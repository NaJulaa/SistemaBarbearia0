package model;

import java.sql.Date;

public class ClienteModel {
	
	private int id;
	private String nomeString;
	private char sexo;
	private Date dataNascimento;
	private String telefone;
	private String email;
	private String rg;
	private String indereco;
	private String cep;
	
	//Geral
	public ClienteModel(int id, String nomeString, char sexo, Date dataNascimento, String telefone, String email,
			String rg, String indereco, String cep) {
		
		this.id = id;
		this.nomeString = nomeString;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
		this.indereco = indereco;
		this.cep = cep;
		
		
	}
	//Obrigatórios
	public ClienteModel(int id, String nomeString, char sexo, String telefone, String indereco) {
		
		this.id = id;
		this.nomeString = nomeString;
		this.sexo = sexo;
		this.telefone = telefone;
		this.indereco = indereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeString() {
		return nomeString;
	}
	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getIndereco() {
		return indereco;
	}
	public void setIndereco(String indereco) {
		this.indereco = indereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	
	
}
