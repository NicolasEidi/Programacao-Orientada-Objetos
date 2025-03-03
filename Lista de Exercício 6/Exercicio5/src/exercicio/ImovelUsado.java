package exercicio;

public class ImovelUsado extends Imovel {
	private double valorDesconto;

	public ImovelUsado(String logradouro, int número, String bairro, String cidade, String uf, double valorBase,
			double valorDesconto) {
		super(logradouro, número, bairro, cidade, uf, valorBase);
		this.valorDesconto = valorDesconto;
	}

	public double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

}
