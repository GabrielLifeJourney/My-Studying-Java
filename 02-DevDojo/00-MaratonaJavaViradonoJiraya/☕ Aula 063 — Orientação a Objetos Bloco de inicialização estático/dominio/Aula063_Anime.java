package dominio;

public class Aula063_Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de inicialização é executado quando a JVM carregar classe
    // 1- Alocado espaço em memória pro objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o quer for
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado

    static   {
        System.out.println("Dentro do bloco de inicialização 1 ");
        episodios = new int[100];
        for (int i=0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }
    static   {
        System.out.println("Dentro do bloco de inicialização 2 ");
    }
    static   {
        System.out.println("Dentro do bloco de inicialização 3 ");
    }
    {
        System.out.println("Dentro do bloco de inicializacao não estático ");
    }

    public Aula063_Anime(String nome) {
        this.nome = nome;
    }
    public Aula063_Anime(){
        for (int epsodio: Aula063_Anime.episodios){
            System.out.println(epsodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int[] getEpisodios() {
        return episodios;
    }

    public static void setEpisodios(int[] episodios) {
        Aula063_Anime.episodios = episodios;
    }
}