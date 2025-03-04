package exercicio;

public class Main {
	public static void main(String[] args) {
		System.out.println("Professor");
		Professor professor = new Professor(111, "Jose", "26/03/2001", 6000, "Doutorado");

		Disciplina disciplina1 = new Disciplina(285, "Pre calculo", "coisas de pre calculo", 60);
		Disciplina disciplina2 = new Disciplina(155, "calculo 1", "coisas de calculo", 60);

		// Testes professor
		professor.adicionarRotina(disciplina1);
		professor.adicionarRotina(disciplina2);

		System.out.println("\nTodas as disciplinas");
		for (Disciplina disciplina : professor.getDisciplinas()) {
			System.out.println(disciplina.getNomeDisciplina());
		}

		professor.removerRotina(285);
		System.out.println("\nDisciplinas que não foram removidas");
		for (Disciplina disciplina : professor.getDisciplinas()) {
			System.out.println(disciplina.getNomeDisciplina());
		}

		professor.calcularSalario();
		professor.imprimirAtributos();

		System.out.println("\nTecnico Administrativo");
		TecAdmin tecnicoAdministrativo = new TecAdmin(222, "Marcos", "10/08/2013", 3500, 400);

		Processo processo1 = new Processo(266, "coisas do processo 1", "22/12/2020");
		Processo processo2 = new Processo(189, "coisas do processo 2", "06/05/2021");

		tecnicoAdministrativo.adicionarProcesso(processo1);
		tecnicoAdministrativo.adicionarProcesso(processo2);

		
		System.out.println("\nTodos os processos");
		for (Processo processo : tecnicoAdministrativo.getProcessos()) {
			System.out.println(processo.getDescricao());
		}
		
		tecnicoAdministrativo.removerRotina(189);
		
		System.out.println("\nProcessos que não foram removidos");
		for (Processo processo : tecnicoAdministrativo.getProcessos()) {
			System.out.println(processo.getDescricao());
		}
		
		tecnicoAdministrativo.calcularSalario();
		tecnicoAdministrativo.imprimirAtributos();
		
		
		

	}
}
