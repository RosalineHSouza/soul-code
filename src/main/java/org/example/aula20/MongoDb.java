package org.example.aula20;

public class MongoDb implements BancoDeDados {

    int numero = 30;

    public void chamarBanco () {

        System.out.println("O Banco conectado é o MongoDb");

    }

    public int getNumero() {

        return numero;

    }

}
