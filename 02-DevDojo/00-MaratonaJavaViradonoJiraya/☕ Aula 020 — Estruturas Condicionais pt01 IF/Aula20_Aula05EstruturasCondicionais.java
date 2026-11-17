public class Aula20_Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcolica");
        }
        // ! negação () caso não ser autorizado
        if (!isAutorizadoComprarBebida){
            System.out.println("Nao Autorizado a comprar bebida alcolica");
        }
        System.out.println("Fora do if");
    }
}
