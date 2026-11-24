package dominio;

public class Aula070_Professor {
    private String nome;
    private String especialidade;
    private Aula070_Seminario[] seminarios;

    public Aula070_Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Aula070_Professor(String nome, String especialidade, Aula070_Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("---------------------");
        System.out.println("Professor: "+this.nome);
        if (seminarios == null)return;
        System.out.println("## Seminarios cadastrados ##");
        for (Aula070_Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length==0) continue;
            System.out.println("** Alunos **");
            for (Aula070_Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+aluno.getNome() + " Idade: "+aluno.getIdade());
            }

        }
    }

    public Aula070_Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Aula070_Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
