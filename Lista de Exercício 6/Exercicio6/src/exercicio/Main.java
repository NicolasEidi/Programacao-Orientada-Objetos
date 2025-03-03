package exercicio;

public class Main {
	public static void main(String[] args) {
		Administrativo administrativo = new Administrativo("Marquim", 123, 2000, 125);
		administrativo.exibirAtributos();
		
		Desenvolvedor desenvolvedor = new Desenvolvedor("Fernandim", 122, 10000, 2);
		desenvolvedor.exibirAtributos();
		
		Gerente gerente = new Gerente("Clebim", 121, 10000, 500000, 1);
		gerente.exibirAtributos();
	}
}
