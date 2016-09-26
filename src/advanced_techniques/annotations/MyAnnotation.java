package advanced_techniques.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

/**
 * Example of an Annotation
 */
public @interface MyAnnotation {

    public String name() default "MyAnnotation";

}
