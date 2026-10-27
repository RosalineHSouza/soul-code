package org.example.aula17.peer.revision.petshop;

public class consulta implements servico{
    @Override
    public void executar(String nomePet){
        System.out.println("Levando " + nomePet + " para a consulta.");
    }
}
