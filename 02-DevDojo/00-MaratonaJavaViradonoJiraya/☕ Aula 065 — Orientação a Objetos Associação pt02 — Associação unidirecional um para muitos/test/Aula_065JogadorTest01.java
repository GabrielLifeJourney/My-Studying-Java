package test;

import dominio.Aula065_Jogador;

public class Aula_065JogadorTest01 {
    public static void main(String[] args) {
        Aula065_Jogador joador1 = new Aula065_Jogador("Pele");
        Aula065_Jogador joador2 = new Aula065_Jogador("Romario");
        Aula065_Jogador joador3 = new Aula065_Jogador("Cafu");

        Aula065_Jogador[] jogadores = new Aula065_Jogador[]{joador1,joador2,joador3};

        for (Aula065_Jogador jogadore : jogadores) {
            jogadore.imprime();
        }
    }
}
