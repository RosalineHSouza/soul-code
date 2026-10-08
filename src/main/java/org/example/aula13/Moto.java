package org.example.aula13;

public class Moto implements Veiculo {

    @Override
    public void ligar(){

        System.out.println("Moto: ligue a chave, certifique-se de que (kill switch) está na posição ligado e " +
                "aperte o botão de partida elétrica");

    }

    @Override
    public void acelerar(){

        System.out.println("Moto: para acelerar, gire a manopla para trás (em direção ao seu corpo)");

    }

}
