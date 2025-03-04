package exercicio;

public class Losango extends FormaGeometrica {
	private int diagonalMaior;
	private int diagonalMenor;

	public Losango(String cor, int diagonalMaior, int diagonalMenor) {
		super(cor);
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}

	@Override
	public double calcularArea() {
		return ((this.diagonalMaior * this.diagonalMenor) / 2);
	}

	@Override
	public double calcularPerimetro() {
		double lado = (Math.sqrt(Math.pow(this.diagonalMaior / 2, 2) + Math.pow(this.diagonalMenor / 2, 2)));
		return (4 * lado);
	}

}
