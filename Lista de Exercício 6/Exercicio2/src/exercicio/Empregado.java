package exercicio;

public class Empregado extends Funcionario {
	private int carteiraTrabalho;

	public Empregado(String nome, String endereco, String dataInicio, String funcao, double salario,
			int carteiraTrabalho) {
		super(nome, endereco, dataInicio, funcao, salario);
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public int getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(int carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	@Override
	public String toString() {
		return "Empregado [\nCarteira de Trabalho = " + carteiraTrabalho + "\nFuncao = " + funcao + "\nSalario = "
				+ salario + "\nNome = " + nome + "\nEndereco = " + endereco + "\nData de inicio = " + dataInicio + "]";
	}

}
