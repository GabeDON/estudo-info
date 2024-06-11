import geom.*;
public class teste {
	public static void main (String[]args){
		forma formas[] = new forma[3];
		formas [0] = new circulo(1.5);
		formas [1] = new retangulo(2.5,4);
		formas [2] = new triangulo (1,2,2);
		for (int i=0; i<formas.length;i++){
			System.out.println(formas[i]);
			System.out.println("area = "+formas[i].area());
		}
	}
}