package org.example.aula2;

public class Aritmeticos {
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

        // Ítem 0

        System.out.println("2 + 2 = " + 2 + 2);

        System.out.println("2 + 2 = " + (2 + 2));

        /*

        No primeiro comando, ocorreu a concatenação. Java avalia a expressão da esquerda para a direita e
        vai concatenando.

        No segundo comando, como foram inseridos parênteses, Java tem de executar primeiro dentro dele.
        Foi realizada a operação matemática de soma.

        Isto também aconteceu, no exercício anterior, quando você pediu a soma de 15 + 4. :-), pois

        Ótimo exercício para fixar o conteúdo!

         */

        // Ítem 1

        int a = 10;
        int b = 3;

        System.out.println("O resultado de a + b é " + (a + b));
        System.out.println("O resultado de a - b é " + (a - b));
        System.out.println("O resultado de a * b é " + (a * b));
        System.out.println("O resultado de a / b é " + (a / b));
        System.out.println("O resto da divisão de a / b é " + (a % b));

        // Ítem 2

        double ad = 10;
        double bd = 3;

        System.out.println("O resultado de a + b é " + (ad + bd));
        System.out.println("O resultado de a - b é " + (ad - bd));
        System.out.println("O resultado de a * b é " + (ad * bd));
        System.out.println("O resultado de a / b é " + (ad / bd));
        System.out.println("O resto da divisão de a / b é " + (ad % bd));

        // Ítem 3

        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;

        System.out.println("A soma das três notas é " + (nota1 + nota2 + nota3));
        System.out.println("A média das três notas é " + ((nota1 + nota2 + nota3) / 3));

        // Ítem 4

        int a1 = 3;
        int b1 = 4;
        int c1 = 5;

        System.out.println("O resultado de a + b * c é " + (a1 + b1 * c1));

        // Ítem 5

        System.out.println("O resultado de (a + b) * c é " + ((a1 + b1) * c1));

        // Desafio

        int segundos = 3785;
        System.out.println("Em 3.785 segundos temos " + (segundos / 60) + " minutos inteiros e restam " + segundos % 60 + " segundos");


    }
}
