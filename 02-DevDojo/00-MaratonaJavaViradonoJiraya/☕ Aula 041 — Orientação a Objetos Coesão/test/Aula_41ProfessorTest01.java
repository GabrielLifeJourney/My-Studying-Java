package test;

import dominio.Aula041_Professor;

public class Aula_41ProfessorTest01 {
    public static void main(String[] args) {
        Aula041_Professor professor = new Aula041_Professor();

        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome: "+ professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);

    }
}
