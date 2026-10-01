package org.example.aula4;

public class Repeticao {
    static void main() {

        int voltas = 5;

        for (int i = 1; i <= voltas; i++) {
            System.out.println("Pulo " + i + " 🎉");
        }
        System.out.println("Ufa, terminei! 😮‍💨");

        /*

        Por que repetir com loop?
        Imagina escrever System.out.println 100 vezes para contar de 1 a 100.
        Cansativo, né? E se mudar de ideia e quiser até 500, lá vai você escrever tudo de novo.

        Com uma estrutura de repetição (ou loop), você escreve a instrução uma vez só e diz ao Java
        quantas vezes repetir. Mudar de 100 para 500 é trocar um número.

        O Java tem três loops principais: for, while e do-while. Vamos ver cada um.

        As três partes do for
        O for é o loop ideal quando você sabe quantas vezes quer repetir.
        Dentro dos parênteses ficam três partes, separadas por ponto e vírgula:

        int i = 1
        Início. Cria o contador. Roda uma vez só, antes de tudo.
        i <= 5
        Condição. Checada antes de cada volta. Se der true, repete. Se der false, o loop acaba.
        i++
        Passo. Roda no fim de cada volta. Aqui soma 1 no contador.
        { ... }
        Corpo. O que vai ser repetido.

        While: repete enquanto for verdade
        While quer dizer enquanto. Ele é ótimo quando você não sabe exatamente quantas vezes vai repetir,
        só sabe quando parar.

        Pense no celular carregando: enquanto a bateria estiver abaixo de 100%, continua carregando.
        Escolha com quanto de bateria o celular começa e aperte para carregar. 🔋

        */

        int bateria = 25;

        while (bateria < 100) {
            bateria += 25;
            System.out.println("Carregando... " + bateria + "%");
        }
        System.out.println("Bateria cheia! 🔋");

        /*

        Do-while: primeiro faz, depois pergunta
        O while pergunta antes de rodar. Se a condição já começar falsa, ele não roda nenhuma vez.

        O do-while é o contrário: ele faz primeiro e só pergunta no final.
        Por isso ele sempre roda pelo menos uma vez. É como provar a comida antes de decidir se quer mais. 🍝

        */

        // while: pergunta antes
        int x = 0;
        while (x < 3) {
            System.out.println("while: " + x);
            x++;
        }

        // do-while: faz primeiro
        int y = 0;
        do {
            System.out.println("do-while: " + y);
            y++;
        } while (y < 3);

        /*

        Break e continue: controlando o loop
        Lembra do break do switch? Ele também funciona nos loops: sai do loop na hora,
        mesmo que a condição ainda seja verdadeira.

        Já o continue pula só aquela volta e segue para a próxima.

        No exemplo, o 3 é pulado pelo continue, e quando chega no 5 o break encerra tudo.
        */

        for (int i = 1; i <= 8; i++) {
            if (i == 3) {
                continue; // pula o 3
            }
            if (i == 5) {
                break; // para no 5
            }
            System.out.println(i);
        }

    }

}
