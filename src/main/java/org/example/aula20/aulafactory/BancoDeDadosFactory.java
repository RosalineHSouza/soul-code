package org.example.aula20.aulafactory;

public class BancoDeDadosFactory {

    public static BancoDeDados criar(int opcao) {

        if (opcao == 1) {

            return new MySql();

        } else if (opcao == 2) {

            return new MongoDb();

        } else if (opcao == 3) {

            return new Oracle();

        } else if (opcao == 4) {

            return new PostgreSql();

        } else {

            throw new IllegalArgumentException("Opção inválida.");

            }
        }
    }




