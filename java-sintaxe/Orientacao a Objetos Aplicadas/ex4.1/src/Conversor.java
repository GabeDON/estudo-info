public class Conversor {
	protected double kProp, klin;
	public Conversor (double kProp, double klin) {
		this.kProp = kProp; this.klin = klin;
	}
	public double getKProp () {return kProp;}
	public double getKlin () {return klin;}
	
	public double converter (double valor){
		return valor*kProp + klin;
	}
	public String toString () {
		return "Conversor[kProp=" + kProp + ",klin= " + klin + "]";
	}
}