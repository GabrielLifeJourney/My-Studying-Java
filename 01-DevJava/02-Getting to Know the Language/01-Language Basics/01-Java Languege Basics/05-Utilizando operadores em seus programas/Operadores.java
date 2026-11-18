public class Operadores {
    public static void main(String[] args) {
        // =====================================================
        // 1. OPERADORES ARITMETICOS: + - * / %
        // =====================================================
        System.out.println("=== 1. ARITMETICOS ===");
        int a = 10;
        int b = 3;

        System.out.println(a + b);   // resultado: 13   (soma)
        System.out.println(a - b);   // resultado: 7    (subtracao)
        System.out.println(a * b);   // resultado: 30   (multiplicacao)
        System.out.println(a / b);   // resultado: 3    (divisao ENTRE INTEIROS descarta a parte decimal)
        System.out.println(a % b);   // resultado: 1    (modulo = resto da divisao: 10 = 3*3 + 1)

        System.out.println(10.0 / 3);  // resultado: 3.3333333333333335 (se um lado e decimal, o resultado e decimal)
        System.out.println(-7 % 3);    // resultado: -1 (o sinal do resto segue o sinal do primeiro numero)
        System.out.println(5.0 / 0);   // resultado: Infinity (com double nao da erro)
        // System.out.println(5 / 0);  // ERRO em execucao: ArithmeticException (com int, divisao por zero lanca excecao)

        // O + tambem concatena (junta) textos quando um dos lados e String
        System.out.println("Ola " + "mundo");  // resultado: Ola mundo
        System.out.println("Soma: " + 2 + 3);  // resultado: Soma: 23 (le da esquerda p/ direita: vira texto e junta)
        System.out.println("Soma: " + (2 + 3)); // resultado: Soma: 5  (parenteses forcam a conta primeiro)

        // =====================================================
        // 2. OPERADORES DE ATRIBUICAO: = += -= *= /= %=
        // =====================================================
        System.out.println("\n=== 2. ATRIBUICAO ===");
        int x = 10;          // = guarda o valor da direita na variavel da esquerda
        System.out.println(x); // resultado: 10

        x += 5;              // o mesmo que x = x + 5
        System.out.println(x); // resultado: 15

        x -= 3;              // o mesmo que x = x - 3
        System.out.println(x); // resultado: 12

        x *= 2;              // o mesmo que x = x * 2
        System.out.println(x); // resultado: 24

        x /= 5;              // o mesmo que x = x / 5 (inteiro: 24/5 = 4)
        System.out.println(x); // resultado: 4

        x %= 3;              // o mesmo que x = x % 3 (4 % 3 = 1)
        System.out.println(x); // resultado: 1

        // =====================================================
        // 3. INCREMENTO E DECREMENTO: ++ e --
        // =====================================================
        System.out.println("\n=== 3. INCREMENTO / DECREMENTO ===");
        int i = 5;

        // POS-fixo (i++): usa o valor atual e DEPOIS soma 1
        System.out.println(i++); // resultado: 5 (imprime 5, depois i vira 6)
        System.out.println(i);   // resultado: 6

        // PRE-fixo (++i): soma 1 e DEPOIS usa o valor
        System.out.println(++i); // resultado: 7 (i vira 7, depois imprime)

        System.out.println(i--); // resultado: 7 (imprime 7, depois i vira 6)
        System.out.println(--i); // resultado: 5 (i vira 5, depois imprime)

        // Pegadinha classica (evite escrever codigo assim, mas entenda):
        int p = 5;
        int q = p++ + ++p;       // p++ usa 5 (p vira 6); ++p torna 7 e usa 7 -> 5 + 7
        System.out.println(q);   // resultado: 12

        // =====================================================
        // 4. OPERADORES UNARIOS: + - ! (alem de ++ e --)
        // =====================================================
        System.out.println("\n=== 4. UNARIOS ===");
        int n = 8;
        System.out.println(-n);     // resultado: -8 (inverte o sinal)
        System.out.println(+n);     // resultado: 8  (mantem o sinal)
        boolean ligado = true;
        System.out.println(!ligado); // resultado: false (! inverte o booleano)

        // =====================================================
        // 5. OPERADORES DE COMPARACAO (RELACIONAIS): == != > < >= <=
        //    Sempre resultam em boolean (true ou false)
        // =====================================================
        System.out.println("\n=== 5. COMPARACAO ===");
        int m = 10;
        int k = 20;

        System.out.println(m == k);  // resultado: false (igual a?)
        System.out.println(m != k);  // resultado: true  (diferente de?)
        System.out.println(m > k);   // resultado: false (maior que?)
        System.out.println(m < k);   // resultado: true  (menor que?)
        System.out.println(m >= 10); // resultado: true  (maior ou igual?)
        System.out.println(m <= 5);  // resultado: false (menor ou igual?)

        // ATENCAO 1: = atribui, == compara. Nao confunda.

        // ATENCAO 2: com objetos (String), == compara a REFERENCIA (o "endereco"), nao o texto.
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s1 == s2);      // resultado: false (sao dois objetos diferentes)
        System.out.println(s1.equals(s2)); // resultado: true  (equals compara o conteudo - use este!)

        // ATENCAO 3: numeros decimais tem imprecisao. Nao compare double com ==.
        System.out.println(0.1 + 0.2);         // resultado: 0.30000000000000004
        System.out.println(0.1 + 0.2 == 0.3);  // resultado: false

        // =====================================================
        // 6. OPERADORES LOGICOS: && || !
        // =====================================================
        System.out.println("\n=== 6. LOGICOS ===");
        boolean t = true;
        boolean f = false;

        // && (E): so e true se OS DOIS lados forem true
        System.out.println(t && t); // resultado: true
        System.out.println(t && f); // resultado: false

        // || (OU): e true se PELO MENOS UM lado for true
        System.out.println(t || f); // resultado: true
        System.out.println(f || f); // resultado: false

        // ! (NAO): inverte
        System.out.println(!t);     // resultado: false

        // Exemplo pratico: idade entre 18 e 65
        int idade = 30;
        boolean podeTrabalhar = idade >= 18 && idade <= 65;
        System.out.println(podeTrabalhar); // resultado: true

        // CURTO-CIRCUITO: && e || param de avaliar assim que o resultado ja esta decidido.
        // Isso evita erros. Exemplo: se texto for null, a segunda parte NAO e executada.
        String texto = null;
        boolean temConteudo = texto != null && texto.length() > 0;
        System.out.println(temConteudo); // resultado: false (sem erro de NullPointerException)

        // Versao SEM curto-circuito: & e | avaliam SEMPRE os dois lados (veja a secao 7)
        // Se usassemos: texto != null & texto.length() > 0  -> daria NullPointerException

        // =====================================================
        // 7. OPERADORES BIT A BIT (BITWISE): & | ^ ~
        //    Trabalham nos bits (0 e 1) dos numeros inteiros
        // =====================================================
        System.out.println("\n=== 7. BITWISE ===");
        int c = 5;   // em binario: 0101
        int d = 3;   // em binario: 0011

        System.out.println(c & d);  // resultado: 1  (0101 & 0011 = 0001) -> E: 1 so se os dois bits forem 1
        System.out.println(c | d);  // resultado: 7  (0101 | 0011 = 0111) -> OU: 1 se algum bit for 1
        System.out.println(c ^ d);  // resultado: 6  (0101 ^ 0011 = 0110) -> XOR: 1 se os bits forem diferentes
        System.out.println(~c);     // resultado: -6 (inverte todos os bits; ~n = -n - 1)

        // & e | tambem funcionam com boolean, mas SEM curto-circuito
        System.out.println(true & false); // resultado: false
        System.out.println(true | false); // resultado: true
        System.out.println(true ^ true);  // resultado: false (XOR: true so se forem diferentes)

        // =====================================================
        // 8. OPERADORES DE DESLOCAMENTO (SHIFT): << >> >>>
        // =====================================================
        System.out.println("\n=== 8. SHIFT ===");

        // << empurra os bits para a esquerda (cada passo equivale a multiplicar por 2)
        System.out.println(8 << 2);    // resultado: 32  (8 * 2 * 2)

        // >> empurra para a direita MANTENDO o sinal (cada passo equivale a dividir por 2)
        System.out.println(8 >> 2);    // resultado: 2   (8 / 2 / 2)
        System.out.println(-16 >> 2);  // resultado: -4  (sinal preservado)

        // >>> empurra para a direita preenchendo com ZEROS (ignora o sinal)
        System.out.println(-16 >>> 28); // resultado: 15 (o numero negativo vira positivo)

        // =====================================================
        // 9. OPERADOR TERNARIO: condicao ? valorSeTrue : valorSeFalse
        //    E um if/else em uma unica linha
        // =====================================================
        System.out.println("\n=== 9. TERNARIO ===");
        int nota = 7;
        String situacao = nota >= 6 ? "Aprovado" : "Reprovado";
        System.out.println(situacao); // resultado: Aprovado

        // Equivalente com if/else:
        String situacao2;
        if (nota >= 6) {
            situacao2 = "Aprovado";
        } else {
            situacao2 = "Reprovado";
        }
        System.out.println(situacao2); // resultado: Aprovado

        // =====================================================
        // 10. OPERADOR instanceof
        //     Verifica se um objeto e de determinado tipo
        // =====================================================
        System.out.println("\n=== 10. INSTANCEOF ===");
        Object objeto = "Kelvyn";
        System.out.println(objeto instanceof String);  // resultado: true
        System.out.println(objeto instanceof Integer); // resultado: false

        // Pattern matching (requer Java 16 ou superior):
        // testa o tipo e ja cria a variavel 'nome' do tipo String, sem precisar de cast
        if (objeto instanceof String) {
            String nome = (String) objeto;
            System.out.println(nome.toUpperCase()); // resultado: KELVYN
        }

        // =====================================================
        // 11. PRECEDENCIA: quem e calculado primeiro
        //     Ordem simplificada (de cima para baixo = mais forte para mais fraco):
        //     1) ()  parenteses
        //     2) ++ -- ! ~ (unarios)
        //     3) * / %
        //     4) + -
        //     5) << >> >>>
        //     6) < <= > >= instanceof
        //     7) == !=
        //     8) &   9) ^   10) |
        //     11) &&   12) ||
        //     13) ?:   14) = += -= etc.
        // =====================================================
        System.out.println("\n=== 11. PRECEDENCIA ===");
        System.out.println(2 + 3 * 4);       // resultado: 14 (multiplicacao antes da soma)
        System.out.println((2 + 3) * 4);     // resultado: 20 (parenteses mandam)
        System.out.println(true || false && false);   // resultado: true  (&& vem antes de ||: false && false = false; true || false = true)
        System.out.println((true || false) && false); // resultado: false (parenteses mudam a ordem)

        // Regra pratica: na duvida, use parenteses. Deixa o codigo mais claro para quem le.

        // =====================================================
        // 12. PEGADINHA: atribuicao composta faz cast implicito
        // =====================================================
        System.out.println("\n=== 12. CAST IMPLICITO EM += ===");
        byte pequeno = 10;
        // pequeno = pequeno + 5;  // ERRO de compilacao: (pequeno + 5) vira int e nao cabe em byte
        pequeno += 5;              // OK: += faz a conversao de volta para byte automaticamente
        System.out.println(pequeno); // resultado: 15

        // Overflow: passar do limite do tipo nao da erro, o valor "da a volta"
        int maximo = Integer.MAX_VALUE;     // 2147483647
        System.out.println(maximo + 1);     // resultado: -2147483648
    }
}
