package org.example.listarevisao041026;

import static org.example.listarevisao041026.Metodos.*; // importando a classe Metodos para facilitar a execução

public class Main {

    static void main() {

        // Crie um método mostrarBoasVindas() que imprime uma mensagem. Chame no main.

        mostrarBoasVindas();

        // Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.

        saudacao("Rosaline");
        saudacao("Flora");
        saudacao("Monica");

        // Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.

        dobro(40);

        // Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.

        calcularMedia(8.0, 9.0);

        // Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.

        ehPar(45);

        // Crie dois métodos somar: um que recebe dois números e outro que recebe três.

        somarDoisNumeros(10, 20);
        somarTresNumeros(10, 20, 30);

        // Mini-desafio

        liberarEntrada(12);

    }
}

/*

*** Evidências de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=62221" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.Main

Seja muito bem-vinda ao nosso curso Java + IA!

Olá, Rosaline!
Olá, Flora!
Olá, Monica!

O dobro de 40 é: 80

A média entre 8,00 e 9,00 é 8,50

O número 45 é ímpar!

O resultado da soma de 10 mais 20 é: 30
O resultado da soma de 10 mais 20 e mais 30 é: 60

Você não é maior de idade! Vá para casa e estude Java!

Process finished with exit code 0

*/

