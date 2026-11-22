package test;

import dominio.Aula060_Anime;

public class Aula060_AnimeTest01 {
    public static void main(String[] args) {
        Aula060_Anime anime = new Aula060_Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }


    }
}
