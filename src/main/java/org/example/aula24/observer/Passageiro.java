package org.example.aula24.observer;

public class Passageiro implements ObservadorVoo {

    public void atualizar (String status) {

        System.out.println("Passageiro avisado: " + status);

    }

}
