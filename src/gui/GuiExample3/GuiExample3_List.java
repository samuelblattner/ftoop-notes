package gui.GuiExample3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by samuelblattner on 25/09/16.
 */
public class GuiExample3_List {

    private ArrayList<Vertex> vertices = new ArrayList<>();

    // Use a custom model or default model
    private DefaultListModel<Vertex> defaultModel;
    private VertexListModel vertexListDataModel;

    private JButton addButton;

    private void createModels() {
        vertices.add(new Vertex(5.0f, 100.0f));

        defaultModel = new DefaultListModel<>();
        vertexListDataModel = new VertexListModel(null);
    }

    private void buildComponents() {

        // Create JFrame
        JFrame baseFrame = new JFrame("Networks");
        baseFrame.setSize(new Dimension(800, 600));
        baseFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // Create Base Panel
        JPanel basePanel = new JPanel(new BorderLayout(5, 5));
        baseFrame.add(basePanel);

        /**
         * MAIN AREA
         */
        // Create Left List Part
        JPanel listPanel = new JPanel(new BorderLayout(5, 5));
        basePanel.add(listPanel, BorderLayout.WEST);

        // Create Right Drawing Area
        JPanel drawPanel = new JPanel(new BorderLayout());
        basePanel.add(drawPanel, BorderLayout.EAST);

        /**
         * LEFT LIST AREA
         */
        // Header
        JLabel headerLabel = new JLabel("Vertex List");
        listPanel.add(headerLabel, BorderLayout.NORTH);

        // Create List
        JList<Vertex> vertexList = new JList<Vertex>(vertexListDataModel);
        listPanel.add(vertexList, BorderLayout.CENTER);

        // Footer
        JPanel footerPanel = new JPanel(new FlowLayout());
        listPanel.add(footerPanel, BorderLayout.SOUTH);
        addButton = new JButton();
        addButton.setText("Add Vertex");
        footerPanel.add(addButton);

        baseFrame.setVisible(true);
    }

    public void createListeners() {
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vertexListDataModel.addEntry(new Vertex(10f, 5f));
                defaultModel.addElement(new Vertex(10f, 5f));

            }
        });
    }

    public GuiExample3_List() {
        createModels();
        buildComponents();
        createListeners();
    }

    public static void main (String args[]) {
        GuiExample3_List example = new GuiExample3_List();
    }
}
