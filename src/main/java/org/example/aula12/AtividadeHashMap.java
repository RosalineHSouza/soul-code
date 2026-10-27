package org.example.aula12;

import java.util.HashMap;

public class AtividadeHashMap {

    public static void main(String[] args) {

        // 1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
        //   inteiro e depois use get para mostrar a idade de uma delas.

        HashMap<String, Integer> nomes = new HashMap<>();

        nomes.put("Maria", 18);
        nomes.put("Pedro", 19);
        nomes.put("Jose", 20);

        System.out.println(nomes);

        System.out.println("A idade de Maria é: " + nomes.get("Maria") + " anos");

        // 2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
        //   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
        //   Imprima outra vez e veja o que aconteceu com o tamanho.

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Café", 5.00);

        System.out.printf("O preço do café é: R$ %.2f\n" , produtos.get("Café"));

        produtos.put("Café", 7.50);

        System.out.printf("O preço do café é: R$ %.2f\n" , produtos.get("Café"));

        System.out.println("O tamanho do HashMap é: " + produtos.size());

        // O tamanho continha sendo 1, pois não houve nova inserção e, sim, apenas uma subscrição de valor
        // pois a chave é a mesma e HashMap não admite chaves duplicadas

        // 3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
        //   dentro de um if para mostrar o telefone de alguém que está na agenda
        //   e de alguém que não está.

        HashMap<String, String> agenda = new HashMap<>();

        agenda.put("João","11-99999-9999");
        agenda.put("Maria","11-88888-8888");

        if (agenda.containsKey("João")) {

            System.out.println("O telefone de João é: " + agenda.get("João"));

        } else {

            System.out.println("O telefone de João não está na agenda!");

        }

        if (agenda.containsKey("Tereza")) {

            System.out.println("O telefone de Tereza é: " + agenda.get("Tereza"));

        } else {

            System.out.println("O telefone de Tereza não está na agenda!");

        }

        // 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
        //   Use getOrDefault para mostrar a quantidade de um produto que existe
        //   e de um que não existe (devolvendo 0). Depois tente com get normal
        //   no que não existe e compare.

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Parafuso", 1000);
        estoque.put("Porca", 2000);

        System.out.println(estoque.getOrDefault("Parafuso", 1000));

        System.out.println(estoque.getOrDefault("Arruela", 0));

        System.out.println(estoque.get("Arruela"));

        // O uso de getOrDefault em um produto que não existe devolve a quantidade colocada como parâmetro (0)
        // O uso de get em um produto que não existe devolve null (ele não existe no HashMap criado)

        // 5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
        //   Remova uma delas e imprima de novo.

        HashMap<String, Double> alunas = new HashMap<>();

        alunas.put("Maria", 7.5);
        alunas.put("Ana", 8.5);
        alunas.put("Tereza", 9.5);

        System.out.println(alunas);

        System.out.println(alunas.size());

        alunas.remove("Maria");

        System.out.println(alunas);

    }
}

/*

*** Evidências de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=49324" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.aula12.AtividadeHashMap

{Jose=20, Pedro=19, Maria=18}
A idade de Maria é: 18 anos

O preço do café é: R$ 5,00
O preço do café é: R$ 7,50
O tamanho do HashMap é: 1

O telefone de João é: 11-99999-9999
O telefone de Tereza não está na agenda!

1000
0
null

{Tereza=9.5, Ana=8.5, Maria=7.5}
3
{Tereza=9.5, Ana=8.5}

Process finished with exit code 0

*/
