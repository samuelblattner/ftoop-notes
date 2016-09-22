package patterns.erzeugungsmuster.erbauer;


/**
 * Created by samuelblattner on 20/09/16.
 */
public class Main {

    public static void main(String args[]) {
        Vehicle myCar = new Vehicle.VehicleBuilder().fourWheeler().numDoors(5).create();
    }
}
