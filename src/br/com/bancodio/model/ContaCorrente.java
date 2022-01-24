package br.com.bancodio.model;

public class ContaCorrente extends Conta implements Credito {
	
	private final Double taxa = 0.02;
	private Double creditoAPagar;
	
	public ContaCorrente(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}
	
	public Double getTaxa() {
		return taxa;
	}
	
	public Double getCreditoAPagar() {
		return creditoAPagar;
	}

	@Override
	public void sacar(Double valor) {
		this.saldo -= valor + (valor * taxa);
	}

	@Override
	public void depositar(Double valor) {
		this.saldo += valor - (valor * taxa);
	}

	@Override
	public void transferir(Conta contaDestino, Double valor) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void getCredito(Double valor) {
		this.saldo += valor;
		this.creditoAPagar += valor;
	}
}
