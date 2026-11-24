package dominio;

public class Aula073_Pessoa {
    protected String nome;
    protected String cpf;
    protected Aula073_Endereco endereco;

    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Endereço: "+this.endereco.getRua()+" "+ this.endereco.getCep());
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

    public Aula073_Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula073_Endereco endereco) {
        this.endereco = endereco;
    }
}
