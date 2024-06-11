import geom.*;
	public class InstanceOf {
		public static void main (String a[]){

			forma obj;
			triangulo obj = (triangulo) f1;

			f1.teste();

			System.out.println(obj);
			// verifica se objeto é uma instancia:
			System.out.printf("%s instancia de triangulo.\n",
				obj instanceof triangulo ? "é":"nao é");			
			System.out.printf("%s instancia de retangulo.\n",
				obj instanceof retangulo ? "é":"nao é");
			System.out.printf("%s instancia de forma.\n",
				obj instanceof forma ? "é":"nao é");
			System.out.printf("%s instancia de Object.\n",
				obj instanceof Object ? "é":"nao é");
			System.out.printf("%s instancia de Runnable.\n",
				obj instanceof Runnable ? "é":"nao é");
		}
	}