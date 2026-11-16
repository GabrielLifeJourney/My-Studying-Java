public class Aula002 {
    static void main(String[] args) {
        /*
    - ☕ Aula 002 — Como Java Funciona

    # ☕ Aula 002 — Como Java Funciona

    Assistir à aula no YouTube

    **Canal:** DevDojo
    **Duração:** 10min28s
    **Idioma:** Português (transcrição gerada automaticamente)

    ---

    ## 🎯 Objetivo

    Compreender como Java permite executar uma aplicação em diferentes sistemas operacionais e conhecer o caminho do código-fonte até sua execução pela JVM.

    Ao final da aula, os principais conceitos são:

    - JVM (Java Virtual Machine).
    - Compilação e bytecode.
    - Arquivos `.java` e `.class`.
    - JDK (Java Development Kit).
    - JRE (Java Runtime Environment).

    ---

    ## 📚 Conceitos

    ### 1. Sistemas operacionais e aplicações

    > ⏱️ TIMESTAMP: 00:00–02:13
    >

    Existem diferentes sistemas operacionais, como Windows, Linux e macOS.

    Cada sistema possui características próprias e gerencia a comunicação entre os aplicativos e os componentes do computador, como processador, memória RAM e armazenamento.

    Por isso, um programa desenvolvido para um sistema operacional pode não funcionar diretamente em outro.

    ### 2. A proposta do Java

    > ⏱️ TIMESTAMP: 02:13–03:16
    >

    A proposta apresentada é permitir que uma mesma aplicação Java seja executada em diferentes sistemas operacionais.

    O slogan associado a essa ideia é:

    **Write Once, Run Anywhere.**

    Tradução: escreva uma vez, execute em qualquer lugar.

    Para isso, Java utiliza uma camada intermediária chamada JVM.

    ### 3. JVM — Java Virtual Machine

    > ⏱️ TIMESTAMP: 03:16–04:17
    >

    JVM significa Java Virtual Machine (Máquina Virtual Java).

    Ela funciona como uma camada entre a aplicação Java e o sistema operacional.

    Em vez de criar uma versão diferente da aplicação para cada sistema operacional, o desenvolvedor compila o programa para gerar bytecode. Esse bytecode pode ser executado por uma JVM compatível com o sistema operacional utilizado.

    Cada sistema operacional precisa de uma implementação compatível da JVM.

    ### 4. Compilação e bytecode

    > ⏱️ TIMESTAMP: 04:17–06:18
    >

    Java passa por um processo de compilação.

    O fluxo apresentado na aula é:

    - O desenvolvedor escreve o código-fonte em um arquivo `.java`.
    - O compilador transforma o código-fonte.
    - O processo gera um arquivo `.class`.
    - O arquivo `.class` contém o bytecode.
    - A JVM executa esse bytecode.

    **Bytecode** é uma representação intermediária do programa, utilizada pela JVM.

    ### 5. O compilador javac

    > ⏱️ TIMESTAMP: 05:16–06:18
    >

    O comando `javac` é o compilador Java.

    Ele recebe o arquivo de código-fonte e gera o arquivo de bytecode.

    Exemplo apresentado a partir do fluxo da aula:

    ```bash
    javac Main.java
    ```

    Após a compilação, é gerado o arquivo:

    ```
    Main.class
    ```

    ### 6. JDK — Java Development Kit

    > ⏱️ TIMESTAMP: 06:18–08:31
    >

    JDK significa Java Development Kit (Kit de Desenvolvimento Java).

    É o conjunto de ferramentas utilizado para desenvolver aplicações Java.

    A aula destaca que o JDK fornece:

    - JVM para executar aplicações Java.
    - Compilador para transformar código-fonte em bytecode.
    - Ferramentas de depuração (debug).
    - Outras ferramentas de desenvolvimento.

    Para desenvolver aplicações Java, utilizaremos o JDK.

    ### 7. JRE — Java Runtime Environment

    > ⏱️ TIMESTAMP: 08:31–09:39
    >

    JRE significa Java Runtime Environment (Ambiente de Execução Java).

    Na explicação da aula, o JRE é apresentado como um ambiente voltado à execução de aplicações Java, enquanto o JDK é utilizado para desenvolver e também executar aplicações.

    A aula menciona o uso do JRE em computadores que precisavam apenas executar aplicações Java, sem realizar o desenvolvimento.

    ---

    ## 🧠 O que memorizar

    | Conceito | Significado |
    | --- | --- |
    | JVM | Java Virtual Machine — Máquina Virtual Java |
    | JDK | Java Development Kit — Kit de Desenvolvimento Java |
    | JRE | Java Runtime Environment — Ambiente de Execução Java |
    | Bytecode | Código intermediário gerado na compilação |
    | `.java` | Arquivo de código-fonte Java |
    | `.class` | Arquivo que contém bytecode |
    | `javac` | Compilador Java |

    **Frase fundamental:** Write Once, Run Anywhere — escreva uma vez, execute em qualquer lugar.

    ---

    ## 💻 Exemplo — Caminho de execução

    O fluxo explicado na aula pode ser representado assim:

    ```
    Desenvolvedor
         |
         v
    Arquivo Main.java
       Código-fonte
         |
         v
       javac
      Compilador
         |
         v
    Arquivo Main.class
        Bytecode
         |
         v
        JVM
         |
         v
    Sistema operacional
    ```

    O arquivo `.class` pode ser executado por uma JVM compatível em diferentes sistemas operacionais.

    ### Exemplo de compilação

    Para compilar o arquivo `Main.java`:

    ```bash
    javac Main.java
    ```

    O compilador gera o arquivo `Main.class`, que contém o bytecode utilizado pela JVM.

    ---

    ## 🔎 Explicação

    O funcionamento pode ser entendido em quatro etapas:

    1. **Código-fonte:** o programador escreve as instruções em Java e salva em um arquivo `.java`.
    2. **Compilação:** o compilador `javac` transforma o código-fonte em bytecode.
    3. **Bytecode:** o resultado é armazenado em um arquivo `.class`.
    4. **Execução:** a JVM executa o bytecode no ambiente do sistema operacional.

    A JVM é a peça que permite que o mesmo bytecode seja utilizado em diferentes sistemas operacionais que tenham uma JVM compatível.

    ---

    ## ⚠️ Pontos de atenção

    - Não confunda o arquivo `.java` com o arquivo `.class`.
    - O arquivo `.java` contém o código-fonte; o `.class` contém bytecode.
    - O comando `javac` realiza a compilação.
    - A JVM é responsável pela execução do bytecode.
    - O JDK reúne ferramentas necessárias ao desenvolvimento Java.
    - A aula apresenta o JRE como ambiente destinado à execução de aplicações.
    - A expressão “compilada e interpretada” é utilizada na aula para descrever as etapas de compilação e execução pela JVM.
    - O slogan “Write Once, Run Anywhere” depende da existência de uma JVM compatível com o sistema operacional.

    ---

    ## 📝 Resumo

    Java utiliza a JVM para permitir que aplicações sejam executadas em diferentes sistemas operacionais.

    O desenvolvedor escreve o código-fonte em um arquivo `.java`. O compilador `javac` transforma esse código em bytecode, armazenado em um arquivo `.class`. A JVM executa esse bytecode no sistema operacional correspondente.

    O JDK fornece as ferramentas necessárias para desenvolver aplicações Java, incluindo compilador e JVM. Já o JRE é apresentado na aula como ambiente voltado à execução.

    ---

    ## 🏋️ Prática

    **Resolva sem consultar as anotações. Utilize suas próprias palavras.**

    ### Exercício 1 — Conceitos fundamentais

    1. O que significa JVM?
    2. Qual é a função da JVM?
    3. O que é bytecode?
    4. Qual é a diferença entre os arquivos `.java` e `.class`?

    ### Exercício 2 — Compilação

    1. Qual é a função do comando `javac`?
    2. Qual arquivo é gerado após a compilação de `Main.java`?
    3. Qual é o conteúdo desse arquivo gerado?

    ### Exercício 3 — JDK e JRE

    1. O que significa JDK?
    2. Para que serve o JDK?
    3. O que significa JRE?
    4. Qual é a diferença entre JDK e JRE segundo a aula?

    ### Exercício 4 — Técnica de Feynman

    Imagine que você desenvolveu um programa Java no Windows e deseja executá-lo no Linux.

    Explique, como se estivesse ensinando a um iniciante, por que o mesmo código pode ser executado nos dois sistemas e qual é o papel da JVM nesse processo.

    ---

    ## 🔄 Revisão

    1. **O que significa Write Once, Run Anywhere?** Escrever uma vez e executar em diferentes sistemas operacionais com uma JVM compatível.
    2. **O que é JVM?** A Máquina Virtual Java, responsável por executar o bytecode.
    3. **O que é bytecode?** A representação intermediária gerada durante a compilação.
    4. **Qual é a função do javac?** Compilar o código-fonte Java e gerar bytecode.
    5. **Qual é a diferença entre .java e .class?** O primeiro contém código-fonte; o segundo contém bytecode.
    6. **Para que serve o JDK?** Fornecer ferramentas para desenvolver aplicações Java.
    7. **Para que serve o JRE?** Fornecer o ambiente de execução apresentado na aula.

    ---

    ## ✅ Checklist

    - [x]  Entendi o que é JVM.
    - [x]  Entendi o que é bytecode.
    - [x]  Sei diferenciar os arquivos `.java` e `.class`.
    - [x]  Entendi a função do compilador `javac`.
    - [x]  Entendi o que é JDK.
    - [x]  Entendi o que é JRE.
    - [x]  Consigo explicar o caminho do código-fonte até a execução.
    - [x]  Consigo explicar o slogan Write Once, Run Anywhere com minhas próprias palavras.
         */
    }
}
