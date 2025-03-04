package exercicio;

public class Main {
	public static void main(String[] args) {
		Circulo circulo = new Circulo("Azul", 3);
		Quadrado quadrado = new Quadrado("Amarelo", 5);
		Retangulo retangulo = new Retangulo("Verde", 5, 2);
		Trapezio trapezio = new Trapezio("Laranja", 10, 5, 3);
		Losango losango = new Losango("Vermelho", 10, 5);
		
		System.out.println("\nCirculo area: " + circulo.calcularArea());
		System.out.println("Circulo perimetro: " + circulo.calcularPerimetro());
		System.out.println("Circulo cor: " + circulo.getCor());
		
		System.out.println("\nQuadrado area: " + quadrado.calcularArea());
		System.out.println("Quadrado perimetro: " + quadrado.calcularPerimetro());
		System.out.println("Quadrado cor: " + quadrado.getCor());
		
		System.out.println("\nRetangulo area: " + retangulo.calcularArea());
		System.out.println("Retangulo perimetro: " + retangulo.calcularPerimetro());
		System.out.println("Retangulo cor: " + retangulo.getCor());
		
		System.out.println("\nTrapezio area: " + trapezio.calcularArea());
		System.out.println("Trapezio perimetro: " + trapezio.calcularPerimetro());
		System.out.println("Trapezio cor: " + trapezio.getCor());
		
		System.out.println("\nLosango area: " + losango.calcularArea());
		System.out.println("Losango perimetro: " + losango.calcularPerimetro());
		System.out.println("Losango cor: " + losango.getCor());
	}
}
