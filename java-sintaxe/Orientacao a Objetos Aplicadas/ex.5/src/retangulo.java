package geom;
public class retangulo extends forma {
	public retangulo (double altura, double largura){
		super(2);
		setMedida(0,altura);
		setMedida(1,largura);
	}
	public double area (){
		return getMedida(0)*getMedida(1);
	}
	public double perimetro (){
		return 2*(getMedida(0)+getMedida(1));
	}
}