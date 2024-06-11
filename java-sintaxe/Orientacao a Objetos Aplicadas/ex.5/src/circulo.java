package geom;
import static java.lang.Math.*;
public class circulo extends forma{
	public circulo (double raio) {
		super(1);
		setRaio(raio);
	}
	@Override
	public double area() {
		return PI*Math.pow(getMedida(0),2);
	}
	public void setRaio(double raio){
		setMedida(0,raio);
	}
}