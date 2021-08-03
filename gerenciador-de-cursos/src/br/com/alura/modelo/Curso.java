package br.com.alura.modelo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private static int tempoTotal;
    
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
    	//List<Aula>aulas = this.getAulas();
    	aulas.forEach(aula -> tempoTotal += aula.duracao); 
    	return tempoTotal;
    }
    
    public int getTempoTotal2() {
    	return this.aulas.stream().mapToInt(a -> a.getDuracao()).sum();
    }
    
    @Override
    public String toString() {
		return "[Curso: " + this.nome + ", tempo total: " + this.tempoTotal + ", aulas: " + aulas;	
    }
}
