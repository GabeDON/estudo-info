public class Externa {
	private int valor;
	public Externa (int valor){this.valor = valor;}

	public class Aninhada {
		public void exibir (){
			System.out.println("valor = "+valor);
		}
	}
}