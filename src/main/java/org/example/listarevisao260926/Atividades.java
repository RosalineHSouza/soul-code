package org.example.listarevisao260926;

import java.util.Scanner;

public class Atividades {
    static void main() {

        /*
        1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele.
        Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00.
        No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do lanche:");
        String lanche = sc.nextLine();
        System.out.println("Digite o valor do lanche:");
        double valor = sc.nextDouble();

        if (valor > 30) {

            valor -= 5;
        }

        System.out.printf("O lanche %s custa R$ %.2f\n", lanche, valor);

        /*
        *** Evidência de execução ****
        Digite o nome do lanche:
        Xis-bacon
        Digite o valor do lanche:
        33,50
        O lanche Xis-bacon custa R$ 28,50

        Process finished with exit code 0
        */

        /*
        2 - Faça um programa que use um laço for para contar de 1 até 15. Dentro do for, coloque um if para
        verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
        Imprima na tela o número e a palavra correspondente.
        Exemplo de saída:
        "1 é Ímpar"
        "2 é Par"
        */

        for (int i = 0; i <= 15; i++) {

            if (i % 2 == 0) {

                System.out.println(i + " é Par");

            } else {

                System.out.println(i + " é Ímpar");
            }

        }

        /*
        *** Evidência de execução ***
        0 é Par
        1 é Ímpar
        2 é Par
        3 é Ímpar
        4 é Par
        5 é Ímpar
        6 é Par
        7 é Ímpar
        8 é Par
        9 é Ímpar
        10 é Par
        11 é Ímpar
        12 é Par
        13 é Ímpar
        14 é Par
        15 é Ímpar

        Process finished with exit code 0
        */

        /*
        3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha.
        Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

        */

            int opcao;

            do {

                System.out.println("Digite a opção desejada:");
                System.out.println("1 - Ver camisas");
                System.out.println("2 - Ver calças");
                System.out.println("3 - Sair");
                opcao = sc.nextInt();

                switch (opcao) {

                    case 1:
                        System.out.println("Confirmando a opção 1: Ver camisas!");
                        break;

                    case 2:
                        System.out.println("Confirmando a opção 2: Ver calças!");
                        break;

                    case 3:
                        System.out.println("Sair");
                        break;

                    default:
                        System.out.println("Opção inválida! Digite novamente!");
                }

            } while (opcao != 3);

        /*
        *** Evidência de execução ***

        Digite a opção desejada:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        1
        Confirmando a opção 1: Ver camisas!
        Digite a opção desejada:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        2
        Confirmando a opção 2: Ver calças!
        Digite a opção desejada:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        4
        Opção inválida! Digite novamente!
        Digite a opção desejada:
        1 - Ver camisas
        2 - Ver calças
        3 - Sair
        3
        Sair

        Process finished with exit code 0
        */

        /*
        4 - Crie uma classe chamada Pet.
        Dê a ela três atributos: nome (String), raca (String) e peso (double).
        Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        Atribua valores para os atributos de cada um deles.
        Imprima os dados dos dois pets concatenando textos e variáveis.
        */

            Pet gato = new Pet();
            Pet cachorro = new Pet();

            gato.nome = "Caquito";
            gato.peso = 5.5;
            gato.raca = "Pelo Curto Brasileiro";

            cachorro.nome = "Buggy";
            cachorro.peso = 7.0;
            cachorro.raca = "Terrier Brasileiro";

            System.out.println("O gato " + gato.nome + " pesa " + gato.peso + " kg e sua raça é " + gato.raca);
            System.out.println("O cachorro " + cachorro.nome + " pesa " + cachorro.peso + " kg e sua raça é " + cachorro.raca);

        /*
        *** Evidência de execução ***

        O gato Caquito pesa 5.5 kg e sua raça é Pelo Curto Brasileiro
        O cachorro Buggy pesa 7.0 kg e sua raça é Terrier Brasileiro

        Process finished with exit code 0

        */

        /*

        5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        Na classe principal, faça um laço for que repita 3 vezes.
        A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        Instancie um novo Produto e guarde nele os valores digitados.
        Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!".
        Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
         */

            for (int i = 1; i <= 3; i++) {

                Scanner sc1 = new Scanner(System.in);
                System.out.println("Digite o nome de um produto: ");
                String nome = sc1.nextLine();
                System.out.println("Digite o preço de um produto: ");
                double preco = sc1.nextDouble();

                Produto produto = new Produto();
                produto.nome = nome;
                produto.preco = preco;

                if (produto.preco > 100) {

                    System.out.printf("O produto %s está caro! R$ %.2f\n", produto.nome, produto.preco);

                } else {

                    System.out.printf("O produto %s está com preço acessível: R$ %.2f\n", produto.nome, produto.preco);
                }

            }

        /*
        *** Evidência de execução ***
        Digite o nome de um produto:
        Enceradeira
        Digite o preço de um produto:
        101
        Produto caro! R$ 101,00
        Digite o nome de um produto:
        Tábua de passar roupa
        Digite o preço de um produto:
        99
        Produto com preço acessível: R$ 99,00
        Digite o nome de um produto:
        Tanquinho
        Digite o preço de um produto:
        150
        Produto caro! R$ 150,00

        Process finished with exit code 0
        */

        /*
        6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
        Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
        Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
        Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
        */

            // Reutilizando o Scanner criado para a atividade 1 (linha 15)

            System.out.println("Digite o seu Ano de Nascimento (formato AAAA): ");
            int anoNascimento = sc.nextInt();
            sc.nextLine(); // Correção: Consome o '\n' que ficou sobrando (limpa o buffer)
            System.out.println("Digite o seu Nome Completo: ");
            String nomeCompleto = sc.nextLine();

            System.out.println("O usuário " + "[" + nomeCompleto + "]" + " nasceu em " + "[" + anoNascimento + "]");

        /*
        *** Evidência de execução ***

        Digite o seu Ano de Nascimento (formato AAAA):
        1968
        Digite o seu Nome Completo:
        Rosaline Helenna de Souza
        O usuário [Rosaline Helenna de Souza] nasceu em [1968]

        Process finished with exit code 0
        */


    }
}

