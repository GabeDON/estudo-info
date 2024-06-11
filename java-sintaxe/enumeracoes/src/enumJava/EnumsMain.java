package enumJava;
import java.util.Scanner;

public class EnumsMain {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String planeta;
		try {
			System.out.println("Para qual planeta quer viajar?");
			planeta = entrada.next().toUpperCase();
			entrada.close();
			
			ClasseTesteEnum pl = new ClasseTesteEnum(planeta);
			pl.viajarPlaneta();
		} catch (Exception e) {
			System.out.println("Você não pode viajar diretamente para esse local");
		}
	}

}
