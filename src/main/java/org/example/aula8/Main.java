package org.example.aula8;

import java.util.Scanner;

import static org.example.aula8.Utilidades.*; // importando a classe para facilitar a execução

public class Main {

    // 1 — Na mesma classe do main, crie um método
    //  chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main

    static void mostrarBoasVindas() {

        System.out.println("Bem-vindo ao curso de Java!");

    }

    static void main() {

        mostrarBoasVindas();

        // 2 — Crie um método saudar(String nome) que imprime
        //  "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.

        System.out.println(saudar("Rosaline"));
        System.out.println(saudar("Flora"));
        System.out.println(saudar("Angélica"));


        // 3 — Crie um método dobro(int numero) que devolve o dobro do número recebido.
        //  No main, chame ele e mostre o resultado.

        System.out.println("O dobro de 4 é: " + dobro(4));

        // 4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas.
        //  No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.

        double n1;
        double n2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        System.out.printf("A média da primeira e da segunda nota é: %.2f\n" , calcularMedia(n1, n2));


        // 5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false.
        //  No main, peça a idade e use o retorno do método dentro de um if
        //  para imprimir se a pessoa é maior ou menor de idade.

        int idade;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        idade = sc1.nextInt();

        if (ehMaiorDeIdade(idade)) {

            System.out.println("A pessoa é maior de idade!");
        }

        else {

            System.out.println("A pessoa é menor de idade!");
        }


        //    6 — Crie três métodos com o mesmo nome somar:
        //
        //    um que recebe dois inteiros
        //    um que recebe três inteiros
        //    um que recebe dois decimais

        //    No main, chame os três e veja o Java escolher sozinho qual usar.

        System.out.println("Selecionando um dos métodos somar: " + somar(4, 5));
        System.out.println("Selecionando um dos métodos somar: " + somar(7, 8, 9));
        System.out.println("Selecionando um dos métodos somar: " + somar(9.7, 5.4));

        // 7 — Crie dois métodos chamados saudacao:
        //
        //um sem parâmetro, que imprime "Olá!"
        //um que recebe um nome, e imprime "Olá, [nome]!"

        // Testando o primeiro método saudacao
        
        System.out.println(saudacao());

        // Testando o segundo método saudacao

        String nome;

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = sc2.nextLine();

        System.out.println(saudacao(nome));

        sc.close();

    }

}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=54090" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\SoulCode\target\classes org.example.aula8.Main

Bem-vindo ao curso de Java!

Olá, Rosaline. Tudo bem?
Olá, Flora. Tudo bem?
Olá, Angélica. Tudo bem?

O dobro de 4 é: 8

Digite a primeira nota:
9
Digite a segunda nota:
8
A média da primeira e da segunda nota é: 8,50

Digite a sua idade:
58
A pessoa é maior de idade!

Selecionando um dos métodos somar: 9
Selecionando um dos métodos somar: 24
Selecionando um dos métodos somar: 15.1

Olá!
Digite o seu nome:

Rosaline
Olá,Rosaline!

Process finished with exit code 0

*/