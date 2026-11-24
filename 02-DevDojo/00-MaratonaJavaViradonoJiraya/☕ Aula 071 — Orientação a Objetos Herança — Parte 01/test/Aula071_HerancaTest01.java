package test;

import dominio.Aula071_Endereco;
import dominio.Aula071_Funcionario;
import dominio.Aula071_Pessoa;

public class Aula071_HerancaTest01 {
    public static void main(String[] args) {
        Aula071_Endereco endereco = new Aula071_Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11700-000");
        Aula071_Pessoa pessoa = new Aula071_Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("11111111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n++++++++++++++++++++++\n");
        Aula071_Funcionario funcionario = new Aula071_Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("12.353.232.04");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
