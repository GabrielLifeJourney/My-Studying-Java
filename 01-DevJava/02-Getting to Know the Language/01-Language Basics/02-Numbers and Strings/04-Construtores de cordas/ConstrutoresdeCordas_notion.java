public class ConstrutoresdeCordas_notion {
    public static void main(String[] args) {
        /*
        - **Construtores de cordas**

    ## 🎯 Objetivo

    Compreender a diferença entre `String` e `StringBuilder`, conhecer comprimento e capacidade de um construtor de strings e utilizar seus principais métodos para adicionar, inserir, remover, substituir e inverter caracteres.

    ## 📚 Conceitos

    ### 1. O que é StringBuilder?

    A classe `String` representa uma sequência de caracteres imutável: depois que um objeto String é criado, seu conteúdo não pode ser alterado.

    A classe `StringBuilder` representa uma sequência de caracteres modificável. Seu conteúdo e seu comprimento podem ser alterados por chamadas de métodos, sem precisar criar um novo objeto a cada operação.

    **Analogia:** pense em uma String como um texto impresso em uma folha: para mudar uma palavra, você precisa produzir outra folha. Um StringBuilder funciona como um rascunho que permite acrescentar, apagar ou trocar partes do texto.

    A fonte recomenda utilizar `String` como escolha padrão. Use `StringBuilder` quando ele tornar o código mais simples ou oferecer vantagem de desempenho.

    A fonte também explica que, antes do Java SE 9, concatenar muitas strings podia ser mais eficiente usando `StringBuilder`. A partir do Java SE 9, a concatenação de strings foi otimizada e pode ser mais eficiente do que adicionar strings manualmente a um StringBuilder. Portanto, não se deve assumir que StringBuilder será sempre mais rápido.

    ### 2. Comprimento e capacidade

    Um objeto `StringBuilder` possui duas propriedades importantes:

    | Propriedade | Significado |
    | --- | --- |
    | Comprimento (`length()`) | Quantidade de caracteres atualmente presentes na sequência. |
    | Capacidade (`capacity()`) | Quantidade de espaços de caracteres alocados para armazenar a sequência. |

    A capacidade é sempre maior ou igual ao comprimento. Ela pode ser superior ao comprimento porque representa o espaço disponível, não apenas os caracteres já utilizados.

    Quando uma operação aumenta o conteúdo além da capacidade atual, o próprio StringBuilder amplia sua capacidade automaticamente.

    ### 3. Construtores da classe StringBuilder

    A fonte apresenta quatro formas de criar um StringBuilder:

    | Construtor | Comportamento |
    | --- | --- |
    | `StringBuilder()` | Cria um construtor vazio com capacidade inicial de 16 caracteres. |
    | `StringBuilder(CharSequence cs)` | Copia a sequência informada e reserva mais 16 posições de capacidade. |
    | `StringBuilder(int initCapacity)` | Cria um construtor vazio com a capacidade inicial especificada. |
    | `StringBuilder(String s)` | Inicializa o conteúdo com a String informada e reserva mais 16 posições de capacidade. |

    Exemplo da fonte:

    ```java
    // Cria um StringBuilder vazio, com capacidade 16
    StringBuilder sb = new StringBuilder();

    // Adiciona uma String de 9 caracteres
    sb.append("Greetings");
    ```

    Depois da operação:

    - Comprimento: `9`.
    - Capacidade: `16`.

    ### 4. Métodos de comprimento e capacidade

    | Método | Função |
    | --- | --- |
    | `length()` | Retorna a quantidade de caracteres presentes. |
    | `capacity()` | Retorna a capacidade atualmente alocada. |
    | `setLength(int newLength)` | Define um novo comprimento. |
    | `ensureCapacity(int minCapacity)` | Garante capacidade de, no mínimo, o valor informado. |

    Com `setLength()`:

    - Se o novo comprimento for menor que o atual, os caracteres excedentes são removidos do final.
    - Se for maior, caracteres nulos (`�`) são adicionados ao final.

    ### 5. Operações do StringBuilder

    Os métodos `append()` e `insert()` são operações centrais da classe e não estão disponíveis da mesma forma em `String`.

    | Método | Função |
    | --- | --- |
    | `append(valor)` | Adiciona o valor ao final da sequência. |
    | `insert(offset, valor)` | Insere o valor na posição informada. |
    | `delete(start, end)` | Remove os caracteres do índice inicial até o índice anterior ao final. |
    | `deleteCharAt(index)` | Remove o caractere do índice indicado. |
    | `replace(start, end, texto)` | Substitui o trecho indicado pelo texto informado. |
    | `setCharAt(index, caractere)` | Substitui o caractere de uma posição específica. |
    | `reverse()` | Inverte a sequência de caracteres. |
    | `toString()` | Retorna uma String com o conteúdo atual do StringBuilder. |

    **Conversão de valores:** os métodos `append()` e `insert()` possuem sobrecargas para aceitar diferentes tipos primitivos e objetos. O valor é convertido em texto antes de ser adicionado ou inserido.

    **Atenção aos índices:** em `delete(start, end)` e `replace(start, end, texto)`, o índice final não faz parte do trecho afetado. O intervalo começa em `start` e termina antes de `end`.

    ### 6. Usando métodos de String com StringBuilder

    Quando precisar utilizar um método disponível em `String`, mas não em `StringBuilder`, converta o construtor para String com `toString()`.

    Se precisar voltar a trabalhar com um StringBuilder, utilize o construtor `StringBuilder(String string)`.

    Exemplo:

    ```java
    StringBuilder sb = new StringBuilder("Aprendendo Java");

    String texto = sb.toString();
    StringBuilder novamente = new StringBuilder(texto);
    ```

    ### 7. StringBuilder em ação — invertendo uma palavra ou frase

    A fonte apresenta um programa chamado `StringDemo` que inverte a frase `"Dot saw I was Tod"` usando dois arrays de caracteres e laços de repetição.

    A lógica original é:

    1. Copiar cada caractere da String original para um array.
    2. Percorrer esse array na ordem inversa e preencher um segundo array.
    3. Criar uma nova String a partir do segundo array.
    4. Imprimir o resultado.

    Saída:

    ```
    doT saw I was toD
    ```

    A classe `StringBuilder` permite realizar a mesma operação de forma mais simples:

    ```java
    public class StringBuilderDemo {
        public static void main(String[] args) {
            String palindrome = "Dot saw I was Tod";

            StringBuilder sb = new StringBuilder(palindrome);

            sb.reverse();  // inverte a sequência

            IO.println(sb);
        }
    }
    ```

    Saída:

    ```
    doT saw I was toD
    ```

    O método `reverse()` inverte os caracteres diretamente no objeto StringBuilder.

    **Por que `IO.println(sb)` imprime o conteúdo?**

    A fonte explica que a impressão chama implicitamente `sb.toString()`, assim como ocorre com outros objetos passados para uma chamada de `println`.

    ### 8. StringBuilder e StringBuffer

    A fonte também apresenta a classe `StringBuffer`, que possui operações semelhantes às de `StringBuilder`.

    A diferença destacada é que os métodos de `StringBuffer` são sincronizados, tornando a classe thread-safe. A recomendação da fonte é utilizar `StringBuffer` somente quando essa característica for realmente necessária.

    ## 🧠 O que memorizar

    - `String` é imutável; `StringBuilder` é modificável.
    - `length()` retorna a quantidade de caracteres presentes.
    - `capacity()` retorna a capacidade alocada.
    - O construtor vazio de `StringBuilder` começa com capacidade 16.
    - A capacidade aumenta automaticamente quando necessário.
    - `append()` adiciona ao final.
    - `insert()` insere em uma posição específica.
    - `delete()` remove um intervalo; o índice final não é incluído.
    - `replace()` substitui um intervalo; o índice final não é incluído.
    - `setCharAt()` troca um caractere específico.
    - `reverse()` inverte a sequência.
    - `toString()` converte o conteúdo do StringBuilder em String.
    - `StringBuffer` possui métodos sincronizados e é apresentado como alternativa thread-safe.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Criando e adicionando conteúdo

    ```java
    StringBuilder mensagem = new StringBuilder();

    mensagem.append("Estou estudando ");
    mensagem.append("Java");

    IO.println(mensagem);
    IO.println("Comprimento: " + mensagem.length());
    IO.println("Capacidade: " + mensagem.capacity());
    ```

    ### Exemplo 2 — Inserindo e removendo conteúdo

    ```java
    StringBuilder texto = new StringBuilder("Java");

    texto.insert(0, "Aprendendo ");
    IO.println(texto);

    texto.delete(0, 11);
    IO.println(texto);
    ```

    ### Exemplo 3 — Substituindo e invertendo

    ```java
    StringBuilder palavra = new StringBuilder("Java");

    palavra.setCharAt(0, 'C');
    IO.println(palavra);

    palavra.reverse();
    IO.println(palavra);
    ```

    **Nota:** os exemplos 1, 2 e 3 são complementos didáticos para praticar os métodos apresentados na fonte.

    ## 🔎 Explicação do código

    ### 1. Diferença entre String e StringBuilder

    Imagine que você precisa montar uma mensagem em várias etapas. Com String, cada operação que altera o texto produz outra String. Com StringBuilder, você trabalha sobre uma sequência modificável.

    ### 2. Comprimento não é capacidade

    Imagine uma caixa com 16 espaços, mas apenas 9 ocupados. O comprimento representa os 9 caracteres presentes; a capacidade representa os 16 espaços disponíveis.

    ### 3. append() e insert()

    `append()` acrescenta conteúdo no final. `insert()` permite escolher a posição em que o conteúdo será colocado.

    ### 4. Índices em delete() e replace()

    O índice inicial é incluído, mas o índice final é excluído. Essa regra é importante para não remover ou substituir caracteres além do trecho desejado.

    ### 5. Lei de Feynman

    Explique sem consultar o material:

    - Por que StringBuilder pode ser modificado e String não?
    - Qual é a diferença entre comprimento e capacidade?
    - O que acontece quando a capacidade atual não é suficiente?
    - Qual é a diferença entre append() e insert()?
    - Por que o índice final de delete() não é incluído?
    - Para que serve toString()?
    - Em que situação a fonte recomenda StringBuffer?

    ## ⚠️ Pontos de atenção

    - Não confunda `length()` com `capacity()`.
    - A capacidade inicial padrão de `StringBuilder()` é 16.
    - A capacidade pode crescer automaticamente; não presuma um fator exato de crescimento, pois a fonte não o especifica.
    - `append()` adiciona ao final; `insert()` utiliza um deslocamento.
    - Em `delete()` e `replace()`, o índice final é exclusivo.
    - `setLength()` pode truncar caracteres ou adicionar caracteres nulos.
    - `toString()` retorna uma String; não transforma o StringBuilder original em String.
    - Não escolha StringBuilder supondo que ele será sempre mais rápido: a fonte destaca a otimização da concatenação de Strings a partir do Java SE 9.
    - A fonte recomenda StringBuffer quando for necessário utilizar uma classe thread-safe.

    ## 📝 Resumo

    `StringBuilder` é uma classe utilizada para trabalhar com sequências de caracteres modificáveis. Diferentemente de `String`, seu conteúdo pode ser alterado por métodos como `append()`, `insert()`, `delete()`, `replace()` e `reverse()`.

    Além do comprimento, o StringBuilder possui uma capacidade que representa o espaço alocado para armazenar caracteres. Essa capacidade pode aumentar automaticamente conforme o conteúdo cresce.

    **Ideia central:** utilize String como escolha padrão e conheça StringBuilder para situações em que modificar uma sequência de caracteres diretamente torne o código mais simples ou seja vantajoso.

    ## 🏋️ Exercícios

    Resolva no IntelliJ. Antes de executar, tente prever o resultado de cada operação. Não consulte soluções prontas.

    ### Exercício 1 — Criando um StringBuilder

    Crie um objeto `StringBuilder` vazio. Adicione seu nome com `append()` e imprima o conteúdo.

    ### Exercício 2 — Comprimento e capacidade

    Crie um StringBuilder vazio e adicione uma palavra. Exiba o resultado de `length()` e `capacity()`. Explique a diferença entre os dois valores.

    ### Exercício 3 — Construtor com capacidade inicial

    Crie um StringBuilder utilizando o construtor que recebe um número inteiro. Informe uma capacidade inicial de sua escolha e consulte o resultado com `capacity()`.

    ### Exercício 4 — Inserindo conteúdo

    Crie um StringBuilder com o texto `"Java"`. Utilize `insert()` para inserir a palavra `"Aprendendo "` no início.

    ### Exercício 5 — Removendo caracteres

    Crie um StringBuilder com o texto `"Estou aprendendo Java"`. Utilize `delete()` para remover somente a palavra `"Estou "`.

    ### Exercício 6 — Substituindo caracteres

    Crie um StringBuilder com a palavra `"Javo"`. Utilize `setCharAt()` para corrigir a última letra.

    ### Exercício 7 — Substituindo um trecho

    Crie um StringBuilder com a frase `"Estou estudando Python"`. Utilize `replace()` para substituir o nome da linguagem por `"Java"`.

    ### Exercício 8 — Invertendo uma String

    Crie um StringBuilder a partir de uma palavra. Utilize `reverse()` e imprima o resultado.

    ### Exercício 9 — Convertendo para String

    Crie um StringBuilder, adicione uma mensagem e converta o conteúdo para String com `toString()`. Imprima o resultado e identifique o tipo da variável que recebeu a conversão.

    ### Exercício 10 — Lei de Feynman

    Explique com suas próprias palavras:

    1. Qual é a diferença entre String e StringBuilder?
    2. O que significa capacidade?
    3. Qual é a diferença entre append() e insert()?
    4. Como funciona o intervalo de índices de delete()?
    5. Para que serve reverse()?
    6. Qual é a função de toString()?
    7. Qual é a diferença apresentada entre StringBuilder e StringBuffer?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. O que é a classe StringBuilder?
    2. Qual é a principal diferença entre String e StringBuilder?
    3. StringBuilder é mutável ou imutável?
    4. O que o método length() retorna?
    5. O que o método capacity() retorna?
    6. Qual é a capacidade inicial do construtor StringBuilder()?
    7. O que acontece quando o conteúdo ultrapassa a capacidade atual?
    8. Para que serve setLength()?
    9. Para que serve ensureCapacity()?
    10. Qual é a diferença entre append() e insert()?
    11. Para que serve delete()?
    12. Qual é a função de deleteCharAt()?
    13. Qual é a diferença entre replace() e setCharAt()?
    14. Para que serve reverse()?
    15. O que o método toString() retorna?
    16. Como utilizar um método de String em um objeto StringBuilder?
    17. Qual é a diferença apresentada entre StringBuilder e StringBuffer?
    18. A fonte afirma que StringBuilder é sempre mais rápido que a concatenação com String?

    ## ✅ Checklist

    - [ ]  Entendi a diferença entre String e StringBuilder.
    - [ ]  Sei explicar o que significa mutabilidade.
    - [ ]  Sei consultar o comprimento com length().
    - [ ]  Sei consultar a capacidade com capacity().
    - [ ]  Conheço os quatro construtores apresentados.
    - [ ]  Entendi como a capacidade aumenta automaticamente.
    - [ ]  Sei utilizar append() para adicionar conteúdo.
    - [ ]  Sei utilizar insert() para inserir conteúdo.
    - [ ]  Entendi como delete() e deleteCharAt() removem caracteres.
    - [ ]  Sei utilizar replace() e setCharAt().
    - [ ]  Sei inverter uma sequência com reverse().
    - [ ]  Sei converter StringBuilder em String com toString().
    - [ ]  Entendi a diferença apresentada entre StringBuilder e StringBuffer.
    - [ ]  Consigo explicar os conceitos sem consultar as anotações.

    ---

    **Referência:** Oracle Learn Java — Construtores de strings.

    **Última atualização informada pela fonte:** 14 de setembro de 2021.
         */
    }
}
