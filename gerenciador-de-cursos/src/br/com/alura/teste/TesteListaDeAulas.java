package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.modelo.Aula;

public class TesteListaDeAulas {
	
	public static void main (String[] args) {
		
		Aula aula1 = new Aula("Revisando as ArrayLists", 21, null);
		Aula aula2 = new Aula("Listas de objetos", 20, null);
        Aula aula3 = new Aula("Relacionamento de listas e objetos", 15, null);
        
        List <Aula> aulas = new ArrayList<Aula>();
        aulas.add(aula3);
        aulas.add(aula2);
        aulas.add(aula1);
        
        System.out.println(aulas);
        
        //Collections.sort(aulas);
        
        /**
         * null chama o "padrão". Não existe um padrão pronto para uma classe que foi criada pelo desenvolvedor.
         * Esse método só funcionou pq a classe Aula implementa a interface -Compare- e sobrescreve o método -compareTo-
         * Se isso não fosse feito, ao tentar executar surgiria a  -java.lang.ClassCastException- 
         */
        aulas.sort(null);
        
        aulas.forEach(aula -> System.out.println(aula));
        System.out.println("-------------------------------------------------------");
        
        
        /**
         * Caso eu queira ordenar de outra forma, diferente da que defini como "padrão"
         */

        //Maneira mais enxuta de se fazer o código acima
        aulas.sort(Comparator.comparing(Aula::getDuracao));
        aulas.forEach(aula -> System.out.println(aula));

        /*Caso queira ordenar de nenhuma forma já codificada, tem como definir um método:
        aulas.sort((a1, a2) -> {
        	Integer t1= (Integer)a1.duracao;
        	Integer t2 = (Integer)a2.duracao;
        	return t1.compareTo(t2);
        	});
        aulas.forEach(aula -> System.out.println(aula));
        System.out.println("-------------------------------------------------------");
        */
        
	}

}
