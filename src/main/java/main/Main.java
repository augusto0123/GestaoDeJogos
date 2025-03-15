package main;

import jogos.Torneio;
import model.Jogador;
import torneio.TorneioPrincipal;

public class Main {
    public static void main(String[] args) {
        // Criando primeiro torneio
        Torneio torneio1 = new Torneio("Torneio de Verão");
        torneio1.adicionarJogador(new Jogador("Maria", 0));
        torneio1.adicionarJogador(new Jogador("João", 0));
        torneio1.adicionarJogador(new Jogador("Pedro", 0));

        System.out.println("\n🔹 Iniciando " + torneio1 + "...");
        torneio1.simularTorneio();
        torneio1.exibirRankingFinal();

        // Criando segundo torneio
        Torneio torneio2 = new Torneio("Torneio de Inverno");
        torneio2.adicionarJogador(new Jogador("José", 0));
        torneio2.adicionarJogador(new Jogador("Ana", 0));
        torneio2.adicionarJogador(new Jogador("Carlos", 0));

        System.out.println("\n🔹 Iniciando " + torneio2 + "...");
        torneio2.simularTorneio();
        torneio2.exibirRankingFinal();

        // Torneio do Andrey
        TorneioPrincipal torneioPrincipal = new TorneioPrincipal("Torneio LDS I - 15/03");
        torneioPrincipal.adicionarJogador(new Jogador("Pedro", 500));
        torneioPrincipal.adicionarJogador(new Jogador("Carlos", 1000));

        torneioPrincipal.exibirJogadores();
    }
}
