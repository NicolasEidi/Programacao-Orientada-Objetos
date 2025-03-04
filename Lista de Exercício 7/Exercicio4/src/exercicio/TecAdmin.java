package exercicio;

import java.util.ArrayList;
import java.util.List;

public class TecAdmin extends Funcionario {
	private double adicionalNoturno;
	private List<Processo> processos;

	public TecAdmin(int registro, String nome, String dataAdmissao, double salarioBase, double adicionalNoturno) {
		super(registro, nome, dataAdmissao, salarioBase);

		processos = new ArrayList<Processo>();
		this.adicionalNoturno = adicionalNoturno;
	}

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	public List<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processo> processos) {
		this.processos = processos;
	}

	public void adicionarProcesso(Processo processo) {
		this.processos.add(processo);
	}
	
	@Override
	public void removerRotina(int codigoRemover) {
		List<Processo> disciplinasRemover = new ArrayList<>();

		for (Processo processo : processos) {
			if (codigoRemover == processo.getCodigo()) {
				disciplinasRemover.add(processo);
			}
		}
		processos.removeAll(disciplinasRemover);
	}

	@Override
	public void calcularSalario() {
		double salario = this.getSalarioBase() + this.adicionalNoturno;
		System.out.printf("\nSalario base %.02f, somado ao adicional noturno que é de %.02f", this.getSalarioBase(), this.adicionalNoturno, salario);
		System.out.printf("\nTotalizando %.02f\n", salario);
	}
	
	@Override
	public void imprimirAtributos() {
		System.out.println("\nAtibutos do Tecnico Administrativo\n");
		super.imprimirAtributos();
		System.out.println("Adicional noturno: " + this.getAdicionalNoturno());
	}

}
