public class Aula013_Aula02TiposPrimitivos {
    static void main(String[] args) {
        /*

// Inteiros
byte    campoByte    = 127;                // 8 bits,  -128 a 127
short   campoShort   = 32000;              // 16 bits, -32.768 a 32.767
int     campoInt     = 2_000_000_000;      // 32 bits, ~ ±2,1 bilhões
long    campoLong    = 9_000_000_000L;     // 64 bits, sufixo L obrigatório

// Ponto flutuante / decimais
float   campoFloat   = 3.14f;              // 32 bits, sufixo f obrigatório
double  campoDouble  = 3.141592653589793;  // 64 bits, padrão para decimais

// Lógico e caractere
boolean campoBoolean = true;               // apenas true ou false
char    campoChar    = 'K';                // 16 bits, um caractere Unicode, aspas simples
         */
        int idade = (int) 10000000000L;
        long numeroGrande = 10000L; // pode usar L ou l
        double salarioDouble = 2000.0D; // pode usar D ou d
        float salarioFloat = (float) 2500.0D;   // pode uar F ou f
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdadeiro = true ;
        boolean falso = false ;
        char caractere = '\u0041';
        // String não e um tipo primitivos / e uma class
        // obrigatorio aspas duplas | não existe tamanho.
        String nome = "Gabriel";
        // ALTERADO A LINGUAGE JAVA PARA VERSÃO 8

        System.out.println("A idade é: "+idade+" anos.");
        System.out.println(falso);
        System.out.println("char "+ caractere);
        System.out.println(salarioFloat);
        System.out.println("My name: " +nome);

    }
}
