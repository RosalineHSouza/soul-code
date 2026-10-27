package org.example.aula15;

public class AtividadeEncapsulamento {

    static void main() {

        // 1. (sentir o private na pele)

        ContaBancaria c = new ContaBancaria();

        //System.out.println(c.titular);
        //System.out.println(c.saldo = -5000);

        // Não compilou e mostrou os erros abaixo

        /*

        Saída esperada:

        error: titular has private access in ContaBancaria
        error: saldo has private access in ContaBancaria

        */

        // 2. (abrir a porta de leitura)

        /*

        Saída esperada:

         Titular: null
         Saldo: 0.0

        */

        System.out.println(c.getTitular());
        System.out.println(c.getSaldo());











    }


}
