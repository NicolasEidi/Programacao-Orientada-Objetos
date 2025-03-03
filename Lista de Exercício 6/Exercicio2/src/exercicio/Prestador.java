package exercicio;

public class Prestador extends Colaborador {
	protected double valorHora;
	protected String tipoServiço;

	public Prestador(String nome, String endereco, String dataInicio, double valorHora, String tipoServiço) {
		super(nome, endereco, dataInicio);
		this.valorHora = valorHora;
		this.tipoServiço = tipoServiço;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public String getTipoServiço() {
		return tipoServiço;
	}

	public void setTipoServiço(String tipoServiço) {
		this.tipoServiço = tipoServiço;
	}

}
