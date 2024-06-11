package engine;
public class MensagemEditavel extends Mensagem implements Editavel, Imprimivel {
	public MensagemEditavel (String conteudo) {
		super(conteudo);
	}
	public void imprimir () {
		imprimirNoConsole();
	}
	public void imprimirNoConsole () {
		System.out.println(Imprimivel.INICIO);
		System.out.println(getConteudo());
		System.out.println(Imprimivel.FIM);
	}
	public void editar (String conteudo) {
		setConteudo(conteudo);
	}
}