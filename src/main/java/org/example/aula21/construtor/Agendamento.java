package org.example.aula21.construtor;

public class Agendamento {

   String nomePet;
   String servico;
   String horario;
   boolean perfume;
   boolean laco;
   boolean hidratacao;
   String observacao;
   double desconto;

   public Agendamento (String nomePet, String servico, String horario, boolean perfume, boolean laco,
   boolean hidratacao, String observacao, double desconto) {

       this.nomePet = nomePet;
       this.servico = servico;
       this.horario = horario;
       this.perfume = perfume;
       this.laco = laco;
       this.hidratacao = hidratacao;
       this.observacao = observacao;
       this.desconto = desconto;

   }

   void mostrar() {

       System.out.println(nomePet + ", " + servico + ", " + horario + ", " +
               perfume + ", " + laco + ", " + hidratacao + ", " + observacao + ", " + desconto);

   }
}
