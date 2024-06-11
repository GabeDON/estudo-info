package engine;
public interface Editavel {
	long chave = 0xABDCEF0;
	void editar (String conteudo);
	// método que não precisa ser instaciando dentro das classes que implementam-na
	default void limpar (){
		editar("");
	}
}
