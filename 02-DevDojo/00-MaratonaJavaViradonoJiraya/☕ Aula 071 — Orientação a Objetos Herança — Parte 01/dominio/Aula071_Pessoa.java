package dominio;

public class Aula071_Pessoa {
    private String nome;
    private String cpf;
    private Aula071_Endereco endereco;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+" "+ this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aula071_Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula071_Endereco endereco) {
        this.endereco = endereco;
    }
}
