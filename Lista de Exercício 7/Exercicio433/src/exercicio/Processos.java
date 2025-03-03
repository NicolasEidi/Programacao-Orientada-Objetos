package exercicio;

public class Processos extends Rotina {
	private String dataCriacao;

	public Processos(int codigo, String descricao, String dataCriacao) {
		super(codigo, descricao);
		this.dataCriacao = dataCriacao;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
