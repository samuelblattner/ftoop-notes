package testing;


import junit.framework.TestCase;

/**
 * Created by samuelblattner on 21/09/16.
 */
public class CarTest extends TestCase {

    private Car myCar;

    @Override
    public void setUp() {
        System.out.println("SETUP");
        myCar = new Car(6);
    }

    public void testNumDoorGetter() {

        assertEquals(
                "Hey, das geht so nicht! :-(",
                myCar.getNumDoors(),
                6
        );

    }

    public void testNumDoorGetter2() {

        assertEquals(
                "Hey, das geht so nicht! :-(",
                myCar.getNumDoors(),
                6
        );

    }

    public void tearDown() {
        System.out.println("TEAR DOWN");
        myCar = null;
    }

}
