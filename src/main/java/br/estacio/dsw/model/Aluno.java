package br.estacio.dsw.model;

public class Aluno {
	private int				 matricula;
	private String			 nome;
	private Media			 media;
	private float			 nota;
	
	public Aluno(){
		nome	  = "";
		media = new Media();
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
}
