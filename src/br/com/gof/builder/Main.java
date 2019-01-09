package br.com.gof.builder;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa.Builder()
				.id(1L)
				.nome("Nome Teste")
				.cpf("45646546")
				.build();
		
		System.out.println(pessoa.getNome());
	}

}
