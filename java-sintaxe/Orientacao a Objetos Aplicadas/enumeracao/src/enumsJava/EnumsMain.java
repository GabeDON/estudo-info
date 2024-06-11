package enumsJava;
import java.util.Scanner;
public class EnumsMain {
	public static void main (String args []){
		// listar os valores da enum:
		for (EnumPlanetas p : EnumPlanetas.values()){
			System.out.printf("%sn",p);
		}
	}
}