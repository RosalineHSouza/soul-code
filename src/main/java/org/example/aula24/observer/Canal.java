package org.example.aula24.observer;

import java.util.ArrayList;

public class Canal {

    private ArrayList<Inscrito> inscritos = new ArrayList<>();
    private String nomeVideo;

    public void setInscritos(Inscrito inscrito) {
        this.inscritos.add(inscrito);
    }

    public void desinscrever(Inscrito inscrito) {
        this.inscritos.remove(inscrito);
    }

    private void notificacao() {

        for (Inscrito inscrito : inscritos) {

            inscrito.receberNotificacao("Novo vídeo postado: " + nomeVideo );
        }
    }

    public void postarVideo(String nomeVideo) {

        this.nomeVideo = nomeVideo;

        System.out.println( "Novo vídeo postado!: " + nomeVideo );

        notificacao();

    }
}
