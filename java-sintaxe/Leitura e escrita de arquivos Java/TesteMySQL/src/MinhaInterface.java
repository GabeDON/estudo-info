import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class MinhaInterface extends JFrame {
    private JTextField nome;
    private JTextField senha;
    private JButton botaoInserir;
    

    public MinhaInterface() {
        super("Minha Interface");
        setLayout(new FlowLayout());

        nome = new JTextField(10);
        add(nome);

        senha = new JTextField(10);
        add(senha);

        botaoInserir = new JButton("Inserir");
        botaoInserir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("deu certo");
            }
        });
        add(botaoInserir);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 100);
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }

    

}
