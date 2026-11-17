public class Aula23_Aula05TabelaEExercício {
    public static void main(String[] args) {
    /*
    - ☕ Aula 023 — Estruturas Condicionais pt. 04: Tabela Verdade e exercício

    Assistir à aula no YouTube

    **Canal:** DevDojo
    **Duração:** 5min29s
    **Idioma:** Português (transcrição automática)

    ---

    ## 🎯 Objetivo

    Compreender como a tabela-verdade determina o resultado de expressões booleanas que combinam mais de uma condição, diferenciando o comportamento dos operadores lógicos AND (`&&`) e OR (`||`). Aplicar esse raciocínio como preparação para um exercício de cálculo de imposto baseado em faixas salariais.

    ---

    ## 📚 Conceitos

    ### 1. O que é uma tabela-verdade

    > ⏱️ TIMESTAMP: 00:00–01:11
    >

    A tabela-verdade apresenta os possíveis resultados de uma expressão booleana conforme os valores verdadeiros ou falsos das condições que a compõem.

    Quando uma expressão possui mais de uma condição, a tabela ajuda a determinar se o resultado final será `true` ou `false`.

    A aula trabalha com duas tabelas:

    - AND (`&&`): conjunção lógica.
    - OR (`||`): disjunção lógica.

    ### 2. Tabela-verdade do AND (&&)

    > ⏱️ TIMESTAMP: 01:11–02:21
    >

    O operador AND exige que **todas as condições sejam verdadeiras** para que o resultado final também seja verdadeiro.

    | Condição A | Condição B | A && B |
    | --- | --- | --- |
    | true | true | true |
    | true | false | false |
    | false | true | false |
    | false | false | false |

    Análise:

    - Verdadeiro AND verdadeiro resulta em verdadeiro.
    - Verdadeiro AND falso resulta em falso.
    - Falso AND verdadeiro resulta em falso.
    - Falso AND falso resulta em falso.

    **Regra principal:** basta uma condição ser falsa para que o resultado de uma expressão AND com essas condições seja falso. O resultado só será verdadeiro quando todas forem verdadeiras.

    ### 3. Tabela-verdade do OR (||)

    > ⏱️ TIMESTAMP: 02:21–03:27
    >

    O operador OR exige que **pelo menos uma condição seja verdadeira** para que o resultado final seja verdadeiro.

    | Condição A | Condição B | A || B |
    |---|---|---|
    | true | true | true |
    | true | false | true |
    | false | true | true |
    | false | false | false |

    Análise:

    - Verdadeiro OR verdadeiro resulta em verdadeiro.
    - Verdadeiro OR falso resulta em verdadeiro.
    - Falso OR verdadeiro resulta em verdadeiro.
    - Falso OR falso resulta em falso.

    **Regra principal:** o resultado de OR só será falso quando todas as condições forem falsas. Se pelo menos uma for verdadeira, o resultado será verdadeiro.

    ### 4. Expressões com várias condições

    > ⏱️ TIMESTAMP: 03:27–04:38
    >

    A lógica apresentada também se aplica quando existem mais de duas condições na mesma expressão.

    - Com AND (`&&`), todas as condições precisam ser verdadeiras para o resultado final ser verdadeiro.
    - Com OR (`||`), basta uma condição ser verdadeira para o resultado final ser verdadeiro.
    - Em uma expressão OR, o resultado será falso somente quando todas as condições forem falsas.

    O professor reforça que a escolha entre AND e OR depende da regra que se deseja representar.

    ### 5. Apresentação do exercício: cálculo de imposto

    > ⏱️ TIMESTAMP: 04:38–05:29
    >

    O professor apresenta um exercício que será resolvido na aula seguinte.

    O problema proposto é:

    - Receber um salário anual como entrada.
    - Identificar em qual faixa salarial esse valor se encontra.
    - Consultar a tabela de faixas e porcentagens mencionada pelo professor.
    - Calcular o valor do imposto a pagar de acordo com a porcentagem correspondente a cada faixa.

    A tabela com os limites e as porcentagens não está detalhada na transcrição desta aula. O código e a resolução também ficam para a próxima aula.

    ---

    ## 🧠 O que memorizar

    - A tabela-verdade determina o resultado de uma expressão booleana.
    - AND (`&&`) só resulta em verdadeiro quando todas as condições são verdadeiras.
    - AND resulta em falso quando pelo menos uma das condições é falsa.
    - OR (`||`) resulta em verdadeiro quando pelo menos uma condição é verdadeira.
    - OR só resulta em falso quando todas as condições são falsas.
    - Essas regras continuam válidas quando a expressão possui mais de duas condições.
    - A escolha entre AND e OR depende da lógica que o programa precisa representar.
    - O exercício apresentado recebe um salário anual e utiliza faixas e porcentagens para calcular o imposto.

    ---

    ## 💻 Exemplos

    **Nota:** exemplos didáticos organizados a partir das regras explicadas na aula. A transcrição não apresenta um código Java completo para as tabelas-verdade.

    ### Exemplo 1 — AND com duas condições

    ```java
    boolean condicaoA = true;
    boolean condicaoB = true;

    boolean resultado = condicaoA && condicaoB;

    System.out.println(resultado); // true
    ```

    As duas condições são verdadeiras; portanto, o resultado também é verdadeiro.

    ### Exemplo 2 — AND com uma condição falsa

    ```java
    boolean condicaoA = true;
    boolean condicaoB = false;

    boolean resultado = condicaoA && condicaoB;

    System.out.println(resultado); // false
    ```

    Uma das condições é falsa. Por isso, o resultado do AND é falso.

    ### Exemplo 3 — OR com uma condição verdadeira

    ```java
    boolean condicaoA = false;
    boolean condicaoB = true;

    boolean resultado = condicaoA || condicaoB;

    System.out.println(resultado); // true
    ```

    Existe pelo menos uma condição verdadeira; portanto, o resultado do OR é verdadeiro.

    ### Exemplo 4 — OR com todas as condições falsas

    ```java
    boolean condicaoA = false;
    boolean condicaoB = false;

    boolean resultado = condicaoA || condicaoB;

    System.out.println(resultado); // false
    ```

    Como todas as condições são falsas, o resultado do OR também é falso.

    ---

    ## 🔎 Explicação

    Imagine duas perguntas que precisam ser avaliadas para tomar uma decisão.

    **AND (&&): todas precisam ser verdadeiras.**

    Pense em uma regra que exige duas condições ao mesmo tempo. Se uma delas não for atendida, a regra inteira não será satisfeita.

    **OR (||): basta uma ser verdadeira.**

    Agora imagine uma regra que aceita qualquer uma de duas condições. Se pelo menos uma for atendida, a regra será satisfeita.

    A tabela-verdade organiza essas possibilidades para que você consiga prever o resultado antes de executar o programa.

    ---

    ## ⚠️ Pontos de atenção

    - Não confunda AND (`&&`) com OR (`||`).
    - No AND, uma única condição falsa já torna o resultado falso.
    - No OR, uma única condição verdadeira já torna o resultado verdadeiro.
    - Não considere que OR exige que todas as condições sejam verdadeiras; essa é a regra do AND.
    - Não considere que AND aceita qualquer condição verdadeira; todas precisam ser verdadeiras.
    - Quando houver mais de duas condições, aplique a mesma regra geral.
    - A transcrição não informa os limites das faixas salariais nem as porcentagens do exercício. Esses valores não devem ser presumidos ou inventados.
    - A resolução do exercício de imposto será apresentada na aula seguinte.

    ---

    ## 📝 Resumo

    A aula apresenta a tabela-verdade dos operadores lógicos AND (`&&`) e OR (`||`). O AND só produz verdadeiro quando todas as condições são verdadeiras. Já o OR produz verdadeiro quando pelo menos uma condição é verdadeira e só resulta em falso quando todas são falsas.

    O professor também demonstra que essas regras se aplicam a expressões com várias condições e apresenta um exercício para calcular o imposto devido a partir de um salário anual, utilizando faixas e porcentagens. A tabela de valores e a implementação ficam para a próxima aula.

    ---

    ## 🏋️ Prática

    **Resolva sem consultar a tabela acima. Registre suas respostas e depois confira.**

    ### Exercício 1 — AND

    Determine o resultado de cada expressão:

    1. `true && true`
    2. `true && false`
    3. `false && true`
    4. `false && false`

    ### Exercício 2 — OR

    Determine o resultado de cada expressão:

    1. `true || true`
    2. `true || false`
    3. `false || true`
    4. `false || false`

    ### Exercício 3 — Mais de duas condições

    Determine o resultado sem executar o código:

    ```java
    boolean resultado1 = true && true && false;
    boolean resultado2 = false || false || true;
    boolean resultado3 = false || false || false;
    boolean resultado4 = true && true && true;
    ```

    Responda:

    1. Qual expressão resulta em verdadeiro?
    2. Qual expressão resulta em falso?
    3. Qual regra você utilizou para chegar aos resultados?

    ### Exercício 4 — Implementação em Java

    Crie um programa que:

    1. Declare duas variáveis booleanas.
    2. Avalie as variáveis utilizando AND.
    3. Imprima o resultado.
    4. Repita o teste utilizando OR.
    5. Altere os valores para testar as quatro combinações da tabela-verdade.

    ### Exercício 5 — Técnica de Feynman

    Explique com suas próprias palavras:

    1. O que é uma tabela-verdade?
    2. Por que AND precisa de todas as condições verdadeiras?
    3. Por que OR precisa de apenas uma condição verdadeira?
    4. Qual é a diferença entre os resultados de AND e OR?

    ### Exercício 6 — Preparação para o exercício de imposto

    Com base apenas no enunciado apresentado:

    1. Qual informação será recebida pelo programa?
    2. O que deverá ser identificado a partir do salário anual?
    3. Para que servirá a tabela de faixas e porcentagens?
    4. Quais informações ainda precisam ser fornecidas para resolver o exercício?

    Não invente valores para as faixas ou porcentagens. Aguarde a tabela apresentada na aula seguinte.

    ---

    ## 🔄 Revisão

    Tente responder sem consultar o conteúdo:

    1. **O que é uma tabela-verdade?** É uma representação dos resultados possíveis de uma expressão booleana conforme os valores das condições.
    2. **Quando AND resulta em verdadeiro?** Quando todas as condições são verdadeiras.
    3. **Quando AND resulta em falso?** Quando pelo menos uma condição é falsa.
    4. **Quando OR resulta em verdadeiro?** Quando pelo menos uma condição é verdadeira.
    5. **Quando OR resulta em falso?** Quando todas as condições são falsas.
    6. **Qual operador representa AND em Java?** `&&`.
    7. **Qual operador representa OR em Java?** `||`.
    8. **As regras mudam quando existem mais de duas condições?** Não. A regra geral de cada operador continua a mesma.
    9. **Qual exercício foi apresentado no final da aula?** Calcular o imposto devido a partir de um salário anual, identificando a faixa correspondente e aplicando a porcentagem indicada.
    10. **A aula apresentou os valores das faixas e as porcentagens?** Não na transcrição fornecida; a resolução ficou para a aula seguinte.

    ---

    ## ✅ Checklist

    - [ ]  Entendi o que é uma tabela-verdade.
    - [ ]  Compreendi o funcionamento do operador AND (`&&`).
    - [ ]  Memorizei que AND exige todas as condições verdadeiras.
    - [ ]  Compreendi o funcionamento do operador OR (`||`).
    - [ ]  Memorizei que OR exige pelo menos uma condição verdadeira.
    - [ ]  Sei identificar quando AND resulta em falso.
    - [ ]  Sei identificar quando OR resulta em falso.
    - [ ]  Consigo avaliar expressões com mais de duas condições.
    - [ ]  Executei os exemplos em Java.
    - [ ]  Resolvi os exercícios propostos.
    - [ ]  Consigo explicar a diferença entre AND e OR com minhas próprias palavras.
    - [ ]  Entendi o enunciado do exercício de cálculo de imposto.
    - [ ]  Sei quais informações ainda faltam para resolver o exercício de imposto.
     */
        int salario = 50000 ;
        double primeiraFaixa = 9.70;
        double segundaFaixa = 37.35;
        double terceiraFaixa = 49.50;
        double imposto = 0;

        if (salario <= 34712){
             imposto = salario * (primeiraFaixa/100);
        }else if (salario >= 34713 && salario <= 68507){
             imposto = salario * (segundaFaixa/100);
        } else {
             imposto = salario * (terceiraFaixa/100);
        }
        System.out.println("Salario atual com Desconto do Imposto de renda: "+imposto);

        // chave toma agr vamo pra proxima aula
    }
}
