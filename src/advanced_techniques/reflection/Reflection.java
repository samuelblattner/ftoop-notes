package advanced_techniques.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Reflection example
 */
public class Reflection {

    private Class<?> myClass;
    private static final String helloMethodName = "sayHello";

    public Reflection(String className) {

        try {

            // Get Class by String
            myClass = Class.forName(className);

            // Get Method by String
            Method helloMethod = myClass.getMethod(helloMethodName, String.class);

            // Create an instance
            Object instance = myClass.newInstance();

            // Invoke method
            helloMethod.invoke(instance, "Samuel");

            // Get Field and Method list
            Method[] methods = myClass.getDeclaredMethods();
            String methodsString = "";
            for(Method method : methods) {
                methodsString +=
                        String.format(
                                "%s %s(%s)",
                                Modifier.toString(method.getModifiers()),
                                method.getName(),
                                method.getParameterTypes()
                        );
            }

            Field[] fields = myClass.getDeclaredFields();
            String fieldStrings = "";
            for(Field field : fields) {
                fieldStrings +=
                        String.format(
                                "%s %s %s",
                                Modifier.toString(field.getModifiers()),
                                field.getType(),
                                field.getName()
                        );
            }


            System.out.format(
                    "\n\nCalled by class %s with \n\nMethods:\n%s\n\nFields:\n%s",
                    className,
                    methodsString,
                    fieldStrings
            );

        } catch (ClassNotFoundException ex) {
            System.out.format("Class %s could not be found.", className);
        } catch (NoSuchMethodException ex) {
            System.out.format("Method %s could not be found.", helloMethodName);
        } catch (IllegalAccessException ex) {
            System.out.format("Illegal Access");
        } catch (InstantiationException ex) {
            System.out.format("Error when instantiating class %s", className);
        } catch (InvocationTargetException ex) {
            System.out.format("Error when calling method %s", helloMethodName);
        }
    }

    public static void main (String args[]) {

        // Use Fully Qualified Module Name!
        new Reflection("advanced_techniques.reflection.DummyClass");
    }
}
