package test;

import dominio.Aula051_Estudante;
import dominio.Aula051_ImpressoraEstudante;

public class Aula051_EstudanteTest02 {
    public static void main(String[] args) {
        Aula051_Estudante estudante01 = new Aula051_Estudante();
        Aula051_Estudante estudante02 = new Aula051_Estudante();
        Aula051_ImpressoraEstudante impressora = new Aula051_ImpressoraEstudante();


        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
