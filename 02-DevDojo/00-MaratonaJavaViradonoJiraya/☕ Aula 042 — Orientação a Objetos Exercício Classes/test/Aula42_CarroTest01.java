package test;

import dominio.Aula043_Carro;

public class Aula42_CarroTest01 {
    public static void main(String[] args) {
        Aula043_Carro carro1 = new Aula043_Carro();
        Aula043_Carro carro2 = new Aula043_Carro();

        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        System.out.println("Carro 1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\n++++++++++++++++\n");

        System.out.println("Carro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
