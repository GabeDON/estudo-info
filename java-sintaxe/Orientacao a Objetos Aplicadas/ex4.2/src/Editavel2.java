package engine;
public interface Editavel2 extends Editavel {
	// método estático
	static String transformar (String conteudo, int shift) {
		char [] array = conteudo.toCharArray();
		return new String(deslocamento(array,shift));
	}
	private static char [] deslocamento (char[] array, int shift){
		for (int p=0; p<array.length; p++){
		array[p] = (char) ((array[p] + shift) > 122 ? 65 + shift++ : array[p] + shift);
		}
		return array;
	}
	
	
	public void anexar (String conteudo);
}