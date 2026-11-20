package test;

import dominio.Aula054_Pessoa;

public class Aula054_PessoaTest01 {
    public static void main(String[] args) {
        Aula054_Pessoa pessoa = new Aula054_Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);


//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
