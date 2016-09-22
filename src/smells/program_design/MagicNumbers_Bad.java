package smells.program_design;

/**
 * Magic Numbers Bad Smell Example
 */
public class MagicNumbers_Bad {

    public MagicNumbers_Bad() {
        startShow(100);
    }

    private void startShow(int slidesInterval) {
        // Do slide show
        playVideo(10.0f);
    }

    private void playVideo(float volume) {
        // Play video with volume
    }
}
