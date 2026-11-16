public class Aula005 {
    static void main(String[] args) {
        /*
    - ☕ Aula 005 — Executando compilação manualmente

    # ☕ Aula 005 — Executando compilação manualmente

    Assistir à aula no YouTube

    **Canal:** DevDojo
    **Duração:** 11min21s
    **Idioma:** Português (transcrição gerada automaticamente)

    ---

    ## 🎯 Objetivo

    Entender o processo manual de compilação e execução de um programa Java: criar um arquivo `.java`, compilá-lo com o compilador `javac`, gerar o arquivo `.class` (bytecode) e executar a classe utilizando o comando `java`.

    ---

    ## 📚 Conceitos

    ### 1. Código-fonte, compilação e bytecode

    > ⏱️ TIMESTAMP: 00:00–01:09
    >
    - O arquivo `.java` contém o código-fonte escrito pelo desenvolvedor.
    - O processo de compilação é realizado pelo compilador Java, disponibilizado pela JDK.
    - A compilação gera um arquivo `.class`.
    - O arquivo `.class` contém o bytecode, formato que a JVM consegue executar.
    - O instrutor propõe realizar esse processo manualmente para compreender as etapas antes de utilizar uma IDE.

    ### 2. Convenções para nomes de classes

    > ⏱️ TIMESTAMP: 01:09–02:20
    >

    O instrutor apresenta algumas regras e convenções utilizadas na escrita de classes Java:

    - As palavras reservadas, como `public` e `class`, devem ser escritas com letras minúsculas.
    - O nome de uma classe começa com letra maiúscula.
    - Quando o nome possui palavras compostas, cada palavra também começa com letra maiúscula.
    - O exemplo citado é `OlaDevDojo`.
    - O nome poderia ser escrito de outra forma e ainda funcionar em alguns casos, mas o instrutor reforça a importância de seguir a convenção adotada pela comunidade Java.

    Essa convenção de nomenclatura é conhecida como **PascalCase**.

    ### 3. Estrutura inicial da classe e do método main

    > ⏱️ TIMESTAMP: 02:20–03:36
    >

    O instrutor monta a estrutura inicial do programa:

    - Declaração de uma classe pública.
    - Declaração do método `main`, utilizado como ponto de entrada do programa.
    - Utilização de chaves para delimitar os blocos de código.
    - As chaves externas delimitam o corpo da classe.
    - As chaves internas delimitam o corpo do método.
    - A organização dos espaços e recuos é apresentada como parte da identação, que ajuda a visualizar a estrutura do código.

    A estrutura demonstrada contém os elementos `public`, `static`, `void`, `main`, `String[] args` e as chaves de abertura e fechamento.

    ### 4. Exibindo uma mensagem e finalizando uma instrução

    > ⏱️ TIMESTAMP: 03:36–04:51
    >
    - O instrutor utiliza `System.out.println()` para exibir uma mensagem no terminal.
    - O texto que será exibido é colocado entre aspas duplas.
    - Os parênteses recebem o conteúdo que será passado ao método.
    - O ponto e vírgula `;` indica o encerramento da instrução.
    - O exemplo da aula utiliza uma mensagem associada ao primeiro programa apresentado.

    ### 5. Salvando o arquivo Java

    > ⏱️ TIMESTAMP: 04:51–06:02
    >

    Depois de escrever o código, o instrutor demonstra como salvar o arquivo:

    - Criar uma pasta para armazenar o exemplo.
    - Na janela de salvamento, selecionar a opção para exibir todos os tipos de arquivo, se necessário.
    - Salvar o arquivo com a extensão `.java`.
    - O nome do arquivo deve corresponder exatamente ao nome da classe pública, incluindo letras maiúsculas e minúsculas.

    No exemplo da aula, a classe e o arquivo utilizam o nome `OlaDevDojo`, resultando no arquivo:

    ```
    OlaDevDojo.java
    ```

    O instrutor também demonstra como habilitar a visualização das extensões de arquivos no Windows para confirmar que o arquivo foi salvo com a extensão correta.

    ### 6. Abrindo o terminal e compilando o código

    > ⏱️ TIMESTAMP: 06:02–07:07
    >

    Com o arquivo salvo, o próximo passo é abrir o Prompt de Comando na pasta em que o arquivo foi criado.

    O instrutor demonstra a compilação com o comando:

    ```bash
    javac OlaDevDojo.java
    ```

    - `javac` é o compilador Java.
    - `OlaDevDojo.java` é o arquivo de código-fonte que será compilado.
    - A compilação gera o arquivo `OlaDevDojo.class`, que contém o bytecode.

    O instrutor também utiliza o comando `cls` para limpar a tela do Prompt de Comando antes de continuar a demonstração.

    ### 7. Identificando o arquivo .class

    > ⏱️ TIMESTAMP: 07:07–08:06
    >

    Depois da compilação:

    - O arquivo `.class` aparece na pasta em que está o código-fonte.
    - Esse arquivo contém o bytecode gerado pelo compilador.
    - O instrutor demonstra que, ao abrir o arquivo em um editor de texto, seu conteúdo não é apresentado como código Java legível.
    - O arquivo `.class` não deve ser confundido com o arquivo `.java`: cada um representa uma etapa diferente do processo.

    ### 8. Executando o programa

    > ⏱️ TIMESTAMP: 08:06–09:22
    >

    Para executar o programa compilado, o instrutor utiliza o comando:

    ```bash
    java OlaDevDojo
    ```

    Pontos importantes:

    - O comando utilizado para executar é `java`, e não `javac`.
    - Deve ser informado o nome da classe.
    - Não se deve acrescentar a extensão `.class` ao nome passado para o comando `java`.
    - A JVM localiza e executa o bytecode correspondente.
    - O resultado é a mensagem escrita no `System.out.println()`.

    ### 9. Alterações no código e recompilação

    > ⏱️ TIMESTAMP: 08:06–09:22
    >

    O instrutor demonstra um erro comum: alterar o arquivo `.java`, salvar a alteração e executar novamente o programa sem recompilar.

    Nesse caso, o resultado pode continuar igual porque o comando `java` executa o arquivo `.class` que já havia sido gerado.

    Sempre que o código-fonte for alterado, é necessário compilá-lo novamente para atualizar o bytecode:

    ```bash
    javac OlaDevDojo.java
    java OlaDevDojo
    ```

    ### 10. Erros comuns durante a compilação

    > ⏱️ TIMESTAMP: 09:22–10:35
    >

    O instrutor demonstra situações que podem causar erros:

    **Nome da classe diferente do nome do arquivo**

    - Em uma classe pública, o nome do arquivo deve corresponder exatamente ao nome da classe.
    - A diferença entre letras maiúsculas e minúsculas também importa.
    - O compilador informa que a classe pública deve estar em um arquivo com o nome correspondente.

    **Ausência de ponto e vírgula**

    - O instrutor remove o ponto e vírgula de uma instrução e tenta compilar novamente.
    - O compilador apresenta uma mensagem de erro indicando o problema.
    - A mensagem ajuda a identificar a região em que a compilação encontrou uma instrução inválida.

    **Leitura das mensagens de erro**

    O instrutor reforça que um bom desenvolvedor deve ler e procurar entender as mensagens apresentadas pelo compilador, em vez de ignorá-las.

    ### 11. Encerramento e próximos conteúdos

    > ⏱️ TIMESTAMP: 10:35–11:21
    >
    - O instrutor lembra que o programa apresentado possui poucos elementos, mas que cada um deles será explicado com mais profundidade nas aulas seguintes.
    - Ele cita elementos como `public`, `class`, `static`, `void`, `main` e `String`.
    - A proposta é não se preocupar em compreender todos os detalhes de uma só vez e avançar conforme os conceitos forem apresentados.

    ---

    ## 🧠 O que memorizar

    | Elemento | Função |
    | --- | --- |
    | `.java` | Arquivo que contém o código-fonte |
    | JDK | Kit de desenvolvimento que inclui o compilador Java |
    | `javac` | Compila o arquivo de código-fonte Java |
    | `.class` | Arquivo gerado pela compilação, contendo bytecode |
    | Bytecode | Código intermediário executado pela JVM |
    | `java` | Comando utilizado para iniciar a execução da classe |
    | JVM | Máquina virtual que executa o bytecode Java |
    | `System.out.println()` | Exibe uma mensagem na saída do programa |
    | `;` | Finaliza uma instrução Java |
    | PascalCase | Convenção de nomenclatura usada no exemplo para nomes de classes |

    **Fluxo principal da aula:**

    ```
    Arquivo .java
         |
         v
    javac NomeDaClasse.java
         |
         v
    Arquivo .class (bytecode)
         |
         v
    java NomeDaClasse
         |
         v
    Programa em execução
    ```

    ---

    ## 💻 Exemplos

    ### Exemplo 1 — Estrutura do primeiro programa

    A transcrição apresenta a estrutura de uma classe pública, um método `main` e uma chamada a `System.out.println()`. O exemplo abaixo organiza esses elementos conforme os nomes identificáveis na demonstração:

    ```java
    public class OlaDevDojo {

        public static void main(String[] args) {
            System.out.println("Olá DevDojo");
        }

    }
    ```

    *Observação: a transcrição foi gerada automaticamente e contém trechos de código reconhecidos com falhas. O exemplo organiza os elementos identificáveis na fala; não é uma transcrição literal do código exibido na tela.*

    ### Exemplo 2 — Compilando o arquivo

    No terminal aberto na pasta do arquivo:

    ```bash
    javac OlaDevDojo.java
    ```

    Resultado esperado no diretório: geração do arquivo `OlaDevDojo.class`, caso a compilação seja concluída sem erros.

    ### Exemplo 3 — Executando a classe

    ```bash
    java OlaDevDojo
    ```

    O nome da classe é informado sem a extensão `.class`.

    ### Exemplo 4 — Recompilando depois de uma alteração

    Quando o código-fonte for modificado e salvo, execute novamente a compilação e depois o programa:

    ```bash
    javac OlaDevDojo.java
    java OlaDevDojo
    ```

    ---

    ## 🔎 Explicação

    ### 1. Qual é a diferença entre compilar e executar?

    **Compilar** é transformar o código-fonte `.java` em bytecode, armazenado no arquivo `.class`.

    **Executar** é iniciar a classe compilada por meio do comando `java`, para que a JVM execute o bytecode.

    São duas etapas diferentes. A execução depende de existir uma compilação válida do código que se deseja executar.

    ### 2. Por que o comando javac recebe o nome do arquivo?

    Porque o compilador precisa saber qual arquivo de código-fonte deve processar. Por isso, informamos o nome completo, incluindo a extensão `.java`.

    ### 3. Por que o comando java não recebe a extensão .class?

    Na forma de execução demonstrada, o comando recebe o nome da classe, sem a extensão do arquivo compilado. Assim, usamos `java OlaDevDojo`, e não `java OlaDevDojo.class`.

    ### 4. Por que é necessário recompilar depois de alterar o código?

    O arquivo `.class` é o resultado de uma compilação anterior. Alterar e salvar o arquivo `.java` não atualiza automaticamente o bytecode. É necessário executar `javac` novamente.

    ### 5. Por que o nome da classe pública e o nome do arquivo precisam ser iguais?

    A linguagem Java exige que o arquivo de código-fonte que contém uma classe pública tenha o mesmo nome da classe, respeitando a escrita exata. Uma diferença de maiúsculas e minúsculas pode provocar erro de compilação.

    ### 6. Qual é a importância de ler as mensagens de erro?

    As mensagens do compilador ajudam a localizar problemas no código, como uma declaração incompatível com o nome do arquivo ou uma instrução sem ponto e vírgula. Aprender a interpretá-las faz parte do processo de desenvolvimento.

    ---

    ## ⚠️ Pontos de atenção

    - **Não confunda os arquivos:** `.java` é o código-fonte; `.class` contém o bytecode gerado pela compilação.
    - **Não confunda os comandos:** `javac` compila; `java` executa.
    - **Não informe a extensão ao executar:** utilize o nome da classe, sem `.class`.
    - **Respeite o nome da classe pública:** ele deve corresponder exatamente ao nome do arquivo `.java`.
    - **Observe maiúsculas e minúsculas:** `OlaDevDojo` e `oladevdojo` não são o mesmo nome.
    - **Não esqueça o ponto e vírgula:** instruções como a chamada demonstrada com `System.out.println()` precisam ser encerradas com `;`.
    - **Recompile depois de alterar o código:** salvar o arquivo `.java` não atualiza automaticamente o `.class`.
    - **Leia as mensagens do compilador:** elas fornecem informações para investigar e corrigir os erros.
    - **A transcrição é automática:** a representação do primeiro código foi organizada a partir dos elementos identificáveis na fala; detalhes inaudíveis não foram atribuídos ao professor.

    ---

    ## 📝 Resumo

    A aula demonstra como compilar e executar manualmente um programa Java, sem depender de uma IDE. Primeiro, o desenvolvedor cria uma classe e salva o código-fonte em um arquivo `.java`, respeitando a convenção de nome da classe e a correspondência exata entre o nome da classe pública e o nome do arquivo.

    Em seguida, abre o terminal na pasta do arquivo e utiliza `javac NomeDaClasse.java` para gerar o arquivo `.class`, que contém o bytecode. Para executar o programa, utiliza `java NomeDaClasse`, sem informar a extensão `.class`.

    O instrutor também demonstra erros comuns, como nome de classe incompatível com o arquivo, ausência de ponto e vírgula e execução de um bytecode antigo depois de alterar o código-fonte. A principal lição prática é compreender que, após modificar o arquivo `.java`, é necessário compilá-lo novamente antes de executar a versão atualizada.

    ---

    ## 🏋️ Prática

    **Resolva sem consultar as anotações. Utilize suas próprias palavras.**

    ### Exercício 1 — Etapas do processo

    1. O que é o arquivo `.java`?
    2. O que o comando `javac` faz?
    3. Qual arquivo é gerado após uma compilação bem-sucedida?
    4. O que é bytecode?
    5. Qual é a função do comando `java`?

    ### Exercício 2 — Identificação dos comandos

    Considere o arquivo `OlaDevDojo.java`.

    1. Qual comando deve ser utilizado para compilá-lo?
    2. Qual arquivo será gerado?
    3. Qual comando deve ser utilizado para executar a classe?
    4. Por que não informamos `.class` no comando de execução?

    ### Exercício 3 — Encontrando erros

    Um estudante criou a classe pública `OlaDevDojo`, mas salvou o arquivo como `oladevdojo.java`.

    1. Qual é o problema?
    2. Por que a diferença entre letras maiúsculas e minúsculas importa?
    3. Como o nome do arquivo deve ser corrigido?

    ### Exercício 4 — Recompilação

    Um estudante alterou a mensagem do programa, salvou o arquivo `.java` e executou novamente o comando `java OlaDevDojo`, mas a mensagem antiga continuou aparecendo.

    1. Por que isso pode acontecer?
    2. Qual etapa ele esqueceu?
    3. Quais comandos deve executar para utilizar a versão atualizada?

    ### Exercício 5 — Leitura de erros

    1. O que pode acontecer quando uma instrução não termina com ponto e vírgula?
    2. O que o compilador fornece quando encontra um erro?
    3. Por que é importante ler a mensagem em vez de apenas tentar executar novamente?

    ### Exercício 6 — Técnica de Feynman

    Explique para uma pessoa iniciante a diferença entre código-fonte, compilação, bytecode e execução. Utilize uma sequência de etapas e os comandos apresentados na aula.

    ---

    ## 🔄 Revisão

    1. **Qual é a extensão do código-fonte Java?** `.java`.
    2. **Qual comando compila o código-fonte?** `javac`.
    3. **Qual extensão é gerada pela compilação?** `.class`.
    4. **O que existe no arquivo .class?** Bytecode.
    5. **Qual comando executa a classe?** `java`.
    6. **Como executar a classe OlaDevDojo?** Com `java OlaDevDojo`, sem extensão.
    7. **O nome do arquivo pode ser diferente do nome da classe pública?** Não; deve corresponder exatamente, inclusive em maiúsculas e minúsculas.
    8. **O que fazer depois de alterar o arquivo .java?** Salvar, compilar novamente com `javac` e executar com `java`.
    9. **O que fazer quando a compilação apresenta erro?** Ler e investigar a mensagem do compilador.

    ---

    ## ✅ Checklist

    - [x]  Entendi a diferença entre código-fonte e bytecode.
    - [x]  Entendi o papel do compilador `javac`.
    - [x]  Identifiquei o arquivo `.class` gerado pela compilação.
    - [x]  Entendi a função do comando `java`.
    - [x]  Sei executar uma classe sem informar a extensão `.class`.
    - [x]  Entendi a convenção de nomenclatura apresentada para classes.
    - [x]  Sei por que o nome da classe pública deve corresponder ao nome do arquivo.
    - [x]  Entendi a função das chaves e da identação no exemplo.
    - [x]  Sei por que uma instrução precisa terminar com ponto e vírgula.
    - [x]  Entendi por que devo recompilar depois de alterar o código.
    - [x]  Sei que devo ler as mensagens de erro do compilador.
    - [x]  Consigo explicar o processo completo com minhas próprias palavras.
         */
    }
}
