import java.awt.*;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MainFrame principal = new MainFrame();


        // declaração de variaveis
        String nome;
        String CPF;
        String doenca;

        // Preparação do objeto Scanner
        Scanner ler = new Scanner(System.in);

        // Entrada de dados
        System.out.println("digite o nome do paciente: ");
        nome = ler.nextLine();
        System.out.println("digite o cpf do paciente: ");
        CPF = ler.nextLine();
        System.out.println("digite a doença do paciente: ");
        doenca = ler.nextLine();

        Paciente p1 = new Paciente();
        p1.setNome(nome);
        p1.setCpf(CPF);
        p1.setDoenca(doenca);


        }

    }
}