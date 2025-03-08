package jogos;

import model.Jogador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Torneio {

    private String nome;
    private ArrayList<Jogador> jogadores;
    private Random random;

    public Torneio(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.random = new Random();
    }

    public void adicionarJogador(Jogador jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
        }
    }

    public void simularTorneio(){
        for (Jogador jogador : jogadores){
            int pontos = random.nextInt(401) + 100;
            jogador.adicionarPontuacao(pontos);
        }
    }

    public void exibirRankingFinal() {
        // ordenação decrecente
        jogadores.sort(Comparator.comparingInt(Jogador::getPontuacao).reversed());
        StringBuilder ranking = new StringBuilder("\n== RANKING FINAL DO TORNEIO: " + nome + "== \n");
        for (int i = 0; i < jogadores.size(); i++) {
            ranking.append(i + 1).append(" - ").append(jogadores.get(i)).append("\n");
        }

        // função para exibir o vencedor
        Jogador vencedor = jogadores.get(0);

        ranking.append("\n VENCEDOR: ").append(vencedor);

        System.out.println(ranking);
    }



}
