public class Aula015_Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        System.out.println("Numero 1: "+ numero01 + "| Numero 2: "+ numero02);
        System.out.println("+++++++++++++++++++++++++++");

        System.out.println("Soma: "+(numero02+numero01));
        System.out.println("Subitracao: "+(numero02-numero01));
        System.out.println("Divisao: "+(numero02/numero01));
        System.out.println("Multiplicacao: "+(numero02*numero01));

        // Atencao
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(numero02+numero01+"Valor"+numero02+numero02);
        //[Soma até chegar no texto]; depois só concatena.
        // () sempre para fazer qualquer calculo.

        System.out.println("+++++++++++++++++++++++++++");
        // explicando sobre inteiro e decimal
        System.out.println(numero01/numero02+" Valor decimal? não Inteiro");
        // correto e cer 0.5 mais gerou so 0| vamos criar com decimal

        System.out.println("+++++++++++++++++++++++++++");
        double numero03 = 10;
        double numero04 = 20;
        System.out.println(numero03/numero04+" agora sim Decimal");
        // podemos usar o casting - não recomendado
        System.out.println(numero01/(double)numero02+" pratica nao recomendada casting");
    }
}
