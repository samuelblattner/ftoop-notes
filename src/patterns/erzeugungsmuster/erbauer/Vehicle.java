package patterns.erzeugungsmuster.erbauer;

/**
 * Vehicle Class (Construction Pattern)
 */
public class Vehicle {

    private String type, color;
    private int nWheels;
    private boolean hasMotor;
    private float maxSpeed;

    /**
     * Called by the Builder
     */
    private Vehicle(VehicleBuilder options) {
        // Do something...
    }

    /**
     * Vehicle Builder
     */
    public static final class VehicleBuilder {

        private int nWheels = 2;
        private int nDoors = 2;

        public VehicleBuilder twoWheeler() {
            this.nWheels = 2;
            return this;
        }

        public VehicleBuilder fourWheeler() {
            this.nWheels = 4;
            return this;
        }

        public VehicleBuilder numDoors(int nDoors) {
            this.nDoors = nDoors;
            return this;
        }

        public Vehicle create() {
            return new Vehicle(this);
        }
    }

}
