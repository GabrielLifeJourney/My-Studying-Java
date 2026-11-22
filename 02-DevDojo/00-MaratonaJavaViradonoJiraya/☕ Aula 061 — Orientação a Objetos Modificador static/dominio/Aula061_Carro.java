package dominio;

public class Aula061_Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;

    public Aula061_Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("\n----------------\n");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Velocidade Max: "+ this.velocidadeMaxima);
        System.out.println("Velocidade Lim: "+ Aula061_Carro.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
