public class Aula22_Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        /*
            Sitema de doação caso o salario for maior que 5 mil
         */
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condiçoes, mas vou ter!";
        // operador ternario
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

//        if(salario > 5000){
//            resultado = mensagemDoar;
//        }else{
//            resultado = mensagemNaoDoar;
//        }
        System.out.println(resultado);
    }
}
