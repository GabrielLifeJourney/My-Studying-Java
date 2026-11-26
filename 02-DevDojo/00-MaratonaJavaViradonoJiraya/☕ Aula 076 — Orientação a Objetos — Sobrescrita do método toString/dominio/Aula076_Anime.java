package dominio;

public class Aula076_Anime extends Object {
    private String nome;

    @Override
    public String toString() {
        return "Aula076_Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public Aula076_Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
