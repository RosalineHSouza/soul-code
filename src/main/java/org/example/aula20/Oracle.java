package org.example.aula20;

public class Oracle implements BancoDeDados {

    int numero = 10;

    public void chamarBanco () {

        System.out.println("O Banco conectado é o Oracle");

    }

    public int getNumero() {

        return numero;

    }


}
