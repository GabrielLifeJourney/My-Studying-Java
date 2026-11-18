package test;

import dominio.Aula039_Estudante;

public class Aula039_EstudanteTest01 {
    public static void main(String[] args) {
        Aula039_Estudante estudante = new Aula039_Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
