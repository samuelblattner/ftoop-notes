package testing;


import junit.framework.TestCase;

/**
 * Example Unit Testing for the Class «Car»
 */
public class CarTest extends TestCase {

    private Car myCar;

    @Override
    /**
     * Basic setup method that is run for every single test
     */
    public void setUp() {
        myCar = new Car("Honda", "Integra", 4);
    }

    /**
     * Testing if number of doors has been set correctly.
     */
    public void testNumDoorGetter() {

        assertEquals(
                "Car's number of doors is not set correctly!",
                myCar.getNumDoors(),
                4
        );
    }

    /**
     * Testing if String representation of Car is <make> <model>
     */
    public void testStringRepresentation() {

        assertEquals(
                "Car.toString() does not return representation of the form: <make> <model>!",
                String.format("%s", myCar),
                "Honda Integra"
        );
    }

    /**
     * Tear down method that cleans up for next test
     */
    public void tearDown() {
        myCar = null;
    }
}
