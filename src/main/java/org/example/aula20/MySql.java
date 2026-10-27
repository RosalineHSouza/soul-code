package org.example.aula20;

public class MySql implements BancoDeDados {

    int numero = 20;

    public void chamarBanco () {

        System.out.println("O Banco conectado é o MySql");

    }

    public int getNumero() {

        return numero;

    }


}
