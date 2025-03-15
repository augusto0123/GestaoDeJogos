package torneio;

import model.Jogador;

import java.util.Collections;
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

    public void exibirVencedorTorneio(){
        System.out.println("\n=== Vencedor do Torneio ===");
        System.out.println("Torneio: " + this.torneioPrincipal.getNome());

        Map.Entry<String, Integer> vencedor = Collections.max(this.pontuacoes.entrySet(), Map.Entry.comparingByValue());
        System.out.printf("JOgador(a): %s - %d pontos\n", vencedor.getKey(), vencedor.getValue());
    }
}
