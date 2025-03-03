package nicolas.macedo;

public class Produto {
	private String nomeProduto;
	private double valorProduto;

	public Produto(String nomeProduto, double valorProduto) {
		this.nomeProduto = nomeProduto;
		this.valorProduto = valorProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

}
