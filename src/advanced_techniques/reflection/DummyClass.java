package advanced_techniques.reflection;

/**
 * Reflection Example: Dummy Class to be loaded and instantiated dynamically
 */
public class DummyClass {

    private static final int myVar = 0;

    public void sayHello(String yourName) {
        System.out.format("Hello World, hello %s\n", yourName);
    }
}
