package exercicio;

public class Caminhao extends Veiculo {
	private int capacidadeCarga;

	public Caminhao(String marca, String modelo, String anoDeFabricacao, double valorVeiculo, int capacidadeCarga) {
		super(marca, modelo, anoDeFabricacao, valorVeiculo);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public double calcularIPVA() {
		double custoIPVA = valorVeiculo * (1.5 / 100);
		double IPVA = valorVeiculo + custoIPVA;
		return IPVA;
	}

	@Override
	public void exibirAtributos() {
		super.exibirAtributos();
		System.out.println("\nCapacidade de Carga: " + capacidadeCarga + " toneladas");
	}
}
