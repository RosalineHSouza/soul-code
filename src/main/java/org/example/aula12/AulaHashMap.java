package org.example.aula12;

import java.util.HashMap;

public class AulaHashMap {

    public static void main(String[] args) {

        /*

        3. Principais métodos do HashMap
            Método	                Finalidade
            put(chave, valor)	    Adiciona ou atualiza um par
            get(chave)	            Recupera um valor
            remove(chave)	        Remove um par
            containsKey(chave)	    Verifica se a chave existe
            containsValue(valor)	Verifica se o valor existe
            size()	                Retorna a quantidade de pares
            isEmpty()	            Verifica se está vazio
            clear()	                Remove todos os pares
            keySet()	            Retorna o conjunto de chaves
            values()	            Retorna os valores
            entrySet()	            Retorna os pares de chave e valor

         */

        HashMap<Integer, String> alunos = new HashMap<>();

        // Adicionando alunos
        alunos.put(101, "Maria");
        alunos.put(102, "João");
        alunos.put(103, "Ana");

        // Consultando um aluno
        System.out.println(alunos.get(102));

        // Atualizando um cadastro
        alunos.put(103, "Ana Paula");

        // Verificando uma matrícula
        System.out.println(alunos.containsKey(101));

        // Removendo um aluno
        alunos.remove(102);

        // Quantidade de alunos
        System.out.println(alunos.size());

        /*

        5. Como percorrer um HashMap com for-each?
        Lembra do for-each que estudamos com ArrayList?

        Também podemos utilizá-lo com HashMap, mas precisamos escolher o que queremos percorrer.

        Por exemplo:
        */


        for (Integer matricula : alunos.keySet()) {
            System.out.println( matricula + " - " + alunos.get(matricula) );
        }

        // Uma alternativa bastante utilizada é entrySet():

        for (var entrada : alunos.entrySet()) {
            System.out.println( entrada.getKey() + " - " + entrada.getValue() );
        }

        /*

        Nesse caso:
        - entrada.getKey() recupera a matrícula.
        - entrada.getValue() recupera o nome.
        Importante: o HashMap não garante a ordem de inserção. Se precisarmos preservar essa ordem,
        podemos utilizar LinkedHashMap. Se quisermos as chaves ordenadas, podemos utilizar TreeMap.


        */




    }
}
