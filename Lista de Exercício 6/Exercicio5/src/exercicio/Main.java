package exercicio;

public class Main {
	public static void main(String[] args) {
		ImovelNovo novo = new ImovelNovo("Rua Sorvete", 321, "Araucaria", "Pinhão", "PR", 120000, 50);
		ImovelUsado usado = new ImovelUsado("Rua Abacaxi", 123, "Pinheiro", "Sengés", "PR", 120000, 50);
		
		System.out.println("Imovel novo");
		novo.exibirAtributos();
		System.out.println("Valor adicional: " + novo.getValorAdicional());
		System.out.println("\n");
		
		System.out.println("Imovel usado");
		usado.exibirAtributos();
		System.out.println("Valor desconto: " + usado.getValorDesconto());
	}
}
