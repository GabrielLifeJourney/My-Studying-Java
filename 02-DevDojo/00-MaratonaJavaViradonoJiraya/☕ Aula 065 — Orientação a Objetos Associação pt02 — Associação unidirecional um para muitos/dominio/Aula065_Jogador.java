package dominio;

public class Aula065_Jogador {
    private String nome;
    private Aula065_Time time;

    public void imprime() {
        System.out.println(this.nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }


    public Aula065_Jogador(String nome) {
        this.nome = nome;
    }

    public Aula065_Time getTime() {
        return time;
    }

    public void setTime(Aula065_Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
