package org.example.aula18;

public class AulaSingleton {

    static void main() {

        TesteSingleton testeS = TesteSingleton.getInstancia();

        ContadorVisitas v1 = ContadorVisitas.getInstancia();
        ContadorVisitas v2 = ContadorVisitas.getInstancia();
        ContadorVisitas v3 = ContadorVisitas.getInstancia();

        v1.registrarVisita();
        System.out.println( v1.getTotal() );

        v2.registrarVisita();
        System.out.println( v2.getTotal() );

        v3.registrarVisita();
        System.out.println( v2.getTotal() );





    }


}
