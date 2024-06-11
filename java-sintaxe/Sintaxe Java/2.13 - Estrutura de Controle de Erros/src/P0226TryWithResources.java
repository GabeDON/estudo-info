import java.io.IOException;
import java.io.StringReader;

public class P0226TryWithResources {
    public static void main (String []args){
        String s = "Java - Guia do Programador, 4a Ed.";
        processaRecurso(s);
    }

    public static void processaRecurso(String s){
        StringReader recurso = new StringReader(s);
        try (recurso) { // recurso monitorado
            int espacos = 0, c;
            // uso do recurso
            while ((c = recurso.read()) != -1){if (c == 32)espacos++;}
            System.out.println("Espacos = "+espacos);
        } catch (IOException e1){
            System.out.println(e1);
        }
        System.out.println("Recurso Processado");
    }
}
