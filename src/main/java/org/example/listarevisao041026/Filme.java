package org.example.listarevisao041026;

public class Filme {

    String titulo;
    String genero;
    double nota;
    String classificacao;
    boolean assistido;

    static String classificacao (double nota) {

        if ( nota >= 8 ) {

            return "Ótimo";

        } else if ( nota >= 5) {

            return "Bom";

        }

        else {

            return "Ruim";

        }




    }

}
