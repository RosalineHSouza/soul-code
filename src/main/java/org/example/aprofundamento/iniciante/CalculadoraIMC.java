package org.example.aprofundamento.iniciante;

public class CalculadoraIMC {

    public static double calcularIMC (double peso, double altura) {

        return peso / ( altura * altura);

    }

    public static void exibirResultado (double imc) {

        System.out.printf("O seu IMC é: %.2f", imc);

    }


    public static void main (String args[]) {

        double imc = calcularIMC(62.5, 1.67 );
        exibirResultado(imc);


    }
}
