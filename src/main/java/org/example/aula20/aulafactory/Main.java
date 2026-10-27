package org.example.aula20.aulafactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o banco de dados:");
        System.out.println("1 - MySQL");
        System.out.println("2 - MongoDB");
        System.out.println("3 - Oracle");
        System.out.println("4 - PostgreSQL");

        int opcao = sc.nextInt();

        BancoDeDados banco = BancoDeDadosFactory.criar(opcao);

        banco.conectar();

        sc.close();

        }

    }

