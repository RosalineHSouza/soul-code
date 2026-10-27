package org.example.aula20;

public class Main {

    public static void conectarBanco(BancoDeDados banco) {

        banco.chamarBanco();

    }


    static void main() {

        BancoDeDados novobanco = new Oracle();
        BancoDeDados novobanco1 = new MySql();
        BancoDeDados novobanco2 = new MongoDb();

        conectarBanco(novobanco);
        System.out.println(novobanco.getNumero());

        conectarBanco(novobanco1);
        System.out.println(novobanco1.getNumero());

        conectarBanco(novobanco2);
        System.out.println(novobanco2.getNumero());




    }

}
