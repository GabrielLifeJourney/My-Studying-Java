package test;

import dominio.Aula079_Carro;
import dominio.Aula079_Ferrari;

public class Aula079_CarroTest01 {
    public static void main(String[] args) {
        Aula079_Carro carro = new Aula079_Carro();
        Aula079_Ferrari ferrari = new Aula079_Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
