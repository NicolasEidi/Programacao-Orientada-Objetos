package exercicio;

public abstract class FormaGeometrica {
	private String cor;

	public FormaGeometrica(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	abstract double calcularArea();

	abstract double calcularPerimetro();

}
