package exercicio;

public class Main {
	public static void main(String[] args) {
		System.out.println("Nsdfsdf");
		Professor professor = new Professor(111, "Jose", "26/03/2001", 5000, "Doutorado");
		
		Disciplina disciplina1 = new Disciplina(285, "Pre calculo", "coisas de pre calculo", 60);
		Disciplina disciplina2 = new Disciplina(155, "calculo 1", "coisas de calculo", 60);
		
		professor.adicionarDisciplina(disciplina1);
		professor.adicionarDisciplina(disciplina2);
		for (Disciplina disciplina : professor.getDisciplinas()) {
			
			System.out.println(disciplina.getNomeDisciplina());
		}
		
		//professor.removerDisciplina(155);
		professor.calcularSalario();
	}
}
