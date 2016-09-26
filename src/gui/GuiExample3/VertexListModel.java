package gui.GuiExample3;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Example of a custom list model
 */
public class VertexListModel extends AbstractListModel {

    private List<Vertex> vertices;

    public VertexListModel(List<Vertex> vertices) {
        if (vertices == null) {
            this.vertices = new ArrayList<>();
        }
        else {
            this.vertices = vertices;
        }
    }

    @Override
    public int getSize() {
        return vertices.size();
    }

    @Override
    public Object getElementAt(int index) {
        return vertices.get(index);
    }

    public void addEntry(Vertex newVertex) {
        vertices.add(newVertex);
        fireIntervalAdded(this, 0, vertices.size());
    }
}
