import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        try {
            // criação de objetp
            FileWriter fw;
            // escrita
            fw = new FileWriter("arq.txt",true);// append serve para não resetar o arquivo
            fw.write("Gabriel\n");
            for (int i = 0; i < 10; i++) {
                fw.write(i+"\n");
            }
            // fechamento do arquivo
            fw.close();
            System.out.println("Deu tudo certo! \n");

        } catch (Exception e){
            // tratamento de erros
            System.out.println("Erro "+e.getMessage());
        }

        try {
           FileReader fr;
            fr = new FileReader("arq.txt");
            BufferedReader bf;
            bf = new BufferedReader(fr);
            String linha = bf.readLine();
            System.out.println(linha);
            while(linha != null){
                System.out.println(linha);
                linha = bf.readLine();
            }

        } catch (Exception e){
            // tratamento de erros
            System.out.println("Erro "+e.getMessage());
        }
    }
}
