package exercicio;

public class Gerente extends Funcionario {
	private double totalLucroEmpresa;
	private double participacao;

	public Gerente(String nome, int registro, double salarioBase, double totalLucroEmpresa, double participacao) {
		super(nome, registro, salarioBase);
		this.totalLucroEmpresa = totalLucroEmpresa;
		this.participacao = participacao;
	}

	public double getTotalLucroEmpresa() {
		return totalLucroEmpresa;
	}

	public void setTotalLucroEmpresa(double totalLucroEmpresa) {
		this.totalLucroEmpresa = totalLucroEmpresa;
	}

	public double getParticipacao() {
		return participacao;
	}

	public void setParticipacao(double participacao) {
		this.participacao = participacao;
	}

	public void exibirAtributos() {
		System.out.println("Funcionario Gerente");
		System.out.println("Nome: " + getNome());
		System.out.println("Registro: " + getRegistro());
		System.out.printf("Salario base:  %.02f\n", getSalarioBase());
		System.out.println("Percentual nos lucros: " + participacao);
		System.out.printf("Total lucro da empresa: %.02f\n", totalLucroEmpresa);
		System.out.printf("Salario final:  %.02f\n", (getSalarioBase() + (totalLucroEmpresa * (participacao/100))));
		System.out.println("\n");
	}
}
