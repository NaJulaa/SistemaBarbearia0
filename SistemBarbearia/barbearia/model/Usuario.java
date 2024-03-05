package model;

import java.sql.Date;

public class Usuario {
	private String Senha;
	private String nivelAcesso;
	private int id;
	private String nomeString;
	private char sexo;
	private Date dataNascimento;
	private String telefone;
	private String email;
	private String rg;
	
	public Usuario(String senha, String nivelAcesso, int id, String nomeString, char sexo, Date dataNascimento,
			String telefone, String email, String rg) {
		
		Senha = senha;
		this.nivelAcesso = nivelAcesso;
		this.id = id;
		this.nomeString = nomeString;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
	}
	//Obrigatórios
	public Usuario(String senha, int id, String nomeString) {
		super();
		Senha = senha;
		this.id = id;
		this.nomeString = nomeString;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getNivelAcesso() {
		return nivelAcesso;
	}
	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
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
	
	
	
	

}
	
	

