public class Aula018_Aula04Operadores {
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

        }
}
