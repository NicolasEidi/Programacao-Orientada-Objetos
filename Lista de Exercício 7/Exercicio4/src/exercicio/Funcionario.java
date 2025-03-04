package exercicio;

public abstract class Funcionario {
	private int registro;
	private String nome;
	private String dataAdmissao;
	private double salarioBase;

	public Funcionario(int registro, String nome, String dataAdmissao, double salarioBase) {
		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public void imprimirAtributos() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Numero do registro: " + this.getRegistro());
		System.out.println("Data da admissão: " + this.getDataAdmissao());
		System.out.println("Salario base: " + this.getSalarioBase());
	}
	
	abstract void removerRotina(int codigoRemover);
	
	abstract void calcularSalario();

}
