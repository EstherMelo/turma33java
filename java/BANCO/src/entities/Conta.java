package entities;

public class Conta {
	//atributos
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	

	
	//construtor
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	
	//encapsulamento - getters and setters

	public boolean isAtivo() {
		return ativo;
	}

	//get, set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	/*
	 * public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	 */

	//metodos
	//seja o que deus quer
	
}
