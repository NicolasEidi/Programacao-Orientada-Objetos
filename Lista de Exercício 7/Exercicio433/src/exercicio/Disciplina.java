package exercicio;

public class Disciplina extends Rotina {
	private String nomeDisciplina;
	private int cargaHoraria;

	public Disciplina(int codigo, String descricao, String nomeDisciplina, int cargaHoraria) {
		super(codigo, descricao);
		this.nomeDisciplina = nomeDisciplina;
		this.cargaHoraria = cargaHoraria;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
