package dominio;

public class Aula075_Pessoa {
    protected String nome;
    protected String cpf;
    protected Aula075_Endereco endereco;

    static {
        System.out.println("Dentro do Bloco de Inicialização estatico de Pessoa");
    }
    {
        System.out.println("Dentro do Bloco de Inicialização de Pessoa 1");
    }
    {
        System.out.println("Dentro do Bloco de Inicialização de Pessoa 2");
    }

    public Aula075_Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa");
        this.nome = nome;
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

    public Aula075_Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula075_Endereco endereco) {
        this.endereco = endereco;
    }
}
