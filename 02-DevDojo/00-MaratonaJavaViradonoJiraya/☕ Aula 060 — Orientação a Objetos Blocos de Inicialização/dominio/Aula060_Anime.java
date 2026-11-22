package dominio;

public class Aula060_Anime {
    private  String nome;
    private int[] episodios;

    /*
    1- Alocado espaço em memoria pro objeto
    2- Cada atribruto de classe e criado e inicianilizado com valores default ou o que for passada.
    3 - Bloco de inicialização é executado
    4- Construtor é executado
     */

    {
        System.out.println("Dentro do Bloco de Inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Aula060_Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public Aula060_Anime(){

        for (int episodios: this.episodios){
            System.out.println(episodios + " ");
        }

    }





}
