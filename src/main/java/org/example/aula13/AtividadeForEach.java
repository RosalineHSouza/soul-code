package org.example.aula13;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class AtividadeForEach {

    static void main() {

        // 1. Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each,
        //   um por linha.

        int i = 0;

        String[] nomes = {"Jacó", "Esaú", "Isaías", "Abraão"};

        for(String nome : nomes){

            System.out.println("Imprimindo um nome por linha: " + nomes[i]);
            i++;

        }

        // 2. Crie um ArrayList com 5 notas e imprima todas usando for-each.

        ArrayList<Integer> notas = new ArrayList<>();

        notas.addAll(List.of(2,4,6,8,10));

        int j = 0;

        for(int nota : notas){

            System.out.println("A notas inserida no ArrayList, na posição " + j + " é: " + notas.get(j));
            j++;

        }

        // 3. Com o array de notas {8, 6, 10, 7}, use for-each para somar
        // todas e mostrar a soma e a média.

        ArrayList<Integer> outrasNotas = new ArrayList<>();

        outrasNotas.addAll(List.of(8, 6, 10, 7));

        int k = 0;
        double soma = 0;

        for (int nota : outrasNotas){

            soma += outrasNotas.get(k);
            k++;

        }

        double media = soma / outrasNotas.size();

        System.out.println("As notas do ArrayList são: " + outrasNotas);
        System.out.println("A soma das notas do ArrayList é: " + soma);
        System.out.printf("A média das notas do ArrayList é: %.2f\n",media);

        // 4. Com um array de nomes, use for-each e um if para contar quantos
        // têm mais de 5 letras. Mostre o total. Dica: usem o método length.

        int nomeGrande = 0;

        ArrayList<String> nomesLongos = new ArrayList<>();

        nomesLongos.addAll(List.of("Epaminondas", "Desdêmona", "Plutarco", "José", "Esaú", "Jacó"));

        int l = 0;

        for (String nome : nomesLongos){

            if(nome.length() >=5){

                nomeGrande += l;
                l++;

            }

        }

        System.out.println("Há " + l + " nomes com mais de 5 letras");

        // 5. Pegue o exercício 1 e escreva ele DE NOVO com o for normal,
        // usando o índice. Deixe os dois na mesma classe e compare.

        for (int m = 0; m < nomes.length; m++){

            System.out.println("Imprimindo um nome por linha: " + nomes[m]);

        }

        // Conforme mostrado na evidência de execução, o resultado é o mesmo.
        // A diferença está na construção e no uso da variável "m" para controlar o fluxo

    }
}

/*

*** Evidências de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=58348" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.aula13.AtividadeForEach
Imprimindo um nome por linha: Jacó
Imprimindo um nome por linha: Esaú
Imprimindo um nome por linha: Isaías
Imprimindo um nome por linha: Abraão

A notas inserida no ArrayList, na posição 0 é: 2
A notas inserida no ArrayList, na posição 1 é: 4
A notas inserida no ArrayList, na posição 2 é: 6
A notas inserida no ArrayList, na posição 3 é: 8
A notas inserida no ArrayList, na posição 4 é: 10

As notas do ArrayList são: [8, 6, 10, 7]
A soma das notas do ArrayList é: 31.0
A média das notas do ArrayList é: 7,75

Há 3 nomes com mais de 5 letras

Imprimindo um nome por linha: Jacó
Imprimindo um nome por linha: Esaú
Imprimindo um nome por linha: Isaías
Imprimindo um nome por linha: Abraão

Process finished with exit code 0

*/
