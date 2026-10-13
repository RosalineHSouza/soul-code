package org.example.listarevisao041026;

import java.util.Scanner;

public class ManipulaString {

    static void main() {

        /*

        Strings
        Peça o nome completo e mostre quantas letras ele tem.

        Peça o nome e mostre em MAIÚSCULO e em minúsculo.

        Peça o nome e mostre a primeira letra.

        Peça uma frase e uma palavra. Diga se a palavra aparece na frase.

        Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.

        Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).

        🔥 Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra,
        ignorando maiúscula e minúscula.
        Exemplos: ana → sim · Ovo → sim · casa → não

        💡A primeira letra está na posição 0. A última está na posição length() - 1, porque a contagem começa no zero.
        E para ignorar maiúscula, converta a palavra inteira antes de comparar.

        */

        // Peça o nome completo e mostre quantas letras ele tem.

        String nomeCompleto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();

        System.out.println("O nome completo possui " + nomeCompleto.length() + " letras e espaços em branco.");

        // Peça o nome e mostre em MAIÚSCULO e em minúsculo.

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();

        System.out.println("O nome completo em maiúsculas (caixa alta) é: " + nomeCompleto.toUpperCase());

        System.out.println("O nome completo em minúsculas (caixa baixa) é: " + nomeCompleto.toLowerCase());

        // Peça o nome e mostre a primeira letra.

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();

        System.out.println("A primeira letra do seu nome é: " + nomeCompleto.charAt(0));

        // Peça uma frase e uma palavra. Diga se a palavra aparece na frase.

        String frase;
        String palavra;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();

        // Verifica se frase contém a palavra

        if(frase.contains(palavra)) {

            System.out.println("A frase '" + frase + "' " + "contém a palavra '" + palavra + "'");

        }

        else {

            System.out.println("A frase '" + frase + "' " + "não contém a palavra '" + palavra + "'");

        }

        // Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.

        String nomeUmaVez;
        String nomeOutraVez;

        System.out.println("Digite seu nome uma vez: ");
        nomeUmaVez = sc.nextLine();

        System.out.println("Digite seu nome outra vez: ");
        nomeOutraVez = sc.nextLine();

        // Verifica se os nomes digitados são iguais ignorando a caixa alta

        if(nomeUmaVez.equalsIgnoreCase(nomeOutraVez)) {

            System.out.println("Os nomes digitados são iguais, ignorando a caixa alta (maiúsculas)");

        }

        else {

            System.out.println("Os nomes digitados não são iguais, mesmo ignorando a caixa alta (maiúsculas)");

        }

        // Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).

        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.nextLine();

        System.out.println("O nome completo, em maiúsculas e sem espaços nas pontas, é: " +
                nomeCompleto.toUpperCase().trim());

        // Bônus ==> removendo espaços no meio da string

        System.out.println("O nome completo, em maiúsculas e sem espaços no meio, é: " +
                nomeCompleto.toUpperCase().replace(" ",""));

        // Mini-deafio

        String outraPalavra;

        System.out.println("Digite uma palavra: ");
        outraPalavra = sc.nextLine();

        // Covertendo a palavra para minúsculas antes da comparação

        outraPalavra = outraPalavra.toLowerCase();

        // Armazenando a primeira e a última letra da palavra digitada

        Character primeiraLetra = outraPalavra.charAt(0); // Primeira letra
        Character ultimaLetra = outraPalavra.charAt( (outraPalavra.length() - 1) ); // Última letra

        // Realizando a comparação para saber
        // se a palavra começa e termina com a mesma letra

        if (primeiraLetra.equals(ultimaLetra)) { // Comparando a primeira com a última letra

            System.out.println("A palavra " + outraPalavra + " começa e termina com a mesma letra: " +
                    outraPalavra.charAt(0));

        }

        else {

            System.out.println("A palavra " + outraPalavra + " começa e termina com letras diferentes: " +
                    outraPalavra.charAt(0) + " e " + outraPalavra.charAt( (outraPalavra.length() - 1) ));

        }

    }
}

/*

*** Evidências de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=55088" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.ManipulaString
Digite seu nome completo:
Rosaline Helena de Souza
O nome completo possui 24 letras e espaços em branco.

Digite seu nome completo:
Rosaline Helenna de Souza
O nome completo em maiúsculas (caixa alta) é: ROSALINE HELENNA DE SOUZA
O nome completo em minúsculas (caixa baixa) é: rosaline helenna de souza

Digite seu nome completo:
Rosaline Helenna de Souza
A primeira letra do seu nome é: R

Digite uma frase:
Hoje será um dia maravilhoso!
Digite uma palavra:
Pipoca
A frase 'Hoje será um dia maravilhoso!' não contém a palavra 'Pipoca'

Digite seu nome uma vez:
Rosaline
Digite seu nome outra vez:
rosaline
Os nomes digitados são iguais, ignorando a caixa alta (maiúsculas)

Digite seu nome completo:
Rosaline Helenna de Souza
O nome completo, em maiúsculas e sem espaços nas pontas, é: ROSALINE HELENNA DE SOUZA
O nome completo, em maiúsculas e sem espaços no meio, é: ROSALINEHELENNADESOUZA

Digite uma palavra:
Abracadabra
A palavra abracadabra começa e termina com a mesma letra: a

Digite uma palavra:
Ovomaltine
A palavra ovomaltine começa e termina com letras diferentes: o e e

Process finished with exit code 0

*/
