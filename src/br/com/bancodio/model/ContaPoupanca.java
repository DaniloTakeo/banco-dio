package br.com.bancodio.model;

public class ContaPoupanca extends Conta {
	
	private final Double jurosRendimento = 0.5;
	private Double limiteSaqueETransferencia = 500.0;
	
	public Double getJurosRendimento() {
		return jurosRendimento;
	}
	
	public Double getLimiteSaqueETransferencia() {
		return limiteSaqueETransferencia;
	}

	public ContaPoupanca(Cliente cliente, Agencia agencia) {
		super(cliente, agencia);
	}

	@Override
	public void sacar(Double valor) {
		if(this.limiteSaqueETransferencia > 0) {
			this.saldo -= valor;
			this.limiteSaqueETransferencia -= valor;
		} else {
			System.out.println("Limite diário de saque e transferência excedido!");
		}
		
	}

	@Override
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void transferir(Conta contaDestino, Double valor) {
		if(this.limiteSaqueETransferencia > 0) {
			this.sacar(valor);
			contaDestino.depositar(valor);			
		} else {
			System.out.println("Limite diário de saque e transferência excedido!");
		}
		
	}

}
