package advanced_techniques.annotations;

/**
 * Example of an annotated class
 */

@MyAnnotation(name="An annotated class")
public class AnnotatedClass {

    public AnnotatedClass() {

        // Get Annotation name-Attribute using Reflection
        String nameOfAnnotation = this.getClass().getAnnotation(MyAnnotation.class).name();
        System.out.println(nameOfAnnotation);
    }

    public static void main(String args[]) {
        AnnotatedClass annClass = new AnnotatedClass();
    }
}
