package org.example.listarevisao041026;

import java.util.Scanner;

public class Condicionais {

    static void main() {

        /*

        Condicionais
        Peça a idade e diga se a pessoa é maior ou menor de idade.

        Peça um número e diga se ele é par ou ímpar.

        Peça dois números e diga qual é o maior. Se forem iguais, avise.

        Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".

        Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.

        Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.

        🔥 Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero;
        dois iguais → Isósceles; todos diferentes → Escaleno.

        💡 A ordem dos testes importa. Repare que um triângulo equilátero também tem dois lados iguais —
        então, se o teste do isósceles vier primeiro, nenhum equilátero vai ser encontrado.

        */

        // Peça a idade e diga se a pessoa é maior ou menor de idade.

        int idade;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        if(idade >= 18) {

            System.out.println("Você é maior de idade!");

        } else {

            System.out.println("Você não é maior de idade!");

        }

        // Peça um número e diga se ele é par ou ímpar.

        int numero;

        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if(numero % 2 == 0) {

            System.out.println("O número é par!");

        } else {

            System.out.println("O número é ímpar!");

        }

        // Peça dois números e diga qual é o maior. Se forem iguais, avise.

        int outroNumero;
        int maisOutroNumero;

        System.out.println("Digite um número: ");
        outroNumero = sc.nextInt();

        System.out.println("Digite outro número: ");
        maisOutroNumero = sc.nextInt();

        if(outroNumero > maisOutroNumero) {

            System.out.println("O número " + outroNumero + " é maior que o número " + maisOutroNumero);

        }

        else if(outroNumero < maisOutroNumero) {

            System.out.println("O número " + outroNumero + " é menor que o número " + maisOutroNumero);

        }

        else {

            System.out.println(outroNumero + " é igual ao número " + maisOutroNumero);

        }

        // Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".

        double nota;

        System.out.println("Digite uma nota; ");
        nota = sc.nextDouble();

        if(nota >= 7) {

            System.out.println("Aprovada!");

        }

        else if(nota >= 5) {

            System.out.println("Recuperação!");

        }

        else {

            System.out.println("Reprovada!");

        }

        // Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.

        int opcao;

        System.out.println("Escolha seu tipo favorito de sorvete: ");
        opcao = sc.nextInt();

        switch(opcao) {

            case 1:

                System.out.println("Baunilha");
                break;

            case 2:

                System.out.println("Napolitano");
                break;

            case 3:

                System.out.println("Pavê de cupuaçu");
                break;

            default:

                System.out.println("Você não escolheu nenhum sabor! Até mais!");

        }

        // Peça a idade e diga o valor do ingresso: menos de 12 ou 60 ou mais paga R$ 10; o resto paga R$ 25.


        int outraIdade;

        System.out.println("Digite a sua idade: ");
        outraIdade = sc.nextInt();

        if(outraIdade < 12 || outraIdade >= 60) {

            System.out.println("O preço do ingresso é R$ 10,00");

        }

        else {

            System.out.println("O preço do ingresso é R$ 25,00");

        }

        // Mini-desafio

        int ladoA;
        int ladoB;
        int ladoC;

        System.out.println("Digite o lado a de um triângulo: ");
        ladoA = sc.nextInt();

        System.out.println("Digite o lado b de um triângulo: ");
        ladoB = sc.nextInt();

        System.out.println("Digite o lado c de um triângulo: ");
        ladoC = sc.nextInt();

        // Se lado == ladoB E lado B == ladoC, logo, ladoA == lado C
        // Não precisa colocar (ladoA == ladoC) no laço

        if( (ladoA == ladoB) && (ladoB == ladoC)) {

            System.out.println("O seu triângulo é equilátero");

        }

        else if( (ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {

            System.out.println("O seu triângulo é isósceles");

        }

        else {

            System.out.println("O seu triângulo é escaleno");

        }

    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=51638" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.Condicionais
Digite a sua idade:
20
Você é maior de idade!

Digite um número:
14
O número é par!

Digite um número:
18
Digite outro número:
37
O número 18 é menor que o número 37

Digite uma nota;
7
Aprovada!

Escolha seu tipo favorito de sorvete:
3
Pavê de cupuaçu

Digite a sua idade:
18
O preço do ingresso é R$ 25,00

Digite o lado a de um triângulo:
3
Digite o lado b de um triângulo:
4
Digite o lado c de um triângulo:
5
O seu triângulo é escaleno

Process finished with exit code 0


*/