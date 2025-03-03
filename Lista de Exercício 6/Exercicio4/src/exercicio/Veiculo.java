package exercicio;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected String anoDeFabricacao;
	protected double valorVeiculo;

	public Veiculo(String marca, String modela, String anoDeFabricacao, double valorVeiculo) {
		super();
		this.marca = marca;
		this.modelo = modela;
		this.anoDeFabricacao = anoDeFabricacao;
		this.valorVeiculo = valorVeiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(String anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public double getValorVeiculo() {
		return valorVeiculo;
	}

	public void setValorVeiculo(double valorVeiculo) {
		this.valorVeiculo = valorVeiculo;
	}

	public double calcularIPVA() {
		double custoIPVA = valorVeiculo * 1; // IPVA isento
		return custoIPVA;
	}

	public void exibirAtributos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de Fabricacao: " + anoDeFabricacao);
		System.out.printf("Custo do IPVA: %.2f", (calcularIPVA() - (double) valorVeiculo));
		System.out.printf("\nCusto com IPVA: %.2f", calcularIPVA());
	}

}
