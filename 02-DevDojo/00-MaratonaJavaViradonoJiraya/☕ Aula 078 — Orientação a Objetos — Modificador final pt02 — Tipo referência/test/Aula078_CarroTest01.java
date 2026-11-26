package test;

import dominio.Aula078_Carro;
import dominio.Aula078_Comprador;

public class Aula078_CarroTest01 {
    public static void main(String[] args) {
        Aula078_Carro carro = new Aula078_Carro();
        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
