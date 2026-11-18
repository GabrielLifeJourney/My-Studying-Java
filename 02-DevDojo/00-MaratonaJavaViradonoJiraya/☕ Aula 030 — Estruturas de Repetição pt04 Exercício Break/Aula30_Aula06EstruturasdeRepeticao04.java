public class Aula30_Aula06EstruturasdeRepeticao04 {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas ele pode ser parcelado.
        // Condição ValorParcela >=1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if ( valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+parcela+" R$:"+valorParcela );
        }

    }
}
