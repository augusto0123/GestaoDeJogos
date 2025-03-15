package torneio;

import model.Jogador;

import java.util.HashMap;
import java.util.Map;

public class Estatistica {

    private TorneioPrincipal torneioPrincipal;
    private Map<String, Integer> pontuacoes;

    public Estatistica(TorneioPrincipal torneioPrincipal) {
        this.torneioPrincipal = torneioPrincipal;
        this.pontuacoes = new HashMap<>();
    }

    public void registrarPontuacao(Jogador jogador, int pontuacao){
        if (this.torneioPrincipal.getJogadors().contains(jogador)){
            this.pontuacoes.put(jogador.getNome(), this.pontuacoes.getOrDefault(jogador.getNome(), 0) + pontuacao);
        }
    }

    public void exibirPontuacoes(){
        System.out.println("\n=== Pontuações do Torneio ===");
        System.out.println("Torneio: " + this.torneioPrincipal.getNome());
        this.pontuacoes.forEach((nome, pontos) -> System.out.printf("Nome: %s | Pontuação: %d\n", nome, pontos));
    }
}
