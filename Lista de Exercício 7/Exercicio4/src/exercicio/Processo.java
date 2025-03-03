package exercicio;

public class Processo extends Rotina {
	private String dataCriacao;

	public Processo(int codigo, String descricao, String dataCriacao) {
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
