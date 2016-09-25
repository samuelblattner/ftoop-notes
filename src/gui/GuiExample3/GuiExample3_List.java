package gui.GuiExample3;

import javax.swing.*;
import java.awt.*;

/**
 * Created by samuelblattner on 25/09/16.
 */
public class GuiExample3_List {

    private void buildComponents() {

        // Create JFrame
        JFrame baseFrame = new JFrame("Networks");
        baseFrame.setSize(new Dimension(800, 600));
        baseFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // Create Base Panel
        JPanel basePanel = new JPanel(new BorderLayout());
        baseFrame.add(basePanel);

        // Create Left List Part
        JPanel listPanel = new JPanel(new BorderLayout());
        basePanel.add(listPanel, BorderLayout.WEST);

        // Header
        JLabel headerLabel = new JLabel("Vertex List");
        listPanel.add(headerLabel, BorderLayout.NORTH);

        // Create List
        JList<>

        // Footer
        JPanel footerPanel = new JPanel(new FlowLayout());
        listPanel.add(footerPanel, BorderLayout.SOUTH);
        JButton addButton = new JButton();
        addButton.setText("Add Vertex");
        footerPanel.add(addButton);


        // Create Right Drawing Area
        JPanel drawPanel = new JPanel(new BorderLayout());
        basePanel.add(drawPanel, BorderLayout.EAST);

        baseFrame.setVisible(true);
    }

    public GuiExample3_List() {
        buildComponents();
    }

    public static void main (String args[]) {
        GuiExample3_List example = new GuiExample3_List();
    }
}
