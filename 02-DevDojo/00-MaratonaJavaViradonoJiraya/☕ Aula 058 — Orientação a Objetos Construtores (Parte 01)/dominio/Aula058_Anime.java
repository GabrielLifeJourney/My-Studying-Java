package dominio;

public class Aula058_Anime {
    public String tipo;
    public String nome;
    private int epsodios;
    private String genero;

    public Aula058_Anime(String nome, String tipo, int epsodios, String genero){
        System.out.println("Dentro do Construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.epsodios = epsodios;
        this.genero = genero;
    }
    public Aula058_Anime(){

    }


    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.epsodios);
        System.out.println(this.genero);
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
