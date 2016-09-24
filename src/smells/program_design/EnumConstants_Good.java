package smells.program_design;

/**
 * Created by samuelblattner on 24/09/16.
 */
public class EnumConstants_Good {

    public static final int COMMAND_REDO = 1;
    public static final int COMMAND_UNDO = 2;
    public static final int COMMAND_SAVE = 3;

    public void execute_command(final int strategy) {        // <--- Theoretisch jeder int-Wert möglich!!!
        // u.U. Wertebereichsüberprüfung von strategy
        // Ausführen des Commands
        // ...
    }
}
