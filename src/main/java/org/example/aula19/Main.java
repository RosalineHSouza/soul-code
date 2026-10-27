package org.example.aula19;

public class Main {

    static void main() {

        Boneca barbie = new Boneca();

        barbie.corCabelo = "loiro";
        barbie.nome = "Profissões";

        Brinquedos playmobil = new Brinquedos();

        playmobil.nome = "Forte Apache";

        Brinquedos.verBrinquedo(playmobil);

        Bebe aurora = new Bebe("Janaína", "10/05/67");

        System.out.println(aurora.nome + " " + aurora.dataNascimento);







    }
}
