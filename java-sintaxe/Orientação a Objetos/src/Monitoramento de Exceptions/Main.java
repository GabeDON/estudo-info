public class Main {
    public static void main(String[] args) {
		try {	
			double larg = Double.parseDouble(args[0]);
			double alt = Double.parseDouble(args[1]);
			P0311Retangulo a  = new P0311Retangulo (larg,alt);
			System.out.println(a);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Numero insuficiente de argumentos");
		}catch (NumberFormatException e) {
			System.out.println("Argumentos inválidos");
		}catch (Exception e) {
			System.out.println("Dimensões inválidas");
		}			
    }
}