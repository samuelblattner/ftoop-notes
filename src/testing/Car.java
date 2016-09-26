package testing;

/**
 * Car Class
 */
public class Car {

    private int numDoors;
    private String make;
    private String model;

    public Car(String make, String model, int numDoors) {
        this.make = make;
        this.model = model;
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public String toString() {
        return String.format("%s %s", make, model);
    }
}
