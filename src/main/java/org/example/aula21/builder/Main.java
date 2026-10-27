package org.example.aula21.builder;

public class Main {

    static void main() {


    Pizza pizza = new Pizza.Builder() // old fashioned - builder feito na unha
            .borda("Catupiry")
            .sabor("Muçarela")
            .temQueijo(true)
            .build();

        System.out.println(pizza.borda);

    Agendamento agendamento = Agendamento.builder() // new fashioned - usando lombok
            .nomePet("Caquito")
            .servico("Consulta")
            .horario("17h")
            .perfume(true)
            .laco(true)
            .hidratacao(true)
            .observacao("Com amor e carinho")
            .desconto(20)
            .build();

    agendamento.mostrar();

    }

}
