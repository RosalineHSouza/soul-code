package org.example.aula24.observer;

public class Main {

    public static void main(String[] args) {

        Canal canal = new Canal();

        // Criamos os observadores (Observers)
        Seguidor joao = new Seguidor("João");
        Seguidor maria = new Seguidor("Maria");
        Seguidor carlos = new Seguidor("Carlos");

        // COLOCANDO OS OBJETOS DENTRO DA LISTA DO CANAL
        canal.setInscritos(joao);
        canal.setInscritos(maria);
        //canal.setInscritos(carlos);

        // Quando o canal faz uma ação,
        // o código roda o 'for' interno e avisa
        canal.postarVideo("Video novo.");
    }
}

