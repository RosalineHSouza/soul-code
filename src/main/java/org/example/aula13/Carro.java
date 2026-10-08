package org.example.aula13;

public class Carro implements Veiculo{

    @Override
    public void ligar(){

        System.out.println("Carro: insira e gire a chave na ignição para ligar o veículo!");

    }

    @Override
    public void acelerar(){

        System.out.println("Carro: pise no pedal da extrema direita para acelerar o veículo!");

    }
}
