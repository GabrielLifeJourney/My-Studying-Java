public class Aula004 {
    static void main(String[] args) {
        /*
    - ☕ Aula 004 — Configurando variáveis de ambiente

    # ☕ Aula 004 — Configurando variáveis de ambiente

    Assistir à aula no YouTube

    **Canal:** DevDojo
    **Duração:** 8min07s
    **Idioma:** Português (transcrição gerada automaticamente)

    ---

    ## 🎯 Objetivo

    Compreender por que o Java precisa ser configurado nas variáveis de ambiente do Windows, aprender a criar a variável `JAVA_HOME`, adicionar a pasta `bin` ao `PATH` e verificar se os comandos Java podem ser executados a partir de diferentes diretórios.

    ---

    ## 📚 Conceitos

    ### 1. Padronização e configuração do Java

    > ⏱️ TIMESTAMP: 00:00–01:12
    >
    - O instrutor apresenta o Java como uma linguagem padronizada e menciona a JCP (Java Community Process), responsável pelo processo de especificação da linguagem.
    - A padronização permite que desenvolvedores utilizem convenções comuns, independentemente do país ou ambiente de trabalho.
    - Depois da instalação, é necessário configurar o Java para que ele possa ser acessado por diferentes partes do computador e por outras aplicações.
    - Essa configuração é realizada por meio das variáveis de ambiente do sistema operacional.

    ### 2. A pasta `bin` e os comandos do Java

    > ⏱️ TIMESTAMP: 01:12–03:43
    >
    - O instrutor demonstra a pesquisa por variáveis de ambiente nas configurações do Windows.
    - Ao tentar executar comandos Java pelo Prompt de Comando, o sistema pode informar que o comando não é reconhecido quando o caminho da pasta que contém os executáveis não está configurado no `PATH`.
    - Dentro da instalação do JDK existe a pasta `bin`, que contém executáveis utilizados no desenvolvimento e na execução de programas Java.
    - Entre os comandos demonstrados estão `java`, `javac` e `java -version`.
    - Quando o terminal está aberto diretamente na pasta `bin`, esses comandos podem ser encontrados porque o diretório atual já é aquele que contém os executáveis.
    - O objetivo da configuração é permitir que o sistema encontre esses comandos mesmo quando o terminal estiver em outro diretório.

    ### 3. Criando a variável `JAVA_HOME`

    > ⏱️ TIMESTAMP: 03:43–04:56
    >

    O instrutor demonstra a criação de uma nova variável de ambiente:

    - **Nome:** `JAVA_HOME`
    - **Valor:** caminho completo do diretório em que o JDK foi instalado, até a pasta da versão do JDK.
    - O caminho não deve terminar com `\bin`.

    A variável `JAVA_HOME` funciona como uma referência ao local de instalação do JDK.

    Outras aplicações, como Eclipse e IntelliJ, podem procurar essa variável para identificar onde o Java está instalado. Assim, em vez de depender de um caminho específico escrito diretamente em cada aplicação, elas podem consultar o valor de `JAVA_HOME`.

    ### 4. Adicionando o Java ao `PATH`

    > ⏱️ TIMESTAMP: 04:56–06:17
    >

    Depois de criar `JAVA_HOME`, o instrutor demonstra a edição da variável `PATH`.

    O valor a ser adicionado é:

    ```
    %JAVA_HOME%\bin
    ```

    - `%JAVA_HOME%` referencia o valor definido na variável `JAVA_HOME`.
    - `\bin` indica a pasta que contém os executáveis do Java.
    - Dessa forma, o Windows utiliza o caminho armazenado em `JAVA_HOME` e acrescenta a pasta `bin` para localizar os comandos.

    O instrutor destaca que essa configuração evita precisar escrever todo o caminho de instalação do Java diretamente no `PATH`.

    ### 5. Erro comum: adicionar `bin` duas vezes

    > ⏱️ TIMESTAMP: 06:17–07:27
    >

    Um erro comum acontece quando a variável `JAVA_HOME` já termina com `\bin` e o `PATH` também recebe `%JAVA_HOME%\bin`.

    Nesse caso, o caminho final fica com a pasta `bin` repetida, apontando para um diretório que não existe.

    A configuração correta demonstrada pelo instrutor é:

    - `JAVA_HOME`: caminho até o diretório do JDK, sem `\bin`.
    - `PATH`: referência `%JAVA_HOME%\bin`.

    ### 6. Testando a configuração

    > ⏱️ TIMESTAMP: 07:27–08:07
    >
    - O instrutor abre o Prompt de Comando e testa os comandos Java.
    - A demonstração mostra que os comandos podem ser acessados mesmo quando o terminal está em outro diretório, como uma pasta de usuário.
    - Se as variáveis de ambiente forem alteradas enquanto um terminal já estiver aberto, ele não atualizará automaticamente os valores.
    - É necessário fechar o terminal e abrir outro para testar a configuração atualizada.

    ---

    ## 🧠 O que memorizar

    | Elemento | Função |
    | --- | --- |
    | Variáveis de ambiente | Armazenam configurações que podem ser utilizadas pelo sistema e por aplicações |
    | JCP | Java Community Process, mencionado na aula como parte do processo de padronização do Java |
    | `JAVA_HOME` | Guarda o caminho do diretório de instalação do JDK |
    | `PATH` | Permite localizar executáveis a partir de diferentes diretórios |
    | `bin` | Pasta da instalação do JDK que contém comandos executáveis |
    | `%JAVA_HOME%` | Referencia o valor armazenado na variável `JAVA_HOME` |
    | `%JAVA_HOME%\bin` | Caminho adicionado ao `PATH` para localizar os comandos Java |

    **Configuração principal:**

    ```
    JAVA_HOME = caminho até a pasta do JDK, sem \bin

    PATH = %JAVA_HOME%\bin
    ```

    ---

    ## 💻 Exemplos

    ### Exemplo 1 — Estrutura do caminho

    Considerando a estrutura de instalação apresentada na aula anterior, a configuração deve apontar para o diretório principal do JDK:

    ```
    Diretório do JDK
        |
        +-- bin
             |
             +-- java
             +-- javac
    ```

    A variável `JAVA_HOME` aponta para o diretório do JDK. O `PATH` utiliza essa referência e acrescenta `\bin`.

    ### Exemplo 2 — Referência no PATH

    ```
    %JAVA_HOME%\bin
    ```

    O Windows substitui `%JAVA_HOME%` pelo caminho armazenado nessa variável e utiliza o resultado para localizar os executáveis.

    ### Exemplo 3 — Comandos demonstrados

    ```bash
    java
    javac
    java -version
    ```

    Esses comandos são utilizados na demonstração para verificar o acesso aos executáveis do Java.

    ---

    ## 🔎 Explicação

    ### 1. Por que existe a variável JAVA_HOME?

    Imagine que diferentes programas precisam localizar a instalação do Java. Em vez de cada programa depender de um caminho digitado individualmente, a variável `JAVA_HOME` centraliza essa informação.

    Ela funciona como um endereço de referência para o diretório do JDK.

    ### 2. Qual é a função do PATH?

    O `PATH` permite que o sistema encontre programas executáveis sem que seja necessário informar o caminho completo até cada arquivo.

    Ao adicionar `%JAVA_HOME%\bin`, o Windows passa a procurar os comandos Java dentro da pasta `bin` da instalação indicada por `JAVA_HOME`.

    ### 3. Por que JAVA_HOME não deve terminar com bin nesta configuração?

    Porque o valor adicionado ao `PATH` já contém `\bin`. Se `JAVA_HOME` também terminar com essa pasta, a referência resultará em `bin\bin`, formando um caminho incorreto.

    ### 4. Por que é necessário reabrir o terminal?

    O terminal aberto antes da alteração mantém o ambiente recebido quando foi iniciado. Por isso, depois de modificar as variáveis, é necessário abrir uma nova janela do terminal para testar os valores atualizados.

    ---

    ## ⚠️ Pontos de atenção

    - **Não confunda `JAVA_HOME` com `PATH`:** `JAVA_HOME` aponta para o diretório do JDK; `PATH` recebe o caminho da pasta que contém os executáveis.
    - **Não coloque `\bin` no final de `JAVA_HOME` nesta configuração:** o próprio valor adicionado ao `PATH` já acrescenta essa pasta.
    - **Evite duplicar `bin`:** a combinação incorreta pode produzir um diretório inexistente.
    - **Não teste somente dentro da pasta `bin`:** o objetivo é conseguir executar os comandos a partir de outros diretórios.
    - **Reabra o terminal após alterar as variáveis:** uma janela que já estava aberta não recebe automaticamente a configuração atualizada.
    - **A transcrição é gerada automaticamente:** alguns trechos apresentam falhas de reconhecimento de voz; a documentação preserva os conceitos identificáveis sem completar partes inaudíveis com explicações atribuídas ao professor.

    ---

    ## 📝 Resumo

    A aula ensina a configurar as variáveis de ambiente do Java no Windows. O instrutor explica que a pasta `bin` do JDK contém comandos como `java` e `javac`, mas que o sistema precisa conhecer o caminho dessa pasta para localizar os executáveis a partir de diferentes diretórios.

    Para isso, é criada a variável `JAVA_HOME`, apontando para o diretório de instalação do JDK, sem acrescentar `\bin`. Em seguida, o caminho `%JAVA_HOME%\bin` é adicionado ao `PATH`.

    O instrutor também alerta para o erro de adicionar `bin` duas vezes e demonstra que, depois de alterar as variáveis de ambiente, é necessário fechar e abrir novamente o terminal para testar a configuração atualizada.

    ---

    ## 🏋️ Prática

    **Resolva sem consultar as anotações. Utilize suas próprias palavras.**

    ### Exercício 1 — Variáveis de ambiente

    1. Por que o Java precisa ser configurado nas variáveis de ambiente?
    2. O que é a variável `JAVA_HOME`?
    3. Qual é a função do `PATH`?
    4. O que existe dentro da pasta `bin` do JDK?

    ### Exercício 2 — Configuração

    Considere que o JDK está instalado em um diretório próprio.

    1. Até qual pasta o valor de `JAVA_HOME` deve apontar?
    2. O valor de `JAVA_HOME` deve terminar com `\bin` nesta configuração?
    3. Qual referência deve ser adicionada ao `PATH`?
    4. Explique o que significa `%JAVA_HOME%\bin`.

    ### Exercício 3 — Identificação de erro

    Um estudante configurou:

    ```
    JAVA_HOME = caminho do JDK\bin
    PATH = %JAVA_HOME%\bin
    ```

    1. Qual é o problema dessa configuração?
    2. Por que o caminho final fica incorreto?
    3. Como deve ser organizada a configuração para evitar a duplicação?

    ### Exercício 4 — Verificação

    1. Por que testar os comandos somente dentro da pasta `bin` não é suficiente?
    2. O que deve ser feito com o terminal depois de alterar as variáveis de ambiente?
    3. Quais comandos foram demonstrados para verificar o acesso ao Java?

    ### Exercício 5 — Técnica de Feynman

    Explique para uma pessoa iniciante a diferença entre `JAVA_HOME` e `PATH`. Use a ideia de um endereço de referência e explique por que acrescentamos `\bin` ao caminho utilizado pelo sistema.

    ---

    ## 🔄 Revisão

    1. **O que é JAVA_HOME?** É a variável que guarda o caminho do diretório de instalação do JDK.
    2. **O que é PATH?** É a variável utilizada para localizar executáveis a partir de diferentes diretórios.
    3. **Onde ficam os comandos Java apresentados?** Na pasta `bin` da instalação do JDK.
    4. **Qual valor deve ser adicionado ao PATH?** `%JAVA_HOME%\bin`.
    5. **JAVA_HOME deve terminar com \bin nesta configuração?** Não. O caminho deve terminar no diretório principal do JDK.
    6. **Qual erro pode acontecer ao adicionar bin duas vezes?** O caminho resultante pode apontar para um diretório inexistente.
    7. **Por que reabrir o terminal?** Para que a nova janela receba as variáveis de ambiente atualizadas.

    ---

    ## ✅ Checklist

    - [x]  Entendi por que o Java precisa ser configurado nas variáveis de ambiente.
    - [x]  Entendi a função da variável `JAVA_HOME`.
    - [x]  Entendi a função da variável `PATH`.
    - [x]  Identifiquei a função da pasta `bin`.
    - [x]  Sei por que `JAVA_HOME` não deve terminar com `\bin` nesta configuração.
    - [x]  Sei qual referência deve ser adicionada ao `PATH`.
    - [x]  Entendi o erro de duplicar a pasta `bin`.
    - [x]  Sei por que preciso reabrir o terminal depois de alterar as variáveis.
    - [x]  Consigo explicar a configuração com minhas próprias palavras.
         */
    }
}
