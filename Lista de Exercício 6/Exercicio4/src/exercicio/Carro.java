package exercicio;

public class Carro extends Veiculo {
	private int qtdPortas;

	public Carro(String marca, String modelo, String anoDeFabricacao, int qtdPortas, double valorVeiculo) {
		super(marca, modelo, anoDeFabricacao, valorVeiculo);
		this.qtdPortas = qtdPortas;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	@Override
	public double calcularIPVA() {
		double custoIPVA = valorVeiculo * (3.5 / 100);
		double IPVA = valorVeiculo + custoIPVA;
		return IPVA;
	}

	@Override
	public void exibirAtributos() {
		super.exibirAtributos();
		System.out.println("\nQuantidade de Portas: " + qtdPortas);
	}
}
