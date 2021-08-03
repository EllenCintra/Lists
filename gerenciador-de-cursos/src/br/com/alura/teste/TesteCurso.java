package br.com.alura.teste;

import br.com.alura.modelo.Curso;

import java.util.List;

import br.com.alura.modelo.Aula;

public class TesteCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");
     
        Aula aula1 = new Aula ("Trabalhando com ArrayList", 21, javaColecoes); 
        javaColecoes.adiciona(aula1);
        Aula aula2 = new Aula ("Trabalhando com LinkedList", 11, javaColecoes); 
        javaColecoes.adiciona(aula2);
              
        System.out.println(javaColecoes.getAulas());
    }
}
