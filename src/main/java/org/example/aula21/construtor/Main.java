package org.example.aula21.construtor;

import org.example.aula21.builder.Pizza;

public class Main {

    static void main() {

        /*

        Na Main, crie 3 agendamentos:
        a) Thor, banho, 14h, com perfume e laço, sem hidratação,
        "alérgico a shampoo", 10% de desconto
        b) Luna, tosa, 10h, sem nenhum extra, sem observação,
        sem desconto
        c) Mel, banho, 16h, só com hidratação, sem observação,
        sem desconto


         */

        Agendamento agendamento1 = new Agendamento("Thor", "banho", "14h", true,
                true, false, "alérgico a shampoo", 10);

        Agendamento agendamento2 = new Agendamento("Luna", "tosa", "10h", false,
                false, false, "", 0);

        Agendamento agendamento3 = new Agendamento("Mel", "banho", "16h", false,
                false, true, "", 0);

        agendamento1.mostrar();
        agendamento2.mostrar();
        agendamento3.mostrar();

        /*

        Agora responda:
        - Olhando só a linha do new, dá pra saber o que cada
        true/false significa? Não
        - Se você trocar a ordem do perfume e do laço sem querer,
        o código compila? Alguém perceberia o erro? Sim. Não.
        - No agendamento b, quantos valores você digitou só para
        dizer "não quero isso"? 8 valores

         */



    }
}
