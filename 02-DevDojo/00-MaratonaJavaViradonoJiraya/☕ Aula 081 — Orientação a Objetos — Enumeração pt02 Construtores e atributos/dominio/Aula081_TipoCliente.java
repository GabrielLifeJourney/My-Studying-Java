package dominio;

public enum Aula081_TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int valor;
    private String nomeRelatorio;

    Aula081_TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor ;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
