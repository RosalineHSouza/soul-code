package org.example.aula2;

public class Concatenacao {
    static void main() {

        /*

        Concatenação:
        1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."
        2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"
        3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."

        Aritméticos:
        0- Rode esse código:
        System.out.println("2 + 2 = " + 2 + 2);.
        Agora rode:
        System.out.println("2 + 2 = " + (2 + 2));
        Explique em um comentário por que deram resultados diferentes.
        1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
        3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.
        4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
        5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.
        Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.

        Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.

        Cheatsheet:
        Printar na tela:
        System.out.println(); (Com aspas pra texto!!)
        Operadores Aritméticos: +, -, *, /, %

        */

        // Ítem 1
        String nome = "Rosaline";
        String cidade = "São Paulo";
        int idade = 58;

        System.out.println("Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos");

        // Ítem 2
        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$" + preco + " cada. Total: R$ " + (quantidade * preco));

        // Ítem 3
        int numero1 = 15;
        int numero2 = 4;
        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + (numero1 + numero2));

    }
}
