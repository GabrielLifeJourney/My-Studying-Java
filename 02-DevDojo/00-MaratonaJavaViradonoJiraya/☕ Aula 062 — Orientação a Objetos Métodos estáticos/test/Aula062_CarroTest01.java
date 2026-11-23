package test;

import dominio.Aula062_Carro;

public class Aula062_CarroTest01 {
    public static void main(String[] args) {
        Aula062_Carro.setVelocidadeLimite(180);

        Aula062_Carro c1 = new Aula062_Carro("BMW",380);
        Aula062_Carro c2 = new Aula062_Carro("Mercedes",275);
        Aula062_Carro c3 = new Aula062_Carro("Audi",290);

        c1.imprime();
        c2.imprime();
        c3.imprime();   
    }
}
