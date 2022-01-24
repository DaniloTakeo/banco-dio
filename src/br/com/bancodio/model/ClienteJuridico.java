package br.com.bancodio.model;

public class ClienteJuridico extends Cliente{

	private String cnpj;
	
	public ClienteJuridico(String nome, String logradouro, String numero, String bairro,
			String cep, String cidade, String cnpj) {
		this.cnpj = cnpj;
		this.setNome(nome);
		this.setEndereco(new Endereco(logradouro, numero, bairro, cep, cidade));
	}
	
	public String getCnpj() {
		return cnpj;
	}
}
