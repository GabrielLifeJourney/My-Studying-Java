public class TiposPrimitivos {
    static void main(String[] args) {
        // Os 8 Tipos Primitivos
        /*
        | Tipo | Tamanho | Utilização |
        | --- | --- | --- |
        | `byte` | 8 bits | Inteiros pequenos |
        | `short` | 16 bits | Inteiros |
        | `int` | 32 bits | Inteiros comuns |
        | `long` | 64 bits | Inteiros grandes |
        | `float` | 32 bits | Decimais |
        | `double` | 64 bits | Decimais com maior precisão |
        | `boolean` | Não definido precisamente | Verdadeiro ou falso |
        | `char` | 16 bits | Um caractere Unicode |
         */
//Tipos Inteiros
        //      byte
        /*
            - Tamanho: 8 bits.
            - Valor mínimo: -128.
            - Valor máximo: 127.
         */
        byte idade = 23;
        //      short
        /*
            - Tamanho: 16 bits.
            - Valor min: -32.768
            - Valor max: 32.767
         */
        short quantidade = 15000;
        //      int
        /*
            - Tamanho: 32 bits.
            - Valor min: -2sub31
            - Valor max: 2sub31 -1.
         */
        int ano = 2026;
        // e o mais utilizado em situacoes comuns.
        //      long
        /*
            - Tamanho: 64 bits.
            - Valor max: -2sub63.
            - Valor min: 2sub63 -1.
         */
        long populacao = 800000000L;
        // observa que tem l .Ele indentifica literalmente do tipo "long"
//Tipos Decimais
        //      float
        /*
            - Tamanho: 32 bits.
            - Ponto flutuante de precisao simples
            - Utiliza o sufio f ou F.
         */
        float altura = 1.78f;
        //      double
        /*
            - Tamanho: 64 bits.
            - Ponto flutuante de precisao dupla.
            - E a escolha padrao para numeros decimais comuns.
         */
        double peso = 83.6;
        /*
        ⚠️ Atenção: float e double não devem ser utilizados para representar valores monetários que exigem precisão decimal exata. A documentação recomenda BigDecimal, da biblioteca java.math.
         */
// Tipo Logico
        //      boolean
        // obs: Possui somente dois valores possiveis:
        /*
            - true: verdadeiro
            - false: falso
         */
        boolean aprovado = true ;
        boolean reprovado = false ;
        // e utilizado para representar condições e estados logicos.
// Tipo Caractere
        //      Char
        /*
            - Tamanho: 16 bits.
            - Armazena um caractere Unicode.
         */
        char letra = 'K';
        char numero = '7';
        char simbolo = '@';
        //Importante: caracteres utilizam aspas simples.

        // String em Java
        // Exemplo
        String nome = "Kelvyn";
        String mensagem = "Estou estudando Java";

        // Principal diferença entre char e String :
        /*
                char  letra = 'K';
                String nome = "Kelvyn";
         */
        /*
            char utiliza aspas simples
            String utiliza aspas duplas
         */
        /*
        ## Imutabilidade das Strings

        Os objetos `String` são imutáveis (*immutable*).

        Isso significa que, depois de criados, seus valores não podem ser modificados.
         */

        /*
                # 🧠 2. O que memorizar

                Os 8 tipos primitivos:

                | Inteiros | Decimais | Outros |
                | --- | --- | --- |
                | byte | float | boolean |
                | short | double | char |
                | int |  |  |
                | long |  |  |

                Diferenças importantes:

                - `int` → números inteiros.
                - `double` → números decimais.
                - `boolean` → verdadeiro ou falso.
                - `char` → um caractere.
                - `String` → sequência de caracteres.

                **Atenção:** `String` não é um tipo primitivo. É uma classe especial da biblioteca Java.
         */

        //  Valores padrao das variaveis
        //Quando um campo é declarado sem receber um valor inicial, Java atribui um valor padrão conforme o tipo de dado.

                /*
                | Tipo | Valor padrão |
                | --- | --- |
                | byte | 0 |
                | short | 0 |
                | int | 0 |
                | long | 0L |
                | float | 0.0f |
                | double | 0.0d |
                | char | '\u0000' |
                | boolean | false |
                | String / objetos | null |
                */
        // Exemplo:

        class pessoa {
            int idade ;
            boolean ativo;
            String nome;
        }
        // nesse exemplo os campos recebem automaticamente os valores padrao correspondentes.

        // Variaveis locais
        /*
        existe uma diferenca impotante

        variaveis locais não recebem valores padrão automaticamente

        Exemplo :
         */
        /*
        public class main {
            public static void main(String[] args) {}
                int idade;
                System.out.ptintln(idade);
         } Esse código apresenta erro de compilação porque idade ainda não recebeu um valor.
         Forma correta:
                public class Main {
                    public static void main(String[] args) {
                            int idade = 23;
                            System.out.println(idade);
                    }
                }

          **Memorize:**
            - Campos: recebem valores padrão.
            - Variáveis locais: precisam ser inicializadas antes de serem utilizadas.
         */

        // O que são literais ?

        /*
        Literais são representações de valores fixos diretamente no código-fonte.

            Exemplo:

            ```
            boolean resultado = true;
            char letra = 'C';
            byte numero = 100;
            short quantidade = 10000;
            int idade = 23;
            ```

            Observe que não precisamos utilizar a palavra-chave `new` para inicializar variáveis primitivas.

            Isso acontece porque os tipos primitivos fazem parte da própria linguagem Java.
         */

        // Literais inteiros
        /*
            Um literal inteiro é considerado `int` por padrão.

            Para representar um `long`, utilizamos `L` ou `l`.

            ```
            int idade = 23;

            long populacao = 8000000000L;
            ```

            A Oracle recomenda utilizar `L` maiúsculo, pois o `l` minúsculo pode ser confundido com o número `1`.
         */
        // Sistemas numéricos
        /*
            Java permite representar números utilizando diferentes sistemas:

            **Decimal — Base 10**

            ```
            int decimal = 26;
            ```

            **Hexadecimal — Base 16**

            Utiliza o prefixo `0x`.

            ```
            int hexadecimal = 0x1a;
            ```

            **Binário — Base 2**

            Utiliza o prefixo `0b`.

            ```
            int binario = 0b11010;
            ```

            Os três exemplos representam o mesmo valor: 26.
         */
        // Literais de ponto flutuante
        /*
            Um literal decimal é considerado `double` por padrão.

            Para declarar um `float`, utilizamos `f` ou `F`.

            ```
            double numero1 = 123.4;

            float numero2 = 123.4f;
            ```

            Também podemos utilizar notação científica:

            ```
            double numero = 1.234e2;
            ```

            O valor representa 123,4.
         */
        //  Literais de caracteres e Strings
        /*
        Java permite utilizar caracteres Unicode em `char` e `String`.

            Exemplo:

            ```
            char letra = 'A';

            String nome = "Kelvyn";
            ```

            Também existem sequências especiais chamadas caracteres de escape.

            | Escape | Significado |
            | --- | --- |
            | `\b` | Backspace |
            | `\t` | Tabulação |
            | `\n` | Nova linha |
            | `\f` | Alimentação de formulário |
            | `\r` | Retorno de carro |
            | `\"` | Aspas duplas |
            | `\'` | Aspas simples |
            | `\\` | Barra invertida |

            Exemplo:

            ```
            System.out.println("Olá\nKelvyn");
            ```

            Resultado:

            ```
            Olá
            Kelvyn
            ```
         */
        // Valor null
        /*
            `null` representa a ausência de referência a um objeto.

                Exemplo:

                ```
                String nome = null;
                ```

                O valor `null` pode ser atribuído a variáveis de tipos de referência, mas não aos tipos primitivos.

                Java permite utilizar caracteres Unicode em `char` e `String`.

                Exemplo:

                ```
                char letra = 'A';

                String nome = "Kelvyn";
                ```

                Também existem sequências especiais chamadas caracteres de escape.

                | Escape | Significado |
                | --- | --- |
                | `\b` | Backspace |
                | `\t` | Tabulação |
                | `\n` | Nova linha |
                | `\f` | Alimentação de formulário |
                | `\r` | Retorno de carro |
                | `\"` | Aspas duplas |
                | `\'` | Aspas simples |
                | `\\` | Barra invertida |

                Exemplo:

                ```
                System.out.println("Olá\nKelvyn");
                ```

                Resultado:

                ```
                Olá
                Kelvyn
                ```
         */
        // Class literals
        /*
            Java também permite representar um tipo por meio de `.class`.

            Exemplo:

            ```
            String.class
            ```

            Isso representa o objeto que descreve o tipo `String`, pertencente à classe `Class`.
         */
        // Sublinhados em números
        /*
        Desde o Java SE 7, podemos utilizar `_` para separar grupos de números e melhorar a leitura de valores grandes.

        Exemplo:

        ```
        long numero = 1234_5678_9012_3456L;

        int populacao = 1_000_000;
        ```

        O sublinhado não altera o valor numérico.

        ## 7.1 Exemplos válidos

        ```
        int numero1 = 5_2;

        int numero2 = 5_______2;

        int hexadecimal = 0x5_2;

        int binario = 0b0010_0101;
        ```

        ## 7.2 Exemplos inválidos

        ```
        int numero1 = 52_;

        int numero2 = 0x_52;

        float numero3 = 3_.1415F;

        float numero4 = 3._1415F;
        ```

        Regras:

        - Não colocar `_` no início do número.
        - Não colocar `_` no final do número.
        - Não colocar `_` ao lado do ponto decimal.
        - Não colocar `_` antes dos sufixos `F` ou `L`.
        - Não colocar `_` no prefixo `0x` ou `0b`.
         */


        // Pontos de Atencao
        /*
        1. Java é uma linguagem estaticamente tipada.
        2. Toda variável precisa ter um tipo declarado.
        3. Existem exatamente 8 tipos primitivos.
        4. `String` é uma classe, não um tipo primitivo.
        5. `char` utiliza aspas simples.
        6. `String` utiliza aspas duplas.
        7. `float` utiliza o sufixo `f` quando declarado com literal decimal.
        8. `long` utiliza o sufixo `L` quando necessário.
        9. Campos recebem valores padrão; variáveis locais não.
        10. `null` não pode ser atribuído a tipos primitivos.
        11. `float` e `double` não são adequados para valores monetários que exigem precisão decimal exata.
        12. Sublinhados podem melhorar a leitura de números grandes.
         */

        // Resumo
        /*
        Nesta aula, aprendemos que Java possui oito tipos primitivos utilizados para armazenar diferentes categorias de informação.

        Também estudamos:

        - Declaração e inicialização de variáveis.
        - Tipos inteiros e decimais.
        - Valores booleanos e caracteres.
        - Strings e sua imutabilidade.
        - Valores padrão.
        - Diferença entre campos e variáveis locais.
        - Literais e sistemas numéricos.
        - Caracteres de escape.
        - Valor `null`.
        - Sublinhados em literais numéricos.

        **Ideia central:** escolher corretamente o tipo de dado é fundamental para armazenar informações e realizar operações em Java.
         */
    }
}