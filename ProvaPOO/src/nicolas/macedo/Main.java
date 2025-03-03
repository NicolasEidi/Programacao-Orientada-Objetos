package nicolas.macedo;

public class Main {
	public static void main(String[] args) {
		CartaoComum cartaoComum = new CartaoComum(111, 1234, "Jose", "Desbloqueado", 1000);
		CartaoPremium cartaoPremium = new CartaoPremium(222, 4321, "Maria", "Desbloqueado");
		
		Produto produto1 = new Produto("Camiseta", 250);
		Produto produto2 = new Produto("Shorts", 1500);
		Produto produto3 = new Produto("Tenis", 350);
		Produto produto4 = new Produto("Blusa", 250);
	
		cartaoComum.comprar(12, "22/05/2001", produto1);
		cartaoComum.comprar(1234, "22/05/2001", produto2);
		cartaoComum.comprar(1234, "22/05/2001", produto3);
		cartaoComum.comprar(1234, "22/05/2001", produto4);
		
		cartaoPremium.comprar(4321, "23/09/2015", produto1);
		cartaoPremium.comprar(4321, "23/09/2015", produto2);
		cartaoPremium.comprar(4321, "23/09/2015", produto3);
		cartaoPremium.comprar(4321, "23/09/2015", produto4);
		
		
		cartaoComum.bloquearCartao(1234);
		cartaoComum.desbloquearCartao(1234);
		
		cartaoPremium.bloquearCartao(4321);
		cartaoPremium.desbloquearCartao(4321);

		
		cartaoComum.visualizarFatura(1234);
		cartaoPremium.visualizarFatura(4321);
		
	}
}
