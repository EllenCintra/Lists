package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<Integer>();

        long inicioAdd = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        
        long fimAdd = System.currentTimeMillis();
        
        
        long inicio = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucaoAdd = fimAdd - inicioAdd;
        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto para adicionar: " + tempoDeExecucaoAdd);
        System.out.println("Tempo gasto para buscar: " + tempoDeExecucao);

    }

}
