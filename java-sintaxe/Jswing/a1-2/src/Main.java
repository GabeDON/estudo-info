import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("program.png"); // imagem
        Border border = BorderFactory.createLineBorder(Color.green,3); // adicionar Borda

        // Label
        JLabel label = new JLabel(); // cria uma Label
        label.setText("  Bro, do you even code?"); // adiciona texto a label
        label.setIcon(image); // adicionar icon a label
        label.setHorizontalTextPosition(JLabel.CENTER); // colocar o texto no CENTER,RIGHT,LEFT of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // colocar texto TOP,CENTER,BOTTOM of imageicon
        label.setForeground(new Color(62, 46, 116)); // adiciona cor
        label.setFont(new Font("Cascadia Code",Font.BOLD,50)); // adiciona fonte
        label.setIconTextGap(20); // distancia do texto e imagem
        label.setBackground(new Color(181, 87, 76)); // selecionar fundo
        label.setOpaque(true); // display backgroung color
        label.setBorder(border);
        label.setVerticalAlignment(JLabe    l.CENTER); // posição vertical da label
        label.setHorizontalAlignment(JLabel.CENTER); // posição horizontal do label
        //label.setBounds(100,100,250,250); // set x, y position within
        // frame as well as dimensions

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(label);
        frame.pack(); // redimensiona a janela de acordo com os componentes
        // só funciona após a adição dos componentes
    }

}