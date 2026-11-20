package test;

import dominio.Aula053_Funcionario;

public class Aula053_FuncionarioTest01 {
    public static void main(String[] args) {
        Aula053_Funcionario funcionario = new Aula053_Funcionario();
        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.32, 2000} ;

        funcionario.imprime();
    }
}
