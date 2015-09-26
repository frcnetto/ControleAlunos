package br.estacio.dsw.model;

import java.util.ArrayList;

public class Media {
	private int			 			 id;
	private ArrayList<Prova> provas;
	private String					 formula;
	
	public Media(){
		provas  = new ArrayList<Prova>();
		formula = "";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Prova> getProvas() {
		return provas;
	}
	
	public void setProvas(ArrayList<Prova> provas) {
		this.provas = provas;
	}
	
	public String getFormula() {
		return formula;
	}
	
	public void setFormula(String formula) {
		this.formula = formula;
	}
}
