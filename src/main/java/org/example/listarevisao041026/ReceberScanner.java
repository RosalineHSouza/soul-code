package org.example.listarevisao041026;

import java.util.Scanner;

public class ReceberScanner {

    static void main() {

        /*

        Scanner
        Pergunte o nome da pessoa e responda: "Olá, [nome]!"

        Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.

        Pergunte dois números e mostre a soma.

        Pergunte a altura e o peso e imprima os dois numa frase.

        🔥 Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto).
        Depois imprima tudo numa ficha.

        💡 Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome.
        Quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás.
        O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.

        */

        // Pergunte o nome da pessoa e responda: "Olá, [nome]!"

        String nome;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Seu nome é: " + nome);

        // Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        System.out.println("Você vai fazer " + (idade + 1) + " anos no seu próximo aniversário!");

        // Pergunte dois números e mostre a soma.

        int numero1;
        int numero2;

        System.out.println("Digite um número: ");
        numero1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt();

        System.out.println("A soma dos dois números digitados é: " + (numero1 + numero2));

        // Pergunte a altura e o peso e imprima os dois numa frase.

        double altura;
        double peso;

        System.out.println("Digite a sua altura: ");
        altura = sc.nextDouble();

        System.out.println("Digite o seu peso: ");
        peso = sc.nextDouble();

        System.out.printf("Você tem %.2f m de altura e %.2f Kg de peso\n" , altura , peso);

        // Mini-desafio

        int outraIdade;
        String outroNome;
        String cidade;

        System.out.println("Digite sua idade: ");
        outraIdade = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite seu nome: ");
        outroNome = sc.nextLine();

        System.out.println("Digite sua cidade: ");
        cidade = sc.nextLine();

        System.out.println("Você tem " + outraIdade + " anos de idade. Seu nome é: " + outroNome + " e você " +
                "nasceu ou reside em " + cidade);

        sc.close();

    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=51656" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.ReceberScanner
Digite seu nome:
Ana
Seu nome é: Ana
Digite a sua idade:
20
Você vai fazer 21 anos no seu próximo aniversário!

Digite um número:
10
Digite outro número:
10
A soma dos dois números digitados é: 20

Digite a sua altura:
1,67
Digite o seu peso:
53,61
Você tem 1,67 m de altura e 53,61 Kg de peso

Digite sua idade:
25
Digite seu nome:
Rogéria
Digite sua cidade:
São Paulo
Você tem 25 anos de idade. Seu nome é: Rogéria e você nasceu ou reside em São Paulo

Process finished with exit code 0


*/
