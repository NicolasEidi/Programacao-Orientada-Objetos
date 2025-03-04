package exercicio;

public class Socio extends Cliente {
	private Dependente dependente;
	private int cpf;

	public Socio(String nome, String dataNascimento, int telefone, Endereco endereco, int cpf) {
		super(nome, dataNascimento, telefone, endereco);
		this.dependente = null;
		this.cpf = cpf;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public void adicionarDependente(String nome, String dataNascimento, int telefone, Endereco endereco) {
		this.setDependente(new Dependente(nome, dataNascimento, telefone, endereco));
	}
}
