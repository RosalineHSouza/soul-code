package org.example.aula14;

public class Main {

    static void main() {

        /*

        1. Crie a classe Pessoa com os atributos nome e idade, e o método
        apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."

        Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada.

        Na Main, crie uma aluna, preencha nome e idade, e chame apresentar().

        Repare: você não escreveu nome, idade nem apresentar() na Aluna,
        e os três funcionaram.

        */

        // Criando a instância de Aluna
        Aluna novaAluna = new Aluna();

        // Preenchendo nome e idade (herdados de Pessoa)
        novaAluna.nome = "Catarina";
        novaAluna.idade = 30;

        // Chamando o método apresentar (também herdado de Pessoa)
        novaAluna.apresentar();

        //2. Acrescente na Aluna o atributo curso e o método estudar(), que
        // imprime "[nome] está estudando [curso]."
        // Preencha os três atributos no objeto e chame os dois métodos.
        // Repare que o estudar() usa o nome, que veio da mãe.

        // Criando a instância de Aluna
        Aluna alunaCurso = new Aluna();

        // Preenchendo nome, idade e curso
        alunaCurso.nome = "Lucíola";
        alunaCurso.idade = 22;
        alunaCurso.curso = "Artes Cênicas";

        // Chamando os métodos apresentar (herdado de Pessoa) e estudar (que usa o atributo nome herdado da mãe)
        alunaCurso.apresentar();
        alunaCurso.estudar();

        //3. Crie a classe Professora, também filha de Pessoa, com o atributo
        // disciplina e o método lancarNota(String aluna, double nota), que
        // imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
        // com %.1f.
        // Na Main, crie uma aluna e uma professora, preencha os atributos de
        // cada objeto e chame os métodos das duas.

        // Criando a instância de Aluna
        Aluna alunaNota = new Aluna();

        // Criando a instância de Professora
        Professora profJava = new Professora();

        // Preenchendo os objetos com seus respectivos atributos
        alunaNota.nome = "Rosaline";
        alunaNota.idade = 58;
        alunaNota.curso = "Algoritmos";

        profJava.nome = "Flora";
        profJava.idade = 20;
        profJava.disciplina = "Algoritmos";

        // Chamando os métodos respectivos de cada classe
        alunaNota.apresentar();
        alunaNota.estudar();

        profJava.apresentar();
        profJava.lancarNota(alunaNota.nome, 9.9);

        //4. Na Professora, sobrescreva o apresentar() usando @Override, para
        // imprimir "Oi, sou [nome] e ensino [disciplina]."
        // Chame apresentar() na aluna e na professora e compare as saídas.

        // Chamando os métodos apresentar de cada classe
        // As saídas serão diferentes devido ao "@override" em Professora que fez prevalecer
        // o método apresentar para aquela classe

        alunaNota.apresentar();
        profJava.apresentar();

        //5. Faça uma cadeia de três níveis:
        // - Funcionario, com o atributo nome e o método baterPonto()
        // - Gerente extends Funcionario, com aprovarFerias(String quem)
        // - Diretora extends Gerente, com definirMeta(String meta)
        // Na Main, crie uma Diretora, preencha o nome dela
        // (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto.
        // Herança em cadeia: ela tem tudo que vem de cima.

        // Criando a instância de Diretora

        Diretora debora = new Diretora();

        // Chamando os métodos

        debora.baterPonto();
        debora.aprovarFerias("Rosaline");
        debora.definirMeta("Redução dos SLAs de atendimento em 15%");

        // 6. Crie duas interfaces:
        // - Notificavel, com notificar(String mensagem)
        // - Exportavel, com exportar()
        // Faça o Gerente do exercício 5 implementar as duas, SEM tirar o
        // extends Funcionario:
        // class Gerente extends Funcionario implements Notificavel, Exportavel
        // Na Main, crie um gerente, preencha o nome e chame os quatro
        // métodos nele: baterPonto(), aprovarFerias(), notificar()
        // e exportar().

        // Criando a instância de Gerente

        Gerente gerente = new Gerente();

        // Preenchendo os objetos com atributo "nome"

        gerente.nome = "Alessandra";

        // Chamando os métodos pertinentes

        gerente.baterPonto();
        gerente.aprovarFerias("Flora");
        gerente.notificar("Estou notificando o notificável!");
        gerente.exportar();

        // Depois tente colocar uma segunda classe no extends:
        // extends Funcionario, Pessoa
        // Veja o que o Java responde.

        // ===>>> Java não mais que uma classe com "extends" <<<===


    }

}

/*

*** Evidência de execução ***

C:\Users\souza\.jdks\openjdk-27\bin\java.exe "-javaagent:D:\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=64487" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\souza\IdeaProjects\soul-code\target\classes org.example.aula14.Main
Oi, sou Catarina e tenho 30 anos.

Oi, sou Lucíola e tenho 22 anos.
Lucíola está estudando Artes Cênicas

Oi, sou Rosaline e tenho 58 anos.
Rosaline está estudando Algoritmos

Oi, sou Flora e ensino Algoritmos
Flora lançou nota 9,9 para Rosaline

Oi, sou Rosaline e tenho 58 anos.
Oi, sou Flora e ensino Algoritmos

Process finished with exit code 0

*/
