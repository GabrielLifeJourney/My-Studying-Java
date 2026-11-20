package test;

import dominio.Aula047_Calculadora;

public class Aula047_CalculadoraTest03 {
    public static void main(String[] args){
        Aula047_Calculadora calculadora = new Aula047_Calculadora();
        double resul = calculadora.divideDoisNumeros(20,0);
        double resul2 = calculadora.divideDoisNumeros2(20,8);

        System.out.println(resul);
        System.out.println(resul2);
        System.out.println("===========");
        calculadora.divideDoisNumeros3(20,0);
    }
}
