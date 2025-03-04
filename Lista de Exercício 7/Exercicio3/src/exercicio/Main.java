package exercicio;

public class Main {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Itapemirim", 551, "Jabuticabeira", 75854102, "Itatinga", "SP");
		Endereco endereco3 = new Endereco("Rua Maciel", 262, "Imbuia", 66644987, "Itatinga", "SP");
		
		Dependente dependente1 = new Dependente("Marcelo", "20/10/2004", 88888888, endereco1);
		Socio socio1 = new Socio("Bruno", "22/01/99", 99999998, endereco1, 12312312);
		socio1.setDependente(dependente1);

		Socio socio2 = new Socio("Larissa", "02/02/03", 98989898, endereco3, 32132132);
		socio2.adicionarDependente("Felipe", "06/04/98", 88787878, endereco3);

		//exibirDadosCliente(socio1);
		//exibirDadosCliente(socio2);
		
		
		
		Filme filme1 = new Filme("O Rei Leão", 90, 5.00, 3.50);
		//filme1.AlugarFilme(socio2, 1, 10);
		filme1.AlugarFilme(socio2.getDependente(), 1, 5);
		exibirDadosFilme(filme1);
		filme1.DevolverFilme();
		

	}

	public static void exibirDadosCliente(Cliente cliente) {
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Data de nascimento: " + cliente.getDataNascimento());
		System.out.println("Telefone: " + cliente.getTelefone());
		System.out.println("\nEndereco de " + cliente.getNome());
		System.out.println("Logradouro: " + cliente.getEndereco().getLogradouro());
		System.out.println("Numero da residencia: " + cliente.getEndereco().getNumResidencia());
		System.out.println("Bairro" + cliente.getEndereco().getBairro());
		System.out.println("CEP: " + cliente.getEndereco().getCep());
		System.out.println("Cidade: " + cliente.getEndereco().getCidade());
		System.out.println("UF: " + cliente.getEndereco().getUf());
		if (cliente instanceof Socio) {
	        Socio socioCliente = (Socio) cliente;
	        System.out.println("CPF: " + socioCliente.getCpf());

	        if (socioCliente.getDependente() != null) {
	            System.out.println("\nDados do dependente:");
	            exibirDadosCliente(socioCliente.getDependente());
	        }
	    }	
	}
	
	
	
	public static void exibirDadosFilme(Filme filme) {
		System.out.println("\n");
		System.out.println("Titulo: " + filme.getTitulo());
		System.out.printf("Duração: %d mins\n", filme.getDuracao());
		System.out.printf("Preco da locação: %.02f\n", filme.getPrecoLocacao());
		System.out.printf("Valor por dia de atraso: %.02f", filme.getValorAtraso());
		if (filme.getLocador() != null) {
			System.out.println("\nFilme alocado ja por " + filme.getLocador().getNome());
			exibirDadosCliente(filme.getLocador());
		}
		else {
			System.out.println("\nFilme disponivel para alocar");
		}
	}
}
