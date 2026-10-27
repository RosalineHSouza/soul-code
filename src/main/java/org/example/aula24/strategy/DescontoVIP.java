package org.example.aula24.strategy;

public class DescontoVIP implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.20;
    }
}