package exercicio;

public class Aluno extends Pessoa{
	private int matricula;

	public Aluno(String nome, String nascimento, int rg, int cpf, int matricula) {
		super(nome, nascimento, rg, cpf);
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public void exibirAtributos() {
		System.out.println("\nNome = " + nome + "\nNascimento = " + nascimento + "\nRG = " + rg + "\nCPF = " + cpf + "\nMatricula = " + matricula);
	}
}
