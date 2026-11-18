public class Numeros_notion {
    public static void main(String[] args) {
        /*
        - **Números**

    ## 🎯 Objetivo

    Conhecer as classes numéricas do Java, entender quando utilizar objetos em vez de tipos primitivos, formatar valores numéricos e utilizar a classe `Math` para cálculos matemáticos.

    ## 📚 Conceitos

    ### 1. Tipos primitivos e classes wrapper

    Na maioria das situações, os números são representados pelos tipos primitivos:

    ```java
    int i = 500;
    float gpa = 3.65f;
    byte mask = 0x7f;
    ```

    Entretanto, existem situações em que é necessário utilizar objetos em vez de valores primitivos. Para isso, a plataforma Java oferece classes wrapper, que encapsulam os valores primitivos em objetos.

    Quando um método ou estrutura espera um objeto e recebe um primitivo, o compilador pode realizar o *autoboxing*. Quando espera um primitivo e recebe um objeto wrapper, pode realizar o *unboxing*.

    As classes wrapper numéricas são subclasses da classe abstrata `Number`.

    A fonte destaca também quatro subclasses de `Number` que não são aprofundadas nesta seção:

    - `BigDecimal` e `BigInteger`: utilizadas em cálculos de alta precisão.
    - `AtomicInteger` e `AtomicLong`: utilizadas em aplicações multithread.

    ### 2. Quando utilizar um objeto Number?

    A lição apresenta três motivos:

    1. Passar um número como argumento para um método que espera um objeto, situação comum ao manipular coleções de números.
    2. Utilizar constantes da classe, como `MIN_VALUE` e `MAX_VALUE`, que representam os limites inferior e superior do tipo.
    3. Utilizar métodos da classe para converter valores entre tipos primitivos, strings e sistemas numéricos, como decimal, octal, hexadecimal e binário.

    ### 3. Métodos da classe Number

    As subclasses de `Number` implementam métodos que convertem o valor do objeto para tipos primitivos:

    | Método | Conversão |
    | --- | --- |
    | `byteValue()` | `byte` |
    | `shortValue()` | `short` |
    | `intValue()` | `int` |
    | `longValue()` | `long` |
    | `floatValue()` | `float` |
    | `doubleValue()` | `double` |

    Também existem métodos de comparação:

    - `compareTo(...)`: compara o objeto numérico com outro objeto do mesmo tipo wrapper.
    - `equals(Object obj)`: verifica se o argumento não é `null`, se é um objeto do mesmo tipo e se possui o mesmo valor numérico. A fonte observa que `Double` e `Float` possuem requisitos adicionais documentados na API Java.

    ### 4. Conversões com Integer

    A lição apresenta os seguintes métodos da classe `Integer`:

    | Método | Descrição |
    | --- | --- |
    | `Integer.decode(String s)` | Decodifica uma string que representa um número decimal, octal ou hexadecimal. |
    | `Integer.parseInt(String s)` | Converte uma string decimal em `int`. |
    | `Integer.parseInt(String s, int radix)` | Converte uma string para inteiro considerando a base informada. |
    | `toString()` | Retorna uma representação textual do objeto `Integer`. |
    | `Integer.toString(int i)` | Converte o inteiro informado em `String`. |
    | `Integer.valueOf(int i)` | Retorna um objeto `Integer` com o valor primitivo informado. |
    | `Integer.valueOf(String s)` | Retorna um objeto `Integer` a partir de uma representação textual. |
    | `Integer.valueOf(String s, int radix)` | Converte uma string para `Integer` considerando a base informada. |

    Exemplo de base numérica citado pela fonte: se `s = "333"` e `radix = 8`, o método interpreta `333` como octal e retorna o valor inteiro equivalente na base decimal.

    ### 5. Formatando a saída numérica com PrintStream

    Os métodos `print()` e `println()` permitem imprimir strings e números, pois os valores numéricos podem ser convertidos em texto.

    Para controlar melhor a apresentação dos números, a classe `PrintStream`, do pacote `java.io`, oferece os métodos `format()` e `printf()`. Eles são equivalentes.

    O objeto `System.out` é uma instância de `PrintStream`, portanto podemos chamar esses métodos diretamente nele.

    Sintaxe apresentada pela fonte:

    ```java
    public PrintStream format(String format, Object... args)
    ```

    - `format`: string que define como os argumentos serão apresentados.
    - `args`: lista variável de argumentos que serão formatados.
    - `Object... args`: utiliza *varargs*, permitindo uma quantidade variável de argumentos.

    Os especificadores de formato começam com `%` e terminam com um caractere conversor. Entre eles podem existir flags e especificadores opcionais.

    Exemplo da fonte:

    ```java
    int i = 461012;
    System.out.format("The value of i is: %d%n", i);
    ```

    Saída:

    ```
    The value of i is: 461012
    ```

    Nesse exemplo:

    - `%d` representa um número inteiro decimal.
    - `%n` insere uma quebra de linha independente da plataforma.

    ### 6. Conversores e flags de formatação

    A tabela resume os especificadores apresentados na lição:

    | Especificador | Significado |
    | --- | --- |
    | `%d` | Número inteiro decimal. |
    | `%f` | Número de ponto flutuante. |
    | `%n` | Nova linha apropriada à plataforma. |
    | `%tB` | Nome completo do mês, conforme a localidade. |
    | `%td`, `%te` | Dia do mês; `td` utiliza zero à esquerda quando necessário e `te` não. |
    | `%ty`, `%tY` | Ano com dois ou quatro dígitos, respectivamente. |
    | `%tl` | Hora no formato de 12 horas. |
    | `%tM` | Minutos com dois dígitos. |
    | `%tp` | Indicador am/pm conforme a localidade. |
    | `%tm` | Mês com dois dígitos. |
    | `%tD` | Data no formato equivalente a mês/dia/ano com dois dígitos. |

    Flags e especificadores adicionais:

    | Elemento | Significado |
    | --- | --- |
    | `%08d` | Largura de oito caracteres, preenchendo com zeros à esquerda. |
    | `%+` | Inclui o sinal positivo ou negativo. |
    | `%,` | Inclui separadores de agrupamento conforme a localidade. |
    | `%-` | Alinha o valor à esquerda. |
    | `%.3f` | Exibe três casas após o separador decimal. |
    | `%10.3f` | Largura de dez caracteres, alinhamento à direita e três casas decimais. |

    A fonte recomenda utilizar `%n` em vez de `\n` para que a quebra de linha seja apropriada à plataforma.

    ### 7. Localidade com Locale

    Os métodos `printf()` e `format()` também possuem uma versão que recebe um objeto `Locale`.

    Isso permite formatar números de acordo com convenções regionais.

    Exemplo da fonte:

    ```java
    System.out.format(Locale.FRANCE,
        "The value of the float variable is %f, while the " +
        "value of the integer variable is %d, and the string is %s%n",
        floatVar, intVar, stringVar);
    ```

    A fonte utiliza a localidade francesa para demonstrar o uso de vírgula como separador decimal.

    ### 8. Exemplo completo de formatação com format

    Exemplo apresentado na lição:

    ```java
    import java.util.Calendar;
    import java.util.Locale;

    public class TestFormat {

        void main() {
            long n = 461012;
            System.out.format("%d%n", n);       // "461012"
            System.out.format("%08d%n", n);     // "00461012"
            System.out.format("%+8d%n", n);     // " +461012"
            System.out.format("%,8d%n", n);     // " 461,012"
            System.out.format("%+,8d%n%n", n);  // "+461,012"

            double pi = Math.PI;

            System.out.format("%f%n", pi);       // "3.141593"
            System.out.format("%.3f%n", pi);     // "3.142"
            System.out.format("%10.3f%n", pi);   // "     3.142"
            System.out.format("%-10.3f%n", pi);  // "3.142"
            System.out.format(Locale.FRANCE,
                              "%-10.4f%n%n", pi); // "3,1416"

            Calendar c = Calendar.getInstance();
            System.out.format("%tB %te, %tY%n", c, c, c);
            System.out.format("%tl:%tM %tp%n", c, c, c);
            System.out.format("%tD%n", c);
        }
    }
    ```

    A saída de data e hora depende do momento em que o programa é executado e da localidade utilizada.

    A fonte informa que a seção apresenta apenas o básico de `format()` e `printf()`; detalhes adicionais são abordados no tutorial de entrada e saída. O uso de `String.format()` é tratado na seção sobre strings.

    ### 9. A classe DecimalFormat

    A classe `DecimalFormat`, do pacote `java.text`, permite controlar a apresentação de números, incluindo:

    - Zeros à esquerda e à direita.
    - Prefixos e sufixos.
    - Separadores de agrupamento (milhares).
    - Separador decimal.

    Ela oferece flexibilidade, mas pode tornar o código mais complexo.

    O padrão é informado ao construtor de `DecimalFormat`. Depois, o método `format()` recebe um valor numérico e retorna uma string formatada.

    Exemplo da fonte:

    ```java
    import java.text.*;

    public class DecimalFormatDemo {

        static public void customFormat(String pattern, double value) {
            DecimalFormat myFormatter = new DecimalFormat(pattern);
            String output = myFormatter.format(value);
            IO.println(value + "  " + pattern + "  " + output);
        }

        static public void main(String[] args) {
            customFormat("###,###.###", 123456.789);
            customFormat("###.##", 123456.789);
            customFormat("000000.000", 123.78);
            customFormat("$###,###.###", 12345.67);
        }
    }
    ```

    Saída apresentada pela fonte:

    ```
    123456.789  ###,###.###  123,456.789
    123456.789  ###.##  123456.79
    123.78  000000.000  000123.780
    12345.67  $###,###.###  $12,345.67
    ```

    Interpretação dos padrões:

    | Padrão | Resultado | Explicação |
    | --- | --- | --- |
    | `###,###.###` | `123,456.789` | `#` representa um dígito; vírgula e ponto indicam posições dos separadores. |
    | `###.##` | `123456.79` | O padrão possui duas casas decimais; o valor é arredondado. |
    | `000000.000` | `000123.780` | `0` exige zeros à esquerda e à direita. |
    | `$###,###.###` | `$12,345.67` | O prefixo `$` aparece antes do primeiro dígito. |

    ### 10. Além da aritmética básica: classe Math

    Os operadores aritméticos `+`, `-`, `*`, `/` e `%` permitem realizar operações básicas.

    Para cálculos matemáticos adicionais, a classe `Math`, do pacote `java.lang`, oferece constantes e métodos estáticos. Como os métodos são estáticos, podem ser chamados diretamente pela classe:

    ```java
    Math.cos(angle);
    ```

    A fonte também demonstra que é possível utilizar importação estática:

    ```java
    import static java.lang.Math.*;
    ```

    Com isso, os métodos podem ser chamados sem escrever `Math.` antes do nome, por exemplo: `cos(angle)`.

    ### 11. Constantes e métodos básicos de Math

    A classe `Math` possui duas constantes destacadas pela lição:

    - `Math.E`: base dos logaritmos naturais.
    - `Math.PI`: razão entre a circunferência de um círculo e seu diâmetro.

    A fonte também apresenta os seguintes métodos:

    **Valor absoluto**

    | Método | Função |
    | --- | --- |
    | `Math.abs(double d)` | Retorna o valor absoluto de um `double`. |
    | `Math.abs(float f)` | Retorna o valor absoluto de um `float`. |
    | `Math.abs(int i)` | Retorna o valor absoluto de um `int`. |
    | `Math.abs(long lng)` | Retorna o valor absoluto de um `long`. |

    **Arredondamento**

    | Método | Função |
    | --- | --- |
    | `Math.ceil(double d)` | Retorna o menor inteiro maior ou igual ao argumento, como `double`. |
    | `Math.floor(double d)` | Retorna o maior inteiro menor ou igual ao argumento, como `double`. |
    | `Math.rint(double d)` | Retorna o inteiro mais próximo, como `double`. |
    | `Math.round(double d)` | Retorna o `long` mais próximo. |
    | `Math.round(float f)` | Retorna o `int` mais próximo. |

    **Mínimo e máximo**

    A classe oferece sobrecargas de `Math.min()` e `Math.max()` para os tipos `double`, `float`, `int` e `long`.

    - `Math.min(a, b)`: retorna o menor dos valores.
    - `Math.max(a, b)`: retorna o maior dos valores.

    Exemplo da fonte:

    ```java
    public class BasicMathDemo {
        public static void main(String[] args) {
            double a = -191.635;
            double b = 43.74;
            int c = 16, d = 45;

            System.out.printf("The absolute value of %.3f is %.3f%n",
                              a, Math.abs(a));

            System.out.printf("The ceiling of %.2f is %.0f%n",
                              b, Math.ceil(b));

            System.out.printf("The floor of %.2f is %.0f%n",
                              b, Math.floor(b));

            System.out.printf("The rint of %.2f is %.0f%n",
                              b, Math.rint(b));

            System.out.printf("The max of %d and %d is %d%n",
                              c, d, Math.max(c, d));

            System.out.printf("The min of %d and %d is %d%n",
                              c, d, Math.min(c, d));
        }
    }
    ```

    Saída apresentada pela fonte:

    ```
    The absolute value of -191.635 is 191.635
    The ceiling of 43.74 is 44
    The floor of 43.74 is 43
    The rint of 43.74 is 44
    The max of 16 and 45 is 45
    The min of 16 and 45 is 16
    ```

    ### 12. Métodos exponenciais e logarítmicos

    A classe `Math` também oferece métodos para cálculos exponenciais e logarítmicos:

    | Método | Função |
    | --- | --- |
    | `Math.exp(d)` | Retorna a constante (e) elevada ao argumento. |
    | `Math.log(d)` | Retorna o logaritmo natural do argumento. |
    | `Math.pow(base, exponent)` | Eleva a base ao expoente informado. |
    | `Math.sqrt(d)` | Retorna a raiz quadrada do argumento. |

    Exemplo da fonte:

    ```java
    public class ExponentialDemo {
        public static void main(String[] args) {
            double x = 11.635;
            double y = 2.76;

            System.out.printf("The value of e is %.4f%n", Math.E);
            System.out.printf("exp(%.3f) is %.3f%n", x, Math.exp(x));
            System.out.printf("log(%.3f) is %.3f%n", x, Math.log(x));
            System.out.printf("pow(%.3f, %.3f) is %.3f%n",
                              x, y, Math.pow(x, y));
            System.out.printf("sqrt(%.3f) is %.3f%n", x, Math.sqrt(x));
        }
    }
    ```

    Saída apresentada pela fonte:

    ```
    The value of e is 2.7183
    exp(11.635) is 112983.831
    log(11.635) is 2.454
    pow(11.635, 2.760) is 874.008
    sqrt(11.635) is 3.411
    ```

    ### 13. Métodos trigonométricos

    A classe `Math` fornece funções trigonométricas. A fonte ressalta que os ângulos passados a esses métodos devem estar em radianos.

    Para converter graus em radianos, utilize `Math.toRadians()`. Para converter radianos em graus, utilize `Math.toDegrees()`.

    | Método | Função |
    | --- | --- |
    | `Math.sin(d)` | Seno do valor informado. |
    | `Math.cos(d)` | Cosseno do valor informado. |
    | `Math.tan(d)` | Tangente do valor informado. |
    | `Math.asin(d)` | Arco-seno do valor informado. |
    | `Math.acos(d)` | Arco-cosseno do valor informado. |
    | `Math.atan(d)` | Arco-tangente do valor informado. |
    | `Math.atan2(y, x)` | Converte coordenadas retangulares `(x, y)` em coordenadas polares e retorna o ângulo `theta`. |
    | `Math.toDegrees(d)` | Converte radianos em graus. |
    | `Math.toRadians(d)` | Converte graus em radianos. |

    Exemplo da fonte com um ângulo de 45 graus:

    ```java
    public class TrigonometricDemo {
        public static void main(String[] args) {
            double degrees = 45.0;
            double radians = Math.toRadians(degrees);

            System.out.format("The value of pi is %.4f%n", Math.PI);
            System.out.format("The sine of %.1f degrees is %.4f%n",
                              degrees, Math.sin(radians));
            System.out.format("The cosine of %.1f degrees is %.4f%n",
                              degrees, Math.cos(radians));
            System.out.format("The tangent of %.1f degrees is %.4f%n",
                              degrees, Math.tan(radians));
            System.out.format("The arcsine of %.4f is %.4f degrees%n",
                              Math.sin(radians),
                              Math.toDegrees(Math.asin(Math.sin(radians))));
            System.out.format("The arccosine of %.4f is %.4f degrees%n",
                              Math.cos(radians),
                              Math.toDegrees(Math.acos(Math.cos(radians))));
            System.out.format("The arctangent of %.4f is %.4f degrees%n",
                              Math.tan(radians),
                              Math.toDegrees(Math.atan(Math.tan(radians))));
        }
    }
    ```

    Saída apresentada pela fonte:

    ```
    The value of pi is 3.1416
    The sine of 45.0 degrees is 0.7071
    The cosine of 45.0 degrees is 0.7071
    The tangent of 45.0 degrees is 1.0000
    The arcsine of 0.7071 is 45.0000 degrees
    The arccosine of 0.7071 is 45.0000 degrees
    The arctangent of 1.0000 is 45.0000 degrees
    ```

    ### 14. Números aleatórios

    O método `Math.random()` retorna um número pseudoaleatório no intervalo:

    `0.0 <= Math.random() < 1.0`

    O intervalo inclui `0.0), mas não inclui` 1.0`.

    Para obter um inteiro entre 0 e 9, a fonte apresenta:

    ```java
    int number = (int)(Math.random() * 10);
    ```

    A multiplicação por 10 transforma o intervalo em valores de `0.0` até antes de `10.0`; o cast para `int` descarta a parte decimal.

    A lição recomenda `Math.random()` quando é necessário gerar um único número. Para gerar uma sequência de números aleatórios, recomenda criar uma instância de `java.util.Random` e chamar seus métodos.

    ## 🧠 O que memorizar

    - Os tipos primitivos são normalmente utilizados para representar números.
    - As classes wrapper representam valores primitivos como objetos.
    - As classes wrapper numéricas são subclasses de `Number`.
    - *Autoboxing* converte automaticamente um primitivo em objeto wrapper; *unboxing* realiza o caminho inverso.
    - `parseInt()` converte uma string em inteiro primitivo; `valueOf()` retorna um objeto `Integer`.
    - `format()` e `printf()` são métodos equivalentes de `PrintStream`.
    - `%d` formata inteiro, `%f` formata ponto flutuante e `%n` representa uma nova linha.
    - `DecimalFormat` permite controlar a apresentação de números por meio de padrões.
    - Os métodos da classe `Math` são estáticos.
    - `Math.PI` representa pi e `Math.E` representa a base dos logaritmos naturais.
    - `ceil()`, `floor()`, `rint()` e `round()` realizam operações diferentes de arredondamento.
    - Os métodos trigonométricos recebem ângulos em radianos.
    - `Math.random()` retorna um valor maior ou igual a zero e menor que um.

    ## 💻 Exemplos de código

    Os exemplos completos da fonte estão distribuídos nas seções de conceitos. Abaixo, um complemento didático reúne algumas operações comuns:

    ```java
    public class NumericPractice {
        public static void main(String[] args) {
            String texto = "250";
            int numero = Integer.parseInt(texto);

            System.out.printf("Número: %d%n", numero);
            System.out.printf("Dobro: %d%n", numero * 2);
            System.out.printf("Raiz quadrada: %.2f%n", Math.sqrt(numero));

            int aleatorio = (int) (Math.random() * 10);
            System.out.printf("Aleatório de 0 a 9: %d%n", aleatorio);
        }
    }
    ```

    *Este último exemplo é um complemento didático, não um exemplo transcrito da fonte.*

    ## 🔎 Explicação do código

    ### 1. Por que existem classes wrapper?

    Imagine que um método recebe objetos, mas você possui um valor primitivo como `int`. A classe wrapper permite representar esse número como objeto. O compilador pode realizar a conversão automaticamente por *autoboxing*.

    ### 2. Como entender parseInt e valueOf?

    Pense em uma string como uma etiqueta com o texto `"250"`. `parseInt()` transforma esse texto em um valor primitivo `int`; `valueOf()` fornece um objeto `Integer` com o valor correspondente.

    ### 3. Como funciona a formatação?

    O especificador informa como o argumento deve aparecer. Por exemplo, `%.2f` solicita duas casas decimais. Já `%08d` solicita largura de oito caracteres, completando com zeros à esquerda.

    ### 4. Como pensar na classe Math?

    A classe `Math` funciona como uma caixa de ferramentas matemáticas. Em vez de implementar cada cálculo manualmente, você chama o método correspondente, como `Math.sqrt()` para raiz quadrada ou `Math.pow()` para potência.

    ### 5. Lei de Feynman

    Explique como se estivesse ensinando alguém que nunca programou:

    - Um tipo primitivo guarda diretamente um valor.
    - Uma classe wrapper permite representar esse valor como objeto.
    - A formatação transforma números em uma apresentação textual controlada.
    - A classe `Math` oferece operações matemáticas prontas.
    - `Math.random()` fornece um valor pseudoaleatório dentro de um intervalo definido.

    ## ⚠️ Pontos de atenção

    - Não confunda tipo primitivo com sua classe wrapper: `int` e `Integer` não são o mesmo tipo.
    - `parseInt()` retorna `int`; `valueOf()` retorna `Integer`.
    - `equals()` compara objetos; a fonte também apresenta `compareTo()` para comparação entre objetos numéricos.
    - `format()` e `printf()` são equivalentes na classe `PrintStream`.
    - Utilize `%n` para quebra de linha independente da plataforma, conforme a recomendação da fonte.
    - `DecimalFormat` utiliza padrões: `#` representa dígitos opcionais e `0` exige preenchimento com zeros.
    - `ceil()` arredonda para cima; `floor()` para baixo; `round()` retorna o inteiro mais próximo conforme seu tipo de retorno.
    - Os métodos trigonométricos apresentados recebem radianos, não graus.
    - `Math.random()` não inclui o limite superior do intervalo.
    - A fonte recomenda `java.util.Random` para gerar uma série de números.

    ## 📝 Resumo

    A lição apresenta três grandes áreas. Primeiro, as classes wrapper e `Number`, que permitem trabalhar com números como objetos e realizar conversões. Depois, os recursos de formatação com `PrintStream` e `DecimalFormat`, que controlam como números aparecem na saída. Por fim, a classe `Math`, que oferece constantes e métodos para cálculos básicos, arredondamentos, operações exponenciais, logaritmos, trigonometria e geração de números pseudoaleatórios.

    **Ideia central:** além de armazenar números em tipos primitivos, Java oferece classes para representá-los como objetos, formatá-los e realizar cálculos matemáticos.

    ## 🏋️ Exercícios

    Tente resolver no IntelliJ antes de consultar qualquer solução. Priorize escrever, executar e explicar o que o código faz.

    ### Exercício 1 — Primitivo e wrapper

    Declare uma variável `int` e uma variável `Integer`. Explique a diferença entre elas e teste a atribuição de uma à outra.

    ### Exercício 2 — Conversão de texto

    Crie uma variável `String` com o texto `"125"`. Converta-a para `int` utilizando `Integer.parseInt()` e calcule o dobro.

    ### Exercício 3 — Outras bases

    Utilize `Integer.parseInt()` com o argumento `radix` para interpretar uma string na base 2 e outra na base 8. Compare os resultados.

    ### Exercício 4 — Formatação com printf

    Declare um inteiro e um número decimal. Exiba-os utilizando `%d`, `%f`, `%.2f` e `%n`.

    ### Exercício 5 — DecimalFormat

    Crie um objeto `DecimalFormat` e formate o valor `12345.678` utilizando os padrões `###,###.##` e `000000.000`. Compare os resultados.

    ### Exercício 6 — Métodos Math

    Declare dois números e utilize `Math.abs()`, `Math.max()`, `Math.min()`, `Math.ceil()` e `Math.floor()`. Explique o resultado de cada chamada.

    ### Exercício 7 — Potência e raiz quadrada

    Utilize `Math.pow()` para calcular uma potência e `Math.sqrt()` para calcular uma raiz quadrada.

    ### Exercício 8 — Graus e radianos

    Converta 90 graus para radianos com `Math.toRadians()`. Depois, utilize `Math.sin()` com o valor convertido.

    ### Exercício 9 — Número aleatório

    Utilize `Math.random()` para gerar um inteiro entre 0 e 9. Execute o programa várias vezes e observe os resultados.

    ### Exercício 10 — Lei de Feynman

    Explique com suas palavras:

    1. Por que existem classes wrapper?
    2. Qual é a diferença entre `parseInt()` e `valueOf()`?
    3. Para que servem `printf()` e `format()`?
    4. Qual é a diferença entre `DecimalFormat` e `Math`?
    5. Por que os métodos trigonométricos utilizam radianos?
    6. Qual é o intervalo retornado por `Math.random()`?

    ## 🔄 Revisão

    Responda sem consultar as anotações:

    1. Qual é a função da classe `Number`?
    2. Quais são as três situações em que a lição recomenda utilizar objetos numéricos?
    3. O que fazem `byteValue()`, `intValue()` e `doubleValue()`?
    4. Qual é a diferença entre `compareTo()` e `equals()`?
    5. Qual é a diferença entre `parseInt()` e `valueOf()`?
    6. O que significa o parâmetro `radix`?
    7. Por que `System.out` permite chamar `printf()` e `format()`?
    8. O que representam `%d`, `%f` e `%n`?
    9. Para que serve `Locale` na formatação?
    10. Qual é a função de `DecimalFormat`?
    11. O que representam os símbolos `#` e `0` nos padrões de `DecimalFormat`?
    12. Qual é a diferença entre `ceil()`, `floor()`, `rint()` e `round()`?
    13. O que representam `Math.PI` e `Math.E`?
    14. Quais métodos da classe `Math` realizam potência e raiz quadrada?
    15. Em qual unidade os métodos trigonométricos recebem os ângulos?
    16. Qual é o intervalo de retorno de `Math.random()`?
    17. Quando a fonte recomenda utilizar `java.util.Random`?

    ## ✅ Checklist

    - [ ]  Entendi a diferença entre tipos primitivos e classes wrapper.
    - [ ]  Sei explicar o que é *autoboxing* e *unboxing*.
    - [ ]  Conheço a finalidade da classe `Number`.
    - [ ]  Sei diferenciar `parseInt()` e `valueOf()`.
    - [ ]  Entendi o parâmetro `radix` nas conversões.
    - [ ]  Sei utilizar `printf()` ou `format()` para formatar números.
    - [ ]  Reconheço os especificadores `%d`, `%f` e `%n`.
    - [ ]  Entendi como `Locale` influencia a formatação.
    - [ ]  Sei utilizar padrões básicos de `DecimalFormat`.
    - [ ]  Conheço as constantes `Math.PI` e `Math.E`.
    - [ ]  Sei utilizar métodos básicos da classe `Math`.
    - [ ]  Entendi a diferença entre os métodos de arredondamento.
    - [ ]  Sei que os métodos trigonométricos recebem radianos.
    - [ ]  Entendi o intervalo de `Math.random()`.
    - [ ]  Consigo explicar os principais conceitos sem consultar as anotações.

    ---

    **Referência:** Dev.java — Numbers.

    **Última atualização informada pela fonte:** 14 de setembro de 2021.
         */
    }
}
