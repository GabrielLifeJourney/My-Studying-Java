public class Matrizes {
    public static void main(String[] args) {
        // declara um array (vetor) de números inteiros
        int[] anArray;

        // aloca memória para 10 números inteiros
        anArray = new int[10];

        // inicializa o primeiro elemento
        anArray[0] = 100;
        // inicializa o segundo elemento
        anArray[1] = 200;
        // e assim por diante
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Elemento  1 no índice 0: " + anArray[0]);
        System.out.println("Elemento  2 no índice 1: " + anArray[1]);
        System.out.println("Elemento  3 no índice 2: " + anArray[2]);
        System.out.println("Elemento  4 no índice 3: " + anArray[3]);
        System.out.println("Elemento  5 no índice 4: " + anArray[4]);
        System.out.println("Elemento  6 no índice 5: " + anArray[5]);
        System.out.println("Elemento  7 no índice 6: " + anArray[6]);
        System.out.println("Elemento  8 no índice 7: " + anArray[7]); // (no original estava "Element 9" por engano)
        System.out.println("Elemento  9 no índice 8: " + anArray[8]);
        System.out.println("Elemento 10 no índice 9: " + anArray[9]);
    }
}
