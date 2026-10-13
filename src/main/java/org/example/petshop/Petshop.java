package org.example.petshop;

import java.util.*;

public class Petshop {

    // Método 1: Recebe apenas o pet

    static void mostrarFicha(Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }

    // Método 2: Recebe o pet e um título personalizado

    static void mostrarFicha(Pet pet, String titulo) {

        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.println("Peso: " + pet.peso + " kg");
        System.out.println("Porte: " + pet.porte);

    }


    static void main() {

        /*

        // 1. A primeira ficha

        String nome = "Mingau";
        String especie = "Gato";
        double peso = 7.9;

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f\n", peso);

        // 2. Perguntando os dados

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do seu pet: ");
        nome = sc.nextLine();

        System.out.println("Digite a espécie do seu pet: ");
        especie = sc.nextLine();

        System.out.println("Digite o peso do seu pet: ");
        peso = sc.nextDouble();

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f\n" , peso);

        // 3. O porte do pet

        nome = "Mingau";
        especie = "Gato";
        peso = 25;

        String porte;

        if ( peso >= 25 ) {

            porte = "Grande";

        } else if ( peso > 10) {

            porte = "Médio";

        } else {

            porte = "Pequeno";

        }

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.printf("Peso: %.1f\n" , peso);
        System.out.println("Porte: " + porte);

        // 4. Juntando tudo num objeto

        Pet pet = new Pet();

        pet.nome = "Mingau";
        pet.especie = "Gato";
        pet.peso = 9.0;
        pet.porte = "Pequeno";

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f\n" , pet.peso);
        System.out.println("Porte: " + pet.porte);

        // 5. Tirando o porte do main

        pet.nome = "Mingau";
        pet.especie = "Gato";
        pet.peso = 9.0;
        pet.porte = pet.definirPorte();

        System.out.println("=== FICHA DO PET ===");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Espécie: " + pet.especie);
        System.out.printf("Peso: %.1f\n" , pet.peso);
        System.out.println("Porte: " + pet.porte);

        // 6. Vários pets

        Pet[] lista = new Pet[5];

        Pet petzinho = new Pet();

        petzinho.nome = "Mingau";
        petzinho.especie = "Gato";
        petzinho.peso = 9.0;
        petzinho.porte = petzinho.definirPorte();

        lista[0] = petzinho;

        System.out.println("--- PETS CADASTRADOS ---");
        System.out.printf("%s (%s) - %.1f - Porte %s\n" , lista[0].nome, lista[0].especie, lista[0].peso,
                lista[0].porte);

         */

        // 7. O menu

        // Criando a fila de banho
        ArrayDeque<String> filaBanhoPet = new ArrayDeque<>();

        // Criando array de objeto Pet com 5 posições
        Pet[] listaPet = new Pet[5];

        int opcao = -1; // Recebe opção do menu
        int posicao = 0; // Controla a posicão no array de objetos

        Scanner sc = new Scanner(System.in);

        while (opcao != 0) {

            System.out.println("=== PETSHOP ===");
            System.out.println("1 - Cadastrar pet");
            System.out.println("2 - Listar pets");
            System.out.println("3 - Procurar pets");
            System.out.println("4 - Espécies cadastradas");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender o próximo");
            System.out.println("7 - Usando os nossos serviços");
            System.out.println("8 - Quantos pets estão cadastrados?");
            System.out.println("0 - Sair");
            System.out.println("Escolha: ");

            // Tratamento de exceção para o caso de digitar letras em vez de números

            try {

                opcao = sc.nextInt();

            } catch (InputMismatchException e) {

                sc.nextLine(); // Impede loop infinito no menu

            }

            switch (opcao) {

                case 1: // 1 - Cadastrar pet

                    if ( posicao < listaPet.length ) {

                    sc.nextLine(); // Limpa buffer de teclado

                    System.out.println("Espécie: ");
                    String selecionaEspecie = sc.nextLine();

                    Pet meuPet;

                    if ( selecionaEspecie.equalsIgnoreCase("Cachorro") ) {

                        meuPet = new Cachorro();

                    } else if ( selecionaEspecie.equalsIgnoreCase("Gato") ) {

                        meuPet = new Gato();

                    } else {

                        meuPet = new Pet();

                    }

                    meuPet.especie = selecionaEspecie;

                    System.out.println("Nome: ");
                    meuPet.nome = sc.nextLine();

                    System.out.println("Peso: ");
                    meuPet.peso = sc.nextDouble();

                    meuPet.porte = meuPet.definirPorte();

                    listaPet[posicao] = meuPet;

                    posicao++;

                    // Métodos criados no item 16 (SOBRECARGA)

                    mostrarFicha(meuPet);

                    System.out.println("---");

                    mostrarFicha(meuPet, "=== FICHA DO PET ===");

                    } else {

                        System.out.println("Cadastro cheio! Não há mais como cadastrar novos pets!");

                    }

                    break;

                case 2: // 2 - Listar pets

                    if (posicao == 0) {

                        System.out.println("Nenhum pet cadastrado");
                        break;

                    }

                    System.out.println("--- PETS CADASTRADOS ---");

                    for (int i = 0; i < posicao; i++) {

                        System.out.println(listaPet[i].nome + " (" + listaPet[i].especie + ") - " +
                                listaPet[i].peso + " Kg - Porte " + listaPet[i].porte);

                        System.out.print(listaPet[i].nome + " faz: ");

                        listaPet[i].emitirSom();

                    }

                    break;

                case 3: // 3 - Procurar pets

                    if (posicao == 0) {

                        System.out.println("Nenhum pet cadastrado");
                        break;

                    }

                    boolean achadoPet = false; // Valida se o pet foi encontrado na pesquisa

                    String pesquisaPet; // Recebe nome do pet para pesquisa

                    sc.nextLine(); // Limpa o buffer de teclado

                    System.out.println("Qual pet você procura?");
                    pesquisaPet = sc.nextLine();

                    // Percorrendo array de pets

                    for (int i = 0; i < posicao; i++) {

                        // Verificando se há correspondência entre o pet digitado
                        // ignorando a caixa e o cadastrado no array de pets
                        //

                        if (listaPet[i].nome.equalsIgnoreCase(pesquisaPet)) {

                            // Se encontrou correspondência listar o pet

                            System.out.println("Encontrado: " + listaPet[i].nome + " (" + listaPet[i].especie +
                                    ") - " + listaPet[i].peso + " Kg");

                            achadoPet = true;

                        }

                    }

                    // Se pet não está cadastrado no array em nenhuma posição
                    // após ele ser percorrido

                    if (!achadoPet) {

                        System.out.println("Pet não encontrado.");

                    }

                    break;

                case 4: // 4 - Espécies cadastradas

                    // Criando o HashSet para armazenar as espécies sem repetição

                    HashSet<String> especiesUnicas = new HashSet<>();

                    // Percorrendo os pets e guardando a espécie de cada um

                    for (int i = 0; i < posicao; i++) {

                        especiesUnicas.add(listaPet[i].especie);

                    }

                    // Exibindo a saída no formato esperado

                    System.out.println("--- ESPÉCIES CADASTRADAS ---");

                    for (String especie : especiesUnicas) {
                        System.out.println("- " + especie);

                    }

                    // Mostrando o total de espécies diferentes

                    System.out.println("Total de espécies diferentes: " + especiesUnicas.size());

                    break;

                case 5 : // 5 - Entrar na fila de banho

                    sc.nextLine(); // Limpar buffer de teclado

                    System.out.print("Nome do pet pra entrar na fila: ");
                    String petEntrante = sc.nextLine();

                    filaBanhoPet.add(petEntrante); // Adiciona no fim da fila

                    System.out.println(petEntrante + " entrou na fila.");
                    System.out.println("Fila agora: " + filaBanhoPet );

                    break;

                case 6 : // 6 - Atender o próximo

                    // Verifica se a fila NÃO está vazia antes de atender

                    if ( filaBanhoPet.isEmpty() ) {

                        System.out.println("A fila de banho está vazia!");

                    } else {

                        // Espia quem é o próximo (opcional, mas bom para mostrar)

                        String proximoPet = filaBanhoPet.peek();
                        System.out.println("Próximo da fila: " + proximoPet);

                        // Remove e retorna o primeiro da fila

                        String atendidoPet = filaBanhoPet.poll();
                        System.out.println("Atendendo " + atendidoPet + "...");

                        // Mostra o estado atual da fila após a remoção

                        System.out.println("Fila agora: " + filaBanhoPet);

                    }

                    break;

                case 7 : // 7 - Usando os nossos serviços

                    sc.nextLine(); // Limpando o buffer

                    String servicoPet; // Recebe nome do pet para usufruir dos serviços

                    System.out.println("Nome: ");
                    servicoPet = sc.nextLine();

                    ArrayList<Servico> lista = new ArrayList<>();

                    lista.add(new Banho());
                    lista.add(new Tosa());
                    lista.add(new Consulta());

                    for(Servico item : lista){

                        item.executar(servicoPet);

                    }

                    break;

                case 8 : // 8 - Quantos pets estão cadastrados?

                    System.out.println("Temos " + posicao + " pets cadastrados de um total de " + listaPet.length +
                            " posicões disponíveis.");

                case 0:

                    System.out.println("Obrigada! Saindo do sistema...");

                    break;

                default:

                     System.out.println("Opção inválida.");


            }
        }

    }

}



