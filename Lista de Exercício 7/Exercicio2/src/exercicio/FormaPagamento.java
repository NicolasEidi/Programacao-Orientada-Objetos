package exercicio;

public abstract class FormaPagamento {
	private double valorTotalCompra;

	public FormaPagamento(double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}

	public double getValorTotalCompra() {
		return valorTotalCompra;
	}

	public void setValorTotalCompra(double valorTotalCompra) {
		this.valorTotalCompra = valorTotalCompra;
	}

	abstract void efetuarPagamento();
}
