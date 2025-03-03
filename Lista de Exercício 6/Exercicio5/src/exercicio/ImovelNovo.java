package exercicio;

public class ImovelNovo extends Imovel {
	private double valorAdicional;

	public ImovelNovo(String logradouro, int número, String bairro, String cidade, String uf, double valorBase,
			double valorAdicional) {
		super(logradouro, número, bairro, cidade, uf, valorBase);
		this.valorAdicional = valorAdicional;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	

}
