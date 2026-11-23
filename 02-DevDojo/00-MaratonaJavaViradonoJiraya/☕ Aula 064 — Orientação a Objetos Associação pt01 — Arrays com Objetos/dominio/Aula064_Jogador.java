package dominio;

public class Aula064_Jogador {
    private String nome;

    public void imprime(){
        System.out.println(this.nome);
    }

    public Aula064_Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
