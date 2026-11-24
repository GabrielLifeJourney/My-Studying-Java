package test;

import dominio.Aula074_Endereco;
import dominio.Aula074_Funcionario;
import dominio.Aula074_Pessoa;

public class Aula074_HerancaTest01 {
    public static void main(String[] args) {
        Aula074_Endereco endereco = new Aula074_Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11700-000");
        Aula074_Pessoa pessoa = new Aula074_Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("11111111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("\n++++++++++++++++++++++\n");
        Aula074_Funcionario funcionario = new Aula074_Funcionario("Oda Nobunaga");
        funcionario.setCpf("12.353.232.04");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
