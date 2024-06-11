package testeClientes;
public record Cliente(String nome, int id) {
	public Cliente(String nome, int id) {
		if (nome==null||nome.length()<2) throw new IllegalArgumentException("Componente nome inválido: "+nome);
		if (id<0) throw new IllegalArgumentException("Componente id inválido: "+id);
		this.nome = nome;this.id=id;
	}
}
