package org.example.aula5;

import java.util.Scanner;

public class EntradaDadosScanner {

    static void main() {

    /*

    Agora o programa conversa com você.
    É o Scanner que escuta.
    Até aqui, a gente escrevia os valores direto no código. Com o Scanner, o programa para, espera você digitar e usa o que você escreveu. Experimente: responda o programa no terminal ao lado.

💡 Repare no código
    A linha que acende em amarelo é onde o programa está.
    Quando ela chega num sc.next...(), o programa congela e espera até você apertar Enter.


    Preparando o Scanner
    O Scanner não vem ligado sozinho. São dois passos, e você faz uma vez só por programa:

    import
    Lá no topo do arquivo, antes da classe, você avisa o Java que vai usar o Scanner. É como pegar a ferramenta na caixa.
    new Scanner
    Dentro do main, você cria o Scanner e dá um nome a ele. Quase todo mundo chama de sc ou scanner.
    System.in
    Quer dizer "entrada do sistema", ou seja, o teclado.
    sc.close()
    No final do programa, você "desliga" o Scanner. É uma boa prática.

    Um método para cada tipo de dado
    Para cada tipo de variável existe um jeito de ler. Escolha o que combina com o tipo da caixinha onde o valor vai ser guardado.

    Método	        Lê	                                                        Exemplo
    nextLine()	    uma linha inteira de texto, com espaços	                    String nome = sc.nextLine();
    next()	        uma palavra só (para no primeiro espaço)	                String cor = sc.next();
    nextInt()	    um número inteiro	                                        int idade = sc.nextInt();
    nextDouble()	um número com decimais	                                    double altura = sc.nextDouble();
    nextBoolean()	true ou false	                                            boolean gosta = sc.nextBoolean();
    */

       Scanner sc = new Scanner(System.in);
       System.out.println("Qual é o seu nome?");
       //String nome = sc.nextLine();
       System.out.println("Quantos anos você tem?");
       //int idade = sc.nextInt();
       //System.out.println("Oi, " + nome + "! Daqui a 10 anos" + " você terá " + (idade + 10) + " anos.");


    /*

    next() ou nextLine()?
    Os dois leem texto, mas o next() para no primeiro espaço.
    Para nome completo, use nextLine(). Digite um nome com sobrenome e compare:

    Você digita
    Ana Clara Souza

    String a = sc.next();
    a = "Ana"

    String b = sc.nextLine();
    b = "Ana Clara Souza"

    O bug do Enter fantasma 👻
    Esse é o erro mais famoso do Scanner.
    Tudo que você digita vai para uma fila, inclusive o Enter (⏎).
    O nextInt() pega só o número e deixa o Enter sobrando na fila.

    Aí, quando vem um nextLine(), ele lê "até o Enter"... e o Enter já está lá!
    Ele pega um texto vazio e o programa pula a pergunta sem esperar você.

    Aperte Próximo passo e veja a fila. Depois ligue a correção e compare.

    Colocar um sc.nextLine(); sozinho para limpar o buffer de teclado
    */

        System.out.println("Quantos anos?");
        int idade = sc.nextInt();
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();
        System.out.println("Oi, " + nome + "!");

        /*

        Pegadinha: ponto ou vírgula no decimal?
        No código, decimal sempre usa ponto: double x = 7.5;.
        Mas quando o usuário digita no Scanner, quem manda é o idioma do computador.
        Num computador em português, o nextDouble() espera vírgula (7,5), e digitar 7.5 dá erro (InputMismatchException).

        Se preferir que aceite ponto, crie o Scanner assim (precisa do import java.util.Locale; lá em cima):

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

         */

    }

}
