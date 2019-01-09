package br.com.gof.builder;

public class Pessoa {

	private Long id;
	private String cpf;
	private String nome;

	public Long getId() {
		return this.id;
	}

	public String getCpf() {
		return this.cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public static class Builder {
		private Long id;
		private String cpf;
		private String nome;

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Pessoa build() {
			return new Pessoa(this);
		}
	}

	private Pessoa(Builder builder) {
		this.id = builder.id;
		this.cpf = builder.cpf;
		this.nome = builder.nome;
	}
}
