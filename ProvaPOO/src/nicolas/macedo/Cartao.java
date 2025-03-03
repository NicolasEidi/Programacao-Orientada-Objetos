package nicolas.macedo;

public abstract class Cartao {
	protected int numIdentificacao;
	protected int senha;
	protected String nome;
	protected double valorFatura = 0;
	protected String statusCartao;

	public Cartao(int numIdentificacao, int senha, String nome, String statusCartao) {
		this.numIdentificacao = numIdentificacao;
		this.senha = senha;
		this.nome = nome;
		this.statusCartao = statusCartao;
	}

	public String getStatusCartao() {
		return statusCartao;
	}

	public void setStatusCartao(String statusCartao) {
		this.statusCartao = statusCartao;
	}

	public int getNumIdentificacao() {
		return numIdentificacao;
	}

	public void setNumIdentificacao(int numIdentificacao) {
		this.numIdentificacao = numIdentificacao;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorFatura() {
		return valorFatura;
	}

	public void setValorFatura(double valorFatura) {
		this.valorFatura = valorFatura;
	}

	abstract void bloquearCartao(int senha);

	abstract void desbloquearCartao(int senha);

	abstract void comprar(int senha, String dataCompra, Produto produto);

	abstract void visualizarFatura(int senha);
}
