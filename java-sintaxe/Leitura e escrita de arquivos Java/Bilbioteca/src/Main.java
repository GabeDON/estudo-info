import javax.swing.*;
import java.io.FileWriter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfaceLogin().setVisible(true);
            }
        });

        try{
            FileWriter senhas = new FileWriter("senhas.txt", true);
            FileWriter livros = new FileWriter("IDlivros",true);
        } catch (Exception e){
            System.out.println("Erro"+e.getMessage());
        }

    }
}