public class AutoboxingeUnboxing_notion {
    public static void main(String[] args) {
        /*
        - **Autoboxing e Unboxing**

    ## 🎯 Objetivo

    Compreender como o compilador Java converte automaticamente tipos primitivos em suas respectivas classes wrapper (autoboxing) e como realiza a conversão inversa, de objetos wrapper para valores primitivos (unboxing).

    ## 📚 Conceitos

    ### 1. O que são Autoboxing e Unboxing?

    Em Java, cada tipo primitivo possui uma classe wrapper correspondente. Essas classes permitem representar valores primitivos como objetos.

    - **Autoboxing:** conversão automática de um tipo primitivo para o objeto da classe wrapper correspondente.
    - **Unboxing:** conversão automática de um objeto wrapper para o valor do tipo primitivo correspondente.

    Exemplo da fonte:

    ```java
    Character ch = 'a';
    ```

    Nesse caso, o caractere primitivo `'a'` é convertido automaticamente em um objeto `Character`.

    ### 2. Autoboxing em coleções

    A fonte apresenta uma lista de inteiros:

    ```java
    List<Integer> ints = new ArrayList<>();

    for (int i = 1; i < 50; i += 2)
        ints.add(i);
    ```

    A lista foi declarada como `List<Integer>`, portanto armazena objetos `Integer`. Mesmo assim, o código adiciona valores do tipo primitivo `int`.

    Isso funciona porque o compilador realiza o autoboxing. Conceitualmente, o trecho:

    ```java
    ints.add(i);
    ```

    é convertido para:

    ```java
    ints.add(Integer.valueOf(i));
    ```

    O método `Integer.valueOf()` produz o objeto wrapper que será adicionado à lista.

    **Quando o compilador aplica autoboxing?**

    Segundo a fonte, quando um valor primitivo é:

    - Passado como argumento para um método que espera o objeto da classe wrapper correspondente.
    - Atribuído a uma variável da classe wrapper correspondente.

    ### 3. Unboxing em operações

    A fonte apresenta o método `sumEven()`, que recebe uma lista de objetos `Integer` e soma os valores pares:

    ```java
    public static int sumEven(List<Integer> ints) {
        int sum = 0;

        for (Integer i : ints) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
    ```

    Embora a variável `i` seja do tipo `Integer`, o código utiliza operadores aritméticos.

    Isso é possível porque o compilador realiza o unboxing. Conceitualmente, as operações são convertidas para chamadas ao método `intValue()`:

    ```java
    public static int sumEven(List<Integer> ints) {
        int sum = 0;

        for (Integer i : ints) {
            if (i.intValue() % 2 == 0) {
                sum += i.intValue();
            }
        }

        return sum;
    }
    ```

    O método `intValue()` retorna o valor primitivo `int` armazenado no objeto `Integer`.

    **Quando o compilador aplica unboxing?**

    Segundo a fonte, quando um objeto wrapper é:

    - Passado como argumento para um método que espera o tipo primitivo correspondente.
    - Atribuído a uma variável do tipo primitivo correspondente.

    ### 4. Exemplo completo de Unboxing

    Código apresentado pela fonte:

    ```java
    import java.util.ArrayList;
    import java.util.List;

    public class Unboxing {

        public static void main(String[] args) {
            Integer i = Integer.valueOf(-8);

            // 1. Unboxing through method invocation
            int absVal = absoluteValue(i);
            IO.println("absolute value of " + i + " = " + absVal);

            List<Double> doubles = new ArrayList<>();
            doubles.add(3.1416); // Autoboxing through method invocation.

            // 2. Unboxing through assignment
            double pi = doubles.get(0);
            IO.println("pi = " + pi);
        }

        public static int absoluteValue(int i) {
            return (i < 0) ? -i : i;
        }
    }
    ```

    Saída apresentada pela fonte:

    ```
    absolute value of -8 = 8
    pi = 3.1416
    ```

    **Entendendo o exemplo:**

    1. `Integer.valueOf(-8)` cria um objeto `Integer`.
    2. O objeto `i` é passado para `absoluteValue()`, que espera um `int`. O compilador realiza unboxing para fornecer o valor primitivo.
    3. `doubles.add(3.1416)` adiciona um valor `double` a uma lista de `Double`. O compilador realiza autoboxing.
    4. `doubles.get(0)` retorna um objeto `Double`. Ao atribuí-lo à variável primitiva `double pi`, ocorre unboxing.

    ### 5. Tipos primitivos e suas classes wrapper

    A tabela da fonte relaciona os oito tipos primitivos às suas classes wrapper correspondentes:

    | Tipo primitivo | Classe wrapper |
    | --- | --- |
    | `boolean` | `Boolean` |
    | `byte` | `Byte` |
    | `char` | `Character` |
    | `float` | `Float` |
    | `int` | `Integer` |
    | `long` | `Long` |
    | `short` | `Short` |
    | `double` | `Double` |

    Atenção: os nomes das classes wrapper são escritos com inicial maiúscula e não são iguais aos nomes dos tipos primitivos.

    ## 🧠 O que memorizar

    - Autoboxing é a conversão automática de um tipo primitivo para sua classe wrapper.
    - Unboxing é a conversão automática de um objeto wrapper para o tipo primitivo correspondente.
    - `int` corresponde a `Integer`.
    - `double` corresponde a `Double`.
    - `char` corresponde a `Character`.
    - `boolean` corresponde a `Boolean`.
    - O compilador realiza autoboxing em atribuições e chamadas de métodos que esperam o wrapper.
    - O compilador realiza unboxing em atribuições e chamadas de métodos que esperam o tipo primitivo.
    - `Integer.valueOf()` é utilizado no exemplo para obter um objeto Integer.
    - `intValue()` retorna o valor primitivo de um objeto Integer.
    - Autoboxing e unboxing tornam o código mais limpo e fácil de ler.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Autoboxing por atribuição

    ```java
    int numero = 10;
    Integer objeto = numero;

    IO.println(objeto);
    ```

    ### Exemplo 2 — Unboxing por atribuição

    ```java
    Integer objeto = Integer.valueOf(20);
    int numero = objeto;

    IO.println(numero);
    ```

    ### Exemplo 3 — Autoboxing em uma chamada de método

    ```java
    import java.util.ArrayList;
    import java.util.List;

    public class ExemploAutoboxing {
        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();

            int valor = 15;
            numeros.add(valor);

            IO.println(numeros);
        }
    }
    ```

    ### Exemplo 4 — Unboxing em uma chamada de método

    ```java
    public class ExemploUnboxing {
        public static void main(String[] args) {
            Integer valor = Integer.valueOf(30);

            mostrarNumero(valor);
        }

        public static void mostrarNumero(int numero) {
            IO.println(numero);
        }
    }
    ```

    **Nota:** os exemplos 1 a 4 são complementos didáticos para praticar as conversões descritas na fonte.

    ## 🔎 Explicação do código

    ### 1. Autoboxing

    Imagine que você tem um valor `int`, mas precisa armazená-lo em uma variável `Integer`. O compilador faz a conversão automaticamente.

    ```java
    int idade = 23;
    Integer idadeObjeto = idade;
    ```

    O valor primitivo é colocado em um objeto wrapper. Essa conversão é chamada de autoboxing.

    ### 2. Unboxing

    Agora imagine o caminho inverso: você tem um objeto `Integer`, mas precisa utilizar o valor em uma variável `int`.

    ```java
    Integer idadeObjeto = Integer.valueOf(23);
    int idade = idadeObjeto;
    ```

    O compilador obtém o valor primitivo do objeto. Essa conversão é chamada de unboxing.

    ### 3. Por que isso é útil em coleções?

    No exemplo da fonte, a lista é do tipo `List<Integer>`, ou seja, trabalha com objetos Integer. O autoboxing permite adicionar valores `int` sem escrever manualmente `Integer.valueOf()` em cada operação.

    ### 4. Lei de Feynman

    Explique sem consultar o material:

    - O que acontece quando um `int` é atribuído a uma variável `Integer`?
    - O que acontece quando um `Integer` é atribuído a uma variável `int`?
    - Por que uma lista `List<Integer>` aceita a adição de um valor `int`?
    - Qual é a função de `intValue()`?
    - Qual é a diferença entre `Double` e `double`?

    ## ⚠️ Pontos de atenção

    - Não confunda o tipo primitivo com sua classe wrapper: `int` e `Integer` são tipos diferentes.
    - Autoboxing converte do primitivo para o wrapper.
    - Unboxing converte do wrapper para o primitivo.
    - Uma coleção declarada como `List<Integer>` armazena objetos Integer, não valores primitivos int.
    - O compilador pode inserir chamadas como `Integer.valueOf()` e `intValue()` para realizar as conversões.
    - A conversão automática não muda a declaração original da variável: uma variável `Integer` continua sendo wrapper, e uma variável `int` continua sendo primitiva.

    ## 📝 Resumo

    Autoboxing e unboxing são conversões automáticas realizadas pelo compilador Java entre tipos primitivos e suas respectivas classes wrapper.

    - **Autoboxing:** primitivo → wrapper. Exemplo: `int` → `Integer`.
    - **Unboxing:** wrapper → primitivo. Exemplo: `Integer` → `int`.

    Essas conversões permitem utilizar valores primitivos em contextos que trabalham com objetos e utilizar objetos wrapper em contextos que esperam valores primitivos, deixando o código mais simples e legível.

    ## 🏋️ Exercícios

    Resolva no IntelliJ. Antes de executar, identifique quais conversões devem ocorrer. Não consulte soluções prontas.

    ### Exercício 1 — Autoboxing básico

    Declare uma variável do tipo `int` e atribua seu valor a uma variável `Integer`. Imprima a variável wrapper.

    ### Exercício 2 — Unboxing básico

    Crie um objeto `Integer` com `Integer.valueOf()`. Atribua seu valor a uma variável `int` e imprima o resultado.

    ### Exercício 3 — Identificando a conversão

    Observe as atribuições abaixo e identifique em qual ocorre autoboxing e em qual ocorre unboxing:

    ```java
    int a = 12;
    Integer b = a;
    int c = b;
    ```

    ### Exercício 4 — Lista de inteiros

    Crie uma lista `List<Integer>`. Adicione cinco valores primitivos `int` usando `add()`. Depois, percorra a lista e imprima os valores.

    ### Exercício 5 — Método que recebe primitivo

    Crie um método que receba um parâmetro `int`. No método `main`, crie um objeto `Integer` e passe-o como argumento. Identifique a conversão realizada.

    ### Exercício 6 — Método que recebe wrapper

    Crie um método que receba um parâmetro `Double`. Passe um valor primitivo `double` como argumento e observe a conversão realizada.

    ### Exercício 7 — Somando números

    Crie uma lista `List<Integer>` com números inteiros. Percorra a lista e calcule a soma dos valores. Identifique onde ocorre unboxing.

    ### Exercício 8 — Tabela de correspondência

    Escreva os oito tipos primitivos e suas respectivas classes wrapper sem consultar a tabela da aula.

    ### Exercício 9 — Análise do exemplo da fonte

    Explique por que o código abaixo compila, mesmo que a lista armazene objetos Integer:

    ```java
    List<Integer> numeros = new ArrayList<>();
    int valor = 10;
    numeros.add(valor);
    ```

    ### Exercício 10 — Lei de Feynman

    Explique com suas próprias palavras:

    1. O que é autoboxing?
    2. O que é unboxing?
    3. Qual é a diferença entre int e Integer?
    4. Por que essas conversões são úteis?
    5. Como o compilador realiza essas conversões nos exemplos apresentados?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. O que é autoboxing?
    2. O que é unboxing?
    3. Qual é a classe wrapper de `int`?
    4. Qual é a classe wrapper de `double`?
    5. Qual é a classe wrapper de `char`?
    6. Qual é a classe wrapper de `boolean`?
    7. O que acontece ao atribuir um `int` a uma variável `Integer`?
    8. O que acontece ao atribuir um `Integer` a uma variável `int`?
    9. Por que uma lista `List<Integer>` aceita valores `int`?
    10. Qual método aparece no exemplo para obter um objeto Integer a partir de um int?
    11. Qual método retorna o valor primitivo de um objeto Integer?
    12. Em quais situações o compilador aplica autoboxing?
    13. Em quais situações o compilador aplica unboxing?
    14. Qual é a vantagem de utilizar essas conversões automáticas?

    ## ✅ Checklist

    - [ ]  Entendi o que é autoboxing.
    - [ ]  Entendi o que é unboxing.
    - [ ]  Sei diferenciar tipos primitivos e classes wrapper.
    - [ ]  Conheço as oito correspondências entre primitivos e wrappers.
    - [ ]  Sei identificar autoboxing em uma atribuição.
    - [ ]  Sei identificar unboxing em uma atribuição.
    - [ ]  Entendi como o autoboxing funciona em uma lista de Integer.
    - [ ]  Entendi como o unboxing funciona em operações aritméticas.
    - [ ]  Reconheço o uso de Integer.valueOf().
    - [ ]  Reconheço o uso de intValue().
    - [ ]  Consigo explicar os conceitos sem consultar as anotações.
    - [ ]  Resolvi os exercícios propostos.

    ---

    **Referência:** Oracle Learn Java — Autoboxing e Unboxing.

    **Última atualização informada pela fonte:** 14 de setembro de 2021.
         */
    }
}
