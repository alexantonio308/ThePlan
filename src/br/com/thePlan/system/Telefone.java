package br.com.thePlan.system;

public class Telefone {
	private int dd;
	private int numero;
	private String operadora;

	public Telefone() {
		this.dd = 0;
		this.numero = 0;
		this.operadora = " ";
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int Dd) {
		this.dd = Dd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String toString() {
		return "(" + this.dd + ") " + this.numero + " - " + this.operadora;
	}

}
