public class InstrucoesdeFluxodeControle_notion {
    public static void main(String[] args) {
        /*
        - **Instruções de fluxo de controle**

    ## 🎯 Objetivo

    Compreender como as instruções de fluxo de controle determinam quais partes do programa serão executadas, quantas vezes um bloco será repetido e quando um método ou laço será encerrado.

    ## 📚 Conceitos

    ### 1. Instrução if-then

    A instrução `if` executa um trecho de código somente quando uma condição booleana é avaliada como `true`.

    Exemplo da lição:

    ```java
    void applyBrakes() {
        if (isMoving) {
            currentSpeed--;
        }
    }
    ```

    Se `isMoving` for `true`, a velocidade é reduzida. Se for `false`, o programa pula o bloco e continua após a instrução `if`.

    As chaves podem ser omitidas quando o bloco contém apenas uma instrução:

    ```java
    if (isMoving)
        currentSpeed--;
    ```

    **Recomendação:** manter as chaves mesmo quando existe apenas uma instrução. Sem elas, adicionar uma segunda instrução posteriormente pode causar um erro lógico difícil de perceber.

    ### 2. Instrução if-then-else

    A estrutura `if-else` permite definir um caminho alternativo quando a condição do `if` é falsa.

    ```java
    void applyBrakes() {
        if (isMoving) {
            currentSpeed--;
        } else {
            System.err.println("The bicycle has already stopped!");
        }
    }
    ```

    Também é possível encadear condições com `else if`.

    Exemplo da lição — classificação de uma nota:

    ```java
    class IfElseDemo {
        public static void main(String[] args) {
            int testscore = 76;
            char grade;

            if (testscore >= 90) {
                grade = 'A';
            } else if (testscore >= 80) {
                grade = 'B';
            } else if (testscore >= 70) {
                grade = 'C';
            } else if (testscore >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            IO.println("Grade = " + grade);
        }
    }
    ```

    Saída:

    ```
    Grade = C
    ```

    Mesmo que uma nota possa satisfazer mais de uma comparação, apenas o primeiro bloco cuja condição seja verdadeira é executado. Depois disso, as condições restantes não são avaliadas.

    ### 3. Laços while e do-while

    Um laço repete um bloco de instruções enquanto sua condição permitir.

    **while**

    A condição é avaliada antes da execução do bloco. Se for falsa desde o início, o bloco não será executado nenhuma vez.

    Sintaxe:

    ```java
    while (expression) {
        statement(s);
    }
    ```

    Exemplo da lição:

    ```java
    class WhileDemo {
        public static void main(String[] args) {
            int count = 1;

            while (count < 11) {
                IO.println("Count is: " + count);
                count++;
            }
        }
    }
    ```

    O programa imprime os números de 1 a 10. A variável `count` é incrementada a cada repetição.

    Um laço infinito pode ser escrito assim:

    ```java
    while (true) {
        // código a executar continuamente
    }
    ```

    **do-while**

    A condição é avaliada no final. Por isso, o bloco é executado pelo menos uma vez, mesmo que a condição seja falsa na primeira avaliação.

    Sintaxe:

    ```java
    do {
        statement(s);
    } while (expression);
    ```

    Exemplo da lição:

    ```java
    class DoWhileDemo {
        public static void main(String[] args) {
            int count = 1;

            do {
                IO.println("Count is: " + count);
                count++;
            } while (count < 11);
        }
    }
    ```

    A diferença principal é o momento em que a condição é verificada: `while` verifica antes; `do-while` verifica depois da execução do bloco.

    ### 4. Instrução for

    O laço `for` oferece uma estrutura compacta para repetir instruções, geralmente quando existe uma variável de controle.

    Sintaxe geral:

    ```java
    for (initialization; termination; increment) {
        statement(s);
    }
    ```

    As três partes têm funções diferentes:

    1. **Inicialização:** prepara o laço e é executada uma única vez.
    2. **Condição de término:** é verificada antes de cada iteração. Quando resulta em `false`, o laço termina.
    3. **Incremento:** é executado após cada iteração do bloco.

    Exemplo da lição:

    ```java
    class ForDemo {
        public static void main(String[] args) {
            for (int i = 1; i < 11; i++) {
                IO.println("Count is: " + i);
            }
        }
    }
    ```

    Saída:

    ```
    Count is: 1
    Count is: 2
    Count is: 3
    Count is: 4
    Count is: 5
    Count is: 6
    Count is: 7
    Count is: 8
    Count is: 9
    Count is: 10
    ```

    A variável `i` foi declarada na inicialização. Seu escopo se estende até o final do bloco controlado pelo `for`. Quando a variável de controle não precisa ser usada fora do laço, declará-la na inicialização ajuda a limitar seu escopo.

    As três expressões do `for` são opcionais. Portanto, também é possível escrever um laço infinito:

    ```java
    for (;;) {
        // código a executar continuamente
    }
    ```

    ### 5. for aprimorado (enhanced for)

    O `for` aprimorado foi projetado para percorrer arrays e coleções de forma mais compacta e legível.

    Exemplo da lição:

    ```java
    class EnhancedForDemo {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            for (int item : numbers) {
                IO.println("Count is: " + item);
            }
        }
    }
    ```

    A variável `item` recebe o valor do elemento atual do array em cada iteração. O laço percorre os elementos sem exigir que o programador controle manualmente um índice.

    A lição recomenda utilizar essa forma sempre que possível, pois pode deixar a iteração mais simples e fácil de ler.

    ### 6. Instrução break

    A instrução `break` encerra imediatamente a estrutura de controle mais interna que a contém, como um laço ou uma instrução `switch`.

    Exemplo da lição — procurar o número 12 em um array:

    ```java
    class BreakDemo {
        public static void main(String[] args) {
            int[] arrayOfInts = {
                32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127
            };
            int searchfor = 12;

            int i;
            boolean foundIt = false;

            for (i = 0; i < arrayOfInts.length; i++) {
                if (arrayOfInts[i] == searchfor) {
                    foundIt = true;
                    break;
                }
            }

            if (foundIt) {
                IO.println("Found " + searchfor + " at index " + i);
            } else {
                IO.println(searchfor + " not in the array");
            }
        }
    }
    ```

    Saída:

    ```
    Found 12 at index 4
    ```

    Quando o valor é encontrado, `break` encerra o laço `for`. A execução continua na primeira instrução após o laço.

    **break com rótulo**

    Em laços aninhados, `break` sem rótulo encerra apenas a estrutura mais interna. Um rótulo permite encerrar uma estrutura externa específica.

    Exemplo da lição:

    ```java
    class BreakWithLabelDemo {
        public static void main(String[] args) {
            int[][] arrayOfInts = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
            };
            int searchfor = 12;

            int i;
            int j = 0;
            boolean foundIt = false;

            search:
            for (i = 0; i < arrayOfInts.length; i++) {
                for (j = 0; j < arrayOfInts[i].length; j++) {
                    if (arrayOfInts[i][j] == searchfor) {
                        foundIt = true;
                        break search;
                    }
                }
            }

            if (foundIt) {
                IO.println("Found " + searchfor + " at " + i + ", " + j);
            } else {
                IO.println(searchfor + " not in the array");
            }
        }
    }
    ```

    Saída:

    ```
    Found 12 at 1, 0
    ```

    O rótulo `search` identifica o laço externo. Ao executar `break search;`, esse laço é encerrado e o fluxo segue para a instrução imediatamente posterior a ele. O controle não retorna ao rótulo.

    ### 7. Instrução continue

    A instrução `continue` ignora o restante da iteração atual e prossegue com a próxima iteração do laço.

    Exemplo da lição — contar quantas vezes a letra `p` aparece em uma String:

    ```java
    class ContinueDemo {
        public static void main(String[] args) {
            String searchMe = "peter piper picked a " + "peck of pickled peppers";
            int max = searchMe.length();
            int numPs = 0;

            for (int i = 0; i < max; i++) {
                // interessa somente a letra p
                if (searchMe.charAt(i) != 'p')
                    continue;

                numPs++;
            }

            IO.println("Found " + numPs + " p's in the string.");
        }
    }
    ```

    Saída:

    ```
    Found 9 p's in the string.
    ```

    Quando o caractere atual não é `p`, o `continue` ignora o incremento de `numPs` e passa à próxima iteração. Se remover a instrução `continue`, o programa contará incorretamente todos os caracteres percorridos, resultando em 35.

    **continue com rótulo**

    Um `continue` com rótulo permite ignorar a iteração atual de um laço externo identificado pelo rótulo.

    Exemplo da lição:

    ```java
    class ContinueWithLabelDemo {
        public static void main(String[] args) {
            String searchMe = "Look for a substring in me";
            String substring = "sub";
            boolean foundIt = false;

            int max = searchMe.length() - substring.length();

            test:
            for (int i = 0; i <= max; i++) {
                int n = substring.length();
                int j = i;
                int k = 0;

                while (n-- != 0) {
                    if (searchMe.charAt(j++) != substring.charAt(k++)) {
                        continue test;
                    }
                }

                foundIt = true;
                break test;
            }

            IO.println(foundIt ? "Found it" : "Didn't find it");
        }
    }
    ```

    Saída:

    ```
    Found it
    ```

    Quando uma comparação falha, `continue test;` interrompe a iteração atual do laço externo e tenta a próxima posição inicial da busca.

    ### 8. Instrução return

    A instrução `return` encerra a execução do método atual e devolve o controle ao ponto em que o método foi chamado.

    Existem duas formas:

    **Retornar um valor:**

    ```java
    return ++count;
    ```

    O tipo do valor retornado deve ser compatível com o tipo declarado no retorno do método.

    **Não retornar um valor:**

    ```java
    return;
    ```

    Essa forma é utilizada em métodos declarados como `void`.

    A lição informa que o estudo detalhado da escrita de métodos será desenvolvido na seção Classes e Objetos.

    ### 9. Instrução yield

    A instrução `yield` encerra a avaliação da expressão `switch` em que está inserida e fornece um valor para essa expressão.

    Ela deve ser seguida por uma expressão que produza um valor; não pode ser uma expressão `void`.

    Exemplo da lição:

    ```java
    class Test {
        enum Day {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
            FRIDAY, SATURDAY, SUNDAY
        }

        public int calculate(Day d) {
            return switch (d) {
                case SATURDAY, SUNDAY -> 0;
                default -> {
                    int remainingWorkDays = 5 - d.ordinal();
                    yield remainingWorkDays;
                }
            };
        }
    }
    ```

    Nesse exemplo, fins de semana produzem o valor `0`. Para os demais dias, o bloco calcula `remainingWorkDays` e utiliza `yield` para fornecer esse valor à expressão `switch`.

    ## 🧠 O que memorizar

    - `if` executa um bloco quando a condição é verdadeira.
    - `else` define o caminho alternativo quando a condição do `if` é falsa.
    - Em uma sequência `if / else if / else`, apenas o primeiro caminho cuja condição seja satisfeita é executado.
    - `while` verifica a condição antes de executar o bloco.
    - `do-while` executa o bloco antes de verificar a condição.
    - `for` organiza inicialização, condição de término e incremento.
    - O `for` aprimorado percorre diretamente os elementos de arrays e coleções.
    - `break` encerra um laço ou `switch`; com rótulo, pode encerrar uma estrutura externa.
    - `continue` ignora o restante da iteração atual; com rótulo, atua sobre um laço externo identificado.
    - `return` encerra o método atual, podendo retornar um valor ou não.
    - `yield` fornece um valor à expressão `switch` que o contém.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Decisão com if-else

    ```java
    int idade = 18;

    if (idade >= 18) {
        IO.println("Maior de idade");
    } else {
        IO.println("Menor de idade");
    }
    ```

    Saída:

    ```
    Maior de idade
    ```

    ### Exemplo 2 — Repetição com while

    ```java
    int contador = 1;

    while (contador <= 3) {
        IO.println(contador);
        contador++;
    }
    ```

    Saída:

    ```
    1
    2
    3
    ```

    ### Exemplo 3 — Repetição com for

    ```java
    for (int i = 1; i <= 3; i++) {
        IO.println(i);
    }
    ```

    Saída:

    ```
    1
    2
    3
    ```

    ### Exemplo 4 — Interrompendo com break

    ```java
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            break;
        }
        IO.println(i);
    }
    ```

    Saída:

    ```
    1
    2
    ```

    ### Exemplo 5 — Pulando com continue

    ```java
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            continue;
        }
        IO.println(i);
    }
    ```

    Saída:

    ```
    1
    2
    4
    5
    ```

    ## 🔎 Explicação do código

    ### 1. Decisão ou repetição?

    - Use uma estrutura condicional quando o programa precisa escolher entre caminhos.
    - Use um laço quando o programa precisa repetir instruções.

    ### 2. Diferença entre while e do-while

    Imagine uma condição que já começa falsa:

    - No `while`, o bloco não é executado.
    - No `do-while`, o bloco é executado uma vez antes da verificação.

    ### 3. Diferença entre for e for aprimorado

    O `for` tradicional oferece controle explícito sobre índice, condição e incremento. O `for` aprimorado percorre diretamente os elementos, sendo conveniente quando o índice não é necessário.

    ### 4. Diferença entre break e continue

    - `break`: encerra a estrutura de repetição.
    - `continue`: não encerra o laço; apenas pula o restante da iteração atual.

    ### 5. Diferença entre return e yield

    - `return`: encerra o método e devolve o controle ao chamador.
    - `yield`: fornece um resultado à expressão `switch` que está sendo avaliada.

    ### 6. Analogia — Lei de Feynman

    Imagine um programa como uma sequência de instruções de trabalho:

    - **if/else:** escolher qual caminho seguir.
    - **while/for:** repetir uma tarefa.
    - **break:** parar a repetição.
    - **continue:** pular a etapa atual e seguir para a próxima.
    - **return:** terminar a tarefa atual e voltar para quem a solicitou.
    - **yield:** entregar um resultado produzido por uma alternativa de uma expressão `switch`.

    ## ⚠️ Pontos de atenção

    - A condição de `if`, `while` e `do-while` deve produzir um valor booleano.
    - Omitir chaves em um `if` com apenas uma instrução pode tornar futuras alterações mais propensas a erros.
    - Em uma sequência `if / else if`, as condições posteriores deixam de ser avaliadas após a primeira condição verdadeira.
    - Um laço precisa de uma condição ou de uma instrução de saída para não continuar indefinidamente.
    - No `while`, a condição é verificada antes; no `do-while`, depois.
    - No `for`, a inicialização acontece uma vez e o incremento ocorre após cada iteração.
    - A variável declarada na inicialização do `for` tem escopo limitado ao laço.
    - O `for` aprimorado é indicado quando basta percorrer os elementos, sem controlar manualmente o índice.
    - `break` e `continue` sem rótulo atuam sobre a estrutura de repetição mais interna.
    - Rótulos em `break` e `continue` permitem direcionar o controle a um laço externo.
    - `return` deve respeitar o tipo de retorno declarado pelo método.
    - `yield` pertence ao contexto de expressões `switch` e precisa fornecer um valor.

    ## 📝 Resumo

    As instruções de fluxo de controle determinam o caminho e a repetição da execução de um programa. As condicionais `if` e `if-else` permitem tomar decisões. Os laços `while`, `do-while` e `for` repetem blocos de instruções de maneiras diferentes, enquanto o `for` aprimorado facilita percorrer arrays e coleções.

    As instruções de ramificação controlam a continuidade da execução: `break` encerra uma estrutura, `continue` pula a iteração atual, `return` encerra um método e `yield` fornece um valor à expressão `switch`.

    **Ideia central:** o fluxo de controle define quando executar, repetir, interromper ou retornar de uma parte do programa.

    ## 🏋️ Exercícios

    Resolva sem consultar as respostas. Explique seu raciocínio antes de executar os códigos no IntelliJ.

    ### Exercício 1 — if-else

    Crie uma variável inteira chamada `idade`. Utilize `if-else` para imprimir se a pessoa é maior ou menor de idade.

    ### Exercício 2 — else if

    Crie uma variável `nota` e monte uma sequência de condições que classifique o resultado em A, B, C, D ou F, seguindo os limites apresentados no exemplo da lição.

    Teste com os valores 95, 82, 76, 65 e 40.

    ### Exercício 3 — while

    Utilize `while` para imprimir os números de 1 a 10.

    ### Exercício 4 — do-while

    Reescreva o exercício anterior utilizando `do-while`. Depois, inicie o contador com um valor que torne a condição falsa logo na primeira verificação.

    O que acontece? Explique a diferença em relação ao `while`.

    ### Exercício 5 — for

    Utilize um laço `for` para imprimir os números pares de 2 a 20.

    ### Exercício 6 — for aprimorado

    Crie um array de cinco números inteiros e percorra seus elementos com `for` aprimorado, imprimindo cada valor.

    ### Exercício 7 — break

    Percorra os números de 1 a 10. Quando o contador chegar a 6, encerre o laço com `break`.

    Quais números serão exibidos?

    ### Exercício 8 — continue

    Percorra os números de 1 a 10 e utilize `continue` para não imprimir o número 5.

    ### Exercício 9 — break e laços aninhados

    Crie dois laços `for`, um dentro do outro. Utilize um rótulo e `break` para encerrar o laço externo quando uma condição for satisfeita.

    Explique por que um `break` sem rótulo não teria o mesmo efeito.

    ### Exercício 10 — return

    Crie um método que receba um número inteiro e retorne o dobro desse número. Chame o método e imprima o resultado.

    ### Exercício 11 — Lei de Feynman

    Explique, com suas próprias palavras:

    1. Qual é a diferença entre `while` e `do-while`?
    2. Qual é a diferença entre `break` e `continue`?
    3. Quando o `for` aprimorado é uma boa escolha?
    4. Qual é a diferença entre `return` e `yield`?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. Para que serve a instrução `if`?
    2. Qual é a função do `else`?
    3. O que acontece com as condições restantes após uma condição verdadeira em uma sequência `else if`?
    4. Quando as chaves de um `if` podem ser omitidas e por que isso pode ser arriscado?
    5. Quando a condição do `while` é avaliada?
    6. Por que o bloco de `do-while` sempre é executado pelo menos uma vez?
    7. Quais são as três expressões do `for` tradicional?
    8. Quando a inicialização do `for` é executada?
    9. Qual é a finalidade do `for` aprimorado?
    10. O que acontece quando um `break` sem rótulo é executado?
    11. Qual é a diferença entre `break` e `continue`?
    12. Para que servem os rótulos em `break` e `continue`?
    13. O que a instrução `return` faz?
    14. Em que contexto a instrução `yield` é utilizada?
    15. Qual é a diferença entre `return` e `yield`?

    ## ✅ Checklist

    - [ ]  Entendi como funciona a instrução `if`.
    - [ ]  Consigo utilizar `if-else` e `else if`.
    - [ ]  Entendi por que é recomendado manter as chaves.
    - [ ]  Sei explicar quando utilizar `while`.
    - [ ]  Sei explicar quando utilizar `do-while`.
    - [ ]  Consigo montar um laço `for` com inicialização, condição e incremento.
    - [ ]  Entendi o escopo da variável declarada no `for`.
    - [ ]  Sei percorrer arrays com `for` aprimorado.
    - [ ]  Entendi como `break` encerra um laço.
    - [ ]  Entendi como `continue` pula uma iteração.
    - [ ]  Sei reconhecer o uso de rótulos em laços aninhados.
    - [ ]  Entendi como `return` encerra um método.
    - [ ]  Entendi como `yield` fornece um valor a uma expressão `switch`.
    - [ ]  Consigo explicar as diferenças entre as estruturas sem consultar as anotações.

    ---

    **Referência:** Dev.java — Control Flow Statements.

    **Última atualização informada pela fonte:** 22 de setembro de 2021.
         */
    }
}
