package dominio;

public class Aula070_Aluno {
    private String nome;
    private int idade;
    private Aula070_Seminario seminario;

    public Aula070_Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
