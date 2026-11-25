package test;

import dominio.Aula075_Funcionario;

public class Aula075_HerancaTest02 {
    // 0 - Bloco de inicialização  estático da super classe é executado quando a JVM carregar classe pai
    // 1 - Bloco de inicialização da subclasse é executado quando a JVM carregar classe filha
    // 2 - Alocado espaço em memoria pro objeto da superclasse
    // 3 - Cada atribuição de superclasse é criado e inicializado com valores default ou o quer for passado
    // 4 - Bloco de inicialização da superclasse
    // 5 - Construtor é executado da superclasse
    // 6 - Alocado espaço em memoria pro projeto da subclasse
    // 7 - cada atributo de subclasse é criado e inicializado com valores default ou que for passado
    // 8 - Bloco de inicialização da subclasse e executado na ordem em que aparece
    // 9 - Construtor é executado da subclasse

    public static void main(String[] args) {
        Aula075_Funcionario funcionario = new Aula075_Funcionario("Jiraya");
    }
}
