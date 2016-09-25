package advanced_techniques.exercises;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;


/**
 * The Interfacer creates a String representation of an interface that is 
 * implemented by a given class name. 
 * @author samuelblattner
 *
 */
public class Interfacer {
	
	private Class<?> classTemplate;
	private Method[] classMethods;
	
	private int indentationLevel = 0;
	private boolean formattedOutput = false;
	
	/** Methods with the following modifiers should not be rendered in the interface */
	private static final String[] INVALID_MODIFIERS = new String[]{"protected", "private", "static", "final"};
	
	/**
	 * Returns a line break if formatted output is turned on.
	 * @return Line break or empty String.
	 */
	private String formattedLineBreak() {
		return formattedOutput ? "\n" : " ";
	}
	
	/**
	 * Returns an indentation corresponding to the current indentation level 
	 * if formatted output is turned on.
	 * @return A multitude of tab characters.
	 */
	private String formattedIndentation() {
		if (formattedOutput) {
			String indentation = "";
			for (int i = 0; i < indentationLevel; i++) {
				indentation += "\t";
			}
			return indentation;
		}
		return "";
	}
	
	/**
	 * Tries to retrieve a Class object by name. 
	 * @param className The class name for which to find a Class
	 * @return true if Class could be found, false if not
	 */
	private boolean getClassByName(final String className) {
		try {
			this.classTemplate = Class.forName(className);
			return true;
		} catch (ClassNotFoundException e) {
			return false;
		}
	}
	
	/**
	 * Gets the actual class name from a fully qualified
	 * class name.
	 * @param className
	 * @return The actual class name
	 */
	private String renderClassName(final String className) {
		int lastPosDot = className.lastIndexOf(".");
		int lastPosDollar = className.lastIndexOf("$");
		int nameStartPos = Math.max(lastPosDot, lastPosDollar);
		return className.substring(nameStartPos + 1);
	}
	
	/**
	 * Check if the modifiers of a given method contain 
	 * any modifier that is illegal for an interface declaration.
	 * @param modifiers
	 * @return True if modifiers are valid
	 */
	private boolean validateModifiers(final String modifiers) {
		boolean valid = true;
		int i = Interfacer.INVALID_MODIFIERS.length;
		while (valid && i-- > 0) {
			if (modifiers.contains(Interfacer.INVALID_MODIFIERS[i])) {
				valid = false;
				return valid;
			}
		}
		return valid;
	}
	
	/**
	 * Renders all annotations for a given class or method. If the annotation
	 * is of type TODO, it will be replaced with a comment representation instead.
	 * @param annotatedObject
	 * @return
	 */
	private String renderAnnotationsForObject(Object annotatedObject) {
		Annotation[] annotationClasses;
		boolean isMethod = true;
		
		if ( annotatedObject.getClass() == Method.class ) {
			annotationClasses = ((Method)annotatedObject).getDeclaredAnnotations();
		} else if ( annotatedObject.getClass() == Class.class ) {
			annotationClasses = ((Class<?>)annotatedObject).getDeclaredAnnotations();
			isMethod = false;
		} else {
			return "";
		}
		
		if (annotationClasses.length > 0) {
			String annotations = "";
			for (Annotation annotation: annotationClasses) {
				if (annotation.annotationType() == TODO.class) {
					TODO todo;
					if (isMethod) {
						todo = ((Method)annotatedObject).getAnnotation(TODO.class);
					} else {
						todo = (TODO)((Class<?>)annotatedObject).getAnnotation(TODO.class);
					}
					
					annotations += String.format("%s/** TODO what=%s when=Release %d */%s",
							formattedIndentation(),
							todo.what(),
							todo.when(),
							formattedLineBreak()
							);
				} else {
					annotations += String.format("%s%s%s",
							formattedIndentation(),
							annotation.toString(),
							formattedLineBreak());
				}
			}
			return annotations;
		}
		return "";
	}
	
	/**
	 * Renders a method with its modifiers, return type and
	 * parameter types. The string is rendered with a concluding
	 * semicolon.
	 * @param method A Method instance of which a String representation
	 * should be rendered.
	 * @return A String representation of the method.
	 */
	private String renderMethodSignature(Method method) {
		/** 
		 * Retrieve method modifiers and check if valid.
		 * Do not render if method signature contains any invalid modifiers */
		String methodModifiers = Modifier.toString(method.getModifiers());
		
		if (validateModifiers(methodModifiers)) {
			
			/** Retrieve parameter types */
			String params = "";
			Class<?>[] paramClasses = method.getParameterTypes();
			
			for (int i = 0; i < paramClasses.length; i++) {
				params += String.format("%s param%d%s",
						paramClasses[i].getName(),
						i,
						i + 1 < paramClasses.length ? ", " : "" );
			}
			
			return String.format("%s%s%s %s %s(%s);",
					renderAnnotationsForObject(method),
					formattedIndentation(),
					Modifier.toString(method.getModifiers()),
					method.getReturnType().getName(),
					method.getName(),
					params
			);
		}
		return "";
	}
	
	/**
	 * Outputs an interfacer description that is compatible to 
	 * the given class.
	 * @param patternClass
	 */
	public String renderInterfaceForClassName(final String className) {
		if (getClassByName(className)) {
			classMethods = classTemplate.getDeclaredMethods();

			String output = String.format("%spublic interface %sIf{%s",
					renderAnnotationsForObject(this.classTemplate),
					renderClassName(className),
					formattedLineBreak());
			
			indentationLevel++;
						
			/** Methods. */
			Arrays.sort(classMethods, new MethodComparator());
			
			for (Method classMethod : classMethods) {
				String methodSignature = renderMethodSignature(classMethod);
				if (methodSignature != "") {
					output += String.format("%s%s",
							renderMethodSignature(classMethod),
							formattedLineBreak());
				}
			}
			
			indentationLevel--;
			
			output += "}";
			System.out.println(output);
			return output;
		} else {
			System.err.format("Class \"%s\" could not be found!", className);
			return "";
		}		
	}
	
	/**
	 * Overloaded method for formatted output.
	 * @param className
	 * @param formattedOutput
	 */
	public String renderInterfaceForClassName(final String className, boolean formattedOutput) {
		this.formattedOutput = formattedOutput;
		return renderInterfaceForClassName(className);
	}
	
	/**
	 * Main method
	 * @param args Arguments
	 */
	public static void main(String[] args) {
		Interfacer interfacer = new Interfacer();
		if (args.length != 2) {
			interfacer.renderInterfaceForClassName("block2.MyClass", false);
		} else {
			String className = args[0];
			boolean formatted = (args[1] == "true" ? true : false);
			interfacer.renderInterfaceForClassName(className, formatted);
		}
	}
}
