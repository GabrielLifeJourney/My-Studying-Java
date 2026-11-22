package dominio;

public class Aula059_Anime {
    public String tipo;
    public String nome;
    private int epsodios;
    private String genero;
    private String estudio;
    // da pra ver ninguem gosta de um gerente kkk.
    // mais a credito na bagagem, historica.

    public Aula059_Anime(String nome, String tipo, int epsodios, String genero){
        this(); // obrigatorio ser a primeira linha executavel
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }
    public Aula059_Anime(String nome, String tipo, int epsodios, String genero, String estudio){
        this(nome,tipo,epsodios,genero);// obrigatorio ser a primeira linha executavel
        this.estudio = estudio;
    }

    public Aula059_Anime(){
        System.out.println("Dentro do Construtor");
    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEpsodios(int epsodios){
        this.epsodios = epsodios ;
    }
    public int getEpsodios(){
        return this.epsodios;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

}
