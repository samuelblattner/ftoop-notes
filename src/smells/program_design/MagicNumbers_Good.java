package smells.program_design;

/**
 * Magic Numbers Bad Smell Example
 */
public class MagicNumbers_Good {

    private static final int SLIDE_INTERVAL = 100;
    private static final float VIDEO_VOLUME = 10.0f;

    public MagicNumbers_Good() {
        startShow(SLIDE_INTERVAL);
    }

    private void startShow(int slidesInterval) {
        // Do slide show
        playVideo(VIDEO_VOLUME);
    }

    private void playVideo(float volume) {
        // Play video with volume
    }
}
