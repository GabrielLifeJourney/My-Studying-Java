package test;

import dominio.Aula065_Jogador;
import dominio.Aula065_Time;

public class Aula_065JogadorTest02 {
    public static void main(String[] args) {
        Aula065_Jogador jogador1 = new Aula065_Jogador("Pele");
        Aula065_Time time = new Aula065_Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
