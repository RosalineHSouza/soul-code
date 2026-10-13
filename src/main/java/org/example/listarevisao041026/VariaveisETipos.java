package org.example.listarevisao041026;

public class VariaveisETipos {

    public static void main(String[] args) {

        /*

        Variáveis e tipos

        Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.

        Crie uma variável cidade e imprima: "Eu moro em Salvador."

        Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.

        Crie uma variável preco com 29.90 e imprima o valor dela numa frase.

        Crie uma variável temCarteira com true e imprima.


        🔥 Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever
        os números 10 e 20 de novo.

        💡 Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável
        para guardar alguma coisa antes.

        */

        // Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.

        String nome = "Rosaline";
        int idade = 58;
        double altura = 1.67;
        boolean jaProgramouAntes = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Já programou antes? " + jaProgramouAntes);

        // Crie uma variável cidade e imprima: "Eu moro em Salvador."

        String cidade = "São Paulo";

        System.out.println("Eu moro em " + cidade);

        // Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.

        String primeiroNome = "Rosaline";
        String sobrenome = "Helenna de Souza";

        System.out.println("Meu nome completo é: " + primeiroNome + " " + sobrenome);

        // Crie uma variável preco com 29.90 e imprima o valor dela numa frase.

        double preco = 29.90;

        System.out.println("O preço sugerido para o ítem é: " + preco);

        // Crie uma variável temCarteira com true e imprima.

        boolean temCarteira = true;

        System.out.println("Você tem carteira? " + temCarteira);

        // Mini-desafio

        int a = 10;
        int b = 20;

        System.out.println("Os valores de a e b ANTES da troca são, respectivamente: " + a + " e " + b);

        int swap = a; // Variável intermediária para possibilitar troca de valores entre a e b

        a = b;
        b = swap;

        System.out.println("Os valores de a e b DEPOIS de troca são, respectivamente: " + a + " e " + b);


    }
}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=53832" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.listarevisao041026.VariaveisETipos
Nome: Rosaline
Idade: 58
Altura: 1.67
Já programou antes? true

Eu moro em São Paulo

Meu nome completo é: Rosaline Helenna de Souza

O preço sugerido para o ítem é: 29.9

Você tem carteira? true

Os valores de a e b ANTES da troca são, respectivamente: 10 e 20
Os valores de a e b DEPOIS de troca são, respectivamente: 20 e 10

Process finished with exit code 0



*/
