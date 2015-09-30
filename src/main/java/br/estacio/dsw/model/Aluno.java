package br.estacio.dsw.model;

public class Aluno {
	private int matricula;
	private String nome;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	
	public Aluno(){
		nome	  = "";
		nota1 = 0;
		nota2 = 0;
		nota3 = 0;
		setMedia();
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
	
	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota3() {
		return nota3;
	}

	public void setNota3(float nota3) {
		this.nota3 = nota3;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getMedia() {
		return (nota1 + nota2 + nota3)/3;
	}

	public void setMedia() {
		media = (nota1 + nota2 + nota3)/3;
	}
}
