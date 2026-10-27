package org.example.aula20.aulafactory;

public class PostgreSql implements BancoDeDados{

    @Override

    public void conectar() {

        System.out.println("Conectando ao PostgreSQL...");

    }
}
