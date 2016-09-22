package patterns.erzeugungsmuster.fabrikmethode;

/**
 * Vehicle Factory
 */
public class VehicleFactory {

    private enum VEHICLE_TYPE {
        CAR,
        BIKE,
    }

    /**
     * This is the Factory method
     */
    public static Vehicle createVehicle(final VEHICLE_TYPE type, final String name) {
        switch (type) {
            case CAR:
                return new Car("My cool car");
            case BIKE:
                return new Bike("My cool bike");
        }

        throw new IllegalStateException(
                String.format("Unexpected Vehicle type %s", type)
        );
    }
}
