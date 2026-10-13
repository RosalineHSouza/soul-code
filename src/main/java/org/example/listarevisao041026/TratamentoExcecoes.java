package org.example.listarevisao041026;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecoes {

    static void main() {

        /*

        Tratamento de exceções
        Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.

        Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.

        Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.

        Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.

        Crie um array com 3 nomes e tente imprimir a posição 5. Trate a exceção e, depois do try/catch,
        imprima "O programa continua funcionando."

        🔥 Mini-desafio — Faça um programa com um try e três catch diferentes: um para divisão por zero,
        um para posição inválida de array e um genérico (Exception) no final. Teste cada situação e veja qual
        catch é acionado.

        💡 O catch (Exception e) pega qualquer erro, então ele precisa ser o último.
        Se vier antes dos outros, o código nem compila — os de baixo nunca seriam alcançados.

        */

        // Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.

        int dividendo;
        int divisor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número (dividendo): ");
        dividendo = sc.nextInt();

        System.out.println("Digite outro número (divisor):");
        divisor = sc.nextInt();

        System.out.println("Vamos mostrar o quociente do dividendo pelo divisor: ");

        try {

            System.out.println(dividendo / divisor);

        } catch (ArithmeticException e) {

            System.out.println("Não se pode dividir por 0!");

        }

        // Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.

        int[] notas = {0,2, 6, 8, 10};
        int posicao;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Por gentileza, digite uma posição para eu exibir uma nota: ");
        posicao = sc1.nextInt();

        try {

            System.out.println("A posição é " + posicao + " e nela a nota é: " + notas[posicao]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("O array de nota tem apenas 4 posições");

        }

        // Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.

        int idade;

        Scanner sc2 = new Scanner(System.in);

        System.out.println("Por gentileza, digite sua idade: ");

        try {

            idade = sc2.nextInt();

            System.out.println("A idade digitada foi: " + idade);

        } catch (InputMismatchException e) {

            System.out.println("Você digitou um texto! Por gentileza, digite apenas números!");

        }

        // Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.

        String nome = null;

        try {

            System.out.println("O tamanho do nome digitado é: " + nome.length());

        } catch (NullPointerException e) {

            System.out.println("O nome não foi preenchido!");

        }

        // Crie um array com 3 nomes e tente imprimir a posição 5. Trate a exceção e, depois do try/catch,
        // imprima "O programa continua funcionando."

        String[] nomes = {"João", "José", "Pedro"};

        try {

            System.out.println("A posição 5 do array de nomes é: " + nomes[5]);

        } catch(ArrayIndexOutOfBoundsException e) {

            System.out.println("Esta posição não existe!");

        } finally {

            System.out.println("O programa continua funcionando!");

        }

        // Mini-desafio


        // 1 = Divisão por zero
        // 2 = Posição inválida do array
        // 3 = Outro erro qualquer (Genérico)

        int cenario;

        Scanner sc3 = new Scanner(System.in);

        // Selecionar a opção para testar cada cenário

        System.out.println("Selecione a opção para testar cada cenário de tratamento de exceção");
        System.out.println("Cenário 1 - Divisão por zero: ");
        System.out.println("Cenário 2 - Posição inválida do array: ");
        System.out.println("Cenário 3 - Erro 'genérico' (qualquer erro/exceção): ");
        cenario = sc3.nextInt();

        try {

            if (cenario == 1) {

                // SITUAÇÃO 1: Divisão por zero
                int resultado = 10 / 0;

            } else if (cenario == 2) {

                // SITUAÇÃO 2: Posição inválida de array
                int[] numeros = {1, 2, 3};
                int valor = numeros[5]; // Índice 5 não existe

            } else if (cenario == 3) {

                // SITUAÇÃO 3: Qualquer outro erro para cair no genérico
                String texto = null;
                texto.toUpperCase(); // Vai gerar um NullPointerException

            }

        } catch (ArithmeticException e) {

            System.out.println("Acionou o 1º catch: Erro de cálculo! (ArithmeticException)");
            System.out.println("Não se pode dividir por 0!");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Acionou o 2º catch: Posição de array inválida! (ArrayIndexOutOfBoundsException)");
            System.out.println("O array tem apenas 3 posições!");

        } catch (Exception e) {

            System.out.println("Acionou o 3º catch: Erro Genérico capturado! (Exception)");
            System.out.println("Nenhum nome foi digitado! A variável está vazia!");
        }

        // De fato, se deixarmos (Exception e) em primeiro, o compilador não executa
        // Ele "grita" que as outras cláusulas de exceção (específicas) já estão sendo tratadas
        // pelo "erro genérico"

        sc.close();
        sc1.close();
        sc2.close();
        sc3.close();

    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=60519" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.TratamentoExcecoes

Digite um número (dividendo):
10
Digite outro número (divisor):
0
Vamos mostrar o quociente do dividendo pelo divisor:
Não se pode dividir por 0!

Por gentileza, digite uma posição para eu exibir uma nota:
9
O array de nota tem apenas 4 posições

Por gentileza, digite sua idade:
Amor
Você digitou um texto! Por gentileza, digite apenas números!

O nome não foi preenchido!

Esta posição não existe!

O programa continua funcionando!

Selecione a opção para testar cada cenário de tratamento de exceção
Cenário 1 - Divisão por zero:
Cenário 2 - Posição inválida do array:
Cenário 3 - Erro 'genérico' (qualquer erro/exceção):
3
Acionou o 3º catch: Erro Genérico capturado! (Exception)
Nenhum nome foi digitado! A variável está vazia!

Process finished with exit code 0

*/






























