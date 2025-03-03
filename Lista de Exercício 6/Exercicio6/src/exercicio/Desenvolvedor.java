package exercicio;

public class Desenvolvedor extends Funcionario {
	private int projetosConcluidos;

	public Desenvolvedor(String nome, int registro, double salarioBase, int projetosConcluidos) {
		super(nome, registro, salarioBase);
		this.projetosConcluidos = projetosConcluidos;
	}

	public int getProjetosConcluidos() {
		return projetosConcluidos;
	}

	public void setProjetosConcluidos(int projetosConcluidos) {
		this.projetosConcluidos = projetosConcluidos;
	}

	public void exibirAtributos() {
		System.out.println("Funcionario Desenvolvedor");
		System.out.println("Nome: " + getNome());
		System.out.println("Registro: " + getRegistro());
		System.out.printf("Salario base:  %.02f\n", getSalarioBase());
		System.out.println("Projetos concluidos: " + projetosConcluidos);
		System.out.printf("Salario final:  %.02f\n", (getSalarioBase() + (1500 * projetosConcluidos)));
		System.out.println("\n");
	}
}
