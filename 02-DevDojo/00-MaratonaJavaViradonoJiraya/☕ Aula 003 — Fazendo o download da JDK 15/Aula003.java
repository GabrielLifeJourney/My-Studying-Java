public class Aula003 {
    static void main(String[] args) {
        /*
        - ☕ Aula 003 — Fazendo o download da JDK 15

    # ☕ Aula 003 — Fazendo o download da JDK 15

    Assistir à aula no YouTube

    **Canal:** DevDojo
    **Duração:** 9min44s
    **Idioma:** Português (transcrição gerada automaticamente)

    ---

    ## 🎯 Objetivo

    Compreender a diferença entre linguagens de alto e baixo nível, revisar o caminho do código-fonte Java até o bytecode e entender a escolha de uma versão do JDK. Ao final, acompanhar o download e a instalação do JDK 15 no Windows de 64 bits.

    ---

    ## 📚 Conceitos

    ### 1. Linguagens de alto e baixo nível

    > ⏱️ TIMESTAMP: 00:00–01:34
    >
    - **Linguagens de alto nível:** possuem uma sintaxe mais próxima da forma como os seres humanos organizam e compreendem instruções. O instrutor utiliza Java como exemplo.
    - **Linguagens de baixo nível:** são mais próximas do funcionamento da máquina e do sistema operacional. O instrutor menciona Assembly como exemplo.
    - Quanto mais próxima da máquina é uma linguagem, maior pode ser o desempenho, mas a programação tende a ser mais complexa e menos fácil de compreender visualmente.

    O arquivo de código-fonte Java utiliza a extensão `.java`. Ele contém instruções escritas pelo desenvolvedor e passa por compilação para gerar o arquivo `.class`.

    ### 2. Código-fonte, compilação e bytecode

    > ⏱️ TIMESTAMP: 01:34–02:40
    >

    O instrutor retoma o fluxo de funcionamento do Java:

    1. O desenvolvedor escreve o código-fonte em um arquivo `.java`.
    2. O compilador Java transforma o código-fonte.
    3. O resultado é um arquivo `.class`, que contém bytecode.
    4. A JVM utiliza esse bytecode para executar a aplicação.

    O bytecode é a representação intermediária utilizada pela JVM. Ele permite que o mesmo código compilado seja executado em sistemas operacionais diferentes, desde que exista uma JVM compatível.

    ### 3. Evolução das versões do Java

    > ⏱️ TIMESTAMP: 02:40–04:38
    >

    O instrutor apresenta mudanças na evolução das versões do Java:

    - **Java 8:** é destacada pela introdução de recursos de programação funcional.
    - **Java 9:** marca uma mudança no ritmo de lançamento das versões.
    - A partir dessa mudança, o ciclo de lançamento passa a ser apresentado como semestral, com novas versões aproximadamente a cada seis meses.
    - O instrutor relaciona esse ciclo mais curto à possibilidade de disponibilizar funcionalidades, receber feedback e realizar melhorias com maior frequência.
    - A comunidade e o processo de especificação do Java, mencionados por meio da JCP (Java Community Process), participam das decisões sobre a evolução da linguagem.

    ### 4. Versões LTS e versões de ciclo curto

    > ⏱️ TIMESTAMP: 04:38–05:38
    >

    O instrutor diferencia as versões com suporte de longo prazo das versões intermediárias:

    - **LTS (Long-Term Support):** versão com suporte prolongado.
    - **Versões de ciclo curto:** versões intermediárias, apresentadas na aula como oportunidades para testar novas funcionalidades antes das próximas atualizações.

    No contexto histórico da gravação:

    - Java 11 é apresentada como a versão LTS mais recente naquele momento.
    - Java 17 é citada como a próxima versão LTS esperada.
    - Java 12, 13, 14, 15 e 16 são mencionadas como versões intermediárias.
    - O instrutor comenta que empresas tendem a priorizar versões com suporte de longo prazo.

    **Importante:** essas referências descrevem o cenário apresentado pelo professor na época da gravação, não o estado atual das versões Java.

    ### 5. Escolha do JDK para o curso

    > ⏱️ TIMESTAMP: 05:38–06:55
    >

    O instrutor decide utilizar o JDK 15 durante esta etapa do curso.

    Ele explica que existem diferentes distribuições do JDK e apresenta o site da Oracle como fonte escolhida para realizar o download.

    Na página de downloads, são mostradas opções de versões, incluindo Java 8, Java 11 e Java 15. A versão 15 é selecionada para acompanhar o curso.

    O instrutor também comenta que o download pela Oracle pode exigir a aceitação de termos e a realização de login.

    ### 6. Escolha do instalador conforme o sistema operacional

    > ⏱️ TIMESTAMP: 06:55–08:08
    >

    O JDK precisa ser baixado de acordo com o sistema operacional e a arquitetura do computador.

    O instrutor demonstra como verificar as propriedades do computador e identifica seu ambiente como Windows de 64 bits.

    Por isso, seleciona o instalador **Windows x64**.

    Também são mencionadas opções de download para:

    - Windows.
    - macOS.
    - Linux.

    A linguagem Java e o bytecode são apresentados como elementos comuns ao processo, enquanto a JVM precisa ser compatível com o sistema operacional em que será executada.

    ### 7. Instalação do JDK 15

    > ⏱️ TIMESTAMP: 08:08–09:31
    >

    Depois de concluir o download, o instrutor:

    1. Abre o instalador baixado.
    2. Executa o arquivo.
    3. Avança pelas etapas do instalador utilizando as opções apresentadas.
    4. Conclui a instalação.
    5. Fecha o instalador após a confirmação de sucesso.

    O caminho de instalação mostrado é:

    `C:\Program Files\Java\jdk-15`

    Ao abrir a pasta, o instrutor mostra que existem diversos arquivos e diretórios dentro da instalação.

    A pasta `bin` e os arquivos internos do JDK serão explicados na próxima aula, junto da configuração das variáveis de ambiente.

    ---

    ## 🧠 O que memorizar

    | Conceito | Significado |
    | --- | --- |
    | Alto nível | Linguagem com instruções mais próximas da compreensão humana |
    | Baixo nível | Linguagem mais próxima da máquina e do sistema operacional |
    | Assembly | Exemplo de linguagem de baixo nível citado pelo instrutor |
    | `.java` | Arquivo que contém o código-fonte Java |
    | `.class` | Arquivo gerado na compilação, contendo bytecode |
    | Bytecode | Representação intermediária utilizada pela JVM |
    | JVM | Máquina Virtual Java, que executa o bytecode |
    | JDK | Kit de Desenvolvimento Java |
    | LTS | Long-Term Support — suporte de longo prazo |
    | Windows x64 | Instalador destinado ao Windows de 64 bits |

    **Sequência principal:** código-fonte `.java` → compilação → bytecode no arquivo `.class` → execução pela JVM.

    ---

    ## 💻 Exemplos

    ### Exemplo 1 — Caminho do código Java

    O processo retomado pelo professor pode ser representado assim:

    ```
    Código-fonte
       Main.java
          |
          v
      Compilador
          |
          v
    Bytecode
       Main.class
          |
          v
         JVM
          |
          v
    Execução no sistema operacional
    ```

    ### Exemplo 2 — Escolha do instalador

    A escolha demonstrada na aula segue esta relação:

    ```
    Sistema operacional: Windows
    Arquitetura: 64 bits
              |
              v
    Instalador: Windows x64
              |
              v
             JDK 15
    ```

    ### Exemplo 3 — Diretório de instalação mostrado

    ```
    C:\Program Files\Java\jdk-15
    ```

    A aula mostra esse diretório como local de instalação. A exploração dos arquivos internos e da pasta `bin` fica para a próxima aula.

    ---

    ## 🔎 Explicação

    ### 1. Por que o Java utiliza bytecode?

    O código-fonte é escrito em uma linguagem de alto nível, mais compreensível para o desenvolvedor. Depois da compilação, ele é transformado em bytecode. A JVM é responsável por executar essa representação intermediária no sistema operacional compatível.

    ### 2. Por que existem versões diferentes do JDK?

    O Java recebe atualizações e novas funcionalidades ao longo do tempo. O instrutor explica que o ciclo de versões passou a ser mais curto a partir do Java 9, enquanto algumas versões recebem suporte de longo prazo.

    ### 3. Por que escolher o instalador correto?

    O pacote de instalação precisa corresponder ao sistema operacional e à arquitetura do computador. Na demonstração, como o ambiente utilizado é Windows de 64 bits, o professor escolhe Windows x64.

    ### 4. Por que instalar o JDK?

    O JDK reúne as ferramentas necessárias para desenvolver aplicações Java. Nesta aula, o objetivo é realizar sua instalação. A configuração para utilizar essas ferramentas pelo sistema será apresentada na aula seguinte.

    ---

    ## ⚠️ Pontos de atenção

    - **Não confunda alto nível com baixo nível:** a diferença apresentada está na proximidade da linguagem com a compreensão humana ou com a máquina.
    - **Não confunda `.java` com `.class`:** o primeiro contém o código-fonte; o segundo contém o bytecode gerado na compilação.
    - **Não confunda JVM com JDK:** a JVM executa o bytecode; o JDK reúne ferramentas para desenvolvimento Java.
    - **LTS significa suporte de longo prazo:** a aula diferencia essas versões das versões intermediárias.
    - **Contexto histórico:** Java 11 como LTS mais recente e Java 17 como próxima LTS são informações apresentadas pelo professor no momento da gravação.
    - **Escolha o instalador correto:** observe o sistema operacional e a arquitetura antes de baixar o JDK.
    - **A instalação não encerra a configuração:** a próxima aula aborda as variáveis de ambiente e a pasta `bin`.

    ---

    ## 📝 Resumo

    A aula começa retomando a diferença entre linguagens de alto e baixo nível e o processo pelo qual o código-fonte Java é compilado para gerar bytecode, armazenado em um arquivo `.class` e executado pela JVM.

    Em seguida, o instrutor apresenta a evolução das versões do Java, destacando a mudança no ciclo de lançamentos a partir do Java 9 e a diferença entre versões LTS e versões intermediárias. No contexto da gravação, Java 11 é apresentada como LTS e Java 17 como a próxima versão de suporte prolongado.

    Na parte prática, o professor escolhe o JDK 15 no site da Oracle, seleciona o instalador Windows x64 para seu computador de 64 bits e realiza a instalação. O diretório mostrado é `C:\Program Files\Java\jdk-15`.

    A configuração das variáveis de ambiente e a explicação da pasta `bin` ficam para a próxima aula.

    ---

    ## 🏋️ Prática

    **Resolva sem consultar as anotações. Utilize suas próprias palavras.**

    ### Exercício 1 — Alto e baixo nível

    1. Qual é a principal diferença entre uma linguagem de alto nível e uma linguagem de baixo nível?
    2. Qual linguagem de baixo nível foi citada pelo professor?
    3. Por que linguagens mais próximas da máquina podem ser mais complexas de compreender?

    ### Exercício 2 — Compilação e execução

    1. O que existe dentro de um arquivo `.java`?
    2. O que é gerado após a compilação?
    3. O que é bytecode?
    4. Qual é o papel da JVM nesse processo?

    ### Exercício 3 — Versões do Java

    1. Qual mudança na frequência de lançamento das versões foi apresentada a partir do Java 9?
    2. O que significa LTS?
    3. Qual versão foi apresentada como LTS mais recente no momento da gravação?
    4. Qual versão foi citada como a próxima LTS esperada?

    ### Exercício 4 — Escolha do instalador

    Imagine que você precisa instalar o JDK em um computador Windows de 64 bits.

    1. Qual opção de instalador deve procurar?
    2. Por que é importante verificar a arquitetura do sistema?
    3. Qual versão do JDK foi utilizada pelo instrutor nesta aula?

    ### Exercício 5 — Técnica de Feynman

    Explique para uma pessoa iniciante o caminho que um programa Java percorre desde o arquivo `.java` até sua execução pela JVM. Depois, explique por que o instalador do JDK precisa corresponder ao sistema operacional.

    ---

    ## 🔄 Revisão

    1. **O que diferencia linguagens de alto e baixo nível?** O nível de proximidade com a compreensão humana ou com a máquina.
    2. **O que é Assembly?** A linguagem de baixo nível citada pelo professor.
    3. **O que é gerado após a compilação do código Java?** Um arquivo `.class` contendo bytecode.
    4. **Qual é a função da JVM?** Executar o bytecode.
    5. **O que significa LTS?** Long-Term Support, ou suporte de longo prazo.
    6. **Qual JDK foi instalado na aula?** JDK 15.
    7. **Qual instalador foi escolhido na demonstração?** Windows x64.
    8. **Onde o JDK foi instalado?** Em `C:\Program Files\Java\jdk-15`.
    9. **O que será abordado na próxima aula?** Configuração das variáveis de ambiente e explicação da pasta `bin`.

    ---

    ## ✅ Checklist

    - [x]  Entendi a diferença entre linguagens de alto e baixo nível.
    - [x]  Consigo explicar o caminho do código-fonte até o bytecode.
    - [x]  Sei diferenciar os arquivos `.java` e `.class`.
    - [x]  Entendi o papel da JVM.
    - [x]  Compreendi a diferença apresentada entre versões LTS e versões intermediárias.
    - [x]  Identifiquei por que o instalador deve corresponder ao sistema operacional e à arquitetura.
    - [x]  Entendi qual versão do JDK foi utilizada na aula.
    - [x]  Sei qual é o assunto da próxima aula.
         */
    }
}
