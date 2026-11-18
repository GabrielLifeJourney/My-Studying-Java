public class ExpressoesdeclaracoeseBlocos_notion {
    public static void main(String[] args) {
        /*
        - **Expressões, declarações e blocos**

    ## 🎯 Objetivo

    Compreender a diferença entre expressões, declarações e blocos em Java, identificando como esses elementos formam instruções e organizam a execução de um programa.

    ## 📚 Conceitos

    ### 1. Expressões

    Uma expressão é uma construção formada por variáveis, operadores e chamadas de métodos, organizada conforme a sintaxe Java e que resulta em um único valor.

    Exemplos apresentados na lição:

    ```java
    int cadence = 0;
    anArray[0] = 100;
    IO.println("Element 1 at index 0: " + anArray[0]);

    int result = 1 + 2; // result is now 3
    if (value1 == value2)
        IO.println("value1 == value2");
    ```

    O tipo do valor produzido depende dos elementos utilizados. Por exemplo:

    - `cadence = 0` resulta em um valor do tipo `int`, pois a atribuição produz um valor do mesmo tipo do operando à esquerda.
    - Uma expressão pode produzir valores de tipos diferentes, como `int`, `boolean` ou `String`.

    Java permite combinar expressões menores para formar expressões compostas, desde que os tipos envolvidos sejam compatíveis.

    Exemplo:

    ```java
    1 * 2 * 3
    ```

    Nesse caso, a ordem das multiplicações não altera o resultado.

    ### 2. Precedência e parênteses

    Nem toda expressão composta pode ser avaliada em qualquer ordem.

    Considere:

    ```java
    x + y / 100
    ```

    A divisão possui precedência maior que a adição. Portanto, sem parênteses, a divisão é realizada primeiro.

    Para deixar explícita a intenção de somar antes de dividir:

    ```java
    (x + y) / 100
    ```

    Para deixar explícito que a divisão deve acontecer primeiro:

    ```java
    x + (y / 100)
    ```

    **Recomendação da lição:** utilize parênteses para indicar claramente quais operações devem ser realizadas primeiro. Isso facilita a leitura e a manutenção do código.

    ### 3. Aritmética de ponto flutuante

    Operações com números de ponto flutuante podem produzir resultados diferentes dos esperados por causa da forma como esses valores são representados e arredondados.

    Exemplo da lição:

    ```java
    double d1 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1
              + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

    IO.println("d1 == 1 ? " + (d1 == 1.0));
    ```

    Embora seja esperado intuitivamente que a comparação resulte em `true`, a lição informa que o resultado impresso é `false`.

    A implementação detalhada da aritmética de ponto flutuante está fora do escopo desta lição.

    ### 4. Declarações

    Uma declaração (statement) é uma unidade completa de execução, semelhante a uma frase completa em uma linguagem natural.

    Algumas expressões podem ser transformadas em declarações ao serem finalizadas com ponto e vírgula (`;`). A lição apresenta quatro tipos de expressões que podem formar declarações expressivas:

    - Expressões de atribuição.
    - Utilizações de `++` ou `--`.
    - Invocações de métodos.
    - Expressões de criação de objetos.

    Exemplos:

    ```java
    // Declaração de atribuição
    aValue = 8933.234;

    // Declaração de incremento
    aValue++;

    // Declaração de invocação de método
    IO.println("Hello World!");

    // Declaração de criação de objeto
    Bicycle myBike = new Bicycle();
    ```

    Além das declarações expressivas, a lição apresenta outros dois tipos de instruções:

    - **Declarações de variáveis:** declaram uma variável, como `double aValue = 8933.234;`.
    - **Instruções de fluxo de controle:** determinam a ordem em que as instruções são executadas. Esse assunto será desenvolvido na próxima seção do tutorial.

    ### 5. Blocos

    Um bloco é um grupo de zero ou mais instruções delimitado por chaves (`{` e `}`).

    Um bloco pode ser utilizado em qualquer lugar onde uma única instrução seja permitida.

    Exemplo apresentado na lição:

    ```java
    class BlockDemo {
        public static void main(String[] args) {
            boolean condition = true;

            if (condition) { // início do bloco 1
                IO.println("Condition is true.");
            } // fim do bloco 1
            else { // início do bloco 2
                IO.println("Condition is false.");
            } // fim do bloco 2
        }
    }
    ```

    Nesse exemplo, cada alternativa do `if/else` possui seu próprio bloco, delimitado por chaves.

    ## 🧠 O que memorizar

    - Uma expressão é uma construção que resulta em um único valor.
    - Expressões podem ser combinadas para formar expressões compostas.
    - A precedência dos operadores determina a ordem padrão de avaliação.
    - Parênteses tornam explícita a ordem desejada das operações.
    - A aritmética de ponto flutuante pode produzir resultados inesperados em comparações.
    - Uma declaração é uma unidade completa de execução.
    - Declarações expressivas podem envolver atribuição, incremento/decremento, chamada de método e criação de objeto.
    - Declarações de variáveis e instruções de fluxo de controle também são tipos de instruções.
    - Um bloco agrupa zero ou mais instruções entre chaves.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Expressão aritmética

    ```java
    int result = 1 + 2;
    ```

    A expressão `1 + 2` produz o valor `3`, que é atribuído à variável `result`.

    ### Exemplo 2 — Precedência e parênteses

    ```java
    int resultado1 = 2 + 3 * 4;
    int resultado2 = (2 + 3) * 4;

    IO.println(resultado1);
    IO.println(resultado2);
    ```

    Saída:

    ```
    14
    20
    ```

    A multiplicação é realizada primeiro em `resultado1`. Em `resultado2`, os parênteses fazem a soma acontecer primeiro.

    ### Exemplo 3 — Declarações expressivas

    ```java
    int pontos = 10;
    pontos++;
    IO.println(pontos);
    ```

    Saída:

    ```
    11
    ```

    A atribuição, o incremento e a chamada de método são exemplos de instruções apresentados na lição.

    ### Exemplo 4 — Bloco condicional

    ```java
    boolean condition = true;

    if (condition) {
        IO.println("Condition is true.");
    } else {
        IO.println("Condition is false.");
    }
    ```

    Como `condition` é `true`, o primeiro bloco é executado.

    ## 🔎 Explicação do código

    ### 1. Expressão não é a mesma coisa que declaração

    Em `1 + 2`, temos uma expressão: ela calcula e produz um valor.

    Em `int result = 1 + 2;`, temos uma instrução completa que declara uma variável, avalia a expressão e atribui o resultado.

    ### 2. Por que utilizar parênteses?

    Os parênteses deixam clara a ordem pretendida pelo programador. Em expressões maiores, isso reduz interpretações equivocadas e facilita a manutenção.

    ### 3. Por que a comparação com ponto flutuante pode falhar?

    O exemplo da lição mostra que somar dez vezes `0.1` e comparar o resultado diretamente com `1.0` pode produzir `false`. Portanto, não se deve presumir que operações com valores decimais de ponto flutuante sempre produzirão o valor matemático exato esperado.

    ### 4. Como reconhecer um bloco?

    Observe as chaves: tudo o que estiver entre a chave de abertura `{` e a chave de fechamento `}` pertence ao bloco. No exemplo, o `if` e o `else` possuem blocos separados.

    ### 5. Analogia — Lei de Feynman

    Imagine que um programa seja um texto de instruções:

    - **Expressão:** uma conta que produz um resultado.
    - **Declaração:** uma instrução completa, como guardar ou exibir um resultado.
    - **Bloco:** um conjunto de instruções agrupadas para serem tratadas como uma unidade.

    ## ⚠️ Pontos de atenção

    - Uma expressão sempre resulta em um valor; uma declaração representa uma unidade completa de execução.
    - Não confunda a precedência dos operadores com a ordem que você deseja expressar. Use parênteses quando necessário.
    - A expressão `x + y / 100` não deixa a intenção de quem escreve evidente; a precedência do Java ainda determina a avaliação. Os parênteses tornam a intenção explícita.
    - Não presuma que somas com `double` produzirão sempre o valor decimal exato esperado.
    - O ponto e vírgula (`;`) finaliza as declarações expressivas apresentadas na lição.
    - As chaves delimitam os blocos.
    - A lição introduz instruções de fluxo de controle, mas seu estudo detalhado fica para a próxima seção.

    ## 📝 Resumo

    Expressões são construções que produzem valores e podem ser combinadas para formar cálculos mais complexos. A precedência dos operadores define a ordem de avaliação, enquanto os parênteses permitem deixar essa ordem explícita. Operações com ponto flutuante podem apresentar diferenças de arredondamento.

    Declarações são unidades completas de execução. Entre elas estão as declarações expressivas, as declarações de variáveis e as instruções de fluxo de controle. Blocos agrupam zero ou mais instruções entre chaves.

    **Ideia central:** expressões produzem valores, declarações formam instruções completas e blocos organizam grupos de instruções.

    ## 🏋️ Exercícios

    Resolva sem consultar as respostas. Primeiro explique seu raciocínio; depois, teste no IntelliJ.

    ### Exercício 1 — Identificando expressões

    Analise:

    ```java
    int total = 10 + 5;
    ```

    1. Qual parte do código é a expressão?
    2. Qual valor ela produz?
    3. Qual é a função da variável `total`?

    ### Exercício 2 — Precedência

    Determine o resultado de cada expressão:

    1. `2 + 3 * 4`
    2. `(2 + 3) * 4`
    3. `20 / 5 + 2`
    4. `(20 / (5 + 5)) + 2`

    Explique a ordem das operações em cada caso.

    ### Exercício 3 — Uso de parênteses

    Considere:

    ```java
    int resultado = a + b / 2;
    ```

    Reescreva a expressão para que a soma entre `a` e `b` aconteça antes da divisão.

    ### Exercício 4 — Ponto flutuante

    Com base no exemplo da lição:

    1. Qual resultado você esperaria da comparação entre `d1` e `1.0`?
    2. Qual resultado a lição informa que é impresso?
    3. Qual cuidado você deve ter ao comparar valores de ponto flutuante?

    ### Exercício 5 — Reconhecendo declarações

    Classifique cada linha como atribuição, incremento, invocação de método ou declaração de variável:

    ```java
    int idade = 23;
    idade++;
    idade = 24;
    IO.println(idade);
    ```

    ### Exercício 6 — Identificando blocos

    Observe:

    ```java
    if (true) {
        IO.println("Primeiro bloco");
    } else {
        IO.println("Segundo bloco");
    }
    ```

    1. Quantos blocos existem?
    2. Quais símbolos delimitam cada bloco?
    3. Qual bloco será executado?

    ### Exercício 7 — Lei de Feynman

    Explique, com suas próprias palavras e sem copiar a definição:

    **Qual é a diferença entre uma expressão, uma declaração e um bloco em Java?**

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. O que é uma expressão em Java?
    2. Quais elementos podem compor uma expressão?
    3. O que determina o tipo de valor produzido por uma expressão?
    4. O que é uma expressão composta?
    5. Para que serve a precedência dos operadores?
    6. Por que devemos utilizar parênteses em expressões compostas?
    7. O que pode acontecer ao comparar diretamente resultados de operações com ponto flutuante?
    8. O que é uma declaração?
    9. Quais quatro tipos de expressões podem formar declarações expressivas, segundo a lição?
    10. Quais são os outros dois tipos de instruções apresentados?
    11. O que é um bloco?
    12. Quais símbolos delimitam um bloco?

    ## ✅ Checklist

    - [ ]  Entendi o que é uma expressão.
    - [ ]  Consigo identificar uma expressão em um trecho de código.
    - [ ]  Entendi como expressões menores formam expressões compostas.
    - [ ]  Compreendi como a precedência determina a ordem das operações.
    - [ ]  Sei utilizar parênteses para deixar a intenção explícita.
    - [ ]  Entendi o alerta sobre aritmética de ponto flutuante.
    - [ ]  Sei reconhecer uma declaração expressiva.
    - [ ]  Diferencio declaração de variável e instrução de fluxo de controle.
    - [ ]  Entendi que um bloco agrupa zero ou mais instruções entre chaves.
    - [ ]  Consigo explicar a diferença entre expressão, declaração e bloco sem consultar as anotações.

    ---

    **Referência:** Dev.java — Expressions, Statements and Blocks.

    **Última atualização informada pela fonte:** 22 de setembro de 2021.
         */
    }
}
