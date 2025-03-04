package exercicio;

public class Filme {
	private String titulo;
	private int duracao;
	private double precoLocacao;
	private double valorAtraso;

	private int diaLocacao;
	private int diaPrevistoDevolucao;
	private int diaDevolucao;

	private Cliente locador;

	public Filme(String titulo, int duracao, double precoLocacao, double valorAtraso) {
			this.titulo = titulo;
			this.duracao = duracao;
			this.precoLocacao = precoLocacao;
			this.valorAtraso = valorAtraso;
			this.locador = null;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getPrecoLocacao() {
		return precoLocacao;
	}

	public void setPrecoLocacao(double precoLocacao) {
		this.precoLocacao = precoLocacao;
	}

	public double getValorAtraso() {
		return valorAtraso;
	}

	public void setValorAtraso(double valorAtraso) {
		this.valorAtraso = valorAtraso;
	}

	public int getDiaLocacao() {
		return diaLocacao;
	}

	public void setDiaLocacao(int diaLocacao) {
		this.diaLocacao = diaLocacao;
	}

	public int getDiaPrevistoDevolucao() {
		return diaPrevistoDevolucao;
	}

	public void setDiaPrevistoDevolucao(int diaPrevistoDevolucao) {
		this.diaPrevistoDevolucao = diaPrevistoDevolucao;
	}

	public int getDiaDevolucao() {
		return diaDevolucao;
	}

	public void setDiaDevolucao(int diaDevolucao) {
		this.diaDevolucao = diaDevolucao;
	}

	public Cliente getLocador() {
		return locador;
	}

	public void setLocador(Cliente locador) {
		this.locador = locador;
	}

	public void AlugarFilme(Cliente cliente, int diaLocacao, int diaDevolucao) {
		if (diaLocacao > diaDevolucao) {
			System.out.println("Dia de Locação é maior que dia de Devolução");
		}
		else if ((cliente instanceof Socio || cliente instanceof Dependente) && this.locador == null) {
			this.locador = cliente;
			this.diaLocacao = diaLocacao;
			this.diaPrevistoDevolucao = diaLocacao + 3;
			this.diaDevolucao = diaDevolucao;
		} else {
			System.out.println("\nEste cliente não tem permissão para alugar um filme");
		}
	}

	public void DevolverFilme() {
		if (this.locador != null) {
			if (this.diaDevolucao > this.diaPrevistoDevolucao) {
				int diasAtraso = this.diaDevolucao - this.diaPrevistoDevolucao;
				double multa = diasAtraso * this.valorAtraso;
				System.out.printf("\nO dia de devolução passou do limite (3 dias),");
				System.out.printf("\nA multa sera de %.02f por %d dia(s) de atraso", multa, diasAtraso);

				System.out.printf("\nValor total a ser pago: %.02f", (multa + this.precoLocacao));
			}

			else {
				System.out.printf("Filme devolvido sem atraso, valor total a  ser pago: %.02f", this.precoLocacao);
			}

			this.locador = null;
			this.diaLocacao = 0;
			this.diaPrevistoDevolucao = 0;
			this.diaDevolucao = 0;
		}
	}
}
