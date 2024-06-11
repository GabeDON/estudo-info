package geom;
public abstract class forma {
	private double medida [];
	public forma (int numMedidas){
		medida = new double[numMedidas];
	}
	public double getMedida (int i){
		if (i < 0 || i > medida.length) {
			throw new RuntimeException("Numero invalido porra");
		}
		return medida[i];
	}
	public int getNumMedidas(){
		return medida.length;
	}
	public void setMedida(int i, double m){
		if (i < 0 || i > medida.length) {
			throw new RuntimeException("Numero invalido porra");
		}
		if (m < 0) {
			throw new RuntimeException("Numero invalido porra");
		}
		medida[i]=m;
	}
	public String toString () {
		StringBuffer sb = new StringBuffer(getClass().getName());
		sb.append("[medidas:");
		for(int i=0; i<=medida.length-1;i++){
			sb.append(medida[i]); sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}
	public abstract double area();
}