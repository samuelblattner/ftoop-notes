package patterns.verhaltensmuster.template;

public abstract class AirplaneChecklist {
	
	// Mandatory template methods
	abstract protected boolean checkControls();
	abstract protected boolean checkGearStatus();
	abstract protected boolean checkFuel();
	
	// Optional hook methods
	protected void beforeChecklist() {}
	protected void checklistSuccessful() {}
	protected void checklistFailed() {}
	
	public AirplaneChecklist() {
		doChecklist();
	}
	
	public final void doChecklist() {
		
		boolean checklistOK = true;
		
		// Call before Checklist hook
		beforeChecklist();
		
		// Call mandatory checks
		checklistOK = checkControls() && checkGearStatus() && checkFuel();
		
		// Call success / fail checklist hook
		if (checklistOK) {
			checklistSuccessful();
		} else {
			checklistFailed();
		}
	}
}
