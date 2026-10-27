package org.example.aula22.auladecorator;

public class CafeDecorator {

    abstract class CafeDecorator implements Cafe {
        protected Cafe cafeEmbrulhado;


        public CafeDecorator(Cafe cafe) {
            this.cafeEmbrulhado = cafe;

        }
    }
}
