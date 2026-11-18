public class Aula34_Aula07Arrays02 {
    public static void main(String[] args) {
        // padrao de inicializacao
        // byte,short,int,long,float e double 0
        // cahr '\u0000' ''
        // boolean false
        // String null

        String[] nomes = new String[5];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Ordem:"+i+" :"+nomes[i]);

        }
        System.out.println("5 total de quadrados");
        System.out.println("+++++++++++++++++");
        System.out.println("Novos quadrados\nseparados");

        nomes = new String[6];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Ordem:"+i+" :"+nomes[i]);
        }

    }
}
