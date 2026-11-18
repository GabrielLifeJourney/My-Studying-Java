public class IdentificadordeTipodeVariável {
    public static void main(String[] args) {
        /*
    - **Usando o identificador de tipo de variável**

    ## 🎯 Objetivo

    Compreender como utilizar a palavra-chave `var` para declarar variáveis locais com inferência de tipo em Java, identificar como o compilador determina o tipo e reconhecer as situações em que esse recurso pode ou não ser utilizado.

    ---

    ## 📚 Conceitos

    ### 1. A palavra-chave `var`

    A palavra-chave `var` foi introduzida no Java SE 10 e permite que o compilador infira o tipo de uma variável local a partir do valor utilizado em sua inicialização.

    Isso significa que não precisamos escrever explicitamente o tipo quando declaramos a variável. O compilador identifica o tipo durante a compilação.

    **Importante:** depois que o tipo é inferido, ele não pode ser alterado. `var` não transforma Java em uma linguagem de tipagem dinâmica.

    ### 2. Declaração com tipo explícito

    Podemos declarar variáveis informando seus tipos diretamente:

    ```java
    String message = "Hello world!";
    Path path = Path.of("debug.log");
    InputStream stream = Files.newInputStream(path);
    ```

    Nesse exemplo, os tipos são escritos pelo programador: `String`, `Path` e `InputStream`.

    ### 3. A mesma declaração utilizando `var`

    As mesmas variáveis podem ser declaradas com `var`:

    ```java
    var message = "Hello world!";
    var path = Path.of("debug.log");
    var stream = Files.newInputStream(path);
    ```

    O compilador infere os tipos a partir das expressões utilizadas na inicialização:

    - `message`: `String`.
    - `path`: `Path`.
    - `stream`: `InputStream`.

    ### 4. Exemplos com `var`

    A inferência também pode ser utilizada em estruturas como `for` e `try-with-resources`.

    **Em um laço `for`:**

    ```java
    var list = List.of("one", "two", "three", "four");

    for (var element : list) {
        IO.println(element);
    }
    ```

    O compilador infere que `list` é uma `List<String>` e que `element` é uma variável do tipo `String`.

    **Em um `try-with-resources`:**

    ```java
    var path = Path.of("debug.log");

    try (var stream = Files.newInputStream(path)) {
        // process the file
    }
    ```

    Nesse exemplo, `path` é inferido como `Path` e `stream` como `InputStream`.

    ### 5. Restrições ao uso de `var`

    A palavra-chave `var` pode ser utilizada somente em variáveis locais declaradas em:

    - Métodos.
    - Construtores.
    - Blocos inicializadores.

    Ela não pode ser utilizada para declarar:

    - Campos de uma classe.
    - Parâmetros de métodos.
    - Parâmetros de construtores.

    O compilador também precisa conseguir determinar o tipo no momento da declaração. Por isso, a variável precisa receber uma expressão de inicialização.

    ---

    ## 🧠 O que memorizar

    - `var` foi introduzido no Java SE 10.
    - Permite inferência de tipo para variáveis locais.
    - O compilador determina o tipo a partir da expressão de inicialização.
    - Depois de inferido, o tipo da variável não muda.
    - Pode ser usado em variáveis locais de métodos, construtores e blocos inicializadores.
    - Não pode ser usado em campos, parâmetros de métodos ou parâmetros de construtores.
    - A declaração precisa ter uma inicialização para que o compilador consiga inferir o tipo.
    - `var` não significa que a variável pode receber valores de tipos diferentes.

    ---

    ## 💻 Exemplos de código

    ### Exemplo 1 — Inferência de tipos básicos de referência

    ```java
    var nome = "Kelvyn";
    var caminho = Path.of("debug.log");
    ```

    Tipos inferidos:

    | Variável | Tipo inferido |
    | --- | --- |
    | `nome` | `String` |
    | `caminho` | `Path` |

    ### Exemplo 2 — Uso em uma lista e no `for-each`

    ```java
    var list = List.of("one", "two", "three", "four");

    for (var element : list) {
        IO.println(element);
    }
    ```

    O tipo da lista é inferido como `List<String>`; o tipo de cada elemento percorrido é `String`.

    ### Exemplo 3 — Uso em `try-with-resources`

    ```java
    var path = Path.of("debug.log");

    try (var stream = Files.newInputStream(path)) {
        // process the file
    }
    ```

    O compilador infere `Path` para `path` e `InputStream` para `stream`.

    ### Exemplo 4 — Uso inválido em um campo e em um parâmetro

    ```java
    public class User {
        private var name = "Sue"; // ERRO DE COMPILAÇÃO

        public void setName(var name) { // ERRO DE COMPILAÇÃO
            this.name = name;
        }
    }
    ```

    O exemplo é inválido porque `var` não pode declarar campos nem parâmetros de métodos.

    ### Exemplo 5 — Uso inválido sem inicialização

    ```java
    public String greetings(int message) {
        var greetings; // ERRO DE COMPILAÇÃO

        if (message == 0) {
            greetings = "morning";
        } else {
            greetings = "afternoon";
        }

        return "Good " + greetings;
    }
    ```

    O compilador não consegue inferir o tipo de `greetings` no momento da declaração porque nenhum valor foi atribuído nessa linha.

    ---

    ## 🔎 Explicação do código

    ### 1. Como o compilador infere o tipo

    Observe:

    ```java
    var message = "Hello world!";
    ```

    O valor inicial é uma String. Por isso, o compilador determina que `message` possui o tipo `String`.

    A inferência acontece durante a compilação. O tipo não fica indefinido e não é escolhido novamente a cada atribuição.

    ### 2. Inferência em coleções e laços

    No exemplo:

    ```java
    var list = List.of("one", "two", "three", "four");

    for (var element : list) {
        IO.println(element);
    }
    ```

    A lista contém elementos do tipo `String`. O compilador consegue inferir tanto o tipo da lista quanto o tipo do elemento utilizado no laço.

    ### 3. Inferência em recursos

    No exemplo com `try-with-resources`, a expressão `Path.of(...)` permite inferir o tipo `Path`. A chamada `Files.newInputStream(path)` permite inferir o tipo `InputStream`.

    ### 4. Por que a inicialização é necessária?

    A declaração abaixo não fornece informação suficiente:

    ```java
    var greetings;
    ```

    Sem uma expressão inicial, o compilador não tem como determinar o tipo da variável. A atribuição feita posteriormente dentro de um bloco condicional não resolve a ausência de tipo no momento da declaração.

    ---

    ## ⚠️ Pontos de atenção

    - **Não confunda inferência com tipagem dinâmica:** Java continua sendo uma linguagem de tipagem estática.
    - **O tipo não muda:** depois que o compilador infere o tipo, a variável permanece com esse tipo.
    - **Não use `var` em campos:** a palavra-chave é restrita a variáveis locais.
    - **Não use `var` em parâmetros:** parâmetros de métodos e construtores precisam ter seus tipos declarados explicitamente.
    - **Não declare `var` sem inicialização:** o compilador precisa de uma expressão para inferir o tipo.
    - **A inferência acontece na compilação:** não é uma decisão tomada durante a execução do programa.

    ---

    ## 📝 Resumo

    A palavra-chave `var`, introduzida no Java SE 10, permite declarar variáveis locais sem escrever explicitamente o tipo. O compilador infere esse tipo a partir da expressão utilizada na inicialização.

    O recurso pode ser utilizado em variáveis locais declaradas em métodos, construtores e blocos inicializadores, inclusive nos exemplos apresentados com `for` e `try-with-resources`.

    Entretanto, `var` não pode ser utilizado em campos ou parâmetros e exige uma expressão de inicialização. Depois que o tipo é inferido, ele não pode ser alterado.

    ---

    ## 🏋️ Exercícios

    **Resolva sem consultar os exemplos. Primeiro explique seu raciocínio; depois, se possível, teste no Java.**

    ### Exercício 1 — Identifique os tipos inferidos

    Observe:

    ```java
    var nome = "Kelvyn";
    var numero = 25;
    var caminho = Path.of("debug.log");
    ```

    1. Qual é o tipo inferido de `nome`?
    2. Qual é o tipo inferido de `numero`?
    3. Qual é o tipo inferido de `caminho`?

    ### Exercício 2 — Entenda a restrição

    Por que a declaração abaixo não compila?

    ```java
    var saudacao;
    saudacao = "Bom dia";
    ```

    Explique em qual momento o compilador precisa conseguir determinar o tipo.

    ### Exercício 3 — Identifique onde `var` pode ser usado

    Classifique cada situação como válida ou inválida, de acordo com as regras apresentadas:

    1. Variável local declarada dentro de um método.
    2. Campo declarado diretamente em uma classe.
    3. Parâmetro de um método.
    4. Variável local declarada em um construtor.
    5. Variável local declarada em um bloco inicializador.

    ### Exercício 4 — Analise o código

    ```java
    var nomes = List.of("Ana", "Carlos", "João");

    for (var nome : nomes) {
        IO.println(nome);
    }
    ```

    1. Qual é o tipo inferido de `nomes`?
    2. Qual é o tipo inferido de `nome`?
    3. Por que o compilador consegue inferir esses tipos?

    ### Exercício 5 — Lei de Feynman

    Explique com suas próprias palavras, como se estivesse ensinando alguém que está começando em Java:

    **O que é `var`, como o compilador descobre o tipo da variável e por que esse tipo não pode ser alterado depois?**

    ---

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. Em qual versão do Java a palavra-chave `var` foi introduzida?
    2. O que significa inferência de tipo?
    3. Quem determina o tipo quando utilizamos `var`?
    4. Em quais declarações `var` pode ser utilizado?
    5. Podemos utilizar `var` para declarar um campo de classe?
    6. Podemos utilizar `var` em parâmetros de métodos?
    7. Por que uma variável declarada com `var` precisa ser inicializada?
    8. O tipo inferido pode mudar depois de uma nova atribuição?
    9. Qual é a diferença entre utilizar um tipo explícito e utilizar `var`?
    10. Por que `var` não significa que Java passou a ter tipagem dinâmica?

    ---

    ## ✅ Checklist

    - [ ]  Entendi o que é inferência de tipo.
    - [ ]  Sei que `var` foi introduzido no Java SE 10.
    - [ ]  Entendi como o compilador infere o tipo pela inicialização.
    - [ ]  Sei que o tipo inferido não pode ser alterado.
    - [ ]  Sei utilizar `var` em variáveis locais.
    - [ ]  Reconheço seu uso em exemplos com `for`.
    - [ ]  Reconheço seu uso em `try-with-resources`.
    - [ ]  Sei por que `var` não pode ser usado em campos.
    - [ ]  Sei por que `var` não pode ser usado em parâmetros.
    - [ ]  Entendi por que a inicialização é obrigatória.
    - [ ]  Consigo explicar o funcionamento de `var` sem consultar as anotações.

    ---

    **Referência:** Dev.java — Using the var identifier.
         */
    }
}
