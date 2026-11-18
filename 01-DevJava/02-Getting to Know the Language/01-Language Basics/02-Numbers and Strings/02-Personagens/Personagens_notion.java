public class Personagens_notion {
    /*
    - **Personagens**

    ## 🎯 Objetivo

    Compreender como Java representa caracteres individuais, quando utilizar o tipo primitivo `char` ou a classe wrapper `Character`, como funcionam os métodos de manipulação de caracteres, os pontos de código Unicode e as sequências de escape.

    ## 📚 Conceitos

    ### 1. Tipo primitivo char

    Quando o programa precisa armazenar um único caractere, normalmente utiliza o tipo primitivo `char`.

    Exemplos da fonte:

    ```java
    char ch = 'a';

    // Unicode para o caractere ômega grego maiúsculo
    char uniChar = '\u03A9';

    // Um array de caracteres
    char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
    ```

    - Um caractere literal é escrito entre aspas simples.
    - Um valor Unicode pode ser representado por uma sequência de escape Unicode, como `'\u03A9'`.
    - Um array de `char` armazena vários valores de caractere.

    ### 2. Classe wrapper Character

    Em algumas situações, é necessário tratar um `char` como objeto, por exemplo, quando um método espera receber um objeto. Para isso, Java fornece a classe wrapper `Character`.

    Um objeto `Character` contém um único campo do tipo primitivo `char`. A classe também disponibiliza métodos estáticos para testar e manipular caracteres.

    Exemplo apresentado pela fonte:

    ```java
    Character ch = new Character('a');
    ```

    O compilador também pode converter automaticamente um `char` primitivo em um objeto `Character` quando necessário. Essa conversão é chamada de **autoboxing**. A conversão inversa, de objeto wrapper para tipo primitivo, é chamada de **unboxing**.

    A classe `Character` é imutável: depois que um objeto é criado, seu valor não pode ser alterado.

    ### 3. Métodos úteis da classe Character

    A fonte apresenta os seguintes métodos estáticos:

    | Método | Finalidade |
    | --- | --- |
    | `Character.isLetter(ch)` | Verifica se o caractere é uma letra. |
    | `Character.isDigit(ch)` | Verifica se o caractere é um dígito. |
    | `Character.isWhitespace(ch)` | Verifica se o caractere é um espaço em branco. |
    | `Character.isUpperCase(ch)` | Verifica se o caractere está em maiúsculas. |
    | `Character.isLowerCase(ch)` | Verifica se o caractere está em minúsculas. |
    | `Character.toUpperCase(ch)` | Retorna a forma maiúscula do caractere. |
    | `Character.toLowerCase(ch)` | Retorna a forma minúscula do caractere. |
    | `Character.toString(ch)` | Retorna uma String que representa o caractere. |

    A lista não é completa. A fonte informa que a classe possui mais de 50 métodos e direciona à especificação da API para consultar todos eles.

    ### 4. Caracteres e pontos de código Unicode

    A plataforma Java oferece suporte ao padrão Unicode desde o JDK 1.0.2. A fonte apresenta a seguinte relação entre versões do Java e versões do Unicode:

    | Lançamento do Java | Versão Unicode |
    | --- | --- |
    | Java SE 26 | Unicode 17.0 |
    | Java SE 24 | Unicode 16.0 |
    | Java SE 22 | Unicode 15.1 |
    | Java SE 20 | Unicode 15.0 |
    | Java SE 19 | Unicode 14.0 |
    | Java SE 15 | Unicode 13.0 |
    | Java SE 13 | Unicode 12.1 |
    | Java SE 12 | Unicode 11.0 |
    | Java SE 11 | Unicode 10.0 |
    | Java SE 9 | Unicode 8.0 |
    | Java SE 8 | Unicode 6.2 |
    | Java SE 7 | Unicode 6.0 |
    | Java SE 5.0 | Unicode 4.0 |
    | Java SE 1.4 | Unicode 3.0 |
    | JDK 1.1 | Unicode 2.0 |
    | JDK 1.0.2 | Unicode 1.1.5 |

    O tipo `char` e a classe `Character` foram baseados na especificação Unicode original, que definia caracteres como entidades de largura fixa de 16 bits. Posteriormente, o Unicode passou a permitir caracteres cuja representação exige mais de 16 bits.

    O intervalo atual de pontos de código válidos apresentado pela fonte vai de `U+0000` a `U+10FFFF`. Esse intervalo é chamado de valor escalar Unicode.

    ### 5. BMP e caracteres suplementares

    Um valor `char` é codificado com 16 bits e representa valores de `0x0000` a `0xFFFF`. Esse conjunto é chamado de **Plano Multilíngue Básico (BMP)**.

    - **BMP:** caracteres cujos pontos de código estão dentro do intervalo representável por um único `char`.
    - **Caracteres suplementares:** caracteres com pontos de código acima de `U+FFFF`, que exigem mais de 16 bits para sua representação.

    A fonte diferencia os tipos desta maneira:

    - Um valor `char` representa pontos de código do BMP.
    - Um valor `int` pode representar todos os pontos de código Unicode, inclusive os suplementares.

    Comportamento dos métodos:

    - Métodos que recebem apenas `char` não dão suporte a caracteres suplementares e tratam valores substitutos como caracteres indefinidos.
    - Métodos que recebem `int` dão suporte a todos os caracteres Unicode, inclusive os suplementares.

    ### 6. Sequências de escape

    Uma sequência de escape é formada por uma barra invertida (`\\`) seguida de um caractere que possui significado especial para o compilador Java.

    | Sequência | Descrição apresentada pela fonte |
    | --- | --- |
    | `\t` | Insere uma tabulação. |
    | `\b` | Insere um caractere de retrocesso (backspace). |
    | `\n` | Insere uma nova linha. |
    | `\r` | Insere uma quebra de linha. |
    | `\f` | Insere uma quebra de linha. |
    | `\s` | Insere um espaço. |
    | `\'` | Insere uma aspa simples. |
    | `\"` | Insere aspas duplas. |
    | `\\` | Insere uma barra invertida. |
    | Barra invertida seguida de um terminador de linha | Não insere o terminador de linha no texto. |

    A fonte demonstra que as sequências de escape são interpretadas pelo compilador quando encontradas em uma instrução de impressão.

    Exemplo original:

    ```java
    IO.println("She said \"Hello!\" to me.");
    ```

    Saída:

    ```
    She said "Hello!" to me.
    ```

    Nesse exemplo, `\"` permite incluir aspas duplas dentro da String sem encerrar a literal antes da hora.

    ## 🧠 O que memorizar

    - `char` é o tipo primitivo utilizado normalmente para representar um único caractere.
    - `Character` é a classe wrapper de `char`.
    - Autoboxing converte um primitivo em seu objeto wrapper; unboxing realiza a conversão inversa.
    - Objetos `Character` são imutáveis.
    - Os métodos `isLetter()`, `isDigit()` e `isWhitespace()` verificam características de um caractere.
    - `toUpperCase()` e `toLowerCase()` retornam formas maiúsculas e minúsculas.
    - Unicode permite representar caracteres de diferentes sistemas de escrita.
    - `char` possui 16 bits e representa valores do BMP.
    - `int` pode representar todos os pontos de código Unicode, inclusive os suplementares.
    - Sequências de escape começam com uma barra invertida.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Declarando caracteres

    Exemplo da fonte:

    ```java
    char ch = 'a';
    char uniChar = '\u03A9';
    char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
    ```

    ### Exemplo 2 — Convertendo aspas em uma String

    Exemplo da fonte:

    ```java
    IO.println("She said \"Hello!\" to me.");
    ```

    Saída:

    ```
    She said "Hello!" to me.
    ```

    ## 🔎 Explicação do código

    ### 1. Diferença entre char e Character

    Pense em `char` como um valor simples que guarda um caractere. Já `Character` é um objeto que representa esse mesmo tipo de valor. Essa versão em objeto é útil quando uma operação exige um objeto em vez de um tipo primitivo.

    ### 2. Para que servem os métodos de Character?

    Imagine que você recebe caracteres digitados por uma pessoa e precisa verificar o conteúdo. Os métodos de `Character` funcionam como ferramentas de inspeção: permitem verificar se um caractere é letra, número, espaço, maiúsculo ou minúsculo.

    ### 3. O que é Unicode?

    Unicode é um padrão que atribui pontos de código aos caracteres. Isso permite que sistemas representem caracteres de diferentes idiomas e símbolos. Nem todo ponto de código cabe em um único `char`, por isso a fonte diferencia o BMP dos caracteres suplementares.

    ### 4. Por que existem sequências de escape?

    Alguns caracteres têm significado especial dentro de uma String ou não são simples de digitar diretamente. A barra invertida indica ao compilador que a sequência seguinte deve ser interpretada de maneira especial.

    ### 5. Lei de Feynman

    Tente explicar sem consultar o material:

    - Quando você escolheria `char` em vez de `Character`?
    - Por que um caractere pode precisar de mais de 16 bits?
    - Qual é a diferença entre BMP e caracteres suplementares?
    - Como uma sequência de escape permite imprimir aspas dentro de uma String?

    ## ⚠️ Pontos de atenção

    - Literais de caracteres utilizam aspas simples, como `'a'`; Strings utilizam aspas duplas.
    - `Character` não é o mesmo tipo que `char`.
    - A fonte apresenta o construtor `new Character('a')` como exemplo de criação de objeto.
    - Não confunda autoboxing com unboxing: são conversões em sentidos opostos.
    - Um único `char` não representa todos os pontos de código Unicode.
    - Métodos que recebem `int` podem lidar com caracteres suplementares; os que recebem apenas `char` não oferecem esse suporte.
    - Sequências de escape começam com `\\`. A sequência precisa ser escrita corretamente para que o compilador a interprete.

    ## 📝 Resumo

    Java oferece o tipo primitivo `char` para representar caracteres individuais e a classe wrapper `Character` para trabalhar com esses valores como objetos. A classe disponibiliza métodos estáticos para verificar e transformar caracteres, além de ser imutável.

    A representação de caracteres segue o padrão Unicode. Um `char` possui 16 bits e representa valores do Plano Multilíngue Básico, enquanto `int` pode representar todos os pontos de código Unicode, incluindo os suplementares. Por fim, as sequências de escape permitem inserir caracteres especiais em textos e instruções de impressão.

    **Ideia central:** entender `char`, `Character`, Unicode e sequências de escape permite manipular caracteres corretamente em Java.

    ## 🏋️ Exercícios

    Tente resolver no IntelliJ antes de consultar qualquer solução. Escreva o código, execute e explique o resultado.

    ### Exercício 1 — Declarando char

    Declare uma variável `char` que armazene a letra inicial do seu nome. Exiba o valor no console.

    ### Exercício 2 — Código Unicode

    Declare uma variável `char` utilizando uma sequência Unicode no formato apresentado pela fonte. Exiba o caractere.

    ### Exercício 3 — Array de caracteres

    Crie um array de `char` com cinco letras. Percorra o array e exiba cada caractere.

    ### Exercício 4 — Wrapper Character

    Declare uma variável do tipo `Character`. Explique a diferença entre ela e uma variável do tipo `char`.

    ### Exercício 5 — Autoboxing e unboxing

    Crie uma variável `char` e atribua seu valor a uma variável `Character`. Depois, faça o caminho inverso. Identifique em qual etapa ocorre autoboxing e em qual ocorre unboxing.

    ### Exercício 6 — Verificando caracteres

    Utilize `Character.isLetter()` e `Character.isDigit()` para verificar uma letra e um número. Observe os valores retornados.

    ### Exercício 7 — Maiúsculas e minúsculas

    Utilize `Character.toUpperCase()` e `Character.toLowerCase()` para converter um caractere. Exiba os resultados.

    ### Exercício 8 — Espaços em branco

    Teste `Character.isWhitespace()` com um espaço em branco e com uma letra. Compare os resultados.

    ### Exercício 9 — Sequências de escape

    Crie uma instrução de impressão que utilize `\t`, `\n`, `\'`, `\"` e `\\`. Observe o efeito de cada sequência.

    ### Exercício 10 — Lei de Feynman

    Explique com suas palavras:

    1. Qual é a diferença entre `char` e `Character`?
    2. O que são autoboxing e unboxing?
    3. O que significa dizer que `Character` é imutável?
    4. Qual é a diferença entre BMP e caracteres suplementares?
    5. Por que métodos que recebem `int` podem suportar mais caracteres Unicode do que métodos que recebem apenas `char`?
    6. Para que servem as sequências de escape?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. Qual tipo primitivo Java é normalmente utilizado para armazenar um único caractere?
    2. Qual é a classe wrapper de `char`?
    3. O que um objeto `Character` armazena?
    4. O que é autoboxing?
    5. O que é unboxing?
    6. A classe `Character` é mutável ou imutável?
    7. Qual método verifica se um caractere é uma letra?
    8. Qual método verifica se um caractere é um dígito?
    9. Qual método verifica se um caractere é espaço em branco?
    10. Qual é a finalidade de `toUpperCase()` e `toLowerCase()`?
    11. O que é Unicode?
    12. Quantos bits possui um valor `char`?
    13. O que significa BMP?
    14. O que são caracteres suplementares?
    15. Qual tipo pode representar todos os pontos de código Unicode: `char` ou `int`?
    16. Para que serve uma sequência de escape?
    17. Qual sequência representa uma tabulação?
    18. Qual sequência representa uma nova linha?
    19. Como imprimir aspas duplas dentro de uma String?
    20. Como imprimir uma barra invertida?

    ## ✅ Checklist

    - [ ]  Entendi quando utilizar `char`.
    - [ ]  Sei diferenciar `char` de `Character`.
    - [ ]  Entendi autoboxing e unboxing.
    - [ ]  Sei que objetos `Character` são imutáveis.
    - [ ]  Conheço os métodos básicos de verificação da classe `Character`.
    - [ ]  Sei utilizar métodos de conversão entre maiúsculas e minúsculas.
    - [ ]  Entendi o papel do padrão Unicode.
    - [ ]  Sei explicar o que é BMP.
    - [ ]  Entendi o que são caracteres suplementares.
    - [ ]  Sei diferenciar o suporte de `char` e `int` a pontos de código Unicode.
    - [ ]  Reconheço as principais sequências de escape.
    - [ ]  Consigo explicar os conceitos principais sem consultar as anotações.

    ---

    **Referência:** Dev.java — Characters.

    **Última atualização informada pela fonte:** 10 de maio de 2026.
     */
}
