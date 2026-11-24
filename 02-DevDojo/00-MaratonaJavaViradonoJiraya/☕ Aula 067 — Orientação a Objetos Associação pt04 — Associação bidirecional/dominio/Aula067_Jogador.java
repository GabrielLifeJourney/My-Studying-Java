package dominio;

public class Aula067_Jogador {
    private String nome;
    private Aula067_Time time;

    public void imprime(){
        System.out.println(this.nome);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public Aula067_Jogador(String nome) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula067_Time getTime() {
        return time;
    }

    public void setTime(Aula067_Time time) {
        this.time = time;
    }
}
