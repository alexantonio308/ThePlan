package br.com.thePlan.system;

public class Endereco {
	private String numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;

	public Endereco() {
		this.numero = "";
		this.rua = "";
		this.bairro = "";
		this.cidade = "";
		this.estado = "";
		this.cep = "";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String toString() {
		return "Endereco [numero=" + numero + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", estado="
				+ estado + ", cep=" + cep + "]";
	}

}
