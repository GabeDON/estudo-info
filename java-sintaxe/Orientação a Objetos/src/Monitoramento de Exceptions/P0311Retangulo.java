public class P0311Retangulo {
	private double largura, altura;
	// construtor default
	public P0311Retangulo() throws Exception {this (2,1);}
	// construtor parametizado
	public P0311Retangulo (double largura, double altura) throws Exception {
		this.setTamanho(largura,altura);
	}	
	// métodos 
	public void setTamanho(double largura, double altura) throws Exception {
		if (largura > 0 && altura >= 0){
			this.largura = largura; this.altura = altura;
		} else {
			throw new Exception("Dimensões invalidas");
		}		
	}
	public double getLargura () { return this.largura;}
	public double getAltura () { return this.altura;}
	
	@Override
	public String toString() { 
		return "P0311Retangulo[largura=" + largura + ",altura="+altura+"]";
	}
}