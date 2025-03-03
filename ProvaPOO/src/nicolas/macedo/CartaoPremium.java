package nicolas.macedo;

import java.util.ArrayList;
import java.util.List;

public class CartaoPremium extends Cartao {
	private List<Produto> produtos;
	private int pontuacao = 0;

	public CartaoPremium(int numIdentificacao, int senha, String nome, String statusCartao) {
		super(numIdentificacao, senha, nome, statusCartao);
		produtos = new ArrayList<Produto>();
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
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

			else {
				this.produtos.add(produto);
				System.out.println("Compra realizada com sucesso do item: " + produto.getNomeProduto());
				this.setValorFatura(getValorFatura() + produto.getValorProduto());
				int pontuacao = this.getPontuacao() + ((int)(produto.getValorProduto() / 6));
				this.setPontuacao(pontuacao);
			}
		}

		catch (ExceptionCartaoBloqueado e) {
			System.out.println(e.getMessage());
		}

		catch (ExceptionSenhaErrada e) {
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
				System.out.printf("Valor fatura: %.02f\n", this.getValorFatura());
				System.out.println("\nItens comprado no cartao premium\n");
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
