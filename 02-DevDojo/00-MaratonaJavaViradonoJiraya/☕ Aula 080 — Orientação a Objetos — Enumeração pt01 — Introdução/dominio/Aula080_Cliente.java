package dominio;

public class Aula080_Cliente {
    private String nome;
    private Aula080_TipoCliente tipoCliente;

    public Aula080_Cliente(String nome, Aula080_TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Aula080_Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aula080_TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Aula080_TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
