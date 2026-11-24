package test;

import dominio.Aula067_Jogador;
import dominio.Aula067_Time;

public class Aula067_JogadorTest03 {
    public static void main(String[] args) {
        Aula067_Jogador jogador = new Aula067_Jogador("Cafu");
        Aula067_Jogador jogador2 = new Aula067_Jogador("Pele");
        Aula067_Time time = new Aula067_Time("Brasil");
        Aula067_Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---- Jogador ----");
        jogador.imprime();
        System.out.println("---- Time ----");
        time.imprime();

    }
}
