
public class Main {
	public static void main(String[] args) {
		double nota1 = 10;
		double nota2 = 5;

		try {
			if (nota2 < 10) {
				throw new Reprovado("Aluno reprovado");
			}
		}

		catch (Reprovado e) {
			System.out.println(e.getMessage());
		}

	}
}
