package dominio;

public class Aula067_Time {
    private String nome;
    private Aula067_Jogador[] jogadores;

    public Aula067_Time(String nome) {
        this.nome = nome;
    }

    public Aula067_Time(String nome, Aula067_Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Aula067_Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula067_Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Aula067_Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
