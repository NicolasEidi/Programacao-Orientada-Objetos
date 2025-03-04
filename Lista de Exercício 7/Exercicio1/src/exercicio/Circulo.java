package exercicio;

public class Circulo extends FormaGeometrica {
	static final double PI = 3.14;
	private int raio;

	public Circulo(String cor, int raio) {
		super(cor);
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return (PI * (Math.pow(raio, 2)));
	}

	@Override
	public double calcularPerimetro() {
		return (2 * PI * this.raio);
	}
}
