package exercicio;

public class Pix extends FormaPagamento {
	private int chavePix;
	private String nomeDestinatario;

	public Pix(int valorTotalCompra, int chavePix, String nomeDestinatario) {
		super(valorTotalCompra);
		this.chavePix = chavePix;
		this.nomeDestinatario = nomeDestinatario;
	}

	public int getChavePix() {
		return chavePix;
	}

	public void setChavePix(int chavePix) {
		this.chavePix = chavePix;
	}

	public String getNomeDestinatario() {
		return nomeDestinatario;
	}

	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("\nChave PIX: " + this.chavePix);
		System.out.println("Nome do Destinatario: " + this.nomeDestinatario);
		System.out.printf("Valor total da compra: %.02f\n", this.getValorTotalCompra());
	}
}
