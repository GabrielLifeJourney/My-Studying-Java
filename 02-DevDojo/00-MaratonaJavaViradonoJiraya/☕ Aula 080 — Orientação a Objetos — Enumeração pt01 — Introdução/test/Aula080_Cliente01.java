package test;

import dominio.Aula080_Cliente;
import dominio.Aula080_TipoCliente;

public class Aula080_Cliente01 {
    public static void main(String[] args) {
        Aula080_Cliente cliente1 = new Aula080_Cliente("Tsubasa", Aula080_TipoCliente.PESSOA_FISICA);
        Aula080_Cliente cliente2 = new Aula080_Cliente("Tsubasa",Aula080_TipoCliente.PESSOA_FISICA);
        Aula080_Cliente cliente3 = new Aula080_Cliente("Tsubasa",Aula080_TipoCliente.PESSOA_FISICA);
        Aula080_Cliente cliente4 = new Aula080_Cliente("Tsubasa",Aula080_TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
