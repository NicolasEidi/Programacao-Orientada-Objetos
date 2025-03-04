package exercicio;

public class CartaoDeCredito extends FormaPagamento {
	private int numeroCartao;
	private String nomeTitular;
	private String dataValidade;
	private int codSeguranca;

	public CartaoDeCredito(int valorTotalCompra, int numeroCartao, String nomeTitular, String dataValidade,
			int codSeguranca) {
		super(valorTotalCompra);
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.dataValidade = dataValidade;
		this.codSeguranca = codSeguranca;
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getCodSeguranca() {
		return codSeguranca;
	}

	public void setCodSeguranca(int codSeguranca) {
		this.codSeguranca = codSeguranca;
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("\nNumero do Cartão: " + this.numeroCartao);
		System.out.println("Nome do Titutar: " + this.nomeTitular);
		System.out.println("Data de validade: " + this.dataValidade);
		System.out.println("Codigo de segurança: " + this.codSeguranca);
		System.out.printf("Valor total da compra: %.02f\n", this.getValorTotalCompra());	}
}
