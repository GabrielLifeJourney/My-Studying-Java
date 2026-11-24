package teste;

import dominio.Aula070_Aluno;
import dominio.Aula070_Local;
import dominio.Aula070_Professor;
import dominio.Aula070_Seminario;

public class Aula070_AssociacaoTest {
    public static void main(String[] args) {
        Aula070_Local local = new Aula070_Local("Rua das Larangeiras");
        Aula070_Aluno aluno = new Aula070_Aluno("Luffy", 17);
        Aula070_Professor professor = new Aula070_Professor("Barba branca", "Pirata");
        Aula070_Aluno[] alunosParaSeminarios = {aluno};

        Aula070_Seminario seminario = new Aula070_Seminario("Onde acha one piece", alunosParaSeminarios, local);

        Aula070_Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
