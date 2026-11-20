package test;

import dominio.Aula049_Estudante;

public class Aula040_EstudanteTest02 {
    public static void main(String[] args) {
        Aula049_Estudante estudante = new Aula049_Estudante();
        Aula049_Estudante estudante2 = new Aula049_Estudante();

        estudante.nome = "Sanji";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("++++++++++++++++++");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
