import java.util.Scanner;
public class UsaConversor {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double tempC = sc.nextDouble();
		sc.close();
		
		CelsiusKelvin ck = new CelsiusKelvin();
		System.out.println("ck :"+ck);
		double tempK = ck.converter(tempC);
		System.out.println("tempK = " + tempK + "K");
		
		KelvinCelsius kc = new KelvinCelsius();
		System.out.println("kc :"+kc);
		tempC = ck.converter(tempK);
		System.out.println("tempC = " + tempC + "C");
	}
}			