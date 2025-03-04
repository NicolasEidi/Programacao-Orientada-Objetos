package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
	private String titulacao;
	private List<Disciplina> disciplinas;

	

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	public void removerDisciplina(int codigoRemover) {
		List<Disciplina> disciplinasRemover = new ArrayList<>();

		for (Disciplina disciplina : disciplinas) {
			if (codigoRemover == disciplina.getCodigo()) {
				disciplinasRemover.add(disciplina);
			}
		}
		disciplinas.removeAll(disciplinasRemover);
	}

	public void calcularSalario() {
		double salario;
		int totalHoras = 0;
		double valorHoras;

		if (this.getTitulacao().equals("Mestrado")) {
			salario = (this.getSalarioBase() + 1000);

			for (Disciplina disciplina : disciplinas) {
				totalHoras = totalHoras + disciplina.getCargaHoraria();
			}

			valorHoras = (double) (totalHoras * 15);

			System.out.printf("\nCarga horaria de %d horas, totalizando %.02f em ganhos\n", totalHoras, valorHoras);
			System.out.printf("Salario com gratificação de Mestrado é %.02f", (salario + valorHoras));
		}

		else if (this.getTitulacao().equals("Doutorado")) {
			salario = (this.getSalarioBase() + 2000);

			for (Disciplina disciplina : disciplinas) {
				totalHoras = totalHoras + disciplina.getCargaHoraria();
			}

			valorHoras = (double) (totalHoras * 15);

			System.out.printf("\nCarga horaria de %d horas, totalizando %.02f em ganhos\n", totalHoras, valorHoras);
			System.out.printf("Salario com gratificação de Doutorado é %.02f", (salario + valorHoras));
		}

		else {
			for (Disciplina disciplina : disciplinas) {
				totalHoras = totalHoras + disciplina.getCargaHoraria();
			}

			valorHoras = (double) (totalHoras * 15);

			System.out.printf("\nCarga horaria de %d horas, totalizando %.02f em ganhos\n", totalHoras, valorHoras);
			System.out.printf("Salario sem gratificação é de %.02f", (this.getSalarioBase() + valorHoras));
		}
	}

}
