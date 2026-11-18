public class Aula26_Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Ultilizando witch e dados os valores de 1 a 7, imprima se é dia últil ou final de semana.
        // Considerando 1 como Domingo.

        // Resolvendo Sozinho. ⏱️ TIMESTAMP: 01:35.
        byte dia = 1;
        String diaFinaldeSemana = "Final de Semana";
        String diaUtil = "Dia Util.";
        switch (dia){
            case 1:
                System.out.println("Domingo: "+ diaFinaldeSemana);
                break;
            case 2:
                System.out.println("Segunda: "+ diaUtil);
                break;
            case 3:
                System.out.println("Terça: "+ diaUtil);
                break;
            case 4:
                System.out.println("Quarta: "+ diaUtil);
                break;
            case 5:
                System.out.println("Quinta: "+ diaUtil);
                break;
            case 6:
                System.out.println("Sexta: "+ diaUtil);
                break;
            case 7:
                System.out.println("Sabado: "+ diaFinaldeSemana);
                break;
            default:
                System.out.println("Opição Invalida: "+"Selecione um número de 1 a 7, onde 1 é domingo e 7 é sábado. Tente novamente.");
                break;
        }
    }
}
