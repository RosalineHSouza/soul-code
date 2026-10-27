package org.example.aula18;

public class ContadorVisitas {

    private int total = 0;

    public void registrarVisita() {

        total++;

    }

    public int getTotal() {

        return total;

    }

    private static ContadorVisitas instancia;

    private ContadorVisitas() {

    }

    public static ContadorVisitas getInstancia() {

        if ( instancia == null) {

            instancia = new ContadorVisitas();

        }

        return instancia;

    }

}


