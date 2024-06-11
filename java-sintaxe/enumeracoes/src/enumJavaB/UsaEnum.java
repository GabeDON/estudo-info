package enumJavaB;

public class UsaEnum {
	public static void main (String a[]) {
		for (Enum1 constante : Enum1.values()) {
			System.out.printf("%-25s #%02d: %-20s\n",constante,
					constante.getValor(),constante.getNome());
			switch(constante) {
			case COMPACTAR:
				System.out.println("Opção de compactação");
				break;
			case DESCOMPACTAR:
				System.out.println("Opção de descompactação");
				break;
			}
		}
	}
}
