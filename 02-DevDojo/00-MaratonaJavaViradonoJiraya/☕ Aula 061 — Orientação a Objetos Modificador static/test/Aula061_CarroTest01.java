package test;

import dominio.Aula061_Carro;

public class Aula061_CarroTest01 {
    public static void main(String[] args) {
        Aula061_Carro c1 = new Aula061_Carro("BMW",380);
        Aula061_Carro c2 = new Aula061_Carro("Mercedes",275);
        Aula061_Carro c3 = new Aula061_Carro("Audi",290);

        Aula061_Carro.velocidadeLimite = 180;

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
