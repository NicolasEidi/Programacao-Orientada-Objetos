package exercicio;

public class Administrativo extends Funcionario {
	private double adicional;

	public Administrativo(String nome, int registro, double salarioBase, double adicional) {
		super(nome, registro, salarioBase);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public void exibirAtributos(){
		System.out.println("Funcionario Administrativo");
		System.out.println("Nome: " + getNome());
		System.out.println("Registro: " + getRegistro());
		System.out.printf("Salario base: %.02f\n", getSalarioBase());
		System.out.printf("Adicional:  %.02f\n", getAdicional());
		System.out.printf("Salario final:  %.02f\n", (getSalarioBase() + getAdicional()));
		System.out.println("\n");
	}
					
}
