package br.estacio.dsw.model;

import java.util.ArrayList;

public class Aluno {
	private int				 matricula;
	private String			 nome;
	private ArrayList<Prova> provas;
	private Media			 calcMedia;
	private float			 media;
	
	public Aluno(){
		matricula = 0;
		nome	  = "";
		provas	  = new ArrayList<Prova>();
		calcMedia = new Media();
		media	  = 0;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Prova> getProvas() {
		return provas;
	}
	
	public void setProvas(ArrayList<Prova> provas) {
		this.provas = provas;
	}
	
	public Media getCalcMedia() {
		return calcMedia;
	}
	
	public void setCalcMedia(Media calcMedia) {
		this.calcMedia = calcMedia;
	}
	
	public float getMedia() {
		return media;
	}
	
	public void setMedia(float media) {
		this.media = media;
	}
	
	public float calcMedia() {
		float soma = 0;
		for(Prova prova:this.provas){
			soma += prova.getNota()*prova.getPeso();
		}
		return soma / calcMedia.getProvas().size();
	}
}
