public class Operadores_noiton {
    public static void main(String[] args) {
        /*
        - **Utilizando operadores em seus programas**

    ## 🎯 Objetivo

    Compreender o que são operadores em Java, conhecer os principais tipos de operadores, entender como funcionam a precedência e a associatividade e identificar como utilizá-los em expressões e condições.

    ---

    ## 📚 Conceitos

    ### 1. O que são operadores?

    Operadores são símbolos especiais que executam operações sobre um, dois ou três operandos e retornam um resultado.

    - **Operador unário:** trabalha com um operando.
    - **Operador binário:** trabalha com dois operandos.
    - **Operador ternário:** trabalha com três operandos.

    Exemplos:

    ```java
    int resultado = 10 + 5;
    ```

    Nesse caso, `+` é o operador e `10` e `5` são os operandos.

    ### 2. Precedência dos operadores

    A precedência determina a ordem em que os operadores são avaliados em uma expressão. Operadores que aparecem em níveis superiores da tabela têm maior precedência e são avaliados antes dos que aparecem abaixo.

    | Nível | Categoria | Operadores |
    | --- | --- | --- |
    | 1 | Sufixo | `expr++` `expr--` |
    | 2 | Unário | `++expr` `--expr` `+expr` `-expr` `~` `!` |
    | 3 | Multiplicativo | `*` `/` `%` |
    | 4 | Aditivo | `+` `-` |
    | 5 | Deslocamento | `<<` `>>` `>>>` |
    | 6 | Relacional | `<` `>` `<=` `>=` `instanceof` |
    | 7 | Igualdade | `==` `!=` |
    | 8 | AND bit a bit | `&` |
    | 9 | OU exclusivo bit a bit | `^` |
    | 10 | OU bit a bit inclusivo | ` |
    | 11 | E lógico | `&&` |
    | 12 | OU lógico | ` |
    | 13 | Ternário | `? :` |
    | 14 | Atribuição | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` ` |

    **Associatividade:** quando operadores binários de mesma precedência aparecem na mesma expressão, a maioria é avaliada da esquerda para a direita. Os operadores de atribuição são avaliados da direita para a esquerda.

    ### 3. Operador de atribuição simples

    O operador `=` atribui ao operando à esquerda o valor da expressão à direita.

    ```java
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    ```

    Ele também pode ser utilizado com objetos para atribuir referências de objetos.

    ### 4. Operadores aritméticos

    Os operadores aritméticos realizam operações matemáticas:

    | Operador | Descrição |
    | --- | --- |
    | `+` | Adição; também pode concatenar Strings |
    | `-` | Subtração |
    | `*` | Multiplicação |
    | `/` | Divisão |
    | `%` | Resto da divisão |

    O operador `%` retorna o resto de uma divisão. Por exemplo, `10 % 7` resulta em `3`.

    #### Atribuições compostas

    É possível combinar uma operação aritmética com atribuição:

    ```java
    x += 1;
    ```

    Essa instrução equivale, neste exemplo, a:

    ```java
    x = x + 1;
    ```

    Ambas aumentam o valor de `x` em 1.

    #### Concatenação de Strings

    O operador `+` também une textos:

    ```java
    class ConcatDemo {
        public static void main(String[] args) {
            String firstString = "This is";
            String secondString = " a concatenated string.";
            String thirdString = firstString + secondString;
            IO.println(thirdString);
        }
    }
    ```

    Saída:

    ```
    This is a concatenated string.
    ```

    ### 5. Operadores unários

    Operadores unários precisam de apenas um operando.

    | Operador | Descrição |
    | --- | --- |
    | `+` | Indica valor positivo |
    | `-` | Nega uma expressão |
    | `++` | Incrementa o valor em 1 |
    | `--` | Decrementa o valor em 1 |
    | `!` | Inverte um valor booleano |

    Exemplo:

    ```java
    class UnaryDemo {
        public static void main(String[] args) {
            int result = +1;
            IO.println(result);

            result--;
            IO.println(result);

            result++;
            IO.println(result);

            result = -result;
            IO.println(result);

            boolean success = false;
            IO.println(success);
            IO.println(!success);
        }
    }
    ```

    #### Incremento prefixado e pós-fixado

    Os operadores `++` e `--` podem aparecer antes ou depois da variável.

    - **Prefixo:** `++result` incrementa primeiro e a expressão utiliza o valor atualizado.
    - **Pós-fixo:** `result++` utiliza o valor atual na expressão e depois incrementa a variável.

    Exemplo:

    ```java
    class PrePostDemo {
        public static void main(String[] args) {
            int i = 3;

            i++;
            IO.println(i);   // 4

            ++i;
            IO.println(i);   // 5

            IO.println(++i); // 6
            IO.println(i++); // 6
            IO.println(i);   // 7
        }
    }
    ```

    Quando o incremento ou decremento é utilizado sozinho, a diferença entre prefixo e pós-fixo não altera o resultado final da variável. Em expressões maiores, a diferença importa.

    ### 6. Operadores de igualdade e relacionais

    Esses operadores comparam dois valores e produzem um resultado booleano (`true` ou `false`).

    | Operador | Significado |
    | --- | --- |
    | `==` | Igual a |
    | `!=` | Diferente de |
    | `>` | Maior que |
    | `>=` | Maior ou igual a |
    | `<` | Menor que |
    | `<=` | Menor ou igual a |

    **Atenção:** para comparar igualdade, utilize `==`. O operador `=` é de atribuição.

    Exemplo:

    ```java
    class ComparisonDemo {
        public static void main(String[] args) {
            int value1 = 1;
            int value2 = 2;

            if (value1 == value2)
                IO.println("value1 == value2");

            if (value1 != value2)
                IO.println("value1 != value2");

            if (value1 > value2)
                IO.println("value1 > value2");

            if (value1 < value2)
                IO.println("value1 < value2");

            if (value1 <= value2)
                IO.println("value1 <= value2");
        }
    }
    ```

    Saída:

    ```
    value1 != value2
    value1 < value2
    value1 <= value2
    ```

    ### 7. Operadores condicionais lógicos

    Os operadores `&&` e `||` trabalham com expressões booleanas.

    | Operador | Significado |
    | --- | --- |
    | `&&` | E lógico condicional: verdadeiro quando as duas condições são verdadeiras |
    | ` |  |

    Eles utilizam avaliação de curto-circuito: o segundo operando só é avaliado quando necessário para determinar o resultado.

    Exemplo:

    ```java
    class ConditionalDemo1 {
        public static void main(String[] args) {
            int value1 = 1;
            int value2 = 2;

            if ((value1 == 1) && (value2 == 2))
                IO.println("value1 is 1 AND value2 is 2");

            if ((value1 == 1) || (value2 == 1))
                IO.println("value1 is 1 OR value2 is 1");
        }
    }
    ```

    ### 8. Operador ternário `? :`

    O operador ternário utiliza três operandos e funciona como uma forma compacta de escolher entre dois valores, conforme uma condição.

    Formato:

    ```java
    condicao ? valorSeVerdadeiro : valorSeFalso;
    ```

    Exemplo:

    ```java
    class ConditionalDemo2 {
        public static void main(String[] args) {
            int value1 = 1;
            int value2 = 2;
            int result;
            boolean someCondition = true;

            result = someCondition ? value1 : value2;

            IO.println(result);
        }
    }
    ```

    Como `someCondition` é verdadeira, o programa imprime `1`.

    Utilize o ternário no lugar de um `if-then-else` quando isso deixar o código mais legível, especialmente quando as expressões forem compactas e não tiverem efeitos colaterais, como atribuições.

    ### 9. Operador de comparação de tipos `instanceof`

    O operador `instanceof` verifica se um objeto é uma instância de um tipo especificado. Ele pode verificar a relação com uma classe, uma subclasse ou uma interface implementada.

    Exemplo:

    ```java
    class InstanceofDemo {
        public static void main(String[] args) {
            Parent obj1 = new Parent();
            Parent obj2 = new Child();

            IO.println("obj1 instanceof Parent: "
                + (obj1 instanceof Parent));
            IO.println("obj1 instanceof Child: "
                + (obj1 instanceof Child));
            IO.println("obj1 instanceof MyInterface: "
                + (obj1 instanceof MyInterface));
            IO.println("obj2 instanceof Parent: "
                + (obj2 instanceof Parent));
            IO.println("obj2 instanceof Child: "
                + (obj2 instanceof Child));
            IO.println("obj2 instanceof MyInterface: "
                + (obj2 instanceof MyInterface));
        }
    }

    class Parent {}
    class Child extends Parent implements MyInterface {}
    interface MyInterface {}
    ```

    Saída:

    ```
    obj1 instanceof Parent: true
    obj1 instanceof Child: false
    obj1 instanceof MyInterface: false
    obj2 instanceof Parent: true
    obj2 instanceof Child: true
    obj2 instanceof MyInterface: true
    ```

    **Importante:** `null` não é uma instância de nenhum tipo; portanto, uma expressão `null instanceof Tipo` resulta em `false`.

    ### 10. Operadores bit a bit e de deslocamento

    Esses operadores trabalham com os bits de valores inteiros. A lição os apresenta brevemente por serem menos comuns em programação de propósito geral.

    | Operador | Operação |
    | --- | --- |
    | `~` | Complemento bit a bit: inverte cada bit |
    | `<<` | Deslocamento à esquerda |
    | `>>` | Deslocamento à direita com sinal |
    | `>>>` | Deslocamento à direita sem sinal |
    | `&` | AND bit a bit |
    | `^` | OU exclusivo bit a bit |
    | ` | ` |
    - `~` transforma cada bit 0 em 1 e cada bit 1 em 0.
    - `<<` desloca os bits para a esquerda.
    - `>>` desloca os bits para a direita, preservando a extensão do sinal.
    - `>>>` desloca os bits para a direita preenchendo as posições mais à esquerda com zeros.
    - `&`, `^` e `|` realizam, respectivamente, AND, OU exclusivo e OR inclusivo bit a bit.

    Exemplo:

    ```java
    class BitDemo {
        public static void main(String[] args) {
            int bitmask = 0x000F;
            int val = 0x2222;

            // imprime "2"
            IO.println(val & bitmask);
        }
    }
    ```

    O operador `&` compara os bits correspondentes dos dois valores e o resultado desse exemplo é `2`.

    ---

    ## 🧠 O que memorizar

    - Operadores executam operações sobre um, dois ou três operandos.
    - A precedência define a ordem de avaliação dos operadores em uma expressão.
    - `=` atribui um valor; `==` compara igualdade.
    - `+`, `-`, `*`, `/` e `%` são operadores aritméticos.
    - `%` retorna o resto da divisão.
    - `+` também pode concatenar Strings.
    - `++` incrementa e `--` decrementa em uma unidade.
    - Prefixo utiliza o valor atualizado; pós-fixo utiliza o valor anterior na expressão.
    - Operadores relacionais e de igualdade produzem resultados booleanos.
    - `&&` e `||` usam avaliação de curto-circuito.
    - `? :` é o operador ternário.
    - `instanceof` verifica se um objeto é compatível com um tipo.
    - Operadores bit a bit trabalham diretamente com os bits de valores inteiros.

    ---

    ## 💻 Exemplos de código

    ### Exemplo 1 — Precedência e expressões

    ```java
    int resultado = 2 + 3 * 4;
    IO.println(resultado);
    ```

    O resultado é `14`, pois a multiplicação tem precedência maior que a adição.

    ### Exemplo 2 — Atribuição composta

    ```java
    int pontos = 10;
    pontos += 5;
    IO.println(pontos);
    ```

    Saída:

    ```
    15
    ```

    ### Exemplo 3 — Resto da divisão

    ```java
    int resto = 10 % 7;
    IO.println(resto);
    ```

    Saída:

    ```
    3
    ```

    ### Exemplo 4 — Prefixo e pós-fixo

    ```java
    int numero = 5;

    IO.println(++numero);
    IO.println(numero++);
    IO.println(numero);
    ```

    Saída:

    ```
    6
    6
    7
    ```

    ### Exemplo 5 — Comparação e condição lógica

    ```java
    int idade = 23;
    boolean temAcesso = idade >= 18 && idade < 60;

    IO.println(temAcesso);
    ```

    Saída:

    ```
    true
    ```

    ---

    ## 🔎 Explicação do código

    ### 1. Como a precedência afeta o resultado

    Em `2 + 3 * 4`, a multiplicação é realizada antes da adição. Primeiro temos `3 * 4 = 12`; depois, `2 + 12 = 14`.

    ### 2. A diferença entre atribuir e comparar

    - `pontos = 10`: atribui o valor 10 à variável.
    - `pontos == 10`: verifica se o valor da variável é igual a 10.

    São operações diferentes e não devem ser confundidas.

    ### 3. Como funciona o curto-circuito

    Em uma expressão com `&&`, se a primeira condição for falsa, o resultado já será falso e a segunda condição não precisará ser avaliada.

    Em uma expressão com `||`, se a primeira condição for verdadeira, o resultado já será verdadeiro e a segunda condição não precisará ser avaliada.

    ### 4. Como interpretar o ternário

    Em `condicao ? valor1 : valor2`, o Java verifica a condição. Se ela for verdadeira, o resultado da expressão será `valor1`; caso contrário, será `valor2`.

    ### 5. Como interpretar `instanceof`

    O operador verifica se o objeto referenciado pode ser considerado uma instância do tipo indicado. No exemplo, `obj2` referencia um objeto criado como `Child`, que também é um `Parent` e implementa `MyInterface`.

    ### 6. Como interpretar o AND bit a bit

    O operador `&` compara cada posição de bit dos dois operandos. Uma posição do resultado será 1 somente quando os dois bits correspondentes forem 1.

    ---

    ## ⚠️ Pontos de atenção

    - Não confunda `=` (atribuição) com `==` (comparação de igualdade).
    - A precedência pode mudar o resultado de uma expressão; use parênteses quando quiser deixar a intenção explícita.
    - O operador `%` retorna o resto da divisão, não o resultado da divisão.
    - O operador `+` pode realizar adição ou concatenação, dependendo dos operandos.
    - Prefixo e pós-fixo podem produzir resultados diferentes quando fazem parte de uma expressão.
    - `&&` e `||` realizam curto-circuito; não são a mesma coisa que `&` e `|`.
    - O operador ternário deve ser utilizado quando tornar a expressão mais legível.
    - `instanceof` retorna `false` quando o operando à esquerda é `null`.
    - Os operadores bit a bit são diferentes dos operadores lógicos condicionais.
    - A tabela de precedência é uma referência para compreender a avaliação de expressões.

    ---

    ## 📝 Resumo

    Operadores são símbolos que realizam operações sobre operandos e retornam resultados. Em Java, existem operadores de atribuição, aritméticos, unários, relacionais, de igualdade, lógicos condicionais, ternários, de comparação de tipos, bit a bit e de deslocamento.

    A precedência determina a ordem de avaliação das operações. Entre os operadores mais utilizados estão `=`, `+`, `-`, `*`, `/`, `%`, `++`, `--`, `==`, `!=`, `>`, `<`, `&&` e `||`.

    **Ideia central:** compreender os operadores permite construir expressões, realizar cálculos, comparar valores e controlar decisões em programas Java.

    ---

    ## 🏋️ Exercícios

    Resolva sem consultar os exemplos. Explique seu raciocínio antes de executar o código.

    ### Exercício 1 — Atribuição e aritmética

    Considere:

    ```java
    int numero = 12;
    numero += 5;
    numero *= 2;
    numero -= 4;
    ```

    1. Qual é o valor final de `numero`?
    2. O que cada operador composto realizou?

    ### Exercício 2 — Resto da divisão

    Sem executar primeiro, determine o resultado:

    1. `10 % 3`
    2. `15 % 5`
    3. `22 % 4`

    Explique o que o operador `%` retorna.

    ### Exercício 3 — Precedência

    Qual será o resultado de cada expressão?

    1. `2 + 3 * 4`
    2. `(2 + 3) * 4`
    3. `20 / 5 + 2`
    4. `18 - 4 * 3`

    Explique por que os resultados podem ser diferentes.

    ### Exercício 4 — Prefixo e pós-fixo

    Analise:

    ```java
    int valor = 4;

    IO.println(valor++);
    IO.println(++valor);
    IO.println(valor);
    ```

    Escreva a saída esperada e explique cada alteração.

    ### Exercício 5 — Operadores relacionais e lógicos

    Considere:

    ```java
    int idade = 23;
    boolean estudante = true;
    ```

    Escreva uma expressão que seja verdadeira quando a idade for maior ou igual a 18 e a pessoa for estudante.

    Depois, explique o papel de `>=` e `&&`.

    ### Exercício 6 — Operador ternário

    Crie uma expressão ternária que atribua a String `"Maior de idade"` quando uma variável `idade` for maior ou igual a 18 e `"Menor de idade"` caso contrário.

    ### Exercício 7 — `instanceof`

    Com base no exemplo da aula, explique por que um objeto de `Child` também pode ser reconhecido como uma instância de `Parent` e de `MyInterface`.

    ### Exercício 8 — Lei de Feynman

    Explique com suas próprias palavras, como se estivesse ensinando alguém que está começando em Java:

    **O que são operadores, qual é a diferença entre atribuição e comparação, e por que precisamos compreender a precedência?**

    ---

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. O que é um operador?
    2. Qual é a diferença entre operador unário, binário e ternário?
    3. O que significa precedência de operadores?
    4. Qual é a diferença entre `=` e `==`?
    5. Para que serve o operador `%`?
    6. Como o operador `+` pode ser utilizado com Strings?
    7. Qual é a diferença entre `++valor` e `valor++` em uma expressão?
    8. Quais operadores são utilizados para igualdade e comparação?
    9. Qual é a diferença entre `&&` e `||`?
    10. O que significa avaliação de curto-circuito?
    11. Como funciona o operador ternário `? :`?
    12. Para que serve `instanceof`?
    13. O que acontece quando `null` é utilizado com `instanceof`?
    14. Qual é a finalidade dos operadores bit a bit?
    15. Qual é a diferença entre `>>` e `>>>`?

    ---

    ## ✅ Checklist

    - [ ]  Entendi o que são operadores e operandos.
    - [ ]  Compreendi a tabela de precedência.
    - [ ]  Sei utilizar o operador de atribuição `=`.
    - [ ]  Sei realizar operações aritméticas.
    - [ ]  Entendi o funcionamento do operador de resto `%`.
    - [ ]  Sei utilizar atribuições compostas.
    - [ ]  Entendi a concatenação de Strings com `+`.
    - [ ]  Sei diferenciar operadores unários.
    - [ ]  Entendi incremento e decremento em prefixo e pós-fixo.
    - [ ]  Sei utilizar operadores relacionais e de igualdade.
    - [ ]  Sei diferenciar `=` e `==`.
    - [ ]  Entendi o curto-circuito de `&&` e `||`.
    - [ ]  Sei interpretar o operador ternário.
    - [ ]  Entendi a finalidade de `instanceof`.
    - [ ]  Reconheço os operadores bit a bit e de deslocamento.
    - [ ]  Resolvi os exercícios e revisei minhas respostas.
    - [ ]  Consigo explicar os principais operadores sem consultar as anotações.

    ---

    **Referência:** Dev.java — Using Operators in Your Programs.
         */
    }
}
