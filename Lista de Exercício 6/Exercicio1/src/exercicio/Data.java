package exercicio;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int mes, int ano) {
		this(1, mes, ano);
	}

	public Data(int dia) {
		this(dia, 1, 2019);
	}

	public Data() {
		this(1, 1, 2019);
	}

	public String exibirData() {
		String data = dia + "/" + mes + "/" + ano;
		return data;
	}

}
