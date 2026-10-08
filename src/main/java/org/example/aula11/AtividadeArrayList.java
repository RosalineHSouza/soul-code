package org.example.aula11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadeArrayList {
    public static void main(String[] args){

        // - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

        ArrayList<String> nomes = new ArrayList<>();

        nomes.addAll(List.of("Brigitte", "Candice", "Stella"));

        System.out.println(nomes);

        // - Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

        ArrayList<String> quatronomes = new ArrayList<>(List.of("John Lennon", "Paul McCartney", "George Harrison",
                "Ringo Starr"));

        System.out.println(quatronomes);

        quatronomes.set(2,"Pete Townshend");

        System.out.println(quatronomes);

        // - Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

        ArrayList<String> cidades = new ArrayList<>(List.of("São Paulo", "Guarulhos", "Barueri",
                "Osasco"));

        System.out.println(cidades);

        cidades.remove(1);

        System.out.println(cidades);

        // - Crie uma lista com seis nomes e imprima todos usando um laço, no formato "0: Ana".
        // (Dica: i + ": " + comando para pegar posição da lista)

        ArrayList<String> deusasgregas = new ArrayList<>(List.of("Atena", "Afrodite", "Hera", "Artêmis", "Deméter",
                "Héstia"));

        for (int i = 0; i < deusasgregas.size(); i++){

            System.out.println(i + ": " + deusasgregas.get(i));

        }

        // - Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição.
        // Se não estiver, avise.

        ArrayList<String> cinconomes = new ArrayList<>(List.of("Epaminondas", "Agapito", "Eufésio", "Adamastor",
                "Heráclito"));

        System.out.println("A lista completa para comparação é: " + cinconomes);

        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um nome e direi se está na nossa lista: ");
        nome = sc.nextLine();

        if (cinconomes.contains(nome)){

            System.out.println("O nome " + nome + " consta na lista, na posição " + cinconomes.indexOf(nome));

        }

        else {

            System.out.println("O nome " + nome + " não consta na lista, em nenhuma posição");

        }

        sc.close();

    }
}

/*

Evidência de execução

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=52458" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.aula11.AtividadeArrayList
[Brigitte, Candice, Stella]

[John Lennon, Paul McCartney, George Harrison, Ringo Starr]
[John Lennon, Paul McCartney, Pete Townshend, Ringo Starr]

[São Paulo, Guarulhos, Barueri, Osasco]
[São Paulo, Barueri, Osasco]

0: Atena
1: Afrodite
2: Hera
3: Artêmis
4: Deméter
5: Héstia

A lista completa para comparação é: [Epaminondas, Agapito, Eufésio, Adamastor, Heráclito]

Digite um nome e direi se está na nossa lista:
Agamenon
O nome Agamenon não consta na lista, em nenhuma posição

Digite um nome e direi se está na nossa lista:
Heráclito
O nome Heráclito consta na lista, na posição 4


Process finished with exit code 0
*/