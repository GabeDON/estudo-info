import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JPanel = A GUI component that functions as a container
        // to hold other components
        ImageIcon icon = new ImageIcon("thumbsup.png");
        JLabel label = new JLabel();
        label.setText("Hello World! ");
        label.setFont(new Font("Arial",Font.BOLD,20));
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JPanel redPanel = new JPanel(); // criando Panel - seção do Frame
        redPanel.setBackground(Color.red); // adicionando cor de fundo
        redPanel.setBounds(0,0,250,250); // adicionando posição/tamanho

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);


        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(new BorderLayout());


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        greenPanel.add(label); // adiciona apenas no último add
        frame.add(greenPanel);
    }
}