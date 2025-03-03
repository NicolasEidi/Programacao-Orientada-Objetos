package exercicio;

public class Pessoa {
	protected String nome;
	protected String nascimento;
	protected int rg;
	protected int cpf;

	public Pessoa(String nome, String nascimento, int rg, int cpf) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public void exibirAtributos() {
		System.out.println("\nNome = " + nome + "\nNascimento = " + nascimento + "\nRG = " + rg + "\nCPF = " + cpf);
	}
}
