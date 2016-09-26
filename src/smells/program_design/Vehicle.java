package smells.program_design;

/**
 * Vehicle Class (Construction Pattern)
 */
public class Vehicle {

    public String type, color;
    private int nWheels;
    public boolean hasMotor;
    private float maxSpeed;

    public Vehicle() {

    }
    /**
     * This constructor is too complicated for mortals, wrap it in two literal and easy constructors
     */
    private Vehicle(String type, String color, int nWheels, boolean hasMotor, float maxSpeed) {
        // Do something...
    }

    /**
     * Now, this is much easier
     */
    public static Vehicle createCar(String color) {
        return new Vehicle("Car", color, 4, true, 200.0f);
    }

    /**
     * And this, too
     */
    public static Vehicle createBike(String color) {
        return new Vehicle("Bike", color, 2, false, 60.0f);
    }
}
