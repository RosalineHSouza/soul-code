package org.example.aula24.strategy;

public class Main {
    public static void main(String[] args) {

        Compra compra = new Compra(new DescontoEstudante());
        Compra compra1 = new Compra(new DescontoAniver());

        System.out.println(compra.calcularPrecoFinal(100));
        // 90.0


        compra = new Compra(new DescontoVIP());

        System.out.println(compra.calcularPrecoFinal(100));
        // 80.0
    }
}
