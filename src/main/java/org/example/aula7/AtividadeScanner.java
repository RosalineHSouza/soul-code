package org.example.aula7;

import java.util.Scanner;

public class AtividadeScanner {
    static void main() {

       // 1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos
       // e vai fazer 29 no próximo aniversário."

        String nome;
        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Oi, " + nome + "! " + "Você tem " + idade + " anos e vai fazer " + (idade + 1) +
                " no próximo aniversário");

        // 2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

        int umNumero;
        int outroNumero;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        umNumero = sc1.nextInt();

        System.out.println("Digite outro número inteiro: ");
        outroNumero = sc1.nextInt();

        System.out.println("A soma dos dois números é: " + (umNumero + outroNumero));
        System.out.println("A subtração do segundo numero do primeiro é: " + (umNumero - outroNumero));
        System.out.println("O produto dos dois números é: " + (umNumero * outroNumero));
        System.out.println("O quociente da divisão do primeiro pelo segundo é: " + (umNumero / outroNumero));
        System.out.println("O resto da divisão do primeiro pelo segundo é " + (umNumero % outroNumero));

        // 3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais),
        // ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

        int nota;

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite a nota da aluna: ");
        nota = sc2.nextInt();

        if (nota >= 7){

            System.out.println("Aluna aprovada!");

        } else if (nota >= 5){

            System.out.println("Aluna em recuperação!");

        } else {

            System.out.println("Aluna reprovada!");
        }

        // 4 - Peça um número e mostre a tabuada dele de 1 a 10.

        int numero;

        Scanner sc3 = new Scanner(System.in);

        System.out.println("Digite um número para ver a sua tabuada de 1 a 10: ");
        numero = sc3.nextInt();

        System.out.println("Tabuada do número " + numero);

        for (int i = 1; i <= 10; i++){

            System.out.println(numero + " X " + i + " = " + numero * i);

        }

        /*

        *** Evidência de execução ***

        C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=62456" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\SoulCode\target\classes org.example.aula7.AtividadeScanner
        Digite seu nome:
        Rosaline
        Digite sua idade:
        58
        Oi, Rosaline! Você tem 58 anos e vai fazer 59 no próximo aniversário

        Digite um número inteiro:
        17
        Digite outro número inteiro:
        6
        A soma dos dois números é: 23
        A subtração do segundo número do primeiro é: 11
        O produto dos dois números é: 102
        O quociente da divisão do primeiro pelo segundo é: 2
        O resto da divisão do primeiro pelo segundo é 5

        Digite a nota da aluna:
        5
        Aluna em recuperação!

        Digite um número para ver a sua tabuada de 1 a 10:
        9
        Tabuada do número 9
        9 X 1 = 9
        9 X 2 = 18
        9 X 3 = 27
        9 X 4 = 36
        9 X 5 = 45
        9 X 6 = 54
        9 X 7 = 63
        9 X 8 = 72
        9 X 9 = 81
        9 X 10 = 90

        Process finished with exit code 0

        */

    }

}
