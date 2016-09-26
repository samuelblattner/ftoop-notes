package smells.exception_handling;

import sun.misc.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * IO without finally, Good
 */
public class IONoFinally_Good2 {

    private void loadProperties(InputStream stream) {

    }

    private boolean readProperties(final String fileName) {

        try (final InputStream inputStream = new FileInputStream(fileName)) {
            loadProperties(inputStream);
        } catch (final IOException ex) {
            // log.warn("Error opening the file");
            return false;
        }
        return true;
    }
}
