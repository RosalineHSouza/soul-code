package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AtividadeHashSet {

    public static void main(String[] args){

        /* 1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        com o repetido.
        */

        ArrayList<String> lista = new ArrayList<>(List.of("Ana", "Bruno", "Carlos", "Carlos"));
        HashSet<String> nomes = new HashSet<>(lista);
        System.out.println("Conjunto inicial: " + nomes);
        System.out.println("Tamanho do conjunto: " + nomes.size());

        // 2. Crie um HashSet de cores usando addAll. Depois use contains dentro
        // de um if para avisar se a cor "verde" já está no conjunto ou não.

        HashSet<String> cores = new HashSet<>();
        cores.addAll(List.of("Magenta", "Fúcsia", "Cardeal", "Sépia"));

        if (cores.contains("verde")){

            System.out.println("A cor verde está contida no conjunto!");

        } else {

            System.out.println("A cor verde não está contida no conjunto!");
        }

        // 3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
        // tirar os repetidos. Imprima os dois e compare.

        ArrayList<String> nomesArrayList = new ArrayList<>();
        nomesArrayList.addAll(List.of("Asdrúbal", "Telêmaco", "Empédocles", "Asdrúbal", "Telêmaco", "Empédocles"));

        HashSet<String> nomesHashSet = new HashSet<>(nomesArrayList);

        System.out.println("Estes são os nomes do conjunto do ArrayList: " + nomesArrayList);

        System.out.println("Estes são os nomes do conjunto do HashSet" + nomesHashSet);

        // 4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
        // imprima de novo, junto com o tamanho.

        HashSet<String> listaCPF = new HashSet<>();
        listaCPF.addAll(List.of("111.111.111-11", "222.222.222-22", "333.333.333-33"));

        System.out.println("O conjunto original de CPFs é: " + listaCPF);

        System.out.println("O tamanho do conjunto é: " + listaCPF.size());

        listaCPF.remove("111.111.111-11");

        System.out.println("O conjunto após a remoção de um elemento: " + listaCPF);

        System.out.println("O tamanho do conjunto após a remoção do elemento é: " + listaCPF.size());

        // 5. Crie um HashSet com três frutas e percorra ele com for,
        // imprimindo uma por linha.

        HashSet<String> frutas = new HashSet<>();
        frutas.addAll(List.of("Tamarindo","Cupuaçu", "Tâmara"));

        // Percorrendo com o for-each
        for (String fruta : frutas) {

            System.out.println(fruta);

        }

        // Gambiarra:
        // Converter o HashSet em uma lista ou em um array primeiro, pois listas possuem índices.

        // Convertendo o HashSet em uma ArrayList para ganhar índices
        ArrayList<String> listaFrutas = new ArrayList<>(frutas);

        // Agora sim é possível usar o for convencional!
        for (int i = 0; i < listaFrutas.size(); i++) {

            System.out.println(listaFrutas.get(i));

        }

        /*
        Nota: Ao rodar o código, você vai reparar que as frutas podem não sair exatamente na ordem em que
        você as adicionou (add). Isso é completamente normal no HashSet, já que ele não garante a ordem dos
        elementos!
        */

        // 6. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
        // imprima o isEmpty() de novo.














    }
}
