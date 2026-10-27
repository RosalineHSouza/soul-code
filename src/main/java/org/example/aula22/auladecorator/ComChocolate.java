package org.example.aula22.auladecorator;

public class ComChocolate {

    class ComChocolate extends CafeDecorator {

        public ComChocolate(Cafe cafe) {
            super(cafe);
        }


        @Override
        public String getDescricao() {
            return cafeEmbrulhado.getDescricao() + " + Chocolate";
        }

        @Override
        public double getPreco() {
            return cafeEmbrulhado.getPreco() + 3.50;
        }

    }
}
