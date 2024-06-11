import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame {
    public MyFrame(){
        this.setTitle("olá mundo"); // titulo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // operação de saida
        this.setResizable(false); // impede que o this seja redimensionado
        this.setSize(420,420); // seleciona o tamanho
        this.setVisible(true); // torna visivel

        ImageIcon imagem = new ImageIcon("config.png"); // cria o icone de imagem
        this.setIconImage(imagem.getImage()); // muda o icone de this
        this.getContentPane().setBackground(new Color(159, 141, 216)); // muda o fundo do this
    }
}
