public class P0220TryCatch {
    public static void main (String []args){
        try { // monitora eventurais problemas
            int j = Integer.parseInt(args[0]);
            while (j >= 0){
                System.out.println(j);
                j--;
            }
        }catch (Exception e){ // sinaliza problemas encontrados
            System.out.println("argumento incorreto.");
        }
    }
}
