package org.example.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtividadeTratamentoExcecoes {

    static void main() {


        // 1 — Faça um programa que peça dois números inteiros e mostre a divisão do
        // primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a
        // ArithmeticException e mostre uma mensagem explicando que não dá para dividir por
        // zero.

        int dividendo;
        int divisor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número (dividendo): ");
        dividendo = sc.nextInt();

        System.out.println("Digite outro número (divisor):");
        divisor = sc.nextInt();

        System.out.println("Vamos mostrar o quociente do dividendo pelo divisor: ");

        try {

            System.out.println(dividendo / divisor);

        } catch (ArithmeticException e) {

            System.out.println("Não se pode dividir por 0!");

        }


        // 2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição.
        // Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

        int[] notas = {0,2, 6, 8, 10};
        int posicao;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Por gentileza, digite uma posição para eu exibir uma nota: ");
        posicao = sc1.nextInt();

        try {

            System.out.println("A posição é " + posicao + " e nela a nota é: " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("O array de nota tem apenas 4 posições");

        }

        // 3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número,
        // trate a InputMismatchException e mostre uma mensagem pedindo um número.

        int idade;

        Scanner sc2 = new Scanner(System.in);

        try {

            System.out.println("Por gentileza, digite sua idade: ");
            idade = sc2.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Você digitou um texto! Por gentileza, digite apenas números!");

        }

        // 4 — Crie uma variável String nome = null; e tente imprimir nome.length().
        // Trate a NullPointerException e mostre "O nome não foi preenchido."

        String nome = null;

        try {

            System.out.println("O tamanho do nome digitado é: " + nome.length());

        } catch (NullPointerException e) {

            System.out.println("O nome não foi preenchido!");

        }

        // 5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número.
        // Trate a ArithmeticException para o caso de ela digitar 0.

        int numero;

        Scanner sc3 = new Scanner(System.in);

        System.out.println("Por gentieza, digite um número e vou exibir o resto da divisão de 100 por ele: ");
        numero = sc3.nextInt();

        try {

            System.out.println("O resto da divisão de 100 por " + numero + " é:" + 100 / numero);

        } catch (ArithmeticException e) {

            System.out.println("Você não pode digitar " + numero + " como divisor!");

        }

        // 6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a
        // ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe."
        // Depois do try/catch, imprima "O programa continua funcionando."

        String[] nomes = {"João", "José", "Pedro"};

        try {

            System.out.println("A posição 5 do array de nomes é: " + nomes[5]);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Esta posição não existe!");

        } finally {

            System.out.println("O programa continua funcionando!");

        }

        sc.close();
        sc1.close();
        sc2.close();
        sc3.close();

        /*

        *** Evidência de execução ***

        C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=56986" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.aula10.AtividadeTratamentoExcecoes
        Digite um número (dividendo):
        20
        Digite outro número (divisor):
        0
        Vamos mostrar o quociente do dividendo pelo divisor:
        Não se pode dividir por 0!

        Por gentileza, digite uma posição para eu exibir uma nota:
        6
        O array de nota tem apenas 4 posições

        Por gentileza, digite sua idade:
        Amor
        Você digitou um texto! Por gentileza, digite apenas números!

        O nome não foi preenchido!

        Por gentieza, digite um número e vou exibir o resto da divisão de 100 por ele:
        0
        Você não pode digitar 0 como divisor!

        Esta posição não existe!

        O programa continua funcionando!

        Process finished with exit code 0


        */



    }

}