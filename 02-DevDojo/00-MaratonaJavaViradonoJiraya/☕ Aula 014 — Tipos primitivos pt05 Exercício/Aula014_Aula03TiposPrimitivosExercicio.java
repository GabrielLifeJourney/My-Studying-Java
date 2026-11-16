/*
    Pratica

    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem :

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salario de <salario>.na data <data>
*/
public class Aula014_Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        // pausado em : Timestamp 1:10 e resolvido.
        String nome = "Gabriel";
        String endereco = "Rua Paraíso do Céu, nº 05 – Casa Gabriel, Bairro Jesus Cristo, Cidade Celestial – SP, CEP 00000-001.";
        double salario = 2600;
        String data = "07/11/26";

        System.out.println("Eu "+nome+", morando no endereço \n"+endereco+",\n" +
                "confirmo que recebi o salario de "+salario+". na data "+data);

        // data recebimento foi o que me faltou
        // dataRecebimentoSalario -> corrigir
        // não criei um relatorio -> corrigir

        // revisao.
        String nome2 = "Gabriel";
        String endereco2 = "Rua Paraíso do Céu, nº 05 – Casa Gabriel, Bairro Jesus Cristo, Cidade Celestial – SP, CEP 00000-001.";
        double salario2 = 2600;
        String dataRecebimentoSalario = "07/11/26";
        String relatorio = "Eu "+nome+", morando no endereço \n"+endereco+",\n" +
                "confirmo que recebi o salario de "+salario+". na data "+data ;
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                    Revisão                       ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(relatorio);
    }
}
