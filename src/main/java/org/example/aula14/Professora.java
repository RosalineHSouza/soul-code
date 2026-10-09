package org.example.aula14;

public class Professora extends Pessoa{

    String disciplina;

    void lancarNota(String aluna, double nota){

        System.out.printf("Flora lançou nota %.1f" + " para " + aluna + "\n", nota);

    }

    @Override
    void apresentar(){

        System.out.println("Oi, sou " + nome + " e ensino " + disciplina);

    }


}
