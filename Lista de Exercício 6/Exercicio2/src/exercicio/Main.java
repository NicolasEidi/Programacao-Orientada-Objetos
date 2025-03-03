package exercicio;

public class Main {
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Joazin", "Rua sorvete", "12/05/2000", "Entregador", 1500.00, 123123);
		Estagiario estagiario = new Estagiario("Cleberzin", "Rua Marcelos", "11/09/2012", "Estagiario", 700.00, 321321);

		Empresa empresa = new Empresa("Trapos", "Rua Trapos", "09/01/2024", 200.00, "Soldagem", 987654321);
		Autonomo autonomo = new Autonomo("Zezin", "Rua Canecas", "25/12/2022", 150.00, "Eletricista", 999999999);

		System.out.println(empregado.toString());
		System.out.println("\n");
		System.out.println(estagiario.toString());
		System.out.println("\n");
		System.out.println(empresa.toString());
		System.out.println("\n");
		System.out.println(autonomo.toString());
	}
}
