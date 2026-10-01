package org.example.aula7;

public class AtividadeEstruturaRepeticao {
    static void main() {

        // 1 - Mostre os números de 1 a 30, um por linha, usando for.

        for (int i = 1; i <= 30; i++) {

            System.out.println("Mostrando o número " + i);

        }

        // 2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".

        System.out.println("Contagem regressiva...!");

        for (int i = 10; i >= 1; i--){

            System.out.println(i + "...");

        }

        System.out.println("Fim!");

        // 3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.

        int i = 1;

        while (i <= 30){

            System.out.println("Mostrando o número " + i);
            i++;

        }

        /* Comparação entre os códigos

        FOR: a inicialização da variável "i" de controle, a condição e o incremento são dados na linha do comando

        WHILE: a inicialização da variá "i" de controle deve ser feita antes do comando.
        No comando vai apenas a condição. O incremento "i++" deve ser realizado dentro do laço

        */

        // 4 - Crie uma variável com um número e mostre a tabuada dele de 1 a 10.

        int numero = 9;

        System.out.println("Tabuada do número " + numero);

        for (int j = 1; j <= 10; j++){

            System.out.println(numero + " X " + j + " = " + numero * j);

        }

        /*

        *** Evidência de execução ***

        C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=55776" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\SoulCode\target\classes org.example.aula7.AtividadeEstruturaRepeticao
        Mostrando o número 1
        Mostrando o número 2
        Mostrando o número 3
        Mostrando o número 4
        Mostrando o número 5
        Mostrando o número 6
        Mostrando o número 7
        Mostrando o número 8
        Mostrando o número 9
        Mostrando o número 10
        Mostrando o número 11
        Mostrando o número 12
        Mostrando o número 13
        Mostrando o número 14
        Mostrando o número 15
        Mostrando o número 16
        Mostrando o número 17
        Mostrando o número 18
        Mostrando o número 19
        Mostrando o número 20
        Mostrando o número 21
        Mostrando o número 22
        Mostrando o número 23
        Mostrando o número 24
        Mostrando o número 25
        Mostrando o número 26
        Mostrando o número 27
        Mostrando o número 28
        Mostrando o número 29
        Mostrando o número 30

        Contagem regressiva...!
        10...
        9...
        8...
        7...
        6...
        5...
        4...
        3...
        2...
        1...
        Fim!

        Mostrando o número 1
        Mostrando o número 2
        Mostrando o número 3
        Mostrando o número 4
        Mostrando o número 5
        Mostrando o número 6
        Mostrando o número 7
        Mostrando o número 8
        Mostrando o número 9
        Mostrando o número 10
        Mostrando o número 11
        Mostrando o número 12
        Mostrando o número 13
        Mostrando o número 14
        Mostrando o número 15
        Mostrando o número 16
        Mostrando o número 17
        Mostrando o número 18
        Mostrando o número 19
        Mostrando o número 20
        Mostrando o número 21
        Mostrando o número 22
        Mostrando o número 23
        Mostrando o número 24
        Mostrando o número 25
        Mostrando o número 26
        Mostrando o número 27
        Mostrando o número 28
        Mostrando o número 29
        Mostrando o número 30

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
