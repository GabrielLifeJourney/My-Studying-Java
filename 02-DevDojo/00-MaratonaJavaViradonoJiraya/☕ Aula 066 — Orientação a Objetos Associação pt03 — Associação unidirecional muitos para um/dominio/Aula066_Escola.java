package dominio;

public class Aula066_Escola {
    private String nome;
    private Aula066_Professor[] professores;


    public Aula066_Escola(String nome, Aula066_Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null) return;
            for (Aula066_Professor profersor : professores) {
                System.out.println(profersor.getNome());
            }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula066_Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Aula066_Professor[] professores) {
        this.professores = professores;
    }
}
