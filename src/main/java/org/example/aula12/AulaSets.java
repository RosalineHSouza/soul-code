package org.example.aula12;

import java.util.HashSet;
import java.util.List;

public class AulaSets {

    static void main() {

        /*
        .add("Ana");
        .contains("Ana");
        .remove("Ana");
        .size();
        .isEmpty();
        .clear();
        .new HashSet<>(lista);
        .addAll(List.of("Ana", "Bia", "Carla"));

        */

        // HashSet<String> set = new HashSet<>();

        // 1. Criando um HashSet a partir de uma lista existente

        List<String> lista = List.of("Ana", "Bruno", "Carlos");
        HashSet<String> nomes = new HashSet<>(lista);
        System.out.println("Conjunto inicial: " + nomes);

        // 2. .add() - Adiciona um elemento (retorna false se já existir)
        nomes.add("Ana"); // Não fará efeito pois "Ana" já existe
        nomes.add("Daniel");
        System.out.println("Após adicionar elementos: " + nomes);

        // 3. .contains() - Verifica se o elemento existe no conjunto
        boolean temAna = nomes.contains("Ana");
        System.out.println("O conjunto contém 'Ana'? " + temAna);

        // 4. .remove() - Remove o elemento indicado
        nomes.remove("Ana");
        System.out.println("Após remover 'Ana': " + nomes);

        // 5. .size() - Retorna a quantidade de elementos
        int tamanho = nomes.size();
        System.out.println("Tamanho atual do conjunto: " + tamanho);

        // 6. .isEmpty() - Verifica se o conjunto está vazio
        boolean estaVazio = nomes.isEmpty();
        System.out.println("O conjunto está vazio? " + estaVazio);

        // 7. .addAll() - Adiciona todos os elementos de outra coleção
        nomes.addAll(List.of("Ana", "Bia", "Carla"));
        System.out.println("Após o .addAll(): " + nomes);

        // 8. .clear() - Remove todos os elementos de uma vez
        nomes.clear();
        System.out.println("Após o .clear(): " + nomes);
        System.out.println("Está vazio agora? " + nomes.isEmpty());

        /*

        O que você vai notar ao executar:

        • O método .add("Ana") no começo não duplica o nome, mantendo a regra de ouro do HashSet.
        • A ordem que os nomes aparecem no terminal pode ser totalmente diferente da
        . ordem que foram inseridos, pois o HashSet organiza os elementos internamente
        . por códigos de hash para busca rápida.

         */







    }
}

/*
C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=51198" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.aula12.AulaSets
Conjunto inicial: [Bruno, Ana, Carlos]
Após adicionar elementos: [Bruno, Ana, Daniel, Carlos]
O conjunto contém 'Ana'? true
Após remover 'Ana': [Bruno, Daniel, Carlos]
Tamanho atual do conjunto: 3
O conjunto está vazio? false
Após o .addAll(): [Bruno, Carla, Ana, Daniel, Bia, Carlos]
Após o .clear(): []
Está vazio agora? true

Process finished with exit code 0
*/
