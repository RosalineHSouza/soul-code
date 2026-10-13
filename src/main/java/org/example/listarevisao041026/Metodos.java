package org.example.listarevisao041026;

public class Metodos {

    /*

    Métodos
    💡 Lembrete: se for criar e chamar os métodos dentro do mesmo arquivo onde está o main, não esqueça de colocar a palavra static antes deles (ex: static void mostrarBoasVindas()).

    Crie um método mostrarBoasVindas() que imprime uma mensagem. Chame no main.

    Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.

    Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.

    Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.

    Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.

    Crie dois métodos somar: um que recebe dois números e outro que recebe três.

    🔥 Mini-desafio — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false.
     Depois crie outro método, liberarEntrada(int idade), que chama o primeiro e imprime
     se a pessoa pode entrar ou não. No main, chame apenas o segundo.

    💡 Um método pode chamar outro normalmente, basta escrever o nome dele.
     E como o primeiro devolve true ou false, esse resultado pode ir direto dentro de um if.

     */

    // ===>> Os métodos serão criados aqui (classe Metodos) dentro e chamados na Main <<===

    // Crie um método mostrarBoasVindas() que imprime uma mensagem. Chame no main.

    static void mostrarBoasVindas() {

        System.out.println("Seja muito bem-vinda ao nosso curso Java + IA!");

    }

    // Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.

    static void saudacao(String nome) {

        System.out.println("Olá, " + nome + "!");

    }

    // Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.

    static void dobro(int numero) {

        System.out.println("O dobro de " + numero + " é:" + ( numero * 2));

    }

    // Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.

    static void calcularMedia(double n1, double n2) {

        System.out.printf("A média entre %.2f e %.2f é %.2f\n", n1, n2, ( ( n1 + n2 ) / 2 ) );

    }

    // Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.

    static void ehPar (int numero) {

        if( ( numero % 2 == 0 ) ) {

            System.out.println("O número " + numero + " é par!");

        }

        else {

            System.out.println("O número " + numero + " é ímpar!");

        }

    }

    // Crie dois métodos somar: um que recebe dois números e outro que recebe três.

    static void somarDoisNumeros (int n1, int n2) {

        System.out.println("O resultado da soma de " + n1 + " mais " + n2 + " é: " + ( n1 + n2 ) );

    }

    static void somarTresNumeros (int n1, int n2, int n3) {

        System.out.println("O resultado da soma de " + n1 + " mais " + n2 + " e mais " + n3 + " é: "
                + ( n1 + n2 + n3 ));

    }

    // Mini-desafio

    static boolean ehMaiorDeIdade(int idade) {

        // Retorna true ou false em função da idade

        if( idade >= 18 ) {

            return true;

        } else {

            return false;
        }

    }

    static void liberarEntrada(int idade) {

        // Não precisa inserir " == true " pois o if avalia e
        // só libera se a condição é verdadeira (true)

        if( ehMaiorDeIdade(idade) ) {

            System.out.println("Você é maior de idade! Pode entrar e divirta-se!");

        } else {

            System.out.println("Você não é maior de idade! Vá para casa e estude Java!");

        }

    }

}
