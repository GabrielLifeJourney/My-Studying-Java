package teste;

import dominio.Aula066_Escola;
import dominio.Aula066_Professor;

public class Aula066_EscolaTest01 {
    public static void main(String[] args) {
        Aula066_Professor professor1 = new Aula066_Professor("Jiraya Sensei");
        Aula066_Professor professor2 = new Aula066_Professor("Kakashi Sensei");
        Aula066_Professor[] professores = {professor1,professor2};
        Aula066_Escola escola = new Aula066_Escola("Konoha",professores);

        escola.imprime();
    }
}
