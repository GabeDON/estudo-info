import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class MainFrame extends JFrame{
    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new java.awt.BorderLayout());
        this.setSize(500, 500);

        JPanel insert = new JPanel();
        insert.setLayout(new FlowLayout());
        insert.setBackground(new Color(57, 89, 129));

        JTextField nome = new JTextField();
        JTextField cpf = new JTextField();
        JTextField Doenca = new JTextField();

        JButton adicionar = new JButton("adicionar");
        adicionar.addActionListener(e -> escrita());
        


        insert.add(nome);
        insert.add(cpf);
        insert.add(Doenca);

        this.add(insert, BorderLayout.CENTER);

        this.setResizable(false);
        this.setVisible(true);

        public void escrita () {
            try {
                // criação de objetp
                FileWriter fw;
                // escrita
                fw = new FileWriter("pacientes.txt", true);// append serve para não resetar o arquivo
                fw.write("paciente nº1\n");
                fw.write(p1.toString() + "\n");
                // fechamento do arquivo
                fw.close();
                System.out.println("------------------------");
                System.out.println("Inserção dos dados completa! \n");

            } catch (Exception e) {
                // tratamento de erros
                System.out.println("Erro " + e.getMessage());
            }
        }
    }
