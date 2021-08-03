package br.com.alura.teste;

import java.util.HashSet;
import java.util.Set;

public class ImprimirAlunosSemAcento {
	 public static void main(String[] args) {

	        Set<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    
	        alunos.add("Nico");	
	        alunos.add("paulo");
	        
	 alunos.forEach(aluno -> System.out.println(aluno)); 
	 
	 }
}
