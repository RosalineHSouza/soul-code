package org.example.aula12;

import java.util.ArrayDeque;
import java.util.List;

public class AtividadeArrayDeque {

    public static void main(String[] args) {

        // 1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
        //   e quantas pessoas tem.

        ArrayDeque<String> fila = new ArrayDeque<>();

        fila.add("Pedro");
        fila.add("João");
        fila.add("Lucas");

        System.out.println(fila);

        // 2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
        //   imprima a fila logo depois. Repare que ela não mudou.

        ArrayDeque<String> fila2 = new ArrayDeque<>();

        fila2.addAll(List.of("Alfa", "Beta", "Gama", "Omega"));

        System.out.println(fila2.peek());

        System.out.println(fila2);

        // 3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
        //   depois. Compare com o exercício 2.

        fila2.pollFirst();
        System.out.println(fila2);

        // Houve a remoção (atendimento) do primeiro elemento
        // FIFO = First In, First Out

        // 4. Crie uma fila com três nomes e atenda todos usando
        //   while (!fila.isEmpty()). No final, imprima "Fila vazia!".

        ArrayDeque<String> fila3 = new ArrayDeque<>();

        fila3.addAll(List.of("Huguinho", "Zezinho", "Luizinho"));

        while ( !fila3.isEmpty() ) {

            System.out.println("Próxima na fila: " + fila3.peek());
            System.out.println("Atendendo: " + fila3.pollFirst());

            if ( fila3.isEmpty()) {

                System.out.println("Fila vazia!");
            }

        }

        // 5. Crie uma fila com três nomes e use contains para responder duas
        //   perguntas: se "Bia" está na fila e se "Zoe" está.

        ArrayDeque<String> fila4 = new ArrayDeque<>();

        fila4.addAll(List.of("Bjorn", "Zoe", "Cloe"));

        if ( fila4.contains("Bia") ) {

            System.out.println("Bia está na fila");

        } else {

            System.out.println("Bia não está na fila");
        }

        if ( fila4.contains("Zoe") ) {

            System.out.println("Zoe está na fila");

        } else {

            System.out.println("Zoe não está na fila");

        }

        // 6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
        //   - se estiver vazia  -> "Não tem ninguém na fila."
        //   - se tiver gente    -> "Próximo: [nome]"
        //   Depois adicione uma pessoa e teste de novo.

        ArrayDeque<String> fila5 = new ArrayDeque<>();

        fila5.add("Nicodemos");

        if ( fila5.isEmpty() ) {

            System.out.println("Não tem ninguém na fila.");

        } else {

            System.out.println("Próximo: " + fila5.peek());

        }

    }
}

/*

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=50133" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.aula12.AtividadeArrayDeque

[Pedro, João, Lucas]

Alfa
[Alfa, Beta, Gama, Omega]

[Beta, Gama, Omega]

Próxima na fila: Huguinho
Atendendo: Huguinho
Próxima na fila: Zezinho
Atendendo: Zezinho
Próxima na fila: Luizinho
Atendendo: Luizinho
Fila vazia!

Bia não está na fila
Zoe está na fila

Não tem ninguém na fila.

Próximo: Nicodemos

Process finished with exit code 0

*/