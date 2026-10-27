package org.example.listarevisao041026;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.example.listarevisao041026.Filme.classificacao;

public class DesafioFInal {

    static void main() {

        // 🏆 Desafio Final — Meu Catálogo de Filmes
        // Conforme instruções fornecidas pela Profa. Flora no Classroom da turma

        // Inicializando vetor para armazenar o cadastro dos filmes
        // 5 posições conforme sugerido pela Flora

        // Cria um array capaz de guardar 5 objetos do tipo Filme

        Filme[] listaFilme = new Filme[5];

        // Menu

        int opcao = 0; // Recebe opção do menu

        // Guarda a posição no vetor do último cadastro

        int posicao = 0;

        int filmeCadastrado = 0;  // Contador de filmes cadastrados

        Scanner sc = new Scanner(System.in);

        while ( opcao != 6 ) {

            System.out.println("*** Meu Catálogo de Filmes ***");
            System.out.println("Selecione a sua opção:");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filme");
            System.out.println("3 - Listar filme por gênero");
            System.out.println("4 - Buscar por título");
            System.out.println("5 - Estatísticas");
            System.out.println("6 - Sair");

            // Tratamento de exceção para o caso de digitar letras em vez de números

            try {

                opcao = sc.nextInt();

            } catch (InputMismatchException e) {

                sc.nextLine(); // Impede loop infinito no menu

                // A mensagem de erro cai na categoria "default" do switch

            }

            switch( opcao ) {

                case 1 : // 1 - Cadastrar filme

                    // Cadastrando o filme e os seus atributos

                    // Verificando se ainda é possível cadastrar um filme
                    // Limite de 5
                    // Havendo menos de 5 filmes cadastrados, vai realizar
                    // novo cadastro

                    if ( posicao < listaFilme.length ) {

                    // Instanciando objeto

                    Filme filme = new Filme();

                    // Cadastrando nome

                    sc.nextLine(); // limpando o buffer do teclado para poder digitar o título

                    System.out.println("Digite o título do filme: ");
                    filme.titulo = sc.nextLine();

                    // Cadastrando gênero

                    System.out.println("Digite o gênero do filme: ");
                    filme.genero = sc.nextLine();

                    // Convertendo gênero para maiúsculas

                    filme.genero = filme.genero.toUpperCase();

                    // Cadastrando nota
                    // Do...while para verificar e impedir a digitação de notas
                    // que não estejam entre 0 e 10

                     do {

                         System.out.println("Digite a nota do filme (0 - 10): ");
                         filme.nota = sc.nextDouble();

                         if ( filme.nota < 0 || filme.nota > 10 ) {

                             System.out.println("Digite apenas notas entre 0 e 10");
                         }

                     } while ( filme.nota < 0 || filme.nota > 10 );

                    // Obtendo classificação a partir da nota
                    // com método classificaco

                    filme.classificacao = classificacao(filme.nota);

                    // Cadastrando se já assistiu ou não ao filme

                        System.out.println("Digite se já assistiou ou não ao filme (true/false): ");
                        filme.assistido = sc.nextBoolean();

                    // Cadastrando os atributos no array de filmes

                    listaFilme[posicao] = filme;

                    System.out.println("Filme cadastrado!");

                    // Incrementa contador de posicao do array
                    // Também será usado como contador de filmes cadastr


                    posicao++; // Incrementa contador de posicao do array

                    filmeCadastrado++; // Incrementa contador de filmes cadastrados

                    } else {

                        System.out.println("Não há mais como cadastrar novos filmes!");

                    }

                    break;

                case 2 : // 2 - Listar filme

                    // Se ainda não há filmes cadastrados

                    if ( posicao == 0 ) {

                        System.out.println("Ainda não há filmes cadastrados!");
                        break;

                    }

                    for ( int i = 0; i < posicao; i++ ) {

                        System.out.printf("%s [%s] - Nota %.1f - %s - Assistido? %b\n", listaFilme[i].titulo,
                                listaFilme[i].genero, listaFilme[i].nota, listaFilme[i].classificacao,
                                listaFilme[i].assistido);

                    }



                    break;

                case 3 : // 3 - Listar filme por gênero

                    // Se ainda não há filmes cadastrados

                    if ( posicao == 0 ) {

                        System.out.println("Ainda não há filmes cadastrados!");
                        break;

                    }

                    String generoDesejado;

                    sc.nextLine(); // Limpar buffer de teclado

                    System.out.println("Digite o gênero desejado: ");
                    generoDesejado = sc.nextLine();

                    // Percorrendo o vetor de gênero para descobrir
                    // quantos filmes são selecionáveis

                    for ( int i = 0; i < posicao; i++) {

                        // O texto fixo "Ótimo" nunca será null, então o código nunca vai quebrar

                        if (generoDesejado.equalsIgnoreCase( listaFilme[i].genero )) {

                            System.out.printf("%s [%s] - Nota %.1f - %s - Assistido? %b\n", listaFilme[i].titulo,
                                    listaFilme[i].genero, listaFilme[i].nota,
                                    listaFilme[i].classificacao, listaFilme[i].assistido);

                        }

                    }

                    break;

                case 4 : // 4 - Buscar por título

                    // Se ainda não há filmes cadastrados

                    if ( posicao == 0 ) {

                        System.out.println("Ainda não há filmes cadastrados!");
                        break;

                    }

                    boolean filmePesquisado = false; // Valida se o filme foi encontrado na pesquisa

                    String buscaFilme;

                    sc.nextLine(); // Limpa o buffer de teclado

                    System.out.println("Digite o nome do filme para pesquisar: ");
                    buscaFilme = sc.nextLine();

                    // Percorrendo array de filmes

                    for ( int i = 0; i < posicao; i++ ) {

                        // Verificando se há correspondência entre o filme digitado
                        // ignorando a caixa e o cadastrado no array de fimes
                        //

                        if( buscaFilme.equalsIgnoreCase( listaFilme[i].titulo ) ) {

                            // Se encontrou correspondência listar os atributos

                            System.out.println("Nome do filme: " + listaFilme[i].titulo);
                            System.out.println("Gênero do filme: " + listaFilme[i].genero);
                            System.out.println("Nota do filme: " + listaFilme[i].nota);
                            System.out.println("Classificação do filme: " + listaFilme[i].classificacao);

                            filmePesquisado = true;

                        }

                    }

                    // Se filme não está cadastrado no array em nenhuma posição
                    // após ele ser percorrido

                    if ( posicao != 0 && !filmePesquisado ) {

                        System.out.println("O filme pesquisado ainda não foi cadastrado!");

                    }

                    break;

                case 5 : // 5 - Estatísticas

                    // Se ainda não há filmes cadastrados

                    if ( posicao == 0 ) {

                        System.out.println("Ainda não há filmes cadastrados!");
                        break;

                    }

                    // Inicializa as variáveis com os dados do primeiro filme (índice 0)

                    double maiorNota = 0;
                    int posicaoMaiorNota = 0;

                    double menorNota = 11;
                    int posicaoMenorNota = 0;

                    double totalNota = 0; // Totalizador de notas
                    int contaFilmeOtimo = 0; // Conta quantos filmes tiveram classificação "Ótimo"

                    // Mostrando o total de filmes cadastrados

                    System.out.println("Total de filmes cadastrados: " + filmeCadastrado);

                    // Percorrendo o vetor de notas para calcular o total das notas

                    for ( int i = 0; i < posicao; i++ ) {

                        totalNota += listaFilme[i].nota;

                    }

                    System.out.printf("Média das notas dos filmes cadastrados: %.2f\n" ,
                            ( totalNota / filmeCadastrado ));

                    // Percorre o vetor para comparar e obter
                    // a maior e a menor nota

                    for (int i = 0; i < posicao; i++) {

                        // Verifica se a nota atual é maior que a maior registrada

                        if ( listaFilme[i].nota > maiorNota ) {

                            maiorNota = listaFilme[i].nota;
                            posicaoMaiorNota = i;
                        }

                        // Verifica se a nota atual é menor que a menor registrada

                        if ( listaFilme[i].nota < menorNota ) {

                            menorNota = listaFilme[i].nota;
                            posicaoMenorNota = i;
                        }
                    }

                    // Mostrando o melhor filme com base na maior nota
                    // Mostrando o pior filme com base na menor nota

                    System.out.println("Melhor filme cadastrado: " + listaFilme[posicaoMaiorNota].titulo +
                            " (Nota: " + maiorNota + ")");
                    System.out.println("Pior filme cadastrado: " + listaFilme[posicaoMenorNota].titulo +
                            " (Nota: " + menorNota + ")");

                    // Percorrendo o vetor de classificação para descobrir
                    // quantos filmes são ótimos

                    for ( int i = 0; i < posicao; i++) {

                        // O texto fixo "Ótimo" nunca será null, então o código nunca vai quebrar

                        if ( listaFilme[i].classificacao.equals( "Ótimo" ) ) {

                            contaFilmeOtimo++;

                        }

                    }

                    // Mostrando quantos filmes foram classificados como "Ótimo"

                    System.out.println("Filmes ótimos: " + contaFilmeOtimo + " de " + filmeCadastrado);

                    break;

                case 6 : // 6 - Sair

                    System.out.println("Saindo do sistema! Obrigada!");
                    break;

                default :

                    System.out.println("Opção inválida! Tente novamente");

            }





















            }







        }











}
