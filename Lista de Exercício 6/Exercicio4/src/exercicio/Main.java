package exercicio;

public class Main {
	public static void main(String[] args) {
		Carro carro = new Carro("Fiat", "Uno", "2011", 2, 15000);
		System.out.println("Atributos do carro\n");
		carro.exibirAtributos();

		Moto moto = new Moto("Honda", "CG 150 Titan", "2010", 10000, "Cromado");
		System.out.println("\n\nAtributos da moto\n");
		moto.exibirAtributos();

		Caminhao caminhao = new Caminhao("Fiat", "FNM 180", "1975", 70000, 10);
		System.out.println("\n\nAtributos do caminhao\n");
		caminhao.exibirAtributos();
	}
}
