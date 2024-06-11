import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Objects;

public class Banco extends InterfaceLogin{
    public FileWriter fw;
    public  FileReader fr;
    public BufferedReader bf;
    public String verification;

    public Banco(String verification) {
        this.verification = verification;
    }

    public void Login() throws{

    }
}
