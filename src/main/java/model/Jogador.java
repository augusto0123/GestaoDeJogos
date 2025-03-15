package model;

public class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    public void adicionarPontuacao(int pontos){
        this.pontuacao += pontos;
    }

    @Override
    public String toString(){
        return String.format("Jogador: %s | Pontuação: %d", this.nome, this.pontuacao);
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNome() {
        return nome;
    }
}
