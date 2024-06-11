import java.util.Scanner;
public class Lista {
	public static void main (String arg[]){
		Nodo lista = null;
		Scanner sc = new Scanner(System.in);
		String aux;
		do {
			System.out.println("Digite uma palavra (.encerra):");
			aux = sc.next();
			if (!aux.equals(".")){
				Nodo novo = new Nodo(aux,lista);
				lista = novo;
			}
		} while (!aux.equals("."));
		sc.close();
		
		System.out.println("Lista de palavras:\n");
		Nodo nodo = lista; // variavel auxiliar
		while (nodo!=null){
			System.out.println(nodo.nome + " ");
			nodo = nodo.proximo;
		}
		System.out.println("<.>");
	}
	public static class Nodo {
		public String nome;
		public Nodo proximo;
		@SuppressWarnings("unused")
		public Nodo (){
			this(null,null); // aciona construtor parametizado
		}
		public Nodo (String n, Nodo p){
			nome = n; proximo = p;
		}
	}
}