package test;

import dominio.Aula050_Estudante;
import dominio.Aula050_ImpressoraEstudante;

public class Aula049_EstudanteTest01 {
    public static void main(String[] args) {
        Aula050_Estudante estudante01 = new Aula050_Estudante();
        Aula050_Estudante estudante02 = new Aula050_Estudante();
        Aula050_ImpressoraEstudante impressora = new Aula050_ImpressoraEstudante();


        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        // quando voce passa objetos por arguntos voce passa onde esles estão guardados


    }
}
