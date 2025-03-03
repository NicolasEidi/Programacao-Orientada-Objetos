package exercicio;

public class Main {
	public static void main(String[] args) {
		CartaoDeCredito cartao = new CartaoDeCredito(200, 123, "Jose", "29/12", 1233);
		Pix pix = new Pix(250, 333333, "Marcio");
		Boleto boleto = new Boleto(120, "22/06", 55555);
		
		cartao.efetuarPagamento();
		pix.efetuarPagamento();
		boleto.efetuarPagamento();
	}
}
