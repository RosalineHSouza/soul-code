package org.example.aula13;

// Contribuição da Nathalia

public class AulaInterface {

    class Forma {
        void desenhar() {
            System.out.println("Desenhando uma forma");
        }
    }

    class Circulo extends Forma {

        @Override
        void desenhar() {
            System.out.println("Desenhando um círculo");
        }
    }

    class Quadrado extends Forma {

        @Override
        void desenhar() {
            System.out.println("Desenhando um quadrado");
        }
    }
}
