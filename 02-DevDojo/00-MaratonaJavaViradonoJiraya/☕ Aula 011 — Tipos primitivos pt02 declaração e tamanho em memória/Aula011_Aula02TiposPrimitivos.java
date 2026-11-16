public class Aula011_Aula02TiposPrimitivos {
    static void main(String[] args) {
        /*

// Inteiros
byte    campoByte    = 127;                // 8 bits,  -128 a 127
short   campoShort   = 32000;              // 16 bits, -32.768 a 32.767
int     campoInt     = 2_000_000_000;      // 32 bits, ~ ±2,1 bilhões
long    campoLong    = 9_000_000_000L;     // 64 bits, sufixo L obrigatório

// Ponto flutuante
float   campoFloat   = 3.14f;              // 32 bits, sufixo f obrigatório
double  campoDouble  = 3.141592653589793;  // 64 bits, padrão para decimais

// Lógico e caractere
boolean campoBoolean = true;               // apenas true ou false
char    campoChar    = 'K';                // 16 bits, um caractere Unicode, aspas simples
         */
        int idade = 10;
        long numeroGrande = 10000L;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true ;
        boolean falso = false ;
        char caractere = '\u0041';
        /*
        para o char usamos as tabelas ¹| ASCII ou ²| Unicode
         */

        System.out.println("A idade é: "+idade+" anos.");
        System.out.println(falso);
        System.out.println("char "+ caractere);


    }
}
