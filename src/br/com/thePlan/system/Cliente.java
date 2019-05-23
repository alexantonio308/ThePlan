package br.com.thePlan.system;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	private int codigo;
	private Data entrada;
	private Data saida;
	private boolean status;
	private String funcionarioCadastrado;
	private ArrayList<Treino> treinos;
	private ArrayList<Avaliacao> avaliacao;

	public Cliente() {
		this.codigo = 0;
		this.entrada = new Data();
		this.saida = new Data();
		this.status = false;
		this.funcionarioCadastrado = "";
		this.treinos = new ArrayList<Treino>();
		this.avaliacao = new ArrayList<Avaliacao>();
	}

	public Cliente(int codigo, Data entrada, Data saida, boolean status, String funcionarioCadastrado,
			ArrayList<Treino> treinos, ArrayList<Avaliacao> avaliacao, String nome, Data dataNacimento, String sexo,
			ArrayList<Telefone> telefone, ArrayList<Endereco> endereco, int cpf, int rg) {
		super(nome, dataNacimento, sexo, telefone, endereco, cpf, rg);
		this.codigo = codigo;
		this.entrada = entrada;
		this.saida = saida;
		this.status = status;
		this.funcionarioCadastrado = funcionarioCadastrado;
		this.treinos = treinos;
		this.avaliacao = avaliacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Data getEntrada() {
		return entrada;
	}

	public void setEntrada(Data entrada) {
		this.entrada = entrada;
	}

	public Data getSaida() {
		return saida;
	}

	public void setSaida(Data saida) {
		this.saida = saida;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getFuncionarioCadastrado() {
		return funcionarioCadastrado;
	}

	public ArrayList<Treino> getTreinos() {
		return treinos;
	}

	public void setTreinos(ArrayList<Treino> treinos) {
		this.treinos = treinos;
	}

	public void setFuncionarioCadastrado(String funcionarioCadastrado) {
		this.funcionarioCadastrado = funcionarioCadastrado;
	}

	public ArrayList<Avaliacao> getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(ArrayList<Avaliacao> avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String toString() {
		return "Cliente [codigo=" + codigo + ", entrada=" + entrada + ", saida=" + saida + ", status=" + status
				+ ", funcionarioCadastrado=" + funcionarioCadastrado + ", treinos=" + treinos + ", avaliacao="
				+ avaliacao + "]";
	}

}
