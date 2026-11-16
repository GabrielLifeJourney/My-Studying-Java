public class Aula008 {
    static void main(String[] args) {
        /*
    - ☕ Aula 008 — Organizando o código em pacotes

    # ☕ Aula 008 — Organizando o código em pacotes

    Assistir à aula no YouTube

    **Canal:** DevDojo
    **Duração:** 8min05s
    **Idioma:** Português (transcrição gerada automaticamente)

    ---

    ## 🎯 Objetivo

    Compreender como os pacotes (*packages*) organizam as classes de um projeto Java, aprender a criar uma estrutura de pacotes no IntelliJ IDEA e identificar como essa organização aparece nos arquivos-fonte e nos arquivos compilados.

    ---

    ## 📚 Conceitos

    ### 1. Por que organizar o código em pacotes?

    > ⏱️ TIMESTAMP: 00:53–01:40
    >

    O instrutor explica que projetos Java podem possuir muitas classes. Mesmo um projeto considerado pequeno pode chegar a aproximadamente 200 classes quando está bem estruturado e coeso.

    Os pacotes existem para organizar o código e agrupar classes que possuem assuntos ou responsabilidades em comum.

    - Um pacote ajuda a dividir e organizar as classes.
    - A estrutura de pacotes acompanha a organização dos diretórios.
    - Conforme o projeto cresce, essa divisão facilita a localização e a manutenção das classes.

    ### 2. Convenção de nomenclatura dos pacotes

    > ⏱️ TIMESTAMP: 01:40–03:44
    >

    A convenção apresentada pelo instrutor é começar pelo domínio do site da organização, escrito de forma invertida, seguido pelo nome do projeto e pelas divisões internas desejadas.

    Na demonstração, a estrutura utilizada é:

    - Domínio invertido: `academy.devdojo`
    - Nome do projeto: `maratonajava`
    - Divisão do conteúdo: `introducao`

    O nome completo do pacote criado na aula é:

    `academy.devdojo.maratonajava.introducao`

    O instrutor também recomenda evitar traços na nomenclatura dos pacotes. Para alterar o nome de um pacote já criado, demonstra a opção **Refactor > Rename**, utilizando o atalho **Shift+F6**.

    ### 3. Criação de um pacote no IntelliJ IDEA

    > ⏱️ TIMESTAMP: 01:40–03:44
    >

    Para criar o pacote, o instrutor utiliza o menu de contexto do diretório `src`:

    1. Clica com o botão direito em `src`.
    2. Abre as opções de criação pelo atalho **Alt+Insert**.
    3. Seleciona a opção de pacote.
    4. Informa o nome completo do pacote.
    5. Confirma a criação.

    O IntelliJ cria a estrutura de diretórios correspondente aos segmentos do pacote.

    ### 4. Estrutura de diretórios criada

    > ⏱️ TIMESTAMP: 03:44–04:33
    >

    Ao abrir a pasta do projeto pelo recurso **Show in Explorer**, o instrutor mostra que o pacote corresponde a uma sequência de diretórios dentro de `src`.

    A estrutura criada é:

    `src/academy/devdojo/maratonajava/introducao`

    O instrutor explica que as classes relacionadas à introdução do curso serão organizadas nesse pacote. Outros assuntos poderão ser separados em pacotes próprios conforme o curso avançar.

    ### 5. Movimentação de uma classe para o pacote

    > ⏱️ TIMESTAMP: 04:00–04:33
    >

    A classe `OlaDevDojo`, que estava diretamente em `src`, é movida para dentro do pacote `academy.devdojo.maratonajava.introducao`.

    O instrutor demonstra que é possível arrastar a classe para o pacote. O IntelliJ apresenta a opção de refatoração para realizar a movimentação.

    A movimentação atualiza a localização da classe e também a declaração do pacote no arquivo.

    ### 6. Declaração package

    > ⏱️ TIMESTAMP: 04:33–05:17
    >

    Depois que a classe passa a fazer parte de um pacote, o IntelliJ adiciona a declaração correspondente no início do arquivo:

    `package academy.devdojo.maratonajava.introducao;`

    Essa linha indica a qual pacote a classe pertence.

    Pontos apresentados pelo instrutor:

    - Todas as classes que pertencem a um pacote precisam declarar esse pacote.
    - A declaração `package` deve ser a primeira linha de código do arquivo, desconsiderando comentários.
    - Ao criar uma nova classe diretamente dentro do pacote pelo IntelliJ, a IDE adiciona automaticamente a declaração.
    - O desenvolvedor não precisa inserir manualmente essa linha quando utiliza esse fluxo da IDE.

    ### 7. Nome completo da classe

    > ⏱️ TIMESTAMP: 05:17–06:02
    >

    O instrutor explica que, quando existem muitas classes e pacotes, a localização da classe também faz parte de sua identificação.

    O nome completo pode ser representado pelo nome do pacote seguido de um ponto e do nome da classe:

    `academy.devdojo.maratonajava.introducao.OlaDevDojo`

    Essa forma permite distinguir classes que estejam em pacotes diferentes, mesmo que possuam o mesmo nome simples.

    ### 8. Compilação e estrutura da pasta out

    > ⏱️ TIMESTAMP: 06:02–07:29
    >

    Depois de organizar a classe no pacote, o instrutor demonstra uma nova compilação utilizando **Ctrl+F9**.

    Na configuração apresentada:

    - A compilação gera os arquivos `.class`.
    - A pasta `out` recebe os arquivos compilados.
    - A estrutura de diretórios dentro de `out` acompanha a estrutura dos pacotes do código-fonte.
    - Caso a visualização não seja atualizada, o instrutor demonstra a opção **Reload from Disk**.

    O instrutor ressalta que `out` é uma pasta temporária de saída da compilação e recomenda deixá-la como está, sem marcá-la como outra categoria na IDE.

    ### 9. Execução da classe

    > ⏱️ TIMESTAMP: 07:29–08:05
    >

    Para executar novamente o método principal da classe, o instrutor utiliza **Ctrl+Shift+F10**.

    A aula encerra reforçando que as classes serão organizadas em pacotes por assunto. O instrutor comenta que, ao final do curso, haverá mais de 30 pacotes.

    ---

    ## 🧠 O que memorizar

    - Pacotes servem para organizar classes relacionadas dentro de um projeto Java.
    - Um projeto pode ter muitas classes, por isso a organização se torna importante conforme ele cresce.
    - A convenção apresentada começa pelo domínio do site invertido, seguido pelo nome do projeto e pelas divisões internas.
    - O pacote criado na aula é `academy.devdojo.maratonajava.introducao`.
    - Os pacotes correspondem a uma estrutura de diretórios dentro de `src`.
    - A declaração `package` indica a localização lógica da classe.
    - A declaração `package` deve aparecer antes do código da classe, desconsiderando comentários.
    - O IntelliJ adiciona a declaração automaticamente ao criar uma classe dentro de um pacote.
    - O nome completo de uma classe pode ser formado pelo nome do pacote, um ponto e o nome da classe.
    - A estrutura de pacotes também aparece nos diretórios dos arquivos compilados em `out`.
    - `Ctrl+F9` compila o projeto e `Ctrl+Shift+F10` executa a classe atual.

    ---

    ## 💻 Exemplos

    ### Exemplo 1 — Organização dos diretórios

    Estrutura apresentada na aula, simplificada:

    ```
    src/
    └── academy/
        └── devdojo/
            └── maratonajava/
                └── introducao/
                    └── OlaDevDojo.java
    ```

    Cada segmento do nome do pacote corresponde a um nível de diretório.

    ### Exemplo 2 — Declaração do pacote em uma classe

    ```java
    package academy.devdojo.maratonajava.introducao;

    public class OlaDevDojo {

        public static void main(String[] args) {
            System.out.println("Olá DevDojo");
        }

    }
    ```

    A declaração `package` informa que a classe `OlaDevDojo` pertence ao pacote `academy.devdojo.maratonajava.introducao`.

    ### Exemplo 3 — Nome completo da classe

    ```
    academy.devdojo.maratonajava.introducao.OlaDevDojo
    ```

    O nome completo combina o pacote e o nome da classe.

    ### Exemplo 4 — Estrutura após a compilação

    A pasta `out` apresenta uma estrutura correspondente à organização dos pacotes:

    ```
    out/
    └── academy/
        └── devdojo/
            └── maratonajava/
                └── introducao/
                    └── OlaDevDojo.class
    ```

    O arquivo `.class` é o resultado compilado da classe Java.

    ### Exemplo 5 — Atalhos apresentados

    | Ação | Atalho |
    | --- | --- |
    | Abrir opções de criação | `Alt+Insert` |
    | Renomear usando Refactor | `Shift+F6` |
    | Compilar o projeto | `Ctrl+F9` |
    | Executar a classe atual | `Ctrl+Shift+F10` |

    ---

    ## 🔎 Explicação

    ### 1. O que é um pacote em Java?

    É uma forma de organizar classes relacionadas. Em vez de manter todas as classes diretamente em `src`, o projeto pode dividi-las em pacotes conforme seus assuntos.

    ### 2. Por que o domínio é escrito de forma invertida?

    A convenção apresentada utiliza o domínio da organização em ordem inversa como início do nome do pacote. Na aula, o exemplo é `academy.devdojo`.

    ### 3. Qual é a relação entre pacote e diretório?

    O nome do pacote é representado por uma sequência de diretórios. Por exemplo, `academy.devdojo.maratonajava.introducao` corresponde a `academy/devdojo/maratonajava/introducao` dentro de `src`.

    ### 4. Para que serve a declaração package?

    Ela informa a qual pacote a classe pertence. Por isso, quando uma classe é movida para um pacote, sua declaração precisa corresponder à nova localização.

    ### 5. O que acontece quando uma classe é movida para um pacote no IntelliJ?

    A IDE realiza a refatoração da classe e atualiza a declaração `package`. Ao criar uma nova classe dentro do pacote, o IntelliJ também inclui essa declaração automaticamente.

    ### 6. Qual é a diferença entre o caminho do código-fonte e o caminho compilado?

    O código-fonte fica dentro de `src`. Depois da compilação, o arquivo `.class` é gerado em `out`, mantendo a estrutura de diretórios correspondente ao pacote.

    ---

    ## ⚠️ Pontos de atenção

    - **Não deixe todas as classes desorganizadas:** pacotes ajudam a agrupar classes que possuem assuntos em comum.
    - **Respeite a convenção apresentada:** utilize o domínio invertido, seguido do nome do projeto e das divisões internas.
    - **Evite traços nos nomes:** o instrutor desaconselha o uso de traços na nomenclatura dos pacotes.
    - **Não esqueça a declaração package:** uma classe pertencente a um pacote precisa indicar essa localização no arquivo.
    - **Observe a posição da declaração:** `package` deve ser a primeira linha de código, desconsiderando comentários.
    - **Não confunda o nome simples com o nome completo:** o nome completo inclui o pacote antes do nome da classe.
    - **Não confunda src com out:** `src` contém os arquivos-fonte; `out` recebe os arquivos compilados na configuração demonstrada.
    - **Não altere a pasta out sem necessidade:** o instrutor a apresenta como uma pasta temporária de saída da compilação.

    ---

    ## 📝 Resumo

    A aula apresenta os pacotes como uma maneira de organizar as classes de um projeto Java. O instrutor explica que projetos podem possuir muitas classes e que agrupá-las por assuntos facilita a organização.

    A convenção demonstrada utiliza o domínio do site invertido, seguido pelo nome do projeto e pelas divisões internas. Na prática, foi criado o pacote `academy.devdojo.maratonajava.introducao` dentro de `src`.

    Em seguida, a classe `OlaDevDojo` foi movida para esse pacote. O IntelliJ atualizou a classe adicionando a declaração `package`, que deve ser a primeira linha de código do arquivo, desconsiderando comentários.

    Por fim, o instrutor demonstrou que a compilação gera os arquivos `.class` dentro de `out`, preservando a estrutura de diretórios dos pacotes. A aula estabelece a organização por pacotes que será utilizada para separar os próximos assuntos do curso.

    ---

    ## 🏋️ Prática

    **Realize as atividades e marque cada item somente depois de executá-lo.**

    ### Exercício 1 — Entendendo os pacotes

    Sem consultar as anotações, responda:

    1. Para que servem os pacotes em Java?
    2. Por que eles são importantes em projetos com muitas classes?
    3. Qual convenção de nomenclatura foi apresentada pelo instrutor?
    4. Qual foi o nome completo do pacote criado na aula?

    ### Exercício 2 — Criando um pacote

    No IntelliJ IDEA:

    1. Abra o projeto da Maratona Java.
    2. Clique com o botão direito em `src`.
    3. Utilize **Alt+Insert**.
    4. Escolha a opção de criação de pacote.
    5. Crie o pacote `academy.devdojo.maratonajava.introducao`, caso ainda não exista.

    ### Exercício 3 — Criando uma classe dentro do pacote

    Dentro do pacote criado:

    1. Crie uma classe chamada `OlaDevDojo`.
    2. Observe se o IntelliJ adicionou a declaração `package`.
    3. Identifique a posição dessa declaração no arquivo.
    4. Explique por que ela aparece no início do código.

    ### Exercício 4 — Movimentando uma classe

    Se você já possui uma classe Java diretamente em `src`:

    1. Mova-a para dentro de um pacote.
    2. Observe a opção de refatoração apresentada pelo IntelliJ.
    3. Confira se a declaração `package` foi atualizada.
    4. Verifique se a classe continua organizada no local esperado.

    ### Exercício 5 — Compilação

    1. Utilize **Ctrl+F9**.
    2. Localize a pasta `out`.
    3. Observe a estrutura de diretórios criada.
    4. Localize o arquivo `.class`.
    5. Compare a estrutura de `out` com a estrutura do pacote em `src`.

    ### Exercício 6 — Técnica de Feynman

    Explique com suas próprias palavras:

    - O que é um pacote?
    - Por que organizamos classes em pacotes?
    - Como funciona a convenção do domínio invertido?
    - Para que serve a declaração `package`?
    - Qual é a diferença entre a estrutura em `src` e em `out`?

    ---

    ## 🔄 Revisão

    1. **Para que servem os pacotes?** Para organizar e agrupar classes que possuem assuntos em comum.
    2. **Por que os pacotes são importantes em projetos maiores?** Porque ajudam a organizar muitas classes e facilitam sua localização.
    3. **Qual convenção de nomenclatura foi apresentada?** Domínio do site invertido, seguido do nome do projeto e das divisões internas.
    4. **Qual pacote foi criado na aula?** `academy.devdojo.maratonajava.introducao`.
    5. **Em qual diretório o pacote foi criado?** Dentro de `src`.
    6. **Qual atalho abre as opções de criação?** `Alt+Insert`.
    7. **Qual atalho permite renomear utilizando Refactor?** `Shift+F6`.
    8. **O que a declaração package informa?** A qual pacote a classe pertence.
    9. **Onde deve ficar a declaração package?** Na primeira linha de código, desconsiderando comentários.
    10. **O IntelliJ adiciona package automaticamente?** Sim, ao criar uma classe diretamente dentro de um pacote pela IDE.
    11. **Como é formado o nome completo de uma classe?** Pelo nome do pacote, seguido de um ponto e do nome da classe.
    12. **O que acontece com a estrutura dos pacotes após a compilação?** Ela também aparece nos diretórios dos arquivos compilados em `out`.
    13. **Qual atalho compila o projeto?** `Ctrl+F9`.
    14. **Qual atalho executa a classe atual?** `Ctrl+Shift+F10`.

    ---

    ## ✅ Checklist

    - [ ]  Entendi por que os pacotes são utilizados em Java.
    - [ ]  Compreendi a importância de agrupar classes relacionadas.
    - [ ]  Entendi a convenção de nomenclatura baseada no domínio invertido.
    - [ ]  Identifiquei a estrutura do pacote `academy.devdojo.maratonajava.introducao`.
    - [ ]  Conheci a criação de pacotes pelo IntelliJ.
    - [ ]  Conheci os atalhos `Alt+Insert` e `Shift+F6`.
    - [ ]  Compreendi como mover uma classe para dentro de um pacote.
    - [ ]  Identifiquei a finalidade da declaração `package`.
    - [ ]  Compreendi por que a declaração `package` aparece no início do arquivo.
    - [ ]  Entendi como o IntelliJ adiciona a declaração ao criar uma classe dentro de um pacote.
    - [ ]  Compreendi como é formado o nome completo de uma classe.
    - [ ]  Identifiquei a correspondência entre a estrutura de pacotes em `src` e em `out`.
    - [ ]  Executei uma compilação utilizando `Ctrl+F9`.
    - [ ]  Consigo explicar o conteúdo desta aula com minhas próprias palavras.
         */
    }
}
