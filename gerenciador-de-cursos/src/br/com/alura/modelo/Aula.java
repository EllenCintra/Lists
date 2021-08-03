package br.com.alura.modelo;

public class Aula implements Comparable<Aula>{
	public String titulo;
	public int duracao;
	public Curso curso;
	
	public Aula (String t, int d, Curso c)
	{
		this.titulo = t;
		this.duracao = d;
		this.curso = c;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		return titulo + ", duração de " + duracao + "min";
	}

	@Override
	public int compareTo(Aula o) {
		return this.titulo.compareTo(o.titulo);
	}

}