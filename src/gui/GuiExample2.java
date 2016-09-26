package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by samuelblattner on 21/09/16.
 */
public class GuiExample2 {
    
    private JFrame baseFrame;
    private JPanel basePanel, centerPanel;
    private JButton buttonToLeft, buttonToRight;
    private JScrollPane leftScrollPane, rightScrollPane;
    private JList<String> leftList, rightList;

    
    public GuiExample2() {
    
        baseFrame = new JFrame("Mein tolles Fenster :-)");
        baseFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // pack()???

        basePanel = new JPanel(new BorderLayout(5,5));
        baseFrame.add(basePanel);

        leftScrollPane = new JScrollPane();
        leftScrollPane.setPreferredSize(new Dimension(200, 200));
        leftList = new JList<>();
        leftScrollPane.add(leftList);
        basePanel.add(leftScrollPane, BorderLayout.WEST);

        rightScrollPane = new JScrollPane();
        rightScrollPane.setPreferredSize(new Dimension(200, 200));
        rightList = new JList<>();
        rightScrollPane.add(rightList);
        basePanel.add(rightScrollPane, BorderLayout.EAST);

        centerPanel = new JPanel(new GridLayout(10, 1));

        buttonToLeft = new JButton("<<<");
        buttonToLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hast mich geklickt :D");
                //leftList.add("Click Left", null);
            }
        });

        buttonToRight = new JButton(">>>");
        buttonToRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hast mich geklickt :D");
                //rightList.add("Click Right", null);
            }
        });

        centerPanel.add(buttonToLeft); //, buttonToRight);
        centerPanel.add(buttonToRight);
        basePanel.add(centerPanel, BorderLayout.CENTER);


        baseFrame.setSize(new Dimension(600, 250));
        baseFrame.setVisible(true);

    }
    
       

    public static void main(String args[]) {
        GuiExample2 example = new GuiExample2();

    }
}
