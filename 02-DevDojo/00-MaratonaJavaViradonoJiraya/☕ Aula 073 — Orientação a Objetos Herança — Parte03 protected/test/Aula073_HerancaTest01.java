package test;

import dominio.Aula073_Endereco;
import dominio.Aula073_Funcionario;
import dominio.Aula073_Pessoa;

public class Aula073_HerancaTest01 {
    public static void main(String[] args) {
        Aula073_Endereco endereco = new Aula073_Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11700-000");
        Aula073_Pessoa pessoa = new Aula073_Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("11111111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n++++++++++++++++++++++\n");
        Aula073_Funcionario funcionario = new Aula073_Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("12.353.232.04");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
