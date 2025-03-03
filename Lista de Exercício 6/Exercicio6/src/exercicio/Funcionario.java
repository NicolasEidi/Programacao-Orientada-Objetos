package exercicio;

public class Funcionario {
	private String nome;
	private int registro;
	private double salarioBase;

	public Funcionario(String nome, int registro, double salarioBase) {
		super();
		this.nome = nome;
		this.registro = registro;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

}
