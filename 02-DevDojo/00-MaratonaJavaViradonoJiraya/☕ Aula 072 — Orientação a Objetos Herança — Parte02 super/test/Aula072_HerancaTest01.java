package test;

import dominio.Aula072_Endereco;
import dominio.Aula072_Funcionario;
import dominio.Aula072_Pessoa;

public class Aula072_HerancaTest01 {
    public static void main(String[] args) {
        Aula072_Endereco endereco = new Aula072_Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11700-000");
        Aula072_Pessoa pessoa = new Aula072_Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("11111111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n++++++++++++++++++++++\n");
        Aula072_Funcionario funcionario = new Aula072_Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("12.353.232.04");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
