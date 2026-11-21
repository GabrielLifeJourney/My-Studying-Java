package test;

import dominio.Aula057_Anime;

public class Aula057_AnimeTest01 {
    public static void main(String[] args) {
        Aula057_Anime anime = new Aula057_Anime();
        anime.init("Akuma Drive 2", "Tv",26,"Masculino");
        anime.setGenero("Masculino");
        anime.imprime();

        /*
        Sobrecarga de métodos é a possibilidade de criar métodos com o mesmo nome, mas com listas de parâmetros diferentes. A diferença pode estar na quantidade ou nos tipos dos parâmetros; o tipo de retorno e o modificador de acesso não determinam a sobrecarga.
         */
    }
}
