package engine;
public class MensagemImprimivel extends Mensagem implements Imprimivel {
	public MensagemImprimivel (String conteudo) {
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
}