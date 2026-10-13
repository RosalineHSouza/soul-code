package org.example.listarevisao041026;

import java.util.Arrays;
import java.util.Scanner;

public class VetorArrays {

    static void main() {

        /*

        Arrays
        Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.

        Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.

        Com o mesmo array, calcule e imprima a soma e a média.

        Crie um array com 5 números e descubra qual é o maior.

        Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.

        🔥 Mini-desafio — Crie um array com 5 nomes. Peça um nome para pessoa e diga em qual posição ele está.
        Se não estiver na lista, avise.

        💡 Crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei".
        Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.

        */

        // Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.

        String[] nomes = {"João", "José", "Pedro", "Paulo", "Lucas" };

        System.out.println("O array de nomes é: " + Arrays.toString(nomes));

        System.out.println("O primeiro elemento do array de nomes é: " + nomes[0]);
        System.out.println("O terceiro elemento do array de nomes é: " + nomes[2]);
        System.out.println("o último elemento do array de nome é: " + nomes[nomes.length - 1]);

        // Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.

        int[] notas = {8, 6, 10, 7, 9};

        System.out.println("O array de notas é: " + Arrays.toString(notas));

        for(int i = 0; i < notas.length; i++) {

            System.out.println("A nota na posição " + i + " é :" + notas[i]);

        }

        // Com o mesmo array, calcule e imprima a soma e a média.

        int soma = 0;

        for(int i = 0; i < notas.length; i++) {

            soma += notas[i];

        }

        System.out.println("A soma das notas é: " + soma + " e a média das notas é: " + (soma / notas.length));

        // Crie um array com 5 números e descubra qual é o maior.

        int maiorNumero = 0;

        int[] cincoNumeros = {10, 20, 91, 40, 50};

        for(int i = 0; i < cincoNumeros.length; i++) { // Percorre o array inteiro

            // Verifica se o número na posição do array é maior que aquele guardado na variável
            // na verificação anterior. Se for, faz a substituição

            if(cincoNumeros[i] > maiorNumero) {

                maiorNumero = cincoNumeros[i]; // Se for maior faz a substituição

            }

        }

        System.out.println("O array de números é: " + Arrays.toString(cincoNumeros));

        System.out.println("O maior número do array de números acima é: " + maiorNumero);

        // Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.

        int[] outrasNotas = {8, 5, 10, 4, 7};

        int guardaNota = 0;

        for (int i = 0; i < outrasNotas.length; i++) {

            if(outrasNotas[i] >= 7) {

                guardaNota++;

            }
        }

        System.out.println("O outro array de notas é: " + Arrays.toString(outrasNotas));

        System.out.println("Há " + guardaNota + " notas maiores ou iguais a 7 no array");

        // Mini-desafio

        int naoEncontrei = -1;

        String[] outrosNomes = {"Eratóstenes", "Plutarco", "Heráclito", "Empédocles", "Sófocles"};

        Scanner sc = new Scanner(System.in);

        String recebaNome;

        System.out.println("Digite um nome para procurarmos no array de nomes: ");
        recebaNome = sc.nextLine();

        for(int i = 0; i < outrosNomes.length; i++) {

            if(recebaNome.equals(outrosNomes[i])) {

                naoEncontrei = i;

            }

        }

        if(naoEncontrei != -1) {

            System.out.println("O outro array de nomes é: " + Arrays.toString(outrosNomes));

            System.out.println("O nome digitado " + recebaNome + " está na posição " + naoEncontrei + " no array ");
        }

        else {

            System.out.println("O outro array de nomes é: " + Arrays.toString(outrosNomes));

            System.out.println("O nome digitado " + recebaNome + " não está em nenhuma posição no array");
        }

    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=57392" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.VetorArrays
O array de nomes é: [João, José, Pedro, Paulo, Lucas]
O primeiro elemento do array de nomes é: João
O terceiro elemento do array de nomes é: Pedro
o último elemento do array de nome é: Lucas

O array de notas é: [8, 6, 10, 7, 9]
A nota na posição 0 é :8
A nota na posição 1 é :6
A nota na posição 2 é :10
A nota na posição 3 é :7
A nota na posição 4 é :9
A soma das notas é: 40 e a média das notas é: 8

O outro array de notas é: [8, 5, 10, 4, 7]
Há 3 notas maiores ou iguais a 7 no array

Digite um nome para procurarmos no array de nomes:
Heráclito
O outro array de nomes é: [Eratóstenes, Plutarco, Heráclito, Empédocles, Sófocles]
O nome digitado Heráclito está na posição 2 no array

Digite um nome para procurarmos no array de nomes:
Manoel
O outro array de nomes é: [Eratóstenes, Plutarco, Heráclito, Empédocles, Sófocles]
O nome digitado Manoel não está em nenhuma posição no array

Process finished with exit code 0

*/
