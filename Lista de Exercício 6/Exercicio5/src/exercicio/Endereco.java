package exercicio;

public class Endereco {
	private String logradouro;
	private int número;
	private String bairro;
	private String cidade;
	private String uf;

	public Endereco(String logradouro, int número, String bairro, String cidade, String uf) {
		super();
		this.logradouro = logradouro;
		this.número = número;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNúmero() {
		return número;
	}

	public void setNúmero(int número) {
		this.número = número;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", número=" + número + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + "]";
	}

	
	
}
