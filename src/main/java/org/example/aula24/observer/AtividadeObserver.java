package org.example.aula24.observer;

public class AtividadeObserver {

    // 1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.

    /*

    O padrão Observer resolve o problema de manter vários objetos informados automaticamente quando algo
    acontece ou muda em outro objeto, sem que esse objeto precise conhecer os detalhes de cada interessado.

    Exemplo do dia a dia: acompanhamento de uma encomenda
    Imagine que você comprou um produto pela internet e deseja acompanhar a entrega.

    Sem o Observer, você precisaria acessar o site da transportadora repetidamente para verificar
    se o pedido foi enviado, saiu para entrega ou chegou ao destino.

    Com uma lógica semelhante ao Observer, você se cadastra para receber notificações.
    Quando o status da encomenda muda, o sistema avisa automaticamente todos os interessados cadastrados.

    */

    // 2 - No Observer, o que é o Subject e o que é o Observer?
    // Como o Subject avisa os observadores sem conhecer as classes concretas deles?

    /*

    Subject (Observable): Canal, responsável por manter e notificar os inscritos.

    Observer: Inscrito, interface que define o contrato de notificação.

    O Subject avisa os observadores inscritos pelo método de notificação implementado na classe

    */

    // 3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa
    // saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?

    /*

    Como o entregador é um novo observador, será preciso criar um novo objeto do tipo Seguidor no Main,
    para que ele receba a notificação

    */

    // 4 - A interface já está pronta:
    //
    //public interface ObservadorVoo {
    //void atualizar(String status);
    //
    //}











}
