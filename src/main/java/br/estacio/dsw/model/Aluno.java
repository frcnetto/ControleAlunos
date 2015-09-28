package br.estacio.dsw.model;

import java.util.ArrayList;

public class Aluno {
	private int				 matricula;
	private String			 nome;
	private Media			 media;
	private ArrayList<Prova> provas;
	private ArrayList<Trabalho> trabalhos;
	private float			 nota;
	
	public Aluno(){
		nome	  = "";
		media = new Media();
		provas = new ArrayList<Prova>();
		trabalhos = new ArrayList<Trabalho>();
		nota	  = 0;
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
	
	public Media getMedia() {
		return media;
	}
	
	public void setMedia(Media media) {
		this.media = media;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}

	public ArrayList<Prova> getProvas() {
		return provas;
	}

	public void setProvas(ArrayList<Prova> provas) {
		this.provas = provas;
	}

	public ArrayList<Trabalho> getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(ArrayList<Trabalho> trabalhos) {
		this.trabalhos = trabalhos;
	}
}
