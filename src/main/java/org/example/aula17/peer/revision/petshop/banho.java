package org.example.aula17.peer.revision.petshop;

public class banho implements servico {
    @Override
    public void executar(String nomePet){
        System.out.println("DAndo banho em " + nomePet + " . ");
    }
}