package org.example.aula7;

import java.util.Scanner;

public class AtividadeStrings {
    static void main() {

        // 1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        nome = sc.nextLine();

        // 2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

        System.out.println("Seu nome tem " + nome.length() + " letras (contando os espaços em branco)");

        // 2.1 - Mostrando o nome em letras maiúsculas

        System.out.println("Seu nome em caixa alta: " + nome.toUpperCase());

        // 2.2 - Mostrando o nome em letras minúsculas

        System.out.println("Seu nome em caixa baixa: " + nome.toLowerCase());

        // 3 — Peça o nome da pessoa e mostre a primeira letra dele.

        System.out.println("A primeira letra do seu nome é: " + nome.charAt(0));

        // 4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

        String frase;
        String palavra;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();

        if (frase.contains(palavra)) {

            System.out.println("A palavra " + "'" + palavra + "'" + " está contida na frase " + "'" + frase + "'");

        } else {

            System.out.println("A palavra " + "'" + palavra + "'" + " não está contida na frase " + "'" + frase + "'");

        }

        // 5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

        String nomeMaisc;
        String nomeMinus;

        System.out.println("Digite seu nome uma vez em maiúsculas: ");
        nomeMaisc = sc.nextLine();

        System.out.println("Digite seu nome uma vez em minúsculas: ");
        nomeMinus = sc.nextLine();

        if (nomeMaisc.equalsIgnoreCase(nomeMinus)){

            System.out.println("Os nomes são iguais e ignorando maiúsculas e minúsculas (caixa)");
        }

        else {

            System.out.println("Os nomes não são iguais, mesmo ignorando maiúsculas e minúsculas (caixa)");
        }

    }

}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=58419" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\SoulCode\target\classes org.example.aula7.AtividadeStrings
Digite seu nome completo:
Rosaline Helenna de Souza
Seu nome tem 25 letras (contando os espaços em branco)
Seu nome em caixa alta: ROSALINE HELENNA DE SOUZA
Seu nome em caixa baixa: rosaline helenna de souza
A primeira letra do seu nome é: R
Digite uma frase:
Amanhã será um dia esplêndido
Digite uma palavra:
Ornitorrinco
A palavra 'Ornitorrinco' não está contida na frase 'Amanhã será um dia esplêndido'
Digite seu nome uma vez em maiúsculas:
ROSALINE HELENNA DE SOUZA
Digite seu nome uma vez em minúsculas:
rosaline helenna da silva
Os nomes não são iguais, mesmo ignorando maiúsculas e minúsculas (caixa)

Process finished with exit code 0
*/