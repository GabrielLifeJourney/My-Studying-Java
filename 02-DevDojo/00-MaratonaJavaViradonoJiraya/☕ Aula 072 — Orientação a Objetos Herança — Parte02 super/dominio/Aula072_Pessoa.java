package dominio;

public class Aula072_Pessoa {
    private String nome;
    private String cpf;
    private Aula072_Endereco endereco;

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

    public Aula072_Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Aula072_Endereco endereco) {
        this.endereco = endereco;
    }
}
