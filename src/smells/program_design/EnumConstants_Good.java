package smells.program_design;

/**
 * Example grouped constants, good
 */


enum CommandStrategies {
    COMMAND_REDO,
    COMMAND_UNDO,
    COMMAND_SAVE
}

public class EnumConstants_Good {

    public void execute_command(final CommandStrategies strategy) {     // <--- Nur noch Argument vom Typ CommandStrategies möglich!
        // Ausführen des Commands
        // ...
    }
}
