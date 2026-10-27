package org.example.aula24.strategy;

public class DescontoEstudante implements Desconto {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.10;
    }

}