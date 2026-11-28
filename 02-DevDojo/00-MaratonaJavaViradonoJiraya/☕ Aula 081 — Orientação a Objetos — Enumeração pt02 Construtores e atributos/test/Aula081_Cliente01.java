package test;

import dominio.Aula081_Cliente;
import dominio.Aula081_TipoCliente;

public class Aula081_Cliente01 {
    public static void main(String[] args) {
        Aula081_Cliente cliente1 = new Aula081_Cliente("Tsubasa", Aula081_TipoCliente.PESSOA_FISICA, Aula081_Cliente.Aula081_TipoPagamento.DEBITO);
        Aula081_Cliente cliente2 = new Aula081_Cliente("Akira", Aula081_TipoCliente.PESSOA_JURIDICA, Aula081_Cliente.Aula081_TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
