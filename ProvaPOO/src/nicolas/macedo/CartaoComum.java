package nicolas.macedo;

import java.util.ArrayList;
import java.util.List;

public class CartaoComum extends Cartao {
	private List<Produto> produtos;
	private double valorLimite;

	public CartaoComum(int numIdentificacao, int senha, String nome, String statusCartao, double valorLimite) {
		super(numIdentificacao, senha, nome, statusCartao);
		produtos = new ArrayList<Produto>();
		this.valorLimite = valorLimite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public void bloquearCartao(int senha) {
		try {

			if (this.getSenha() != senha) {
				throw new ExceptionSenhaErrada("Senha incorreta");
			}

			else {
				System.out.println("Cartao Bloqueado");
				this.setStatusCartao("Bloqueado");
			}
		}

		catch (ExceptionSenhaErrada e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void desbloquearCartao(int senha) {
		try {

			if (this.getSenha() != senha) {
				throw new ExceptionSenhaErrada("Senha incorreta");
			} 
			
			else {
				System.out.println("Cartao Desbloqueado");
				this.setStatusCartao("Desbloqueado");
			}
			
		} 
		
		catch (ExceptionSenhaErrada e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void comprar(int senha, String dataCompra, Produto produto) {
		try {
			if (this.statusCartao.equals("Bloqueado")) {
				throw new ExceptionCartaoBloqueado("Cartao bloqueado");
			}

			else if (this.getSenha() != senha) {
				throw new ExceptionSenhaErrada("Senha incorreta");
			}

			else if (produto.getValorProduto() >= this.getValorLimite()) {
				throw new ExceptionLimiteEstourado("Limite estourado");
			}

			else {
				this.produtos.add(produto);
				System.out.println("Compra realizada com sucesso do item: " + produto.getNomeProduto());
				this.setValorFatura(getValorFatura() + produto.getValorProduto());
				this.setValorLimite(this.getValorLimite() - produto.getValorProduto());
			}
		}

		catch (ExceptionCartaoBloqueado e) {
			System.out.println(e.getMessage());
		}

		catch (ExceptionSenhaErrada e) {
			System.out.println(e.getMessage());
		}

		catch (ExceptionLimiteEstourado e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void visualizarFatura(int senha) {
		try {
			if (this.getSenha() != senha) {
				throw new ExceptionSenhaErrada("Senha incorreta");
			}

			else {
				System.out.println("\nNome: " + this.getNome());
				System.out.printf("Valor limite: %.02f\n", this.getValorLimite());
				System.out.printf("Valor fatura: %.02f\n", this.getValorFatura());
				System.out.println("\nItens comprado no cartao comum\n");
				for (Produto produto : this.getProdutos()) {
					System.out.printf("\nNome: %s, valor: %.02f", produto.getNomeProduto(), produto.getValorProduto());
				}
			}
		} 
		
		catch (ExceptionSenhaErrada e) {
			System.out.println(e.getMessage());
		}
	}
}
