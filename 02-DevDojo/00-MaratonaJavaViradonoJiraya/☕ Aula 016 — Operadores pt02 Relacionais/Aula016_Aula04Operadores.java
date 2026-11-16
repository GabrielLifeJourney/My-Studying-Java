public class Aula016_Aula04Operadores {
    public static void main(String[] args) {
        /*
        Operador Significado
        ==	igual a
        !=	diferente de
        >	maior que
        <	menor que
        >=	maior ou igual
        <=	menor ou igual
         */
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        // resto %
        int resto = 20 % 2; //par
        int resto2 = 21 % 2; // impar
        System.out.println(resto+" par" );
        System.out.println(resto2+" impar");

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        // oque falto eu quiz adiciona
        boolean isDezMaiorouIgualQueVinte = 10 >= 20;
        boolean isDezMenorouIgualQueVinte = 10 <= 20;

        System.out.println("isDezMaiorQueVinte: "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte: "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte: "+isDezDiferenteQueVinte);
        System.out.println("isDezMaiorouIgualQueVinte: "+isDezMaiorouIgualQueVinte);
        System.out.println("isDezMenorouIgualQueVinte: "+isDezMenorouIgualQueVinte);

        }
}
