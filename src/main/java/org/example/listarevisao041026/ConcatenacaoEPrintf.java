package org.example.listarevisao041026;

public class ConcatenacaoEPrintf {

    static void main() {


        /*

        Concatenação e printf
        Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."

        Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.

        Crie uma variável com o preço de um produto e imprima com duas casas decimais.

        Usando printf, imprima numa linha só o nome, a idade e a altura.

        🔥 Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha
        deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.

        💡 Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.

         */

        // Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."

        String nome = "Ana";
        int idade = 28;

        System.out.println(nome + " tem " + idade + " anos. ");

        // Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.

        double nota1 = 8.0;
        double nota2 = 7.0;

        System.out.printf("A média entre nota1 e nota2 é: %.2f\n" , ((nota1 + nota2) /2));

        // Crie uma variável com o preço de um produto e imprima com duas casas decimais.

        double preco = 23.56;

        System.out.printf("O preço do produto é: R$ %.2f\n" , preco);

        // Usando printf, imprima numa linha só o nome, a idade e a altura.

        System.out.printf("O nome é: %s, tem %d anos de idade e %.2f m de altura\n" , nome, idade, 1.67);

        // Mini-desafio

        double total = 0;

        String produto1 = "Parafuso";
        String produto2 = "Braçadeira";
        String produto3 = "Arruela";

        double preco1 = 5.50;
        double preco2 = 7.50;
        double preco3 = 9.50;

        System.out.println("*** Recibo de compra ***");

        System.out.printf("Item: %s | Quantidade: %d | Preço unitário: R$ %.2f" +
                " | Preço total: R$ %.2f\n" , produto1 , 1 , preco1 , (1 * preco1));
        total += (1 * preco1);

        System.out.printf("Item: %s | Quantidade: %d | Preço unitáro: R$ %.2f"  +
                "| Preço total: R$ %.2f\n" , produto2, 2 , preco2 , (2 * preco2));
        total += (2 * preco2);

        System.out.printf("Item: %s | Quantidade: %d | Preço unitário: R$ %.2f" +
                " | Preço total: R$ %.2f\n" , produto3, 3 , preco3 , (3 * preco3));
        total += (3 * preco3);

        System.out.printf("Total da compra: ..............................................: R$ %.2f\n" , total);


    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=51628" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.ConcatenacaoEPrintf
Ana tem 28 anos.

A média entre nota1 e nota2 é: 7,50

O preço do produto é: R$ 23,56

O nome é: Ana, tem 28 anos de idade e 1,67 m de altura

*** Recibo de compra ***
Item: Parafuso | Quantidade: 1 | Preço unitário: R$ 5,50 | Preço total: R$ 5,50
Item: Braçadeira | Quantidade: 2 | Preço unitáro: R$ 7,50| Preço total: R$ 15,00
Item: Arruela | Quantidade: 3 | Preço unitário: R$ 9,50 | Preço total: R$ 28,50
Total da compra: ..............................................: R$ 49,00

Process finished with exit code 0

*/