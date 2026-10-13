package org.example.listarevisao041026;

public class ClassesEObjetos {

    static void main() {

        /*

        Classes e objetos
        Crie uma classe Pet com nome, raca e peso. Em outra classe, crie um objeto, preencha e imprima tudo.

        Continuando, crie dois pets diferentes e imprima as duas fichas.

        Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.

        Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.

        🔥 Mini-desafio — Crie uma classe Jogadora com nome e pontos.
        Crie três jogadoras com pontuações diferentes e descubra qual tem a maior pontuação. Imprima o nome dela.

        💡 Compare os atributos pontos de cada objeto, igual você compararia números comuns.
        Guarde numa variável o nome da jogadora com a maior pontuação encontrada até agora.

        */

        // Crie uma classe Pet com nome, raca e peso. Em outra classe, crie um objeto, preencha e imprima tudo.

        Pet caozinho = new Pet();

        caozinho.nome = "Rex";
        caozinho.raca = "Pastor Alemão";
        caozinho.peso = 10.0;

        System.out.println("O pet " + caozinho.nome + " é da raça " + caozinho.raca + " e pesa " + caozinho.peso +
                " Kg.");


        // Continuando, crie dois pets diferentes e imprima as duas fichas.

        Pet gatinho = new Pet();
        Pet doguinho = new Pet();

        gatinho.nome = "Brigitte";
        gatinho.raca = "Maine Coon";
        gatinho.peso = 6.0;

        doguinho.nome = "Marley";
        doguinho.raca = "Golden Retriever";
        doguinho.peso = 12.0;

        System.out.println("O pet " + gatinho.nome + " é da raça " + gatinho.raca + " e pesa " + gatinho.peso +
                " Kg.");

        System.out.println("O pet " + doguinho.nome + " é da raça " + doguinho.raca + " e pesa " + doguinho.peso +
                " Kg.");

        // Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.

        Produto produto = new Produto();

        produto.nome = "Parafuso";
        produto.preco = 5.90;
        produto.quantidade = 100;

        System.out.println("O produto " + produto.nome + " possui " + produto.quantidade + " unidades em estoque.");

        // Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.

        Aluna novaAluna = new Aluna();

        novaAluna.nome = "Rosilda";
        novaAluna.nota1 = 9.0;
        novaAluna.nota2 = 8.0;
        novaAluna.media = ( ( novaAluna.nota1 + novaAluna.nota2 ) / 2 );

        System.out.println("A aluna " + novaAluna.nome + " obteve " + novaAluna.nota1 + " na primeira nota e " +
                novaAluna.nota2 + " na segunda nota, perfazendo a média de " + novaAluna.media);

        // Mini-desafio

        Jogadora numeroUm = new Jogadora();
        Jogadora numeroDois = new Jogadora();
        Jogadora numeroTres = new Jogadora();

        numeroUm.nome = "Alpha";
        numeroUm.pontos = 7000;

        numeroDois.nome = "Beta";
        numeroDois.pontos = 9500;

        numeroTres.nome = "Gama";
        numeroTres.pontos = 9000;

        String maiorPontuadora; // Para guardar o nome da maior pontuadora

        // Realiza as comparações de pontos entre as jogadoras

        if( ( numeroUm.pontos > numeroDois.pontos ) && ( numeroUm.pontos > numeroTres.pontos ) ) {

            maiorPontuadora = numeroUm.nome;

        } else if ( ( numeroDois.pontos > numeroUm.pontos ) && ( numeroDois.pontos > numeroTres.pontos ) ) {

            maiorPontuadora = numeroDois.nome;

        } else {

            maiorPontuadora = numeroTres.nome;

        }

        System.out.println("A maior pontuadora é a jogadora: " + maiorPontuadora);

    }
}

/*

*** Evidência de execução ****

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=60738" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.ClassesEObjetos
O pet Rex é da raça Pastor Alemão e pesa 10.0 Kg.

O pet Brigitte é da raça Maine Coon e pesa 6.0 Kg.
O pet Marley é da raça Golden Retriever e pesa 12.0 Kg.

O produto Parafuso possui 100 unidades em estoque.

A aluna Rosilda obteve 9.0 na primeira nota e 8.0 na segunda nota, perfazendo a média de 8.5

A maior pontuadora é a jogadora: Beta

Process finished with exit code 0

*/
