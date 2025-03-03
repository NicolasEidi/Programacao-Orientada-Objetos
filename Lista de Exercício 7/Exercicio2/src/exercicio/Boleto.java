package exercicio;

public class Boleto extends FormaPagamento {
	private String dataVencimento;
	private int codBarras;

	public Boleto(int valorTotalCompra, String dataVencimento, int codBarras) {
		super(valorTotalCompra);
		this.dataVencimento = dataVencimento;
		this.codBarras = codBarras;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("\nData de Vencimento: " + this.dataVencimento);
		System.out.println("Codigo de Barras: " + this.codBarras);
		System.out.printf("Valor total da compra: %.02f\n", this.getValorTotalCompra());	}
}
