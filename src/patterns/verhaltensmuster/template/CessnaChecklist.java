package patterns.verhaltensmuster.template;

public class CessnaChecklist extends AirplaneChecklist {

	@Override
	protected boolean checkControls() {
		boolean check = true;
		// Execute specific controls checks
		// ...
		return check;
	}

	@Override
	protected boolean checkGearStatus() {
		boolean check = true;
		// Execute specific gear checks
		// ...
		return check;
	}

	@Override
	protected boolean checkFuel() {
		boolean check = true;
		// Execute specific fuel checks
		// ...
		return check;
	}
	
	@Override
	protected void checklistSuccessful() {
		System.out.println("Cessna is checked and ready!");
	}
	
	@Override
	protected void checklistFailed() {
		System.out.println("There's something wrong with your Cessna!");
	}	
}
