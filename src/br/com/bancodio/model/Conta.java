package br.com.bancodio.model;

public abstract class Conta {

	private Cliente cliente;
	private Agencia agencia;
	protected Double saldo;
	
	public Conta(Cliente cliente, Agencia agencia) {
		this.cliente = cliente;
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	
	public abstract void sacar(Double valor);
	
	public abstract void depositar(Double valor);
	
	public abstract void transferir(Conta contaDestino, Double valor);
}
