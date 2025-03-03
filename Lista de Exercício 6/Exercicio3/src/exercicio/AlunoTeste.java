package exercicio;

public class AlunoTeste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Joaquim", "27/03/1999", 12335484, 4444444);
		Aluno aluno = new Aluno("Luquinha", "29/02/2004", 123123132, 22222222, 112);
		
		pessoa.exibirAtributos();
		aluno.exibirAtributos();
	}
}
