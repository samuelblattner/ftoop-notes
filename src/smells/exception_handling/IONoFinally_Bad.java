package smells.exception_handling;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * IO without finally, Bad Smell
 */
public class IONoFinally_Bad {

    private void loadProperties(FileInputStream stream) {

    }

    private boolean readProperties(final String fileName) {

        try {
            final FileInputStream inputStream = new FileInputStream(fileName);
            loadProperties(inputStream);
            inputStream.close();
        } catch (final IOException ex) {
            // log.warn("Error opening file");
            return false;
        }
        return true;
    }
}
