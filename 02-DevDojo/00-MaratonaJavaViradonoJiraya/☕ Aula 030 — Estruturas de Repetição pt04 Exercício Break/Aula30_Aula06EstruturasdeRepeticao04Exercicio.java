public class Aula30_Aula06EstruturasdeRepeticao04Exercicio {
    public static void main(String[] args) {
        // Dado um valor de um carro, descubra em quantas ele pode ser parcelado.
        // Condição ValorParcela >=1000
        // Resolvendo Sozinho. ⏱️ TIMESTAMP: 01:32.

        int valorCarro = 45000;
        int valorParcelaMin= 1000;
        int valorParcelaMax= valorCarro / valorParcelaMin ;

        for (int i = 1; i <= valorParcelaMax; i++) {
            double valorPrestacao = (double) valorCarro / i;
            System.out.println("Parcelas: "+i+" valor = |R$:"+valorPrestacao);
        }
        // tomara que me pesdoue mais usei o casting pra força ser um double.
        // vamo voltar a aula


    }
}
