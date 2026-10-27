package org.example.aula19;

public class Brinquedos {

    String nome;

    /*

    Criem duas classes, uma chamada Main e outra chamada Brinquedos.
    Crie um método dentro da classe Brinquedos chamado verBrinquedo, e
    faça ele receber uma instância da classe Brinquedo e printar qual instância foi.

    Exemplo

    "O brinquedo escolhido foi: "

    */

    // Método que recebe uma instância de Brinquedos e imprime o resultado

    public static void verBrinquedo(Brinquedos brinquedo) {

        System.out.println("O brinquedo escolhido foi: " + brinquedo.nome);

    }
}
