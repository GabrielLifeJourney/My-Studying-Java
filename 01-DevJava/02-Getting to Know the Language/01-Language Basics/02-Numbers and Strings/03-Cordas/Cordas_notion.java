public class Cordas_notion {
    public static void main(String[] args) {
        /*
        - **Cordas**

    ## 🎯 Objetivo

    Compreender como criar, armazenar, consultar, concatenar, pesquisar, comparar e manipular objetos `String` em Java. Aprender também a converter strings em números e números em strings, utilizar índices e substrings e reconhecer a imutabilidade da classe `String`.

    ## 📚 Conceitos

    ### 1. Criando strings

    Strings são sequências de caracteres. Em Java, uma String é um **objeto**, criado e manipulado por meio da classe `String`.

    A maneira mais direta de criar uma String é utilizar uma literal entre aspas duplas:

    ```java
    String greeting = "Hello world!";
    ```

    Quando o compilador encontra uma literal de String, ele cria um objeto `String` com aquele valor.

    Também é possível criar um objeto utilizando a palavra-chave `new` e um construtor. A fonte apresenta um exemplo que utiliza um array de caracteres:

    ```java
    char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
    String helloString = new String(helloArray);
    IO.println("String: " + helloString);
    ```

    Saída apresentada pela fonte:

    ```
    String: hello.
    ```

    **Imutabilidade:** a classe `String` é imutável. Depois que um objeto String é criado, seu conteúdo não pode ser alterado. Métodos que parecem modificar uma String, na realidade, criam e retornam outra String com o resultado.

    ### 2. Comprimento da String

    O método `length()` retorna o comprimento da String.

    Exemplo da fonte:

    ```java
    String palindrome = "Dot saw I was Tod";
    int length = palindrome.length();
    ```

    Nesse exemplo, o resultado de `length` é `17`.

    Um palíndromo é uma palavra ou frase que pode ser lida da mesma forma de trás para frente, desconsiderando maiúsculas, minúsculas e pontuação.

    ### 3. Acessando caracteres e invertendo uma String

    O método `charAt(i)` retorna o caractere localizado no índice informado. A contagem dos índices começa em zero.

    A fonte apresenta um programa que inverte um palíndromo usando dois arrays de caracteres:

    ```java
    String palindrome = "Dot saw I was Tod";
    int len = palindrome.length();
    char[] tempCharArray = new char[len];
    char[] charArray = new char[len];

    // Copia a String original para um array de chars
    for (int i = 0; i < len; i++) {
        tempCharArray[i] = palindrome.charAt(i);
    }

    // Inverte os caracteres em um segundo array
    for (int j = 0; j < len; j++) {
        charArray[j] = tempCharArray[len - 1 - j];
    }

    String reversePalindrome = new String(charArray);
    IO.println("Original string: " + palindrome);
    IO.println("Reversed:        " + reversePalindrome);
    ```

    A fonte mostra como alternativa o método `getChars()`, que copia uma parte da String para um array de caracteres. Assim, o primeiro laço pode ser substituído por:

    ```java
    palindrome.getChars(0, len, tempCharArray, 0);
    ```

    ### 4. Concatenando strings

    Concatenar significa unir strings.

    A classe `String` possui o método `concat()`, que retorna uma nova String formada pela String original seguida da String recebida:

    ```java
    string1.concat(string2);
    ```

    Também é possível concatenar literais:

    ```java
    "My name is ".concat("Rumplestiltskin");
    ```

    A forma mais comum é utilizar o operador `+`:

    ```java
    "Hello," + " world" + "!"
    ```

    Resultado:

    ```
    Hello, world!
    ```

    Exemplo da fonte:

    ```java
    String string1 = "saw I was";
    IO.println("Dot " + string1 + " Tod");
    ```

    Saída:

    ```
    Dot saw I was Tod
    ```

    A concatenação pode misturar diferentes objetos. Quando um objeto não é uma String, seu método `toString()` é chamado para convertê-lo em texto.

    ### 5. Strings em várias linhas e text blocks

    Até o Java SE 15, literais de String não podiam ocupar várias linhas diretamente no código-fonte. Era comum utilizar o operador `+` para juntar partes:

    ```java
    String quote =
        "Now is the time for all good " +
        "men to come to the aid of their country.";
    ```

    A partir do Java SE 15, é possível utilizar **text blocks**, literais de String que abrangem várias linhas. Eles começam com três aspas duplas (`"""`) seguidas de um terminador de linha e terminam com outras três aspas duplas.

    Exemplo da fonte:

    ```java
    String html = """
                  <html>
                      <body>
                          <p>Hello, world</p>
                      </body>
                  </html>
                  """;
    IO.println(html);
    ```

    Saída apresentada:

    ```html
    <html>
        <body>
            <p>Hello, world</p>
        </body>
    </html>
    ```

    ### 6. Criando strings formatadas

    A classe `String` possui o método estático `format()`, que retorna uma String formatada. Isso permite guardar o texto formatado em uma variável e reutilizá-lo, em vez de apenas imprimir uma vez.

    A fonte compara o uso de `printf()` com o método `String.format()` e apresenta um exemplo com text block:

    ```java
    String format = """
         The value of the float \
         variable is %f,  \s
         while the value of the \
         integer variable is %d, \s
         and the string is %s.""";

    var floatVar1  = 3.14f;
    var intVar1    = 314;
    var stringVar1 = "314";
    IO.println(String.format(format, floatVar1, intVar1, stringVar1));

    var floatVar2  = 2.72f;
    var intVar2    = 272;
    var stringVar2 = "272";
    IO.println(String.format(format, floatVar2, intVar2, stringVar2));
    ```

    Saída apresentada:

    ```
    The value of the float variable is 3.140000,
    while the value of the integer variable is 314,
    and the string is 314.
    The value of the float variable is 2.720000,
    while the value of the integer variable is 272,
    and the string is 272.
    ```

    Nesse exemplo:

    - `%f` representa um valor de ponto flutuante.
    - `%d` representa um valor inteiro.
    - `%s` representa uma String.
    - A sequência `\s` preserva o espaço em branco no final da linha do text block.
    - A barra invertida no final de uma linha impede que seja inserido um caractere de nova linha naquele ponto do text block.

    ### 7. Convertendo strings em números

    É comum receber dados numéricos como texto, por exemplo, quando o usuário digita um valor.

    As subclasses de `Number` que representam tipos numéricos primitivos — `Byte`, `Integer`, `Double`, `Float`, `Long` e `Short` — oferecem o método estático `valueOf()`, que converte uma String em um objeto do tipo wrapper correspondente.

    Exemplo da fonte:

    ```java
    void arithmetic(String s1, String s2) {
        // Converte strings em números
        float a = (Float.valueOf(s1)).floatValue();
        float b = (Float.valueOf(s2)).floatValue();

        // Realiza operações aritméticas
        IO.println("a + b = " + (a + b));
        IO.println("a - b = " + (a - b));
        IO.println("a * b = " + (a * b));
        IO.println("a / b = " + (a / b));
        IO.println("a % b = " + (a % b));
    }

    arithmetic("4.5", "87.2");
    ```

    Saída:

    ```
    a + b = 91.7
    a - b = -82.7
    a * b = 392.4
    a / b = 0.051605508
    a % b = 4.5
    ```

    As subclasses de `Number` também oferecem métodos `parseXXXX()`. Por exemplo, `Float.parseFloat()` converte uma String diretamente em um valor primitivo `float`:

    ```java
    float a = Float.parseFloat(s1);
    float b = Float.parseFloat(s2);
    ```

    A fonte destaca que `parseFloat()` é mais direto nesse caso, pois retorna um tipo primitivo em vez de um objeto wrapper.

    ### 8. Convertendo números em strings

    Também é possível converter números em texto. A fonte apresenta três formas:

    **Concatenar com uma String vazia:**

    ```java
    int i;
    String s1 = "" + i;
    ```

    **Utilizar `String.valueOf()`:**

    ```java
    int i;
    String s2 = String.valueOf(i);
    ```

    **Utilizar `toString()` da classe wrapper:**

    ```java
    int i;
    double d;
    String s3 = Integer.toString(i);
    String s4 = Double.toString(d);
    ```

    Outro exemplo da fonte utiliza `Double.toString()`, `indexOf()` e `length()` para contar os dígitos antes e depois do ponto decimal:

    ```java
    double d = 858.48;
    String s = Double.toString(d);

    int dot = s.indexOf('.');

    IO.println(dot + " digits before decimal point.");
    IO.println((s.length() - dot - 1) + " digits after decimal point.");
    ```

    Saída:

    ```
    3 digits before decimal point.
    2 digits after decimal point.
    ```

    ### 9. Obtendo caracteres e substrings por índice

    O método `charAt()` retorna o caractere localizado em determinado índice.

    - O primeiro caractere está no índice `0`.
    - O último caractere está no índice `length() - 1`.

    Exemplo da fonte:

    ```java
    String palindrome = "Niagara. O roar again!";
    char charAtIndex9 = palindrome.charAt(9);
    IO.println("Palindrome: " + palindrome);
    IO.println("Char at index 9: " + charAtIndex9);
    ```

    Saída:

    ```
    Palindrome: Niagara. O roar again!
    Char at index 9: O
    ```

    Para extrair mais de um caractere consecutivo, utiliza-se `substring()`. A fonte apresenta duas versões:

    | Método | Comportamento |
    | --- | --- |
    | `substring(int beginIndex, int endIndex)` | Retorna uma nova String do índice inicial até o índice anterior ao final. |
    | `substring(int beginIndex)` | Retorna uma nova String do índice inicial até o fim da String original. |

    Exemplo da fonte:

    ```java
    String palindrome = "Niagara. O roar again!";
    String roar = palindrome.substring(11, 15);
    IO.println("Palindrome: " + palindrome);
    IO.println("Substring from 11 to 15: " + roar);
    ```

    Saída:

    ```
    Palindrome: Niagara. O roar again!
    Substring from 11 to 15: roar
    ```

    Observe que o índice final não é incluído no resultado.

    ### 10. Outros métodos para manipular strings

    A fonte apresenta os seguintes métodos:

    | Método | Finalidade |
    | --- | --- |
    | `split(String regex)` | Divide a String em um array de strings de acordo com uma expressão regular. |
    | `split(String regex, int limit)` | Faz a divisão e limita o tamanho do array retornado conforme o argumento `limit`. |
    | `subSequence(int beginIndex, int endIndex)` | Retorna uma sequência de caracteres do índice inicial até o índice anterior ao final. |
    | `trim()` | Retorna uma cópia sem espaços em branco no início e no fim. |
    | `toLowerCase()` | Retorna uma cópia convertida para letras minúsculas. |
    | `toUpperCase()` | Retorna uma cópia convertida para letras maiúsculas. |

    Se nenhuma conversão de maiúsculas/minúsculas for necessária, os métodos correspondentes retornam a própria String original.

    ### 11. Pesquisando caracteres e substrings

    Os métodos `indexOf()` e `lastIndexOf()` localizam caracteres ou substrings.

    - `indexOf()` pesquisa a partir do início da String.
    - `lastIndexOf()` pesquisa a partir do final da String.
    - Se o conteúdo procurado não for encontrado, ambos retornam `-1`.

    A fonte lista as seguintes formas:

    | Método | Finalidade |
    | --- | --- |
    | `indexOf(int ch)` | Índice da primeira ocorrência do caractere. |
    | `lastIndexOf(int ch)` | Índice da última ocorrência do caractere. |
    | `indexOf(int ch, int fromIndex)` | Pesquisa o caractere a partir do índice informado. |
    | `lastIndexOf(int ch, int fromIndex)` | Pesquisa o caractere para trás a partir do índice informado. |
    | `indexOf(String str)` | Índice da primeira ocorrência da substring. |
    | `lastIndexOf(String str)` | Índice da última ocorrência da substring. |
    | `indexOf(String str, int fromIndex)` | Pesquisa a substring a partir do índice informado. |
    | `lastIndexOf(String str, int fromIndex)` | Pesquisa a substring para trás a partir do índice informado. |
    | `contains(CharSequence s)` | Retorna `true` se a String contiver a sequência informada. |

    A interface `CharSequence` é implementada pela classe `String`. Por isso, uma String pode ser passada como argumento para `contains()`.

    Utilize `contains()` quando precisar saber apenas se determinado conteúdo existe, sem precisar descobrir sua posição.

    ### 12. Substituindo caracteres e substrings

    A classe `String` oferece métodos para substituir caracteres ou trechos de texto. Todos retornam uma nova String com o resultado.

    | Método | Finalidade |
    | --- | --- |
    | `replace(char oldChar, char newChar)` | Substitui todas as ocorrências do caractere antigo pelo novo. |
    | `replace(CharSequence target, CharSequence replacement)` | Substitui todas as ocorrências da sequência literal informada. |
    | `replaceAll(String regex, String replacement)` | Substitui todas as partes que correspondem à expressão regular. |
    | `replaceFirst(String regex, String replacement)` | Substitui a primeira parte que corresponde à expressão regular. |

    A fonte informa que expressões regulares são estudadas em uma lição específica.

    ### 13. A classe String em ação: analisando nomes de arquivos

    A fonte apresenta a classe `Filename`, que utiliza `lastIndexOf()` e `substring()` para separar caminho, nome e extensão de um arquivo.

    Exemplo original:

    ```java
    class Filename {
        String fullPath;
        char pathSeparator, extensionSeparator;

        Filename(String str, char sep, char ext) {
            fullPath = str;
            pathSeparator = sep;
            extensionSeparator = ext;
        }

        String extension() {
            int dot = fullPath.lastIndexOf(extensionSeparator);
            if (dot == -1) {
                return ""; // sem ponto: extensão vazia
            } else {
                return fullPath.substring(dot + 1);
            }
        }

        // Obtém o nome do arquivo sem a extensão
        String filename() {
            int dot = fullPath.lastIndexOf(extensionSeparator);
            int sep = fullPath.lastIndexOf(pathSeparator);
            if (dot == -1) {
                return fullPath.substring(sep + 1);
            } else {
                return fullPath.substring(sep + 1, dot);
            }
        }

        String path() {
            int sep = fullPath.lastIndexOf(pathSeparator);
            return fullPath.substring(0, sep);
        }
    }

    String path = "/home/user/index.html";
    Filename myHomePage = new Filename(path, '/', '.');
    IO.println("Extension = " + myHomePage.extension());
    IO.println("Filename = " + myHomePage.filename());
    IO.println("Path = " + myHomePage.path());
    ```

    Saída:

    ```
    Extension = html
    Filename = index
    Path = /home/user
    ```

    Funcionamento:

    1. `lastIndexOf(extensionSeparator)` encontra a última ocorrência do separador da extensão, nesse caso o ponto.
    2. `extension()` utiliza `substring(dot + 1)` para obter o texto depois do ponto.
    3. `filename()` localiza o último separador de diretório e o ponto da extensão para extrair somente o nome.
    4. `path()` extrai a parte anterior ao último separador de diretório.
    5. Se não houver ponto, `lastIndexOf()` retorna `-1`, e o método `extension()` retorna uma String vazia.

    A fonte observa que essa classe não faz validação de erros e pressupõe que o argumento contém um caminho completo e um nome de arquivo com extensão. Um código de produção deveria verificar se os argumentos estão corretamente construídos.

    A fonte também explica que `substring()` aceita um índice igual a `length()`, interpretando-o como o final da String. Esse valor é permitido, embora seja maior que o último índice de caractere, pois os índices começam em zero.

    ### 14. Comparando strings e partes de strings

    A classe `String` possui métodos para comparar o conteúdo de duas strings ou partes delas.

    | Método | Finalidade |
    | --- | --- |
    | `endsWith(String suffix)` | Verifica se a String termina com o sufixo informado. |
    | `startsWith(String prefix)` | Verifica se a String começa com o prefixo informado. |
    | `startsWith(String prefix, int offset)` | Verifica se a String começa com o prefixo a partir do índice informado. |
    | `compareTo(String anotherString)` | Compara duas strings lexicograficamente. Retorna valor negativo, zero ou positivo. |
    | `compareToIgnoreCase(String str)` | Faz a comparação lexicográfica ignorando diferenças entre maiúsculas e minúsculas. |
    | `equals(Object anObject)` | Retorna `true` quando o argumento é uma String com a mesma sequência de caracteres. |
    | `equalsIgnoreCase(String anotherString)` | Compara o conteúdo ignorando diferenças entre maiúsculas e minúsculas. |
    | `regionMatches(int toffset, String other, int ooffset, int len)` | Compara regiões de duas strings, considerando os índices e o comprimento informados. |
    | `regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)` | Compara regiões e permite indicar se a diferença entre maiúsculas e minúsculas deve ser ignorada. |
    | `matches(String regex)` | Verifica se a String corresponde à expressão regular informada. |

    No método `compareTo()` e em `compareToIgnoreCase()`:

    - Resultado menor que zero: esta String é menor que a String comparada.
    - Resultado igual a zero: as strings são iguais na comparação.
    - Resultado maior que zero: esta String é maior que a String comparada.

    A fonte apresenta um exemplo com `regionMatches()` para localizar uma palavra dentro de outra String:

    ```java
    String searchMe = "Green Eggs and Ham";
    String findMe = "Eggs";
    int searchMeLength = searchMe.length();
    int findMeLength = findMe.length();
    boolean foundIt = false;

    for (int i = 0;
         i <= (searchMeLength - findMeLength);
         i++) {
        if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
            foundIt = true;
            IO.println(searchMe.substring(i, i + findMeLength));
            break;
        }
    }

    if (!foundIt)
        IO.println("No match found.");
    ```

    Saída:

    ```
    Eggs
    ```

    O programa percorre `searchMe` caractere por caractere. Em cada posição, `regionMatches()` verifica se o trecho iniciado naquele índice corresponde ao texto procurado. Quando encontra a correspondência, imprime a substring e interrompe o laço com `break`.

    ### 15. Praticando a criação e manipulação de strings

    A fonte encerra a lição com exemplos práticos.

    **Criação de strings:**

    ```java
    // Literal de String
    String greeting = "Hello world!";
    IO.println("Greeting: " + greeting);

    // A partir de um array de caracteres
    char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
    String helloString = new String(helloArray);
    IO.println("From array: " + helloString);

    // Sua própria String
    String myString = "Your message here";
    IO.println("My string: " + myString);
    ```

    Saída:

    ```
    Greeting: Hello world!
    From array: hello.
    My string: Your message here
    ```

    **Concatenação com o operador `+`:**

    ```java
    var duke = "Duke";
    var loves = "loves";
    var java = "Java";
    var sentence = duke + " " + loves + " " + java;
    IO.println(sentence);
    ```

    Saída:

    ```
    Duke loves Java
    ```

    **Concatenação com `concat()`:**

    ```java
    var duke = "Duke";
    var loves = "loves";
    var java = "Java";
    var sentence =
        duke.concat(" ")
            .concat(loves)
            .concat(" ")
            .concat(java);
    IO.println(sentence);
    ```

    A saída é a mesma: `Duke loves Java`.

    **Misturando tipos diferentes:**

    ```java
    var name = "Duke";
    var age = 30;
    var sentence = name + " is " + age;
    var length = sentence.length();
    IO.println("length = " + length);
    IO.println(sentence);
    ```

    Saída:

    ```
    length = 10
    Duke is 30
    ```

    **Extraindo caracteres:**

    ```java
    var sentence = "Duke loves Java!";
    char firstChar = sentence.charAt(0);
    char lastChar = sentence.charAt(sentence.length() - 1);
    IO.println("The first char is: " + firstChar);
    IO.println("The last char is: " + lastChar);
    ```

    Saída:

    ```
    The first char is: D
    The last char is: !
    ```

    **Extraindo substrings:**

    ```java
    var sentence = "Duke loves Java!";

    var length = sentence.length();
    IO.println("length = " + length);

    var duke = sentence.substring(0, 4);
    IO.println("Substring 1 = " + duke);

    var java = sentence.substring(11, 15);
    IO.println("Substring 2 = " + java);
    ```

    Saída:

    ```
    length = 16
    Substring 1 = Duke
    Substring 2 = Java
    ```

    **Pesquisando uma substring:**

    ```java
    var sentence = "Duke loves Java!";
    int index = sentence.indexOf("Java");
    IO.println("Index of Java: " + index);
    ```

    Saída:

    ```
    Index of Java: 11
    ```

    **Encontrando todas as ocorrências:**

    ```java
    var sentence = "Duke loves Java, duke loves Java, duke loves Java!";
    int index = sentence.indexOf("Java");

    while (index > -1) {
        IO.println("Found at index " + index);
        index = sentence.indexOf("Java", index + 1);
    }

    IO.println("Done.");
    ```

    Saída:

    ```
    Found at index 11
    Found at index 28
    Found at index 45
    Done.
    ```

    O laço continua pesquisando a próxima ocorrência a partir do índice seguinte ao resultado anterior. Quando `indexOf()` não encontra mais o texto, retorna `-1` e o laço termina.

    ## 🧠 O que memorizar

    - String é uma sequência de caracteres e, em Java, é um objeto.
    - Literais de String são escritas entre aspas duplas.
    - A classe `String` é imutável.
    - `length()` retorna o comprimento da String.
    - `charAt()` acessa um caractere pelo índice.
    - Os índices começam em zero; o último índice é `length() - 1`.
    - `substring(inicio, fim)` não inclui o índice final.
    - `concat()` e o operador `+` concatenam strings.
    - Text blocks permitem escrever literais de várias linhas e estão disponíveis a partir do Java SE 15.
    - `String.format()` retorna uma String formatada.
    - `valueOf()` converte texto em objeto wrapper numérico; `parseFloat()` converte texto diretamente em `float`.
    - `String.valueOf()` e os métodos `toString()` convertem números em texto.
    - `indexOf()` pesquisa do início; `lastIndexOf()` pesquisa do final.
    - Quando não encontram o conteúdo, os métodos de busca retornam `-1`.
    - `contains()` verifica se uma sequência está presente.
    - Métodos como `replace()`, `trim()`, `split()`, `toUpperCase()` e `toLowerCase()` retornam resultados em novas strings.
    - `equals()` compara o conteúdo das strings; `compareTo()` realiza comparação lexicográfica.

    ## 💻 Exemplos de código

    ### Exemplo 1 — Criando e concatenando strings

    ```java
    String nome = "Kelvyn";
    String linguagem = "Java";

    String mensagem = "Estou estudando " + linguagem;
    IO.println(mensagem);
    IO.println("Nome: " + nome);
    ```

    ### Exemplo 2 — Acessando caracteres e substrings

    ```java
    String frase = "Aprendendo Java";

    IO.println(frase.length());
    IO.println(frase.charAt(0));
    IO.println(frase.substring(11, 15));
    ```

    ### Exemplo 3 — Pesquisando conteúdo

    ```java
    String frase = "Java é uma linguagem de programação";

    IO.println(frase.contains("Java"));
    IO.println(frase.indexOf("linguagem"));
    ```

    Nota: os três exemplos acima são complementos didáticos para reunir os métodos estudados; os exemplos da fonte estão registrados nas seções correspondentes.

    ## 🔎 Explicação do código

    ### 1. O que é uma String?

    Pense em uma String como uma sequência de caracteres agrupados em um único objeto. Em vez de guardar cada letra em uma variável separada, você armazena todo o texto em uma variável do tipo `String`.

    ### 2. O que significa imutabilidade?

    Imagine que uma String é um texto escrito em uma folha que não pode ser apagada nem modificada. Quando você utiliza um método para substituir ou transformar parte desse texto, o Java produz outra String com o resultado. O objeto original permanece inalterado.

    ### 3. Como funcionam os índices?

    Imagine uma fila de caracteres em que a primeira posição é zero. `charAt(0)` acessa o primeiro caractere. O método `substring(0, 4)` começa na posição zero e termina antes da posição quatro.

    ### 4. Como funciona a pesquisa?

    `indexOf()` procura um conteúdo e informa a posição onde ele começa. Se não encontrar, retorna `-1`. Já `contains()` responde apenas se o conteúdo existe ou não, com `true` ou `false`.

    ### 5. Como funcionam as conversões?

    Uma informação digitada pode chegar como String mesmo quando representa um número. Para fazer cálculos, é necessário converter esse texto para um tipo numérico. No sentido contrário, um número pode ser convertido em String quando precisar fazer parte de uma mensagem.

    ### 6. Lei de Feynman

    Tente explicar sem consultar o material:

    - Por que String é considerada um objeto?
    - O que significa dizer que uma String é imutável?
    - Por que o índice do primeiro caractere é zero?
    - Qual é a diferença entre `charAt()` e `substring()`?
    - Qual é a diferença entre `indexOf()` e `contains()`?
    - Por que precisamos converter uma String em número antes de realizar operações aritméticas?

    ## ⚠️ Pontos de atenção

    - Utilize aspas duplas para literais de String e aspas simples para literais de `char`.
    - Não confunda `length()` com o último índice: o último índice é `length() - 1`.
    - Em `substring(inicio, fim)`, o índice final não faz parte do resultado.
    - Uma String é imutável: métodos de manipulação retornam uma nova String ou o próprio objeto quando nenhuma alteração é necessária.
    - `indexOf()` e `lastIndexOf()` retornam `-1` quando não encontram o conteúdo.
    - `valueOf()` retorna um objeto wrapper numérico; métodos como `parseFloat()` retornam tipos primitivos.
    - `equals()` verifica igualdade de conteúdo; não substitua essa comparação por `==` quando a intenção for comparar o texto.
    - `replaceAll()`, `replaceFirst()`, `split()` e `matches()` trabalham com expressões regulares conforme descrito pela fonte.
    - Text blocks utilizam três aspas duplas e estão disponíveis a partir do Java SE 15.
    - A classe `Filename` apresentada na fonte é didática e não realiza validações de entrada.

    ## 📝 Resumo

    Em Java, Strings são objetos que representam sequências de caracteres. A classe `String` oferece métodos para consultar o comprimento, acessar caracteres, extrair partes, concatenar, formatar, converter, pesquisar, substituir e comparar textos.

    A característica central da classe é a imutabilidade: operações que parecem modificar uma String produzem um novo resultado, sem alterar o objeto original. Os índices começam em zero, e métodos como `substring()`, `indexOf()` e `lastIndexOf()` permitem trabalhar com partes específicas do texto.

    **Ideia central:** dominar a classe `String` é essencial para receber, transformar, pesquisar, comparar e apresentar informações textuais em programas Java.

    ## 🏋️ Exercícios

    Resolva no IntelliJ. Antes de executar, tente prever o resultado de cada operação. Não consulte soluções prontas.

    ### Exercício 1 — Criando uma String

    Declare uma variável `String` com uma frase sobre o que está estudando. Exiba a frase no console.

    ### Exercício 2 — Comprimento

    Utilize `length()` para descobrir quantos caracteres existem na frase criada no exercício anterior.

    ### Exercício 3 — Primeiro e último caractere

    Utilize `charAt()` para exibir o primeiro e o último caractere da frase. Lembre-se de calcular o índice final.

    ### Exercício 4 — Extraindo uma palavra

    Utilize `substring()` para extrair uma palavra da frase. Informe os índices inicial e final e explique por que o índice final não aparece no resultado.

    ### Exercício 5 — Concatenação

    Crie três variáveis String: nome, linguagem e objetivo. Una os valores utilizando o operador `+` e, depois, tente construir a mesma mensagem com `concat()`.

    ### Exercício 6 — Pesquisa

    Utilize `indexOf()` para localizar uma palavra em uma frase. Depois, teste uma palavra que não existe e observe o retorno.

    ### Exercício 7 — Verificação de conteúdo

    Utilize `contains()` para verificar se uma frase contém determinada palavra. Exiba o resultado.

    ### Exercício 8 — Maiúsculas e minúsculas

    Utilize `toUpperCase()` e `toLowerCase()`. Compare os resultados e verifique se a String original foi alterada.

    ### Exercício 9 — Substituição

    Utilize `replace()` para trocar uma palavra ou caractere por outro. Exiba a String original e o resultado da substituição.

    ### Exercício 10 — Conversão de texto em número

    Declare duas variáveis String contendo valores numéricos. Converta-as utilizando `Float.parseFloat()` e realize uma soma.

    ### Exercício 11 — Conversão de número em texto

    Declare uma variável `int`. Converta seu valor para String utilizando `String.valueOf()` e concatene o resultado a uma mensagem.

    ### Exercício 12 — Encontrando ocorrências

    Crie uma frase em que uma palavra apareça pelo menos três vezes. Utilize `indexOf()` em um laço para encontrar e exibir todas as posições.

    ### Exercício 13 — Lei de Feynman

    Explique com suas próprias palavras:

    1. O que é uma String?
    2. Por que a classe String é imutável?
    3. Qual é a diferença entre `length()` e `charAt()`?
    4. Como funciona `substring()`?
    5. O que acontece quando `indexOf()` não encontra uma palavra?
    6. Qual é a diferença entre `valueOf()` e `parseFloat()`?
    7. Por que `equals()` é utilizado para comparar o conteúdo de strings?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. O que é uma String em Java?
    2. Qual classe é utilizada para criar e manipular strings?
    3. Como declarar uma String literal?
    4. O que significa dizer que String é imutável?
    5. Qual método retorna o comprimento de uma String?
    6. Qual método retorna o caractere de determinado índice?
    7. A partir de qual índice começa a contagem dos caracteres?
    8. Qual é o último índice de uma String?
    9. Qual é a diferença entre `substring(inicio, fim)` e `substring(inicio)`?
    10. O índice final de `substring()` é incluído no resultado?
    11. Qual é a diferença entre `concat()` e o operador `+`?
    12. O que são text blocks e a partir de qual versão do Java estão disponíveis?
    13. Para que serve `String.format()`?
    14. Qual é a diferença entre `valueOf()` e `parseFloat()`?
    15. Como converter um número em String?
    16. Qual é a diferença entre `indexOf()` e `lastIndexOf()`?
    17. O que significa o retorno `-1` em uma pesquisa?
    18. Para que serve `contains()`?
    19. Qual é a finalidade de `split()`?
    20. Qual é a diferença entre `replace()`, `replaceAll()` e `replaceFirst()`?
    21. Qual é a diferença entre `equals()` e `equalsIgnoreCase()`?
    22. O que o método `compareTo()` retorna?
    23. Para que serve `regionMatches()`?
    24. Como o exemplo da classe `Filename` separa caminho, nome e extensão?

    ## ✅ Checklist

    - [ ]  Entendi que String é um objeto em Java.
    - [ ]  Sei criar Strings com literais e com array de caracteres.
    - [ ]  Entendi a imutabilidade da classe String.
    - [ ]  Sei utilizar `length()`.
    - [ ]  Sei acessar caracteres com `charAt()`.
    - [ ]  Entendi como os índices começam em zero.
    - [ ]  Sei extrair partes com `substring()`.
    - [ ]  Sei concatenar com `+` e `concat()`.
    - [ ]  Entendi a estrutura básica dos text blocks.
    - [ ]  Sei para que serve `String.format()`.
    - [ ]  Sei converter strings em números.
    - [ ]  Sei converter números em strings.
    - [ ]  Conheço os métodos de pesquisa `indexOf()` e `lastIndexOf()`.
    - [ ]  Sei utilizar `contains()`.
    - [ ]  Conheço os métodos de substituição.
    - [ ]  Sei utilizar métodos de comparação de strings.
    - [ ]  Entendi o exemplo de separação de caminho, nome e extensão de arquivo.
    - [ ]  Consigo explicar os principais conceitos sem consultar as anotações.

    ---

    **Referência:** Dev.java — Strings.

    **Última atualização informada pela fonte:** 14 de setembro de 2021.
         */
    }
}
