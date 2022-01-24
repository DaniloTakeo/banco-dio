package br.com.bancodio.model;

public class ClienteFisico extends Cliente {
	
	private String cpf;
	
	public ClienteFisico(String nome, String logradouro, String numero, String bairro,
			String cep, String cidade, String cpf) {
		this.cpf = cpf;
		this.setNome(nome);
		this.setEndereco(new Endereco(logradouro, numero, bairro, cep, cidade));
	}

	public String getCpf() {
		return cpf;
	}
	
}
