package smells.exception_handling;

import sun.misc.IOUtils;
import sun.nio.ch.IOUtil;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * IO without finally, Good
 */
public class IONoFinally_Good {

    private boolean readProperties(final String fileName) {

        try {
            final FileInputStream inputStream = new FileInputStream(fileName);
            loadProperties(inputStream);
            inputStream.close();
        } catch (final IOException ex) {
            log.warn("Error opening file");
            return false;
        } finally {
            // Save close
            IOUtils.closeQuietly(inputStream);
        }
        return true;
    }
}
