package exercicio;

public class TecAdmin extends Funcionario {
	private double adcionalNoturno;

	public TecAdmin(int registro, String nome, String dataAdmissao, double salarioBase, double adcionalNoturno) {
		super(registro, nome, dataAdmissao, salarioBase);
		this.adcionalNoturno = adcionalNoturno;
	}

	public double getAdcionalNoturno() {
		return adcionalNoturno;
	}

	public void setAdcionalNoturno(double adcionalNoturno) {
		this.adcionalNoturno = adcionalNoturno;
	}

}
