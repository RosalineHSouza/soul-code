package org.example.aula20.aulafactory;

public class Oracle implements BancoDeDados {

    @Override
    public void conectar() {

        System.out.println("Conectando ao Oracle...");

    }
}
