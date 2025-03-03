package exercicio;

public class Moto extends Veiculo {
	private String guidao;

	public Moto(String marca, String modelo, String anoDeFabricacao, double valorVeiculo, String guidao) {
		super(marca, modelo, anoDeFabricacao, valorVeiculo);
		this.guidao = guidao;
	}

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}

	@Override
	public double calcularIPVA() {
		double custoIPVA = valorVeiculo * ((double) 2 / 100);
		double IPVA = valorVeiculo + custoIPVA;
		return IPVA;
	}

	@Override
	public void exibirAtributos() {
		super.exibirAtributos();
		System.out.println("\nTipo de guidao: " + guidao);
	}
}
