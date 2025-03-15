package main;

import jogos.Torneio;
import model.Jogador;
import torneio.Estatistica;
import torneio.TorneioPrincipal;

public class Main {
    public static void main(String[] args) {
        // Criando jogadores
        Jogador maria = new Jogador("Maria", 0);
        Jogador joao = new Jogador("João", 0);
        Jogador pedro = new Jogador("Pedro", 0);
        Jogador jose = new Jogador("José", 0);
        Jogador ana = new Jogador("Ana", 0);
        Jogador carlos = new Jogador("Carlos", 0);

        // Criando primeiro torneio
        Torneio torneio1 = new Torneio("Torneio de Verão");
        torneio1.adicionarJogador(maria);
        torneio1.adicionarJogador(joao);
        torneio1.adicionarJogador(pedro);

        System.out.println("\n🔹 Iniciando " + torneio1 + "...");
        torneio1.simularTorneio();
        torneio1.exibirRankingFinal();

        // Criando segundo torneio
        Torneio torneio2 = new Torneio("Torneio de Inverno");
        torneio2.adicionarJogador(jose);
        torneio2.adicionarJogador(ana);
        torneio2.adicionarJogador(carlos);

        System.out.println("\n🔹 Iniciando " + torneio2 + "...");
        torneio2.simularTorneio();
        torneio2.exibirRankingFinal();

        // Torneio Principal
        TorneioPrincipal torneioPrincipal = new TorneioPrincipal("Torneio LDS I - 15/03");
        torneioPrincipal.adicionarJogador(pedro);
        torneioPrincipal.adicionarJogador(carlos);

        torneioPrincipal.exibirJogadores();

        // Estatísticas
        Estatistica estatistica = new Estatistica(torneioPrincipal);
        estatistica.registrarPontuacao(pedro, 100);
        estatistica.registrarPontuacao(carlos, 200);
        estatistica.registrarPontuacao(pedro, 50);
        estatistica.registrarPontuacao(carlos, 300);

        estatistica.exibirPontuacoes();
        estatistica.exibirVencedorTorneio();
    }
}
