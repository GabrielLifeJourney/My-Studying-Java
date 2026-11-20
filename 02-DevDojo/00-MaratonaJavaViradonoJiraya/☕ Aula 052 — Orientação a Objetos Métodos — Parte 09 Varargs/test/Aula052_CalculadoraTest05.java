package test;

import dominio.Aula052_Calculadora;

public class Aula052_CalculadoraTest05 {
    public static void main(String[] args) {
        Aula052_Calculadora calculadora = new Aula052_Calculadora();
        int[] numeros = {1,2,3,4,5} ;
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
