package dominio;

public class Aula070_Seminario {
    private String titulo;
    private Aula070_Aluno[] alunos;
    private Aula070_Local local;

    public Aula070_Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Aula070_Seminario(String titulo, Aula070_Aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Aula070_Seminario(String titulo, Aula070_Aluno[] alunos, Aula070_Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Aula070_Local getLocal() {
        return local;
    }

    public void setLocal(Aula070_Local local) {
        this.local = local;
    }

    public Aula070_Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aula070_Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
