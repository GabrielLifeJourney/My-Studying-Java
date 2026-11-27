package test;

import dominio.Aluno;
import dominio.Professor;

public class Aula041_Academico {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        professor.nome="Gustavo";
        professor.salario=40000;

        aluno.nome="Gabriel";
        aluno.idade=23;

        System.out.println("Nome: "+professor.nome+" |Salario: "+ professor.salario);
        System.out.println("Nome: "+aluno.nome+" |Idade: "+aluno.idade);

    }
}
