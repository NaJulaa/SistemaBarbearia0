package model;

public class ServicoModel {
	
	private int id;
	private String descricaoString;
	private float valor;
	
	public ServicoModel(int id, String descricaoString, float valor) {
		this.id = id;
		this.descricaoString = descricaoString;
		this.valor = valor;
	}

	public String getDescricaoString() {
		return descricaoString;
	}

	public void setDescricaoString(String descricaoString) {
		this.descricaoString = descricaoString;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	

}
