package org.example.aula18;

public class TesteSingleton {

    private static TesteSingleton instancia;

    private TesteSingleton() { // Construtor

    }

    public static TesteSingleton getInstancia() { // Getter

        if ( instancia == null ) {

            instancia = new TesteSingleton();

        }

        return instancia;

    }



}
