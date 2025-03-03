package exercicio;

public class Quadrado extends FormaGeometrica {
	private int lado;

	public Quadrado(String cor, int lado) {
		super(cor);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return (Math.pow(lado, 2));
	}

	@Override
	public double calcularPerimetro() {
		return (lado * 4);
	}
}
