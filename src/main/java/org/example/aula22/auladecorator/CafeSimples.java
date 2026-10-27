package org.example.aula22.auladecorator;

public class CafeSimples {

    public class CafeSimples implements Cafe{

        @Override
        public String getDescricao() {

            return "Café Simples";
        }


        @Override
        public double getPreco() {

            return 5.0;
        }



        @Override
        public void naoFazerBarulhoApos10Horas(){

        }
    }
}
