package test;

import dominio.Aula056_Funcionario;

public class Aula056_FuncionarioTest01 {
    public static void main(String[] args) {
        Aula056_Funcionario funcionario = new Aula056_Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
        System.out.println("Media " + funcionario.getMedia());
    }
}
