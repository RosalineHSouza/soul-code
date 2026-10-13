package org.example.petshop;

public class Pet {

    String nome;
    String especie;
    double peso;
    String porte;

    String definirPorte() {

        if ( peso >= 25 ) {

            return "Grande";

        } else if ( peso > 10) {

            return "Médio";

        } else {

            return "Pequeno";

        }


    }

    void emitirSom() {

    }

}
