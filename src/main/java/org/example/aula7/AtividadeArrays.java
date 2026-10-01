package org.example.aula7;

import java.util.Scanner;

public class AtividadeArrays {
    static void main() {

        // 1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] nomes = {"João", "José", "Maria", "Ana", "Clara"};

        System.out.println("Primeira pessoa: " + nomes[0]);
        System.out.println("Terceira pessoa: " + nomes[2]);
        System.out.println("Última pessoa: " + nomes[nomes.length - 1]);

        // 2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas,
        // uma por linha, assim: "Nota 1: 8".

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {

            System.out.println("Nota " + i + ": " + notas[i]);

        }

        // 3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

        int soma = 0;

        for (int i = 0; i < notas.length; i++){

            soma += notas[i];

        }

        System.out.println("A soma das notas é: " + soma);
        System.out.println("A média das notas é: " + soma / notas.length);

        // 4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás para frente.

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++){

            System.out.println("Digite um número: ");
            notas[i] = sc.nextInt();

        }

        for (int i = notas.length - 1; i >= 0; i--){

            System.out.println("Mostrando de trás para frente. Posição: " + i + " - Número: " + notas[i]);

        }
    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=58427" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\SoulCode\target\classes org.example.aula7.AtividadeArrays
Primeira pessoa: João
Terceira pessoa: Maria
Última pessoa: Clara
Nota 0: 8
Nota 1: 6
Nota 2: 10
Nota 3: 7
Nota 4: 9
A soma das notas é: 40
A média das notas é: 8
Digite um número:
1
Digite um número:
2
Digite um número:
3
Digite um número:
4
Digite um número:
5
Mostrando de trás para frente. Posição: 4 - Número: 5
Mostrando de trás para frente. Posição: 3 - Número: 4
Mostrando de trás para frente. Posição: 2 - Número: 3
Mostrando de trás para frente. Posição: 1 - Número: 2
Mostrando de trás para frente. Posição: 0 - Número: 1

Process finished with exit code 0
*/