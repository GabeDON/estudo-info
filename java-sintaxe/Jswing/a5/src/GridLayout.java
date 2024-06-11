import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class GridLayout {
    public static void main(String[] args) {

        // Flow Layout: places components in a grid of cells.
        //              Each component takes all the available space within its cell.
        //              and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER,10,10));
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150,130));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new java.awt.GridLayout(3,3,10,10));
        

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
