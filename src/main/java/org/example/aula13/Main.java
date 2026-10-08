package org.example.aula13;

import java.util.ArrayList;

    /*
    1. Crie uma interface Animal com o método emitirSom().
    Crie a classe Cachorro que implementa ela e imprime "Au au!".
    Na Main, crie um cachorro e chame o método. Não esqueça do @Override.
    */

public class Main {

    public static void main(String[] args) {

        Animal caramelo = new Cachorro();
        caramelo.emitirSom();

    /*

    2. Agora acrescente a classe Gato, que implementa a mesma interface e
    imprime "Miau!". Na main, declare as duas variáveis como Animal:
    Animal bidu = new Cachorro();
    Animal salem= new Gato();
    Chame emitirSom() nas duas.

    */

        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

    /*
    3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro,
    e percorra com for-each chamando emitirSom(). Repare que não
    tem nenhum if. Dica:
    animais.add(new Cachorro());
    */

        ArrayList<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro());
        animais.add(new Gato());

        for (Animal animal : animais){

            animal.emitirSom();

        }
    /*

    4. Crie uma interface Notificacao com o método enviar(String mensagem).
    Crie duas classes que implementam ela: Email e SMS. Cada uma
    imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
    e percorra com for-each, enviando a mesma mensagem.

    Saída esperada:
    E-mail enviado: Sua compra foi aprovada!
    SMS enviado: Sua compra foi aprovada!

    */

        ArrayList<Notificacao> cliente = new ArrayList<>();

        cliente.add(new Email());
        cliente.add(new Sms());


        for(Notificacao compra : cliente){

            compra.enviar("Sua compra foi aprovada!");

        }
    /*
    5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar().
    Crie Carro e Moto implementando os dois. Coloque numa lista e
    percorra com for-each chamando os dois métodos em cada um.
    */

        ArrayList<Veiculo> veiculo = new ArrayList<>();

        veiculo.add(new Carro());
        veiculo.add(new Moto());

        for(Veiculo tipo : veiculo){

            tipo.ligar();
            tipo.acelerar();

        }

    }

}

/*

*** Evidência de execução ***

Au au!

Au au!
Miau!

Au au!
Miau!

E-mail enviado: Sua compra foi aprovada!
SMS enviado: Sua compra foi aprovada!

Carro: insira e gire a chave na ignição para ligar o veículo!
Carro: pise no pedal da extrema direita para acelerar o veículo!

Moto: ligue a chave, certifique-se de que (kill switch) está na posição ligado e aperte o botão de partida elétrica
Moto: para acelerar, gire a manopla para trás (em direção ao seu corpo)

Process finished with exit code 0


 */