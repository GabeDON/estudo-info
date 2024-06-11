package engine;
public abstract class Mensagem {
	private String conteudo;
	public Mensagem (String conteudo){
		setConteudo(conteudo);
	}
	public String getConteudo () {return conteudo;}
	public void setConteudo (String conteudo) {
		this.conteudo = conteudo;
	}
}