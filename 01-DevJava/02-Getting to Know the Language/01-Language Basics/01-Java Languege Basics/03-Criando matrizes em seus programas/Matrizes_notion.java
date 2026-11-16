public class Matrizes_notion {
    /* minha anotação notion
    - Criando matrizes em seus programas

    # 🎯 Objetivo

    Compreender como arrays (matrizes) funcionam em Java: como declarar, criar, inicializar, acessar, percorrer, medir, copiar e manipular seus elementos. Também aprender a trabalhar com arrays multidimensionais, inclusive arrays cujas linhas possuem tamanhos diferentes.

    Ao terminar esta aula, você deverá conseguir:

    - Explicar o que é um array e por que seu tamanho é fixo.
    - Declarar arrays de tipos primitivos e de referência.
    - Criar arrays com `new` ou com valores já informados.
    - Acessar elementos usando índices, lembrando que a contagem começa em zero.
    - Percorrer arrays com estruturas de repetição.
    - Utilizar a propriedade `length`.
    - Declarar e percorrer arrays multidimensionais.
    - Copiar arrays com `System.arraycopy()` e `Arrays.copyOfRange()`.
    - Reconhecer operações comuns da classe `Arrays`.

    **Fonte principal:** Dev.java — Creating Arrays in Your Programs
    **Última atualização indicada pela página:** 27 de agosto de 2022.

    ---

    # 📚 Conceitos

    ## 1. O que é um array?

    Um array é um objeto contêiner que armazena uma quantidade fixa de valores de um único tipo. Seu comprimento é definido no momento em que ele é criado e não pode ser alterado depois.

    Cada valor armazenado é chamado de **elemento**. Para acessar um elemento, utilizamos seu **índice numérico**.

    A contagem dos índices começa em zero:

    | Posição do elemento | Índice |
    | --- | --- |
    | 1º elemento | 0 |
    | 2º elemento | 1 |
    | 3º elemento | 2 |
    | 6º elemento | 5 |
    | 8º elemento | 7 |

    Portanto, em um array com 8 elementos, o primeiro está no índice `0` e o último no índice `7`.

    ## 2. Declarando uma variável que referencia um array

    A declaração informa ao compilador que a variável poderá armazenar uma referência para um array de determinado tipo.

    Sintaxe:

    ```java
    tipo[] nomeDoArray;
    ```

    Exemplo:

    ```java
    int[] anArray;
    ```

    A declaração possui dois componentes:

    - **Tipo do array:** `int[]`, indicando que os elementos serão inteiros.
    - **Nome:** `anArray`, identificador da variável.

    Os colchetes fazem parte da indicação do tipo. O tamanho do array não faz parte do tipo, por isso os colchetes ficam vazios na declaração.

    Declarar a variável não cria o array. A criação é uma etapa separada.

    É possível declarar arrays de outros tipos:

    ```java
    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;
    ```

    Também é possível escrever os colchetes depois do nome, mas essa forma não é recomendada pela convenção da linguagem:

    ```java
    // Forma não recomendada
    float anArrayOfFloats[];
    ```

    A convenção recomenda manter os colchetes junto ao tipo: `float[]`.

    ## 3. Criando, inicializando e acessando um array

    Uma forma de criar um array é utilizar o operador `new`. O exemplo abaixo cria espaço para 10 números inteiros e atribui a referência criada à variável `anArray`:

    ```java
    // Declara um array de inteiros
    int[] anArray;

    // Aloca espaço para 10 inteiros
    anArray = new int[10];
    ```

    Se a criação com `new` for omitida, a variável não terá um array criado para ela. Tentar acessar seus elementos sem uma referência válida provocará erro.

    Depois da criação, podemos atribuir valores a cada posição:

    ```java
    anArray[0] = 100; // inicializa o primeiro elemento
    anArray[1] = 200; // inicializa o segundo elemento
    anArray[2] = 300;
    ```

    O acesso é feito pelo nome do array seguido do índice entre colchetes:

    ```java
    IO.println("Elemento no índice 0: " + anArray[0]);
    IO.println("Elemento no índice 1: " + anArray[1]);
    IO.println("Elemento no índice 2: " + anArray[2]);
    ```

    ### Inicialização direta

    Também podemos criar e inicializar um array em uma única instrução:

    ```java
    int[] anArray = {
        100, 200, 300,
        400, 500, 600,
        700, 800, 900, 1000
    };
    ```

    Nesse formato, o comprimento é determinado pela quantidade de valores informados entre as chaves, separados por vírgulas.

    ## 4. Arrays multidimensionais

    Como um array é uma referência e pode armazenar referências, podemos criar arrays cujos elementos também são arrays. Eles são chamados de **arrays multidimensionais**.

    Para declarar um array bidimensional, usamos dois pares de colchetes:

    ```java
    String[][] names;
    ```

    Cada elemento precisa ser acessado usando a quantidade correspondente de índices. Em um array bidimensional, usamos dois índices: um para selecionar o array interno e outro para selecionar o elemento dentro dele.

    Em Java, um array multidimensional é um array cujos componentes são outros arrays. Isso é diferente de uma matriz bidimensional armazenada como uma única região contígua de memória, como pode ocorrer em C ou Fortran. Em Java, o array externo contém referências para os arrays internos.

    Uma consequência importante é que as linhas podem ter comprimentos diferentes. Esses arrays também são chamados de **irregulares** ou **jagged arrays**.

    Exemplo:

    ```java
    String[][] names = {
        {"Mr. ", "Mrs. ", "Ms. "},
        {"Smith", "Jones"}
    };

    // Mr. Smith
    IO.println(names[0][0] + names[1][0]);

    // Ms. Jones
    IO.println(names[0][2] + names[1][1]);
    ```

    Saída:

    ```
    Mr. Smith
    Ms. Jones
    ```

    ## 5. Utilizando o comprimento de um array

    Todo array possui a propriedade `length`, que informa quantos elementos ele contém.

    ```java
    IO.println(anArray.length);
    ```

    Essa propriedade é especialmente importante em arrays de arrays. Não devemos presumir que todas as linhas possuem o mesmo comprimento: devemos consultar `length` no array externo e também em cada array interno.

    Exemplo de método que percorre um array bidimensional:

    ```java
    void displayBidimensionalArray(String[][] strings) {
        for (int arrayIndex = 0; arrayIndex < strings.length; arrayIndex++) {
            for (int index = 0; index < strings[arrayIndex].length; index++) {
                IO.print(strings[arrayIndex][index] + " ");
            }
            IO.println();
        }
    }

    String[][] strings = {
        {"one"},
        {"Maria", "Jennifer", "Patricia"},
        {"James", "Michael"},
        {"Washington", "London", "Paris", "Berlin", "Tokyo"}
    };

    displayBidimensionalArray(strings);
    ```

    Saída:

    ```
    one
    Maria Jennifer Patricia
    James Michael
    Washington London Paris Berlin Tokyo
    ```

    Observe que cada linha tem um comprimento diferente. O laço interno utiliza `strings[arrayIndex].length` para respeitar o tamanho da linha atual.

    ## 6. Copiando arrays

    A classe `System` possui o método `arraycopy()`, que permite copiar elementos de um array para outro.

    Assinatura apresentada na documentação:

    ```java
    public static void arraycopy(
        Object src,
        int srcPos,
        Object dest,
        int destPos,
        int length
    )
    ```

    Significado dos parâmetros:

    - `src`: array de origem.
    - `srcPos`: posição inicial no array de origem.
    - `dest`: array de destino.
    - `destPos`: posição inicial no array de destino.
    - `length`: quantidade de elementos que serão copiados.

    Exemplo:

    ```java
    String[] copyFrom = {
        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
        "Doppio", "Espresso", "Frappuccino", "Freddo", "Lungo", "Macchiato",
        "Marocchino", "Ristretto"
    };

    String[] copyTo = new String[7];

    System.arraycopy(copyFrom, 2, copyTo, 0, 7);

    for (String coffee : copyTo) {
        IO.print(coffee + " ");
    }
    ```

    Saída:

    ```
    Cappuccino Corretto Cortado Doppio Espresso Frappuccino Freddo
    ```

    Nesse exemplo, a cópia começa no índice `2` do array de origem, começa no índice `0` do destino e copia 7 elementos.

    ## 7. Manipulando arrays com a classe Arrays

    A plataforma Java fornece a classe `Arrays`, que reúne métodos para operações comuns, como cópia, ordenação e pesquisa.

    ### 7.1 Arrays.copyOfRange()

    A documentação apresenta `Arrays.copyOfRange()` como alternativa para copiar um intervalo. Diferentemente de `System.arraycopy()`, não é necessário criar previamente o array de destino: o método retorna um novo array.

    ```java
    String[] copyFrom = {
        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
        "Doppio", "Espresso", "Frappuccino", "Freddo", "Lungo", "Macchiato",
        "Marocchino", "Ristretto"
    };

    String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);

    for (String coffee : copyTo) {
        IO.print(coffee + " ");
    }
    ```

    O segundo parâmetro é o índice inicial e está incluído na cópia. O terceiro parâmetro é o índice final e não está incluído. Portanto, o elemento que está no índice `9` — `Lungo` — não entra nesse intervalo.

    ### 7.2 Outros métodos da classe Arrays

    A documentação destaca estas operações:

    | Método | Finalidade |
    | --- | --- |
    | `binarySearch()` | Pesquisa um valor e retorna o índice em que ele está localizado. |
    | `equals()` | Compara dois arrays para verificar se são iguais. |
    | `fill()` | Preenche as posições de um array com um valor específico. |
    | `sort()` | Ordena os elementos em ordem crescente. |
    | `parallelSort()` | Realiza ordenação paralela; a documentação destaca o possível ganho em arrays grandes e sistemas com múltiplos processadores. |
    | `stream()` | Cria um stream cuja fonte é o array. |
    | `toString()` | Converte os elementos em uma representação textual separada por vírgulas e delimitada por colchetes. |

    ### 7.3 Utilizando stream()

    A documentação demonstra a criação de um stream a partir de um array e a impressão dos elementos:

    ```java
    String[] coffees = {
        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
        "Doppio", "Espresso", "Frappuccino", "Freddo", "Lungo", "Macchiato",
        "Marocchino", "Ristretto"
    };

    Arrays.stream(coffees)
          .map(coffee -> coffee + " ")
          .forEach(IO::print);
    ```

    Saída:

    ```
    Affogato Americano Cappuccino Corretto Cortado Doppio Espresso Frappuccino Freddo Lungo Macchiato Marocchino Ristretto
    ```

    A documentação direciona para a seção sobre Streams para aprofundar esse assunto.

    ### 7.4 Convertendo um array em String

    O método `toString()` converte os elementos do array em texto, separa-os por vírgulas e envolve o resultado com colchetes.

    ```java
    String[] coffees = {
        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
        "Doppio", "Espresso", "Frappuccino", "Freddo", "Lungo", "Macchiato",
        "Marocchino", "Ristretto"
    };

    var coffeesAsString = Arrays.toString(coffees);
    IO.println(coffeesAsString);
    ```

    Saída:

    ```
    [Affogato, Americano, Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappuccino, Freddo, Lungo, Macchiato, Marocchino, Ristretto]
    ```

    ## 8. Encerramento: variáveis e arrays

    A página encerra retomando a terminologia de variáveis do Java:

    - **Variáveis de instância:** campos não estáticos, exclusivos de cada instância de uma classe.
    - **Variáveis de classe:** campos declarados com `static`; existe uma única cópia da variável de classe, independentemente da quantidade de instâncias.
    - **Variáveis locais:** armazenam estado temporário dentro de um método.
    - **Parâmetros:** fornecem informações adicionais a um método. Parâmetros e variáveis locais são classificados como variáveis, não como campos.

    A página também relembra os oito tipos primitivos (`byte`, `short`, `int`, `long`, `float`, `double`, `boolean` e `char`), a classe `java.lang.String`, os valores padrão dos campos e o fato de que variáveis locais não recebem valor padrão automaticamente.

    Por fim, retoma a definição central: um literal é a representação no código-fonte de um valor fixo; um array é um objeto contêiner que armazena uma quantidade fixa de valores de um único tipo, e seu comprimento não muda após a criação.

    ---

    # 🧠 O que memorizar

    - Um array armazena valores de um único tipo.
    - O comprimento é fixado na criação.
    - Os índices começam em `0`.
    - `tipo[] nome` declara uma variável que pode referenciar um array; a declaração, sozinha, não cria o array.
    - `new tipo[tamanho]` cria um array com o tamanho indicado.
    - `array[indice]` acessa um elemento.
    - `length` informa o comprimento do array.
    - `tipo[][]` declara um array bidimensional.
    - Em Java, arrays multidimensionais são arrays cujos elementos são outros arrays; as linhas podem ter comprimentos diferentes.
    - `System.arraycopy()` copia elementos para um array de destino que já existe.
    - `Arrays.copyOfRange()` retorna um novo array e utiliza intervalo com índice inicial inclusivo e final exclusivo.
    - `Arrays` oferece métodos de pesquisa, comparação, preenchimento, ordenação, streams e conversão para texto.

    ---

    # 💻 Exemplos práticos da documentação

    Os exemplos abaixo fazem parte da seção de prática da própria página Dev.java.

    ## 1. Criando e preenchendo um array

    ```java
    int[] numbers = {10, 20, 30, 40, 50};

    IO.println("Array elements:");
    for (int i = 0; i < numbers.length; i++) {
        IO.println("Element at index " + i + ": " + numbers[i]);
    }
    ```

    Saída:

    ```
    Array elements:
    Element at index 0: 10
    Element at index 1: 20
    Element at index 2: 30
    Element at index 3: 40
    Element at index 4: 50
    ```

    ## 2. Percorrendo com for-each

    O padrão `for-each` permite visitar os elementos sem controlar manualmente o índice:

    ```java
    int[] scores = {95, 87, 92, 78, 85};

    IO.println("Test scores using enhanced for loop:");
    for (int score : scores) {
        IO.println("Score: " + score);
    }
    ```

    Saída:

    ```
    Test scores using enhanced for loop:
    Score: 95
    Score: 87
    Score: 92
    Score: 78
    Score: 85
    ```

    ## 3. Array de double

    ```java
    double[] temperatures = {20.5, 25.0, 18.3, 30.2};

    IO.println("Temperatures:");
    for (double temp : temperatures) {
        IO.println(temp + "°C");
    }
    ```

    Saída:

    ```
    Temperatures:
    20.5°C
    25.0°C
    18.3°C
    30.2°C
    ```

    ## 4. Array de referências String

    ```java
    String[] coffees = {
        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado"
    };

    for (var coffee : coffees) {
        IO.println("Duke likes " + coffee);
    }
    ```

    Saída:

    ```
    Duke likes Affogato
    Duke likes Americano
    Duke likes Cappuccino
    Duke likes Corretto
    Duke likes Cortado
    ```

    ## 5. Array bidimensional de inteiros

    ```java
    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    IO.println("3x3 Matrix:");
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            IO.print(matrix[i][j] + " ");
        }
        IO.println(); // Nova linha depois de cada linha da matriz
    }
    ```

    Saída:

    ```
    3x3 Matrix:
    1 2 3
    4 5 6
    7 8 9
    ```

    ## 6. Array bidimensional de referências

    ```java
    String[][] schedule = {
        {"Math", "Science", "English"},
        {"History", "Art", "PE"},
        {"Music", "Computer", "Study Hall"}
    };

    IO.println("");
    IO.println("Class Schedule:");

    String[] periods = {"Period 1", "Period 2", "Period 3"};

    for (int day = 0; day < schedule.length; day++) {
        IO.println("Day " + (day + 1) + ":");
        for (int period = 0; period < schedule[day].length; period++) {
            IO.println("  " + periods[period] + ": " + schedule[day][period]);
        }
    }
    ```

    Saída:

    ```
    Class Schedule:
    Day 1:
      Period 1: Math
      Period 2: Science
      Period 3: English
    Day 2:
      Period 1: History
      Period 2: Art
      Period 3: PE
    Day 3:
      Period 1: Music
      Period 2: Computer
      Period 3: Study Hall
    ```

    ## 7. Realizando cálculos com arrays

    O exemplo calcula soma, média, maior e menor valor:

    ```java
    // Você pode alterar o conteúdo deste array
    int[] values = {12, 8, 15, 3, 9, 21};

    int sum = 0;
    int max = values[0];
    int min = values[0];

    // Calcula soma, máximo e mínimo
    for (int value : values) {
        sum += value;
        if (value > max) max = value;
        if (value < min) min = value;
    }

    double average = (double) sum / values.length;

    IO.println("Array: " + Arrays.toString(values));
    IO.println("Sum: " + sum);
    IO.println("Average: " + average);
    IO.println("Maximum: " + max);
    IO.println("Minimum: " + min);
    ```

    Saída com os valores originais:

    ```
    Array: [12, 8, 15, 3, 9, 21]
    Sum: 68
    Average: 11.333333333333334
    Maximum: 21
    Minimum: 3
    ```

    ## 8. Copiando manualmente

    ```java
    int[] original = {1, 2, 3, 4, 5};
    int[] copy = new int[original.length];

    // Cópia manual
    for (int i = 0; i < original.length; i++) {
        copy[i] = original[i];
    }

    IO.println("Original: " + Arrays.toString(original));
    IO.println("Copy: " + Arrays.toString(copy));

    // Alterar a cópia não altera o array original
    copy[0] = 999;
    copy[4] = 777;

    IO.println("");
    IO.println("After modifying the copy:");
    IO.println("Original: " + Arrays.toString(original));
    IO.println("Copy: " + Arrays.toString(copy));
    ```

    Saída:

    ```
    Original: [1, 2, 3, 4, 5]
    Copy: [1, 2, 3, 4, 5]

    After modifying the copy:
    Original: [1, 2, 3, 4, 5]
    Copy: [999, 2, 3, 4, 777]
    ```

    ## 9. Copiando com System.arraycopy()

    Nesse caso, o array de destino é criado manualmente:

    ```java
    int[] source = {10, 20, 30, 40, 50};
    int[] destination = new int[5];

    System.arraycopy(source, 0, destination, 0, source.length);

    IO.println("Source: " + Arrays.toString(source));
    IO.println("Destination: " + Arrays.toString(destination));

    // Alterar a cópia não altera o array original
    destination[0] = 999;
    destination[4] = 777;

    IO.println("");
    IO.println("After modifying the copy:");
    IO.println("Original: " + Arrays.toString(source));
    IO.println("Copy: " + Arrays.toString(destination));
    ```

    Saída:

    ```
    Source: [10, 20, 30, 40, 50]
    Destination: [10, 20, 30, 40, 50]

    After modifying the copy:
    Original: [10, 20, 30, 40, 50]
    Copy: [999, 20, 30, 40, 777]
    ```

    ## 10. Copiando com Arrays.copyOfRange()

    O método cria o array de destino:

    ```java
    int[] source = {10, 20, 30, 40, 50};
    int[] destination = Arrays.copyOfRange(source, 0, source.length);

    IO.println("Source: " + Arrays.toString(source));
    IO.println("Destination: " + Arrays.toString(destination));

    // Alterar a cópia não altera o array original
    destination[0] = 999;
    destination[4] = 777;

    IO.println("");
    IO.println("After modifying the copy:");
    IO.println("Original: " + Arrays.toString(source));
    IO.println("Copy: " + Arrays.toString(destination));
    ```

    Saída:

    ```
    Source: [10, 20, 30, 40, 50]
    Destination: [10, 20, 30, 40, 50]

    After modifying the copy:
    Original: [10, 20, 30, 40, 50]
    Copy: [999, 20, 30, 40, 777]
    ```

    ---

    # 🔎 Explicação

    ## Entendendo array com uma analogia

    Imagine um armário com várias gavetas numeradas. O array é o armário; cada elemento é uma gaveta; e o índice é o número usado para localizar uma gaveta específica.

    Se o array for:

    ```java
    int[] ages = {18, 23, 30};
    ```

    Podemos representar assim:

    | Índice | Valor |
    | --- | --- |
    | 0 | 18 |
    | 1 | 23 |
    | 2 | 30 |

    A instrução `ages[1]` acessa o valor `23`, porque o índice começa em zero.

    ## Diferença entre declaração, criação e inicialização

    - **Declaração:** informa o tipo e o nome da variável: `int[] numbers;`.
    - **Criação:** reserva o array: `numbers = new int[5];`.
    - **Inicialização:** atribui valores aos elementos: `numbers[0] = 10;`.
    - **Acesso:** lê ou altera um elemento por meio do índice: `numbers[0]`.

    Essas etapas podem aparecer separadas ou combinadas, como em `int[] numbers = {10, 20, 30};`.

    ## Como ler os dois índices de uma matriz bidimensional

    Em `matrix[linha][coluna]`, o primeiro índice seleciona o array interno (a linha); o segundo seleciona o elemento dentro dessa linha (a coluna).

    Exemplo: em `matrix[1][2]`, selecionamos a segunda linha e o terceiro elemento dessa linha.

    ## Por que consultar length em cada linha?

    Em arrays irregulares, cada array interno pode ter um tamanho diferente. Por isso, no laço externo usamos `strings.length` para percorrer as linhas e, no laço interno, usamos `strings[arrayIndex].length` para percorrer os elementos da linha atual.

    ---

    # ⚠️ Pontos de atenção

    1. O tamanho de um array é fixo depois da criação.
    2. Os índices começam em zero; em um array de comprimento `n`, o último índice é `n - 1`.
    3. Acessar uma posição fora dos limites do array causa erro em tempo de execução.
    4. Declarar uma variável de array não cria automaticamente o objeto array.
    5. A forma recomendada é escrever os colchetes junto ao tipo: `int[]`, e não depois do nome.
    6. Um array multidimensional em Java é composto por arrays internos; não presuma que todas as linhas têm o mesmo comprimento.
    7. `length` é uma propriedade de arrays, não uma chamada de método.
    8. `System.arraycopy()` recebe origem, posição inicial da origem, destino, posição inicial do destino e quantidade de elementos.
    9. Em `Arrays.copyOfRange(array, inicio, fim)`, o início é incluído e o fim é excluído.
    10. A classe `Arrays` precisa estar disponível no código para usar seus métodos; nos exemplos que usam `Arrays`, considere o import correspondente: `import java.util.Arrays;`.
    11. **Observação sobre a tradução da página:** no primeiro exemplo, a extração em português mostra duas linhas de saída com o rótulo “Element 9”. O código associa o índice 7 ao oitavo elemento e o índice 8 ao nono. Portanto, o rótulo do índice 7 deve ser lido como “Element 8”; a sequência de valores e índices é a referência para interpretar o exemplo.

    ---

    # 📝 Resumo

    Arrays permitem armazenar vários valores do mesmo tipo em uma estrutura de tamanho fixo. Cada elemento é acessado por um índice que começa em zero. A variável é declarada com `tipo[]`, o array pode ser criado com `new` ou inicializado diretamente com valores, e a propriedade `length` informa seu comprimento.

    Arrays multidimensionais são arrays que contêm outros arrays. Em Java, suas linhas podem ter tamanhos diferentes. Para copiar dados, podemos utilizar `System.arraycopy()` ou `Arrays.copyOfRange()`. A classe `Arrays` também oferece métodos para pesquisa, comparação, preenchimento, ordenação, streams e conversão para texto.

    **Ideia central:** dominar arrays significa compreender como agrupar, localizar, percorrer, organizar e copiar valores em Java.

    ---

    # 🏋️ Prática

    A página Dev.java apresenta os exemplos práticos desta aula: criação e preenchimento de arrays, laço `for-each`, arrays de diferentes tipos, arrays multidimensionais, cálculos e cópia de arrays.

    Além de executar e compreender esses exemplos, resolva os desafios abaixo sem copiar uma solução pronta.

    ### Exercício 1 — Criando seu primeiro array

    Declare um array de inteiros com cinco valores à sua escolha. Depois:

    - Imprima o primeiro elemento.
    - Imprima o terceiro elemento.
    - Imprima o último elemento.

    ### Exercício 2 — Percorrendo com for

    Utilize um laço `for` para percorrer todos os elementos de um array e imprimir o índice e o valor de cada posição.

    ### Exercício 3 — Percorrendo com for-each

    Utilize o mesmo array do exercício anterior, mas agora percorra seus valores com `for-each`. Explique a diferença entre os dois laços.

    ### Exercício 4 — Calculando valores

    Crie um array de números inteiros. Calcule:

    - A soma dos elementos.
    - A média.
    - O maior valor.
    - O menor valor.

    ### Exercício 5 — Matriz bidimensional

    Crie um array bidimensional de inteiros com três linhas e três colunas. Percorra-o com dois laços e imprima os valores em formato de tabela.

    ### Exercício 6 — Linhas de tamanhos diferentes

    Crie um array bidimensional em que cada linha tenha uma quantidade diferente de elementos. Percorra todas as posições usando `length` no array externo e em cada array interno.

    ### Exercício 7 — Cópia de array

    Crie um array original e uma cópia. Altere um elemento da cópia e mostre que o array original permanece com os valores anteriores.

    ---

    # 🔄 Revisão

    Responda sem consultar as anotações:

    1. O que é um array em Java?
    2. Por que o tamanho de um array é fixo?
    3. O que é um elemento?
    4. Por que o primeiro índice é zero?
    5. Qual é a diferença entre declarar e criar um array?
    6. O que a instrução `new int[10]` faz?
    7. Como acessar o terceiro elemento de um array?
    8. Para que serve a propriedade `length`?
    9. O que significa declarar `String[][]`?
    10. Por que as linhas de um array bidimensional podem ter tamanhos diferentes?
    11. Qual é a diferença entre `System.arraycopy()` e `Arrays.copyOfRange()`?
    12. No método `Arrays.copyOfRange(array, 2, 9)`, o elemento do índice 9 é copiado?
    13. Cite quatro métodos da classe `Arrays` e explique suas finalidades.

    ## Lei de Feynman

    Explique com suas próprias palavras:

    **Imagine que você precisa ensinar arrays a alguém que nunca programou. Como explicaria o que é um array, como os índices funcionam e como uma matriz bidimensional organiza seus elementos?**

    Depois, tente explicar por que em Java uma matriz bidimensional pode ter linhas de tamanhos diferentes.

    ---

    # ✅ Checklist

    - [ ]  Entendi o que é um array.
    - [ ]  Entendi que o tamanho do array é fixo.
    - [ ]  Sei explicar elemento e índice.
    - [ ]  Compreendi que os índices começam em zero.
    - [ ]  Sei declarar uma variável de array.
    - [ ]  Sei criar um array com `new`.
    - [ ]  Sei inicializar um array diretamente com valores.
    - [ ]  Sei acessar elementos pelos índices.
    - [ ]  Sei percorrer arrays com `for`.
    - [ ]  Sei percorrer arrays com `for-each`.
    - [ ]  Sei utilizar a propriedade `length`.
    - [ ]  Compreendi arrays multidimensionais.
    - [ ]  Compreendi arrays irregulares (jagged arrays).
    - [ ]  Sei explicar a diferença entre `System.arraycopy()` e `Arrays.copyOfRange()`.
    - [ ]  Conheço as operações apresentadas da classe `Arrays`.
    - [ ]  Executei e compreendi os exemplos da documentação.
    - [ ]  Resolvi os exercícios propostos.
    - [ ]  Consigo explicar o conteúdo sem consultar as anotações.

    ---

    **Referência:** Dev.java — Creating Arrays in Your Programs
    **Documentação pessoal de estudos — My-Studying-Java.**
     */
}
