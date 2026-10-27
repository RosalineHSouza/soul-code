package org.example.aula20.aulafactory;

public class MySql implements BancoDeDados {

    @Override
    public void conectar() {
        System.out.println("Conectando ao MySQL...");

    }
}
