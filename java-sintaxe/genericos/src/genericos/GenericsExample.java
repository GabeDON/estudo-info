package genericos;

public class GenericsExample {
	public static void main(String args[]) {
		Printer <Integer> printerInteiro = new Printer<Integer>(23);
		printerInteiro.print();
		Printer <String> printerString  = new Printer<String>("helloWorld!");
		printerString.print();
		Printer <Double> printerDouble = new Printer<Double>(20.4);
		printerDouble.print();
	}

}
