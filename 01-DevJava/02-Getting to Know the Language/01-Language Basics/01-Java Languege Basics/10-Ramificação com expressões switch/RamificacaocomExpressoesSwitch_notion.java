public class RamificacaocomExpressoesSwitch_notion {
    public static void main(String[] args) {
        /*
        - **Ramificação com expressões switch**

    ## 🎯 Objetivo

    Entender a expressão `switch` introduzida no Java SE 14, sua sintaxe com seta, a produção de valores, o uso de `yield`, a exaustividade e o tratamento de `null` descrito pela fonte.

    ## 📚 Conceitos

    ### 1. Por que surgiu a expressão switch?

    A lição apresenta três motivações para a nova sintaxe:

    - O comportamento tradicional de *fall through* pode causar erros quando um `break` é esquecido.
    - O bloco tradicional de `switch` é tratado como um único bloco, o que pode dificultar a declaração de variáveis restritas a um caso.
    - A instrução tradicional não produz diretamente um valor; normalmente é necessário declarar uma variável antes e atribuir valores dentro dos casos.

    A partir do Java SE 14, `switch` também pode ser utilizado como expressão. A instrução tradicional continua disponível e sua semântica não mudou.

    ### 2. Sintaxe com seta: case ... ->

    A nova forma utiliza `case L ->`. Somente o código à direita do rótulo correspondente é executado. Esse código pode ser uma expressão, um bloco ou uma instrução `throw`.

    Várias constantes podem ser agrupadas no mesmo caso, separadas por vírgulas.

    Exemplo da lição:

    ```java
    Day day = ...; // any day
    int len =
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
        };
    IO.println("len = " + len);
    ```

    Os dias agrupados compartilham o mesmo resultado. Se `day` for `MONDAY`, a expressão produz `6`, atribuído a `len`.

    ### 3. Produzindo um valor

    Uma expressão `switch` pode ser utilizada diretamente na atribuição de uma variável.

    Exemplo da lição:

    ```java
    int quarter = ...; // any value

    String quarterLabel =
        switch (quarter) {
            case 0  -> "Q1 - Winter";
            case 1  -> "Q2 - Spring";
            case 2  -> "Q3 - Summer";
            case 3  -> "Q3 - Summer";
            default -> "Unknown quarter";
        };
    ```

    Quando há uma única expressão à direita da seta, o valor produzido por ela é o resultado do caso.

    ### 4. Utilizando yield em blocos

    Quando um caso precisa executar várias instruções, pode utilizar um bloco entre chaves. O bloco precisa fornecer um valor à expressão `switch`, e a palavra-chave `yield` faz isso.

    A lição mostra que `return` causaria ambiguidade: não ficaria claro se ele deveria encerrar o método ou fornecer o resultado do `switch`.

    Exemplo da lição, com a estrutura do método organizada:

    ```java
    public String convertToLabel(int quarter) {
        String quarterLabel =
            switch (quarter) {
                case 0 -> {
                    IO.println("Q1 - Winter");
                    yield "Q1 - Winter";
                }
                default -> "Unknown quarter";
            };

        return quarterLabel;
    }
    ```

    - `return` encerra a execução do método e devolve seu resultado.
    - `yield` fornece o valor produzido por um bloco da expressão `switch`.

    ### 5. Exaustividade e cláusula default

    As expressões `switch` precisam ser exaustivas: todos os valores possíveis do seletor devem possuir um caminho correspondente.

    As instruções `switch` tradicionais não têm essa mesma exigência. Se nenhum rótulo corresponder, podem simplesmente não executar nenhum caso.

    Na maioria das situações, a exaustividade é alcançada com `default`. A lição apresenta uma exceção para `enum`: se todos os valores conhecidos da enumeração forem tratados, não é obrigatório adicionar `default`.

    A fonte também descreve uma proteção para alterações futuras: se uma nova constante for adicionada à enumeração e o código compilado não a conhecer, uma cláusula padrão gerada pelo compilador lança `IncompatibleClassChangeError`.

    ### 6. Case tradicional com dois-pontos

    Uma expressão `switch` também pode utilizar rótulos tradicionais `case L:`. Nesse formato, o comportamento de *fall through* continua existindo. Os valores são fornecidos com `yield`.

    Exemplo da lição:

    ```java
    int quarter = ...; // any value

    String quarterLabel =
        switch (quarter) {
            case 0:
                yield "Q1 - Winter";
            case 1:
                yield "Q2 - Spring";
            case 2:
                yield "Q3 - Summer";
            case 3:
                yield "Q3 - Summer";
            default:
                IO.println("Unknown quarter");
                yield "Unknown quarter";
        };
    ```

    ### 7. Lidando com valores null

    Segundo a lição, as instruções `switch` apresentadas não aceitavam um seletor com valor `null`; tentar utilizá-lo causava `NullPointerException`.

    A página registra que o Java SE 17 possuía um recurso de pré-visualização que aprimorava as expressões `switch` para permitir valores `null`. Essa informação corresponde ao recorte histórico da fonte, atualizada em 22 de setembro de 2021.

    ## 🧠 O que memorizar

    - A expressão `switch` foi disponibilizada a partir do Java SE 14, conforme a lição.
    - A sintaxe com seta é `case L ->`.
    - Várias constantes podem compartilhar um caso, separadas por vírgulas.
    - A expressão `switch` produz um valor que pode ser atribuído diretamente a uma variável.
    - Um bloco pode executar várias instruções e utilizar `yield` para fornecer seu resultado.
    - `return` encerra o método; `yield` entrega um valor à expressão `switch`.
    - Expressões `switch` devem ser exaustivas.
    - A forma tradicional `case L:` mantém o comportamento de *fall through*.
    - A observação sobre `null` e Java SE 17 reflete o estado descrito pela fonte em 2021.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Opção de menu

    Complemento didático:

    ```java
    int opcao = 2;

    String resultado =
        switch (opcao) {
            case 1 -> "Cadastrar";
            case 2 -> "Consultar";
            case 3 -> "Sair";
            default -> "Opção inválida";
        };

    IO.println(resultado);
    ```

    Saída:

    ```
    Consultar
    ```

    ### Exemplo 2 — Bloco com yield

    Complemento didático:

    ```java
    int nota = 8;

    String classificacao =
        switch (nota) {
            case 10 -> "Excelente";
            case 7, 8, 9 -> {
                IO.println("Nota acima da média");
                yield "Aprovado";
            }
            default -> "Precisa melhorar";
        };

    IO.println(classificacao);
    ```

    Saída:

    ```
    Nota acima da média
    Aprovado
    ```

    *Os exemplos desta seção são complementos didáticos. Os exemplos da fonte foram identificados nas seções anteriores.*

    ## 🔎 Explicação do código

    ### 1. A seta evita o fall through tradicional

    Na sintaxe `case ... ->`, somente o código associado ao caso correspondente é executado. Não é necessário adicionar `break` para impedir a continuação pelos próximos casos.

    ### 2. A expressão switch entrega um resultado

    Pense na expressão como uma escolha que devolve uma resposta. O programa avalia o seletor, encontra o caso correspondente e produz o valor associado.

    ### 3. Quando utilizar yield?

    Utilize `yield` quando o caso contém um bloco com várias instruções e precisa entregar um valor à expressão `switch`.

    ### 4. Lei de Feynman

    Imagine uma máquina de atendimento:

    - O seletor é a opção escolhida.
    - Cada `case` é uma alternativa.
    - A seta `->` associa a alternativa ao resultado.
    - A expressão `switch` devolve o resultado escolhido.
    - `yield` permite executar tarefas antes de entregar a resposta.
    - `default` representa uma alternativa para valores não previstos.

    A diferença essencial: a instrução tradicional executa comandos; a expressão `switch` também produz um valor para o restante do programa.

    ## ⚠️ Pontos de atenção

    - Não confunda instrução `switch` com expressão `switch`: a expressão produz um valor.
    - A forma com seta não apresenta o *fall through* tradicional.
    - Em um bloco de expressão `switch`, utilize `yield` para fornecer o valor.
    - `return` não substitui `yield`: ele encerra o método.
    - Garanta que todos os caminhos da expressão produzam um valor.
    - Expressões `switch` precisam ser exaustivas; instruções tradicionais não têm a mesma exigência.
    - A forma tradicional com dois-pontos mantém o comportamento de *fall through*.
    - A observação sobre `null` e Java SE 17 reflete a atualização de 2021 da página.

    ## 📝 Resumo

    A expressão `switch`, apresentada a partir do Java SE 14, permite selecionar um caso e produzir diretamente um valor. A sintaxe com seta (`case L ->`) simplifica os casos, permite agrupar constantes e evita o *fall through* tradicional. Quando um caso precisa executar várias instruções, pode utilizar um bloco e entregar o resultado com `yield`.

    Diferentemente da instrução tradicional, a expressão precisa ser exaustiva: todos os valores possíveis devem possuir um caminho que produza um resultado. A forma com dois-pontos também pode ser usada, mas mantém o comportamento de passagem entre casos.

    **Ideia central:** a expressão `switch` escolhe um caminho e devolve um valor; `yield` entrega esse valor quando o caso utiliza um bloco.

    ## 🏋️ Exercícios

    Tente resolver sem consultar uma solução pronta. Escreva o código no IntelliJ e explique seu raciocínio antes de executar.

    ### Exercício 1 — Opção de menu

    Crie uma variável `opcao` e utilize uma expressão `switch` para produzir uma descrição para as opções 1, 2 e 3. Trate as demais com `default`.

    ### Exercício 2 — Agrupando constantes

    Crie uma variável que represente um dia da semana. Agrupe três dias em um mesmo caso utilizando vírgulas e produza um número como resultado.

    ### Exercício 3 — Produzindo um valor

    Utilize uma expressão `switch` para converter um número de 1 a 4 em um texto. Armazene o resultado em uma variável `String`.

    ### Exercício 4 — Utilizando yield

    Crie uma expressão `switch` em que um dos casos execute duas instruções dentro de um bloco e utilize `yield` para produzir o resultado.

    ### Exercício 5 — Return ou yield?

    Explique por que `return` e `yield` não são equivalentes. Identifique qual deve ser utilizado para fornecer o valor de um bloco de expressão `switch`.

    ### Exercício 6 — Exaustividade

    Crie uma expressão `switch` que trate todos os valores de uma enumeração criada por você. Explique por que a expressão precisa cobrir todos os casos.

    ### Exercício 7 — Comparação de sintaxes

    Escreva uma expressão `switch` utilizando `case L ->` e outra utilizando `case L:` com `yield`. Explique a diferença entre os formatos e o comportamento de *fall through*.

    ### Exercício 8 — Lei de Feynman

    Explique sem consultar as anotações:

    1. Por que a expressão `switch` foi criada?
    2. O que significa a seta `->`?
    3. Como agrupar várias constantes em um caso?
    4. Quando utilizar `yield`?
    5. Qual é a diferença entre `return` e `yield`?
    6. O que significa dizer que uma expressão `switch` é exaustiva?

    ## 🔄 Revisão

    1. A partir de qual versão do Java a lição apresenta a expressão `switch`?
    2. Quais problemas da sintaxe tradicional motivaram a nova forma?
    3. Qual é a diferença entre `case L ->` e `case L:`?
    4. Como agrupar várias constantes em um único caso?
    5. O que uma expressão `switch` produz?
    6. Quando um bloco de caso precisa utilizar `yield`?
    7. Por que a lição considera ambíguo utilizar `return` no exemplo?
    8. O que significa exaustividade?
    9. Quando uma expressão `switch` com `enum` pode dispensar `default`, segundo a fonte?
    10. Qual é a função da proteção associada a `IncompatibleClassChangeError`?
    11. O que acontece com o *fall through* na sintaxe tradicional com dois-pontos?
    12. Qual comportamento para valores `null` a fonte descreve?

    ## ✅ Checklist

    - [ ]  Entendi por que a expressão `switch` foi introduzida.
    - [ ]  Sei escrever casos com `case L ->`.
    - [ ]  Sei agrupar constantes separadas por vírgulas.
    - [ ]  Consigo atribuir o resultado a uma variável.
    - [ ]  Sei utilizar blocos de código dentro de um caso.
    - [ ]  Entendi a finalidade de `yield`.
    - [ ]  Sei diferenciar `yield` de `return`.
    - [ ]  Entendi o conceito de exaustividade.
    - [ ]  Sei explicar o papel de `default`.
    - [ ]  Conheço a forma tradicional com `case L:` e seu *fall through*.
    - [ ]  Entendi o tratamento de `null` descrito pela fonte.
    - [ ]  Consigo explicar e escrever uma expressão `switch` sem consultar as anotações.

    ---

    **Referência:** Dev.java — Ramificação com expressões switch.

    **Última atualização informada pela fonte:** 22 de setembro de 2021.
         */
    }
}
