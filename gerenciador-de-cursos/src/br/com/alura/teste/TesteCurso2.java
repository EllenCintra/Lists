package br.com.alura.teste;

import br.com.alura.modelo.Curso;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.modelo.Aula;

public class TesteCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");
     
        Aula aula1 = new Aula ("Trabalhando com LinkedList ", 21, javaColecoes); 
        javaColecoes.adiciona(aula1);
        Aula aula2 = new Aula ("Trabalhando com ArrayList", 11, javaColecoes); 
        javaColecoes.adiciona(aula2);
        
        List<Aula> aulas = new ArrayList<Aula>(javaColecoes.getAulas());
        
        
        aulas.sort(null);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes.getTempoTotal2());
     
        System.out.println(javaColecoes);
    }
}
