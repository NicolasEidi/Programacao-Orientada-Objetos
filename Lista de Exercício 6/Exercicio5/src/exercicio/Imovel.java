package exercicio;

public class Imovel extends Endereco {
	private double valorBase;
	
	public Imovel(String logradouro, int número, String bairro, String cidade, String uf, double valorBase) {
		super(logradouro, número, bairro, cidade, uf);
		this.valorBase = valorBase;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}


	public void exibirAtributos() {
		System.out.println("Valor base: " + valorBase);
		System.out.println("Endereco");
		System.out.println("Logradouro: " + getLogradouro());
		System.out.println("Numero: " + getNúmero());
		System.out.println("Bairro: " + getBairro());
		System.out.println("Cidade: " + getCidade());
		System.out.println("UF: " + getUf());

	}

}
