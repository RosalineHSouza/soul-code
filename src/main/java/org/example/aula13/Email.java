package org.example.aula13;

public class Email implements Notificacao{

    @Override
    public void enviar(String mensagem){

        System.out.println("E-mail enviado: " + mensagem);

    }

}
