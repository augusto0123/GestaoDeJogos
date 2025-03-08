package jogos;

import model.Jogador;

import java.util.ArrayList;

public class Ranking {

    private ArrayList<Jogador> jogadores;

    public Ranking() {
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador){
        if (!this.jogadores.contains(jogador)){
            this.jogadores.add(jogador);
        }
    }
}
