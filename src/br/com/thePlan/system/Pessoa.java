package br.com.thePlan.system;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private Data dataNacimento;
	private String sexo;
	private ArrayList<Telefone> telefone;
	private ArrayList<Endereco> endereco;
	private int cpf;
	private int rg;

	public Pessoa() {
		this.nome = "";
		this.dataNacimento = new Data();
		this.sexo = "";
		this.telefone = new ArrayList<Telefone>();
		this.endereco = new ArrayList<Endereco>();
		this.cpf = 0;
		this.rg = 0;
	}

	public Pessoa(String nome, Data dataNacimento, String sexo, ArrayList<Telefone> telefone,
			ArrayList<Endereco> endereco, int cpf, int rg) {
		this.nome = nome;
		this.dataNacimento = dataNacimento;
		this.sexo = sexo;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Data getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(Data dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public ArrayList<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(ArrayList<Telefone> telefone) {
		this.telefone = telefone;
	}

	public ArrayList<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(ArrayList<Endereco> endereco) {
		this.endereco = endereco;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNacimento=" + dataNacimento + ", sexo=" + sexo + ", telefone=" + telefone
				+ ", endereco=" + endereco + ", cpf=" + cpf + ", rg=" + rg + "]";
	}

}
