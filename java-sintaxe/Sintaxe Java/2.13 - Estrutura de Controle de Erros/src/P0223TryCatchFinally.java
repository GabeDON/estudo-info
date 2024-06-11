public class P0223TryCatchFinally {
    public static void main (String []args){
        int j = 5; // valor default
        try { // conversão de argumento
            j = Integer.parseInt(args[0]); // utiliza método pois o argumento vem em formato String
        }catch (Exception e){
            System.out.println("Argumento invalido ou ausente. Usando o default.");
        } finally {
            while (j >= 0 ){
                System.out.println(j);
                j--;
            }
        }
    }
}
