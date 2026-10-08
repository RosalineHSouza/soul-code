package org.example.aula11;

import java.util.HashMap;

public class AulaHashMap {
    static void main() {

        /*
        .put("Ana", 28);
        .get("Ana");
        .getOrDefault("Zoe", 0);
        .containsKey("Ana");
        .containsValue(28);
        .remove("Ana");
        .size();
        .isEmpty();
        .keySet();
        .values();
        putAll(Map.of())
        */

        HashMap<String, String> emails = new HashMap<>();

        emails.put("Ane","teste123@gmail.com");
        emails.put("Paloma","paloma456@gmail.com");
        emails.put("posicao 2","qualquer coisa");

        System.out.println(emails.get("Ane"));
        System.out.println(emails.get("posicao 2"));
        System.out.println(emails.get("Paloma"));

        System.out.println(emails.get("Olá!")); // retorna null

        // Como um tratamento de exceção
        System.out.println(emails.getOrDefault("Olá", "Posição inválida!"));

        System.out.println(emails.getOrDefault("Ane", "Posição inválida!"));

        System.out.println(emails.keySet()); // retorna todas as chaves

        System.out.println(emails.values()); // retorna todos os valores

        // Verifica se a chave existe (se está contida)
        System.out.println(emails.containsKey("Ane")); // retorna true
        System.out.println(emails.containsKey("Paloma")); //retorna true
        System.out.println(emails.containsKey("Brigite")); // retorna false





    }

}
