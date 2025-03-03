package exercicio;

public class Endereco {
	private String logradouro;
	private int numResidencia;
	private String bairro;
	private int cep;
	private String cidade;
	private String uf;

	public Endereco(String logradouro, int numResidencia, String bairro, int cep, String cidade, String uf) {
		this.logradouro = logradouro;
		this.numResidencia = numResidencia;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumResidencia() {
		return numResidencia;
	}

	public void setNumResidencia(int numResidencia) {
		this.numResidencia = numResidencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
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

}
