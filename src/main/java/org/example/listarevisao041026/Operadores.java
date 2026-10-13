package org.example.listarevisao041026;

public class Operadores {

    public static void main(String[] args){

        /*

        Operadores
        Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.

        Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

        Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.

        Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

        Crie um número e imprima o resto da divisão dele por 2.

        Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.

        🔥 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if,
        imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?

        💡 Uma comparação já produz true ou false sozinha — não precisa de if pra isso.
        E um número é divisível por outro quando o resto da divisão é zero.

        */

        // Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.

        int a1 = 15;
        int b1 = 4;

        System.out.println("O resultado de a1 + b1 (soma) é: " + (a1 + b1));
        System.out.println("O resultado de a1 - b1 (subtração) é: " + (a1 - b1));
        System.out.println("O resultado de a1 * b1 (multiplicação) é: " + (a1 * b1));
        System.out.println("O resultado de a1 / b1 (divisão) é: " + (a1 / b1));
        System.out.println("O resultado de a1 % b1 (resto da divisão) é: " + (a1 % b1));

        // Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.

        int saldo = 1000;

        System.out.println("O saldo inicial é: " + saldo);

        saldo += 250;

        saldo -= 380;

        System.out.println("O saldo final, após as operações, é: " + saldo);

        // Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.

        int a2 = 10;
        int b2 = 10;

        System.out.println("O resultado de a2 == b2 é: " + (a2 == b2));
        System.out.println("O resultado de a2 != b2 é: " + (a2 != b2));
        System.out.println("O resultado de a2 > b2 é: " + (a2 > b2));
        System.out.println("O resultado de a2 >= b2 é: " + (a2 >= b2));

        // Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.

        int outraIdade = 20;
        boolean temCarteira1 = true;

        System.out.println("Você tem mais de 18 anos e possui carteira de motorista? " +
                (outraIdade >= 18 && temCarteira1));

        // Crie um número e imprima o resto da divisão dele por 2.

        int outroNumero = 1501;

        System.out.println("O resto da divisão de " + outroNumero + " por 2 é: " + (outroNumero % 2));

        // Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.

        System.out.printf("O resultado da compra de 3 kg de arroz a R$ 3,50 cada é: R$ %.2f\n" , (3 * 3.50));

        // Mini-desafio

        int umNumeroQualquer = 150;

        System.out.println("O número é dívisível por 3 e 5 ao mesmo tempo? " +
                (umNumeroQualquer % 3 == 0 && umNumeroQualquer % 5 == 0));

    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=51651" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.Operadores
O resultado de a1 + b1 (soma) é: 19
O resultado de a1 - b1 (subtração) é: 11
O resultado de a1 * b1 (multiplicação) é: 60
O resultado de a1 / b1 (divisão) é: 3
O resultado de a1 % b1 (resto da divisão) é: 3

O saldo inicial é: 1000
O saldo final, após as operações, é: 870

O resultado de a2 == b2 é: true
O resultado de a2 != b2 é: false
O resultado de a2 > b2 é: false
O resultado de a2 >= b2 é: true

Você tem mais de 18 anos e possui carteira de motorista? true

O resto da divisão de 1501 por 2 é: 1

O resultado da compra de 3 kg de arroz a R$ 3,50 cada é: R$ 10,50

O número é dívisível por 3 e 5 ao mesmo tempo? true

Process finished with exit code 0

*/


