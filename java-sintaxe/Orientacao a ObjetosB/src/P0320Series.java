import jandl.jgp4.*;

public class P0320Series {
	public static void main (String [] args){
		for (int n = 0; n < 10; n++){
			System.out.printf("Fibo: %6d Arit: %6d Geom: %6d\n",
			P0318Fibonacci.fibonacci(n),
			P0319Progressao.aritmetica(0,2,n),
			P0319Progressao.geometrica(1,3,n));
		}
	}
}	