import java.io.*;

public class P0224TryCatchFinally2 {
    public static void main (String []args){
        FileInputStream recurso = null;
        try {
            recurso = new FileInputStream(args[0]);
            // uso do recurso
            System.out.println("Arquivo "+args[0]+" aberto.\n");
            alterar(recurso);
        } catch (IOException e1){
            System.out.println(e1);
        } finally {
            if (recurso != null ) try {
                recurso.close();
                System.out.println("Arquivo "+args[0]+" fechado");
            } catch (IOException e2){}
        }
    }

    static void alterar(FileInputStream a) throws IOException {    // método utilizado para ler bytes do
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();// arquivo e transforma-los numa String
        int data;

        while ((data = a.read()) != -1) {
            buffer.write(data);
        }

        String dadosLidos = buffer.toString();
        System.out.println(dadosLidos);
    }
}

