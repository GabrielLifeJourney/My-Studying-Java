package test;

import dominio.Aula055_Pessoa;

public class Aula055_PessoaTest01 {
    public static void main(String[] args) {
        Aula055_Pessoa pessoa = new Aula055_Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);


        pessoa.imprime();
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
    }
}
