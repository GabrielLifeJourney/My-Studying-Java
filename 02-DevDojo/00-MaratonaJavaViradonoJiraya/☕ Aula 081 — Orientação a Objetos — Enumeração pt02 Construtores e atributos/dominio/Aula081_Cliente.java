package dominio;

public class Aula081_Cliente {
    public enum Aula081_TipoPagamento {
        DEBITO,CREDITO
    }

    private String nome;
    private Aula081_TipoCliente tipoCliente;
    private Aula081_TipoPagamento tipoPagamento;

    public Aula081_Cliente(String nome, Aula081_TipoCliente tipoCliente, Aula081_TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Aula081_Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt=" + tipoCliente.getValor() +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}
