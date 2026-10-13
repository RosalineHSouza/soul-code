package org.example.listarevisao041026;

import java.util.Scanner;

public class Loops {

    static void main() {

        /*

        Loops
        Imprima os números de 1 a 20, um por linha.

        Imprima a contagem regressiva de 10 até 1 e depois "Fim!".

        Peça um número e mostre a tabuada dele de 1 a 10.

        Imprima só os números pares de 1 a 30.

        Usando for, some todos os números de 1 a 100 e mostre o resultado.

        Refaça o primeiro exercício com while. Compare os dois códigos.

        Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.

        🔥 Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura:

        Digite a altura: 5 * ** *** **** *****
        💡 Você vai precisar de um laço dentro do outro. O de fora controla a linha;
        o de dentro imprime os asteriscos daquela linha. Repare que a quantidade de asteriscos muda conforme a linha.

        */

        // Imprima os números de 1 a 20, um por linha.

        for (int i = 1; i <= 20; i++) {

            System.out.println("Número " + i);

        }

        // Imprima a contagem regressiva de 10 até 1 e depois "Fim!".

        for (int i = 10; i >= 1; i--) {

            System.out.println("Contagem regressiva..." + i);

        }

        System.out.println("FIM!");

        // Peça um número e mostre a tabuada dele de 1 a 10.

        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por gentileza, digite um número e vou mostrar a tabuada dele de 1 a 10!");
        numero = sc.nextInt();

        System.out.println("A tabuada do número " + numero + " é: ");

        for (int i = 1; i <= 10; i++) {

            System.out.println(numero + " X " + i + " = " + (numero * i));

        }

        // Imprima só os números pares de 1 a 30.

        for (int i = 1; i <= 30; i++) {

            if (i % 2 == 0){

                System.out.println("Imprimindo um número par entre 1 e 30: " + i);

            }
        }

        // Usando for, some todos os números de 1 a 100 e mostre o resultado.

        int soma1Ate100 = 0;

        for (int i = 1; i <= 100; i++) {

            soma1Ate100 += i;

        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma1Ate100);

        // Refaça o primeiro exercício com while. Compare os dois códigos.

        int i = 1;

        while (i <= 20) {

            System.out.println("Número " + i);
            i++;

        }

        // Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.

        int energia = 3;

        do {

            System.out.println("Jogando...");
            energia--;

        } while (energia > 0);

        // Mini-desafio

        int asteriscoAltura;

        System.out.println("Digite a altura do triângulo de asteriscos: ");
        asteriscoAltura = sc.nextInt();

        // Fazendo com apenas um laço

        for (int j = 1; j <= asteriscoAltura; j++) {

            System.out.println("*".repeat(j));

        }

        // Fazendo com dois laços conforme pedido pela professora Flora

        for (int j = 1; j <= asteriscoAltura; j++) { // Primeiro laço para o controle das linhas

            for (int l = 1; l <= j; l++) { // Segundo laço para impressão dos "*"

                System.out.print("*");

            }

            System.out.println(); // Troca de linha sem imprimir
        }
    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=63055" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.Loops
Número 1
Número 2
Número 3
Número 4
Número 5
Número 6
Número 7
Número 8
Número 9
Número 10
Número 11
Número 12
Número 13
Número 14
Número 15
Número 16
Número 17
Número 18
Número 19
Número 20

Contagem regressiva...10
Contagem regressiva...9
Contagem regressiva...8
Contagem regressiva...7
Contagem regressiva...6
Contagem regressiva...5
Contagem regressiva...4
Contagem regressiva...3
Contagem regressiva...2
Contagem regressiva...1
FIM!

Por gentileza, digite um número e vou mostrar a tabuada dele de 1 a 10!
9
A tabuada do número 9 é:
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

Imprimindo um número par entre 1 e 30: 2
Imprimindo um número par entre 1 e 30: 4
Imprimindo um número par entre 1 e 30: 6
Imprimindo um número par entre 1 e 30: 8
Imprimindo um número par entre 1 e 30: 10
Imprimindo um número par entre 1 e 30: 12
Imprimindo um número par entre 1 e 30: 14
Imprimindo um número par entre 1 e 30: 16
Imprimindo um número par entre 1 e 30: 18
Imprimindo um número par entre 1 e 30: 20
Imprimindo um número par entre 1 e 30: 22
Imprimindo um número par entre 1 e 30: 24
Imprimindo um número par entre 1 e 30: 26
Imprimindo um número par entre 1 e 30: 28
Imprimindo um número par entre 1 e 30: 30

A soma dos números de 1 a 100 é: 5050

Número 1
Número 2
Número 3
Número 4
Número 5
Número 6
Número 7
Número 8
Número 9
Número 10
Número 11
Número 12
Número 13
Número 14
Número 15
Número 16
Número 17
Número 18
Número 19
Número 20

Jogando...
Jogando...
Jogando...

Digite a altura do triângulo de asteriscos:
20

*** Com apenas um laço ***

*
**
***
****
*****
******
*******
********
*********
**********
***********
************
*************
**************
***************
****************
*****************
******************
*******************
********************

*** Com dois laços a pedido da professora Flora ***

*
**
***
****
*****
******
*******
********
*********
**********
***********
************
*************
**************
***************
****************
*****************
******************
*******************
********************

Process finished with exit code 0

*/
