package test;

import dominio.Aula051_Estudante;
import dominio.Aula051_ImpressoraEstudante;

public class Aula050_EstudanteTest01 {
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

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("###########");
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        // quando voce passa objetos por arguntos voce passa onde esles estão guardados

        // PAPO RETO BIZAROOO!. ALTERAR ALGO DO PROPRIO OBJETO SLK ENDOIDEI.
    }
}
