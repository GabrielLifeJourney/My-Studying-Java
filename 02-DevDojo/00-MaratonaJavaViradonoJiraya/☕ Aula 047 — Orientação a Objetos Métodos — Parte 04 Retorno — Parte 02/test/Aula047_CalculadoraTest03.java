package test;

import dominio.Aula048_Calculadora;

public class Aula047_CalculadoraTest03 {
    public static void main(String[] args){
        Aula048_Calculadora calculadora = new Aula048_Calculadora();
        double resul = calculadora.divideDoisNumeros(20,0);
        double resul2 = calculadora.divideDoisNumeros2(20,8);

        System.out.println(resul);
        System.out.println(resul2);
        System.out.println("===========");
        calculadora.divideDoisNumeros3(20,0);
    }
}
