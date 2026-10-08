package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class AulaQueue {

    static void main() {

        /*
        .add("Ana");
        .peek();
        .poll();
        .isEmpty();
        .size();
        .contains("Bia");
        .addAll(List.of("Ana","Bia"));

        */

        // Cria e popula a fial

        ArrayDeque<String> fila = new ArrayDeque<>();

        // Verifica se a fila está vazia

        /*
        if (fila.isEmpty()){
        */

        fila.add("Flora");
        fila.add("Ana");
        fila.addAll(List.of("Maria", "Natalia", "Jamily", "Kerou", "Giovanna"));

        // Lista a fila

        System.out.println(fila);

        // Lista o primeiro elemento

        System.out.println(fila.peek());

        // Remove o primeiro elemento da fila

        System.out.println(fila.poll());
        System.out.println(fila);


    }
}
