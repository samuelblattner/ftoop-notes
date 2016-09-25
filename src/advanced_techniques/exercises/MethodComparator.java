package advanced_techniques.exercises;

import java.lang.reflect.Method;
import java.util.Comparator;

/**
 * Compares Method objects by their method name for sorting.
 * @author samuelblattner
 *
 */
public class MethodComparator implements Comparator<Method> {
    public int compare(Method m1, Method m2) {
        return m1.getName().compareTo(m2.getName());
    }
}
