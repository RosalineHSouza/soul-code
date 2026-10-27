package org.example.aula22.auladecorator;

public class ComLeite {

    public class ComLeite extends CafeDecorator{

        public ComLeite(Cafe cafe) {
            super(cafe);
        }

        @Override
        public String getDescricao() {
            return cafeEmbrulhado.getDescricao() + " + Leite";
        }

        @Override
        public double getPreco() {
            return cafeEmbrulhado.getPreco() + 2.00;
        }


    }
}
