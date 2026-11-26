package dominio;

public class Aula078_Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Aula078_Comprador COMPRADOR = new Aula078_Comprador();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
