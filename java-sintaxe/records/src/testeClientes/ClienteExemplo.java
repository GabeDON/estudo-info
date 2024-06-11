package testeClientes;

public class ClienteExemplo {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Gabriel",1);//zero a esquerda é excluído na execução
		
		String nomeCliente = c1.nome();
		int idCliente = c1.id();
		System.out.println(c1);
	}

}
