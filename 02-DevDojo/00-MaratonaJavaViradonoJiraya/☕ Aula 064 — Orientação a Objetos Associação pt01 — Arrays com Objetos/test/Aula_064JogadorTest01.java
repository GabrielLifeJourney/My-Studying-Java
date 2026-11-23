package test;

import dominio.Aula064_Jogador;

public class Aula_064JogadorTest01 {
    public static void main(String[] args) {
        Aula064_Jogador joador1 = new Aula064_Jogador("Pele");
        Aula064_Jogador joador2 = new Aula064_Jogador("Romario");
        Aula064_Jogador joador3 = new Aula064_Jogador("Cafu");

        Aula064_Jogador[] jogadores = new Aula064_Jogador[]{joador1,joador2,joador3};

        for (Aula064_Jogador jogadore : jogadores) {
            jogadore.imprime();
        }
    }
}
