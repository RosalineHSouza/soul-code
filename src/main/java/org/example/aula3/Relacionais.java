package org.example.aula3;

public class Relacionais {
    static void main() {

        /*
        Relacionais:
        1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de:
        são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
            - a = 10, b = 3
            - a = 3, b = 10
            - a = 5, b = 5
        2- Exiba na tela a == b, sendo a = 10 e b 3.
        3- Exiba na tela a == b, sendo a = 10 e b = 3.
        4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
        */

        // Ítem 1

        System.out.println("Ítem 1");

        //

        System.out.println("Primeira rodada");

        int a = 10;
        int b = 3;

        // São iguais?
        System.out.println(a == b);

        // São diferentes?
        System.out.println(a != b);

        // A primeira é maior?
        System.out.println(a > b);

        // A primeira é menor?
        System.out.println(a < b);

        //

        System.out.println("Segunda rodada");

        a = 3;
        b = 10;

        // São iguais?
        System.out.println(a == b);

        // São diferentes?
        System.out.println(a != b);

        // A primeira é maior?
        System.out.println(a > b);

        // A primeira é menor?
        System.out.println(a < b);

        //

        System.out.println("Terceira rodada");

        a = 5;
        b = 5;

        // São iguais?
        System.out.println(a == b);

        // São diferentes?
        System.out.println(a != b);

        // A primeira é maior?
        System.out.println(a > b);

        // A primeira é menor?
        System.out.println(a < b);


        // Ítem 2

        System.out.println("Ítem 2");
        a = 10;
        b = 3;

        System.out.println(a == b);

        // Ítem 3

        System.out.println("Ítem 3");

        System.out.println(a != b);

        // Ítem 4

        System.out.println("Ítem 4");

        boolean chovendo = true;

        System.out.println(!chovendo);

    }

}
