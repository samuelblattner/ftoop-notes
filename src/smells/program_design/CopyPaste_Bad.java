package smells.program_design;

/**
 * Copy Paste left-overs
 */
public class CopyPaste_Bad {

    public Vehicle createCar() {

        Vehicle vehicle = new Vehicle();
        vehicle.type = "CAR";
        vehicle.hasMotor = true;

        return vehicle;
    }

    public Vehicle createBike() {

        Vehicle vehicle = new Vehicle();
        vehicle.type = "CAR";  // <--- Vergessen zu ändern !!!
        vehicle.hasMotor = false;

        return vehicle;
    }
}
