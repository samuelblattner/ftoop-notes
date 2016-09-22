package smells.program_design;

/**
 * Bad Parameter List Example
 */
public class MethodParameterLength_Bad {

    public void clearRect(int x, int y, int width, int height) {}
    public void clearRect(int x1, int y1, int x2, int y2, long colorRGB) {}
    public void clearRect(int red, int green, int blue,
                          int x, int y, int width, int height) {}
}
