package exercicioAula28_33;

import java.util.Scanner;

public class ContaCorrente {

	private int agencia;
	private int conta;
	private double saldo;
	private double saldoTotal;
	private final static double LIMITE_CHEQUE_ESPECIAL = 500.00;
	private double saque;
	private double deposito;
	private boolean status;
	private double saqueLimite;
	private int operacao;

	public ContaCorrente() {

	}

	public ContaCorrente(int agencia, int conta, double saldo, double saldoTotal, double limiteChequeEspecial,
			double saque, double deposito, boolean status, double saqueLimite, int operacao) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.saldoTotal = saldoTotal;
		this.saque = saque;
		this.deposito = deposito;
		this.status = status;
		this.saqueLimite = saqueLimite;
		this.operacao = operacao;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(double saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	/*
	 * public double getLimiteChequeEspecial() { return limiteChequeEspecial =
	 * 500.00; }
	 * 
	 * public void setLimiteChequeEspecial(double limiteChequeEspecial) {
	 * this.limiteChequeEspecial = limiteChequeEspecial; }
	 */
	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getSaqueLimite() {
		return saqueLimite;
	}

	public void setSaqueLimite(double saqueLimite) {
		this.saqueLimite = saqueLimite;
	}

	public int getOperacao() {
		return operacao;
	}

	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}

	public void depositar(double valor) {
		this.saldo += valor;
		consultar();
	}

	public boolean sacar(double valor) {
		if (valor >= saldo) {
			if(valor>ContaCorrente.LIMITE_CHEQUE_ESPECIAL) {
				System.out.println("SALDO INSUFICIENTE");
				return false;
			}else if(valor<= ContaCorrente.LIMITE_CHEQUE_ESPECIAL) {
				System.out.println("UTILIZOU CHEQUE ESPECIAL");
				this.saque = valor;
				this.saqueLimite = ContaCorrente.LIMITE_CHEQUE_ESPECIAL - valor;
				
				return true;
			}
		} else {
			this.saque = valor;
			this.saldo -= valor;
			this.saldoTotal -= saque;
		}
		return true;
	}

	public void consultar() {
		this.saldoTotal = saldo + ContaCorrente.LIMITE_CHEQUE_ESPECIAL;
		
	}

	@Override
	public String toString() {
		return "Agencia = " + agencia + "\n" + "Conta = " + conta + "\n" + "Saldo = " + saldo + "\n"
				+ "Limite cheque especial R$: " + ContaCorrente.LIMITE_CHEQUE_ESPECIAL + "\n" + "Saque = " + saque
				+ "\n" + "Saque Limite = " + saqueLimite + "\n" + "saldo Total = " + saldoTotal;
	}

}
