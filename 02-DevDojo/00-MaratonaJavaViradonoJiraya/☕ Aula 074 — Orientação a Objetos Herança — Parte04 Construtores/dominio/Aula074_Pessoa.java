package dominio;

public class Aula074_Pessoa {
    protected String nome;
    protected String cpf;
    protected Aula074_Endereco endereco;

    public Aula074_Pessoa(String nome) {
        this.nome = nome;
    }
    public Aula074_Pessoa(String nome , String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.endereco.getRua() + " " + this.endereco.getCep());
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

    public Aula074_Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula074_Endereco endereco) {
        this.endereco = endereco;
    }
}
