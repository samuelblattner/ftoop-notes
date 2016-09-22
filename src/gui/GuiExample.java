package gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by samuelblattner on 21/09/16.
 */
public class GuiExample {

    // Basic Frame (root GUI element)
    private JFrame baseFrame;

    // A Panel
    private JPanel basePanel;

    // Buttons
    private JButton okButton;
    private JButton cancelButton;


    public GuiExample() {
        createBaseDialog();
        createBaseDialog();

        baseFrame.setVisible(true);
    }

    private void createBaseDialog() {

        // Create Frame
        baseFrame = new JFrame("My Frame");
        baseFrame.setSize(500, 500);
        baseFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // Create Panel
        basePanel = new JPanel(new BorderLayout());

        // Add to Frame
        baseFrame.add(basePanel);
    }

    private void createButtons() {
        okButton = new JButton("Hello");
        cancelButton = new JButton("Hello");

        basePanel.add(okButton, BorderLayout.NORTH);
        basePanel.add(cancelButton, BorderLayout.SOUTH);
    }

    public static void main(String args[]) {
        GuiExample example = new GuiExample();
    }
}
