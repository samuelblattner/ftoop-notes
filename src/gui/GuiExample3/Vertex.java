package gui.GuiExample3;

/**
 * 2D Vertex Class
 */
public class Vertex {

    private float x = 0f, y = 0f;

    public Vertex(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("X: %f / Y: %f", x, y);
    }
 }
