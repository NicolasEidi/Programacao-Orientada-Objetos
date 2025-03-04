package exercicio;

public class Trapezio extends FormaGeometrica {
	private int baseMaior;
	private int baseMenor;
	private int altura;

	public Trapezio(String cor, int baseMaior, int baseMenor, int altura) {
		super(cor);
		this.baseMaior = baseMaior;
		this.baseMenor = baseMenor;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (((this.baseMaior + this.baseMenor) * this.altura) / 2);
	}

	@Override
	public double calcularPerimetro() {
		double lado = (double) Math.sqrt(Math.pow((this.baseMaior - this.baseMenor) / 2, 2) + Math.pow(this.altura, 2));
		return (this.baseMaior + this.baseMenor + (2 * lado));
	}
}
