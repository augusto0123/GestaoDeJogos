package torneio;

import jogos.Torneio;
import model.Jogador;

import java.util.HashSet;
import java.util.Set;

public class TorneioPrincipal {

    public String nome;
    private Set<Jogador> jogadors;

    public TorneioPrincipal(String nome){
        this.nome = nome;
        this.jogadors = new HashSet<>();

    }

    public void adicionarJogador(Jogador jogador){
        if(this.jogadors.add(jogador)){
            System.out.printf("Jogador %s entrou no torneio. \n", jogador.getNome());
        }else {
            System.out.printf("Jogador %s já está no torneio. \n", jogador.getNome());
        }
    }

}
