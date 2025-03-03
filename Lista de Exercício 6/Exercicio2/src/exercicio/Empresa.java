package exercicio;

public class Empresa extends Prestador {
	private long cnpj;

	public Empresa(String nome, String endereco, String dataInicio, double valorHora, String tipoServiço, long cnpj) {
		super(nome, endereco, dataInicio, valorHora, tipoServiço);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [\nCNPJ = " + cnpj + "\nValor de hora = " + valorHora + "\nTipo do serviço = " + tipoServiço
				+ "\nNome = " + nome + "\nEndereco = " + endereco + "\nData de inicio = " + dataInicio + "]";
	}

}
