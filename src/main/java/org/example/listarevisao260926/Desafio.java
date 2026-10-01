package org.example.listarevisao260926;

import java.util.Scanner;

public class Desafio {
    static void main() {

        /*
        7 - DESAFIO — Sistema de Cadastro de Alunas
        Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas.
        O programa fica rodando até a pessoa escolher sair.
        Como são muitas instruções e condições, não colocarei aqui. :-)
        */

        int escolha = 0; // recebe a escolha do menu
        int cadastradas = 0; // recebe o total de alunas cadastradas

        while (escolha != 2) {

            System.out.println("Sistema de Cadastro de Alunas");
            System.out.println("Por gentileza, selecione a opção desejada: ");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.println("3 - Total de alunas cadastradas no sistema"); // Bônus
            Scanner sc = new Scanner(System.in);
            escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                    // Instanciando nova aluna
                    Aluna novaaluna = new Aluna();

                    // Recebe a primeira nota

                    do { // Bônus: impede a digitação de nota <0 ou nota > 10
                        System.out.println("Digite a primeira nota da aluna: ");

                        novaaluna.nota1 = sc.nextDouble();

                        if (novaaluna.nota1 < 0 || novaaluna.nota1 > 10){

                            System.out.println("A nota deve estar entre 1 e 10. Por favor, digite novamente!");
                        }

                    } while(novaaluna.nota1 < 0 || novaaluna.nota1 > 10);

                    //Recebe a segunda nota

                    do { // Bônus: impede a digitação de nota <0 ou nota > 10

                    System.out.println("Digite a segunda nota da aluna: ");

                    novaaluna.nota2 = sc.nextDouble();

                        if (novaaluna.nota2 < 0 || novaaluna.nota2 > 10){

                            System.out.println("A nota deve estar entre 1 e 10. Por favor, digite novamente!");
                        }

                    } while(novaaluna.nota2 < 0 || novaaluna.nota2 > 10);

                    //Calcula a média
                    novaaluna.media = (novaaluna.nota1 + novaaluna.nota2) / 2;

                    //Recebe o nome da aluna
                    sc.nextLine(); // Correção: Consome o '\n' que ficou sobrando (limpa o buffer)
                    System.out.println("Digite o nome da aluna: ");
                    novaaluna.nome = sc.nextLine();

                    //Determinando se a aluna foi aprovada ou reprovada

                    String status;

                    if (novaaluna.media >= 6) {

                        novaaluna.passou = true;
                        status = "Aprovada";

                    } else {

                        novaaluna.passou = false;
                        status = "Reprovada";

                    }

                    System.out.printf("O nome da aluna é %s. Sua primeira nota foi %.1f, sua segunda nota foi %.1f"
                                    + " e sua média foi %.1f", novaaluna.nome, novaaluna.nota1, novaaluna.nota2,
                            novaaluna.media); // Não será exibido %b devido ao bônus abaixo

                    // Bônus: exibe "aprovada" ou "reprovada" em vez de "true" ou "false"

                    System.out.println(". Situação da aluna: " + status + ".");

                    // Totalizador de alunas cadastradas
                    cadastradas++;
                    break;

                case 2:

                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                case 3:

                    System.out.println("Temos, até o momento, " + cadastradas + " aluna(s) cadastrada(s) no sistema!");
                    break;

                default:

                    System.out.println("Opção Inválida! Digite novamente!");

            }

        }
    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=51135" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\SoulCode\target\classes org.example.listarevisao260926.Desafio
Sistema de Cadastro de Alunas
Por gentileza, selecione a opção desejada:
1 - Continuar
2 - Sair
3 - Total de alunas cadastradas no sistema
1
Digite a primeira nota da aluna:
90
A nota deve estar entre 1 e 10. Por favor, digite novamente!
Digite a primeira nota da aluna:
-8
A nota deve estar entre 1 e 10. Por favor, digite novamente!
Digite a primeira nota da aluna:
9
Digite a segunda nota da aluna:
99
A nota deve estar entre 1 e 10. Por favor, digite novamente!
Digite a segunda nota da aluna:
-5
A nota deve estar entre 1 e 10. Por favor, digite novamente!
Digite a segunda nota da aluna:
6
Digite o nome da aluna:
Rosaline Helenna de Souza
O nome da aluna é Rosaline Helenna de Souza. Sua primeira nota foi 9,0, sua segunda nota foi 6,0 e sua média foi 7,5. Situação da aluna: Aprovada.
Sistema de Cadastro de Alunas
Por gentileza, selecione a opção desejada:
1 - Continuar
2 - Sair
3 - Total de alunas cadastradas no sistema
3
Temos, até o momento, 1 aluna(s) cadastrada(s) no sistema!
Sistema de Cadastro de Alunas
Por gentileza, selecione a opção desejada:
1 - Continuar
2 - Sair
3 - Total de alunas cadastradas no sistema
1
Digite a primeira nota da aluna:
8
Digite a segunda nota da aluna:
6
Digite o nome da aluna:
Angélica de Sá Porto
O nome da aluna é Angélica de Sá Porto. Sua primeira nota foi 8,0, sua segunda nota foi 6,0 e sua média foi 7,0. Situação da aluna: Aprovada.
Sistema de Cadastro de Alunas
Por gentileza, selecione a opção desejada:
1 - Continuar
2 - Sair
3 - Total de alunas cadastradas no sistema
3
Temos, até o momento, 2 aluna(s) cadastrada(s) no sistema!
Sistema de Cadastro de Alunas
Por gentileza, selecione a opção desejada:
1 - Continuar
2 - Sair
3 - Total de alunas cadastradas no sistema
5
Opção Inválida! Digite novamente!
Sistema de Cadastro de Alunas
Por gentileza, selecione a opção desejada:
1 - Continuar
2 - Sair
3 - Total de alunas cadastradas no sistema
2
Encerrando o sistema. Até logo!

Process finished with exit code 0

*/