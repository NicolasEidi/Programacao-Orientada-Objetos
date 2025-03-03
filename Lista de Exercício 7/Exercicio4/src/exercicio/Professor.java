package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
	private String titulacao;
	private List<Disciplina> disciplinas;
	

	public Professor(int registro, String nome, String dataAdmissao, double salarioBase, String titulacao) {
		super(registro, nome, dataAdmissao, salarioBase);
		disciplinas = new ArrayList<Disciplina>();
		this.titulacao = titulacao;
	}

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
	
	public void adicionarRotina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	@Override
	public void removerRotina(int codigoRemover) {
		List<Disciplina> disciplinasRemover = new ArrayList<>();

		for (Disciplina disciplina : disciplinas) {
			if (codigoRemover == disciplina.getCodigo()) {
				disciplinasRemover.add(disciplina);
			}
		}
		disciplinas.removeAll(disciplinasRemover);
	}

	@Override
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
			System.out.printf("Salario com gratificação de Mestrado é %.02f\n", (salario + valorHoras));
		}

		else if (this.getTitulacao().equals("Doutorado")) {
			salario = (this.getSalarioBase() + 2000);

			for (Disciplina disciplina : disciplinas) {
				totalHoras = totalHoras + disciplina.getCargaHoraria();
			}

			valorHoras = (double) (totalHoras * 15);

			System.out.printf("\nCarga horaria de %d horas, totalizando %.02f em ganhos\n", totalHoras, valorHoras);
			System.out.printf("Salario com gratificação de Doutorado é %.02f\n", (salario + valorHoras));
		}

		else {
			for (Disciplina disciplina : disciplinas) {
				totalHoras = totalHoras + disciplina.getCargaHoraria();
			}

			valorHoras = (double) (totalHoras * 15);

			System.out.printf("\nCarga horaria de %d horas, totalizando %.02f em ganhos\n", totalHoras, valorHoras);
			System.out.printf("Salario sem gratificação é de %.02f\n", (this.getSalarioBase() + valorHoras));
		}
	}
	
	@Override
	public void imprimirAtributos() {
		System.out.println("\nAtributos do professor\n");
		super.imprimirAtributos();
		System.out.println("Titulação: " + this.getTitulacao());
	}

}


