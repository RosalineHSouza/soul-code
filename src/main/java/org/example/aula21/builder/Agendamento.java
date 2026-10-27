package org.example.aula21.builder;

import lombok.Builder;

@Builder
public class Agendamento {

    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    void mostrar() {

        System.out.println(nomePet + ", " + servico + ", " + horario + ", " +
                perfume + ", " + laco + ", " + hidratacao + ", " + observacao + ", " + desconto);

    }


}


