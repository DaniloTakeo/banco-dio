package br.com.bancodio.model;

public abstract class Cliente {

	private String nome;
	private Endereco endereco;
	
	public Cliente() {}
	
	public Cliente(String nome, String logradouro, String numero, String bairro, String cep, String cidade) {
		this.nome = nome;
		this.endereco = new Endereco(logradouro, numero, bairro, cep, cidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
