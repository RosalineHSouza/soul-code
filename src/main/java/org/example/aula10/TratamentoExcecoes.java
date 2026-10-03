package org.example.aula10;

import java.util.Scanner;

public class TratamentoExcecoes {

    static void main() {


        // 1 — Faça um programa que peça dois números inteiros e mostre a divisão do
        // primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a
        // ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por
        // zero.

        int dividendo;
        int divisor;

        Scanner teclado = new Scanner(System.in);

        try (teclado) {

            System.out.println("Digite um número (dividendo): ");
            dividendo = teclado.nextInt();

            System.out.println("Digite outro número (divisor):");
            divisor = teclado.nextInt();

            System.out.println("Vamos mostrar o quociente do dividendo pelo divisor: ");

            System.out.println(dividendo / divisor);

        } catch (ArithmeticException e) {

            System.out.println("Não se pode dividir por 0!");

        }

    }

}