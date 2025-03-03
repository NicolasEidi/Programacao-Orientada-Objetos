package exercicio;

public class Autonomo extends Prestador {
	private long cpf;

	public Autonomo(String nome, String endereco, String dataInicio, double valorHora, String tipoServiço, long cpf) {
		super(nome, endereco, dataInicio, valorHora, tipoServiço);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [\nCPF = " + cpf + "\nValor de hora = " + valorHora + "\nTipo do serviço = " + tipoServiço
				+ "\nNome = " + nome + "\nEndereco = " + endereco + "\nData de inicio = " + dataInicio + "]";
	}
}