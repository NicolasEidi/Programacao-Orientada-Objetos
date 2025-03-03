package exercicio;

public class Retangulo extends FormaGeometrica {
	private int lado;
	private int altura;

	public Retangulo(String cor, int lado, int altura) {
		super(cor);
		this.lado = lado;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.lado * this.altura);
	}

	@Override
	public double calcularPerimetro() {
		return ((2 * this.lado) + (2 * this.altura));
	}

}
