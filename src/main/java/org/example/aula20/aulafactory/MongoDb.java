package org.example.aula20.aulafactory;

public class MongoDb implements BancoDeDados {

    @Override
    public void conectar() {

        System.out.println("Conectando ao MongoDb...");

    }
}
