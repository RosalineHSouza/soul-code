package org.example.aula6;

import java.util.Scanner;

public class AulaClasse {
    static void main() {

        Livro meuLivro = new Livro();
        meuLivro.titulo = "Quarto de Despejo";
        meuLivro.autora = "Carolina Maria de Jesus";
        meuLivro.paginas = 200;

        System.out.println(meuLivro.titulo + ", de " + meuLivro.autora);

        Livro livro = new Livro();

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas páginas?");
        livro.paginas = sc.nextInt();
        sc.nextLine(); // limpa o Enter

        System.out.println("Qual o título?");
        livro.titulo = sc.nextLine();

        sc.close();

    }

}
