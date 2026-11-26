package dominio;

public class Aula078_Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Aula078_Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
