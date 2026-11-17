public class Aula019_Aula04Operadores {
    public static void main(String[] args) {
        /*
        Operador	Nome	Significado	Exemplo	Resultado
        &&	E (AND)	verdadeiro só se os dois lados forem verdadeiros	true && false	false
        ||	OU (OR)	verdadeiro se pelo menos um lado for verdadeiro	true || false	true
        !	NÃO (NOT)	inverte o valor	!true	false
         */

        // &&	E (AND)	verdadeiro só se os dois lados forem verdadeiros	true && false	false
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLei = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLei: "+isDentroDaLei);
        System.out.println("isDentroDaLeiMenorQueTrinta: "+isDentroDaLeiMenorQueTrinta);

        System.out.println("+++++++++++++++++++++++++++++++++");

        //||	OU (OR)	verdadeiro se pelo menos um lado for verdadeiro	true || false	true
        double valorTotalContaCorrente = 200;
        double valorToralContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorToralContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: "+isPlaystationCincoCompravel);

        System.out.println("+++++++++++++++++++++++++++++++++");
        /*
        Operador	Equivale a
        =	atribui o valor
        +=	x = x + valor
        -=	x = x - valor
        *=	x = x * valor
        /=	x = x / valor
        %=	x = x % valor
         */

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++; // 2
        contador--; // 1
        ++contador; // 2
        --contador; // 1
        int contador2 = 0;
        System.out.println(contador2++);
        System.out.println(++contador2);

    }
}
