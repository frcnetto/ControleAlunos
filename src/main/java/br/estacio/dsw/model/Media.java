package br.estacio.dsw.model;

public class Media {
	private int	id;
	private String expressao;
	
	public Media(){
		expressao = "";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getExpressao() {
		return expressao;
	}
	
	public void setExpressao(String formula) {
		this.expressao = formula;
	}
}
