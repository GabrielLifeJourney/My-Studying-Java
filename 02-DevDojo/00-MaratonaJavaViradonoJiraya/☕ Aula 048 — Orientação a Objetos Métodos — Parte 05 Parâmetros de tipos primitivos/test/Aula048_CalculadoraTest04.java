package test;

import dominio.Aula052_Calculadora;

public class Aula048_CalculadoraTest04 {
    public static void main(String[] args){
        Aula052_Calculadora calculador = new Aula052_Calculadora();
        int a= 1;
        int b= 2;
        calculador.alteraDoisNumeros(a,b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("a "+a);
        System.out.println("b "+b);
    }
}
