package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade;

public class Exercicio04 {
    
    public static void main(String[] args) {
        
        // inicializando as variaveis
        Cramps jogo = new Cramps();
        Dado dado = new Dado();
        int ponto;
        
        // jogando
        ponto = jogo.faseUm(jogo.tentativa(dado));
        
        while (ponto != 0) {
            ponto = jogo.faseDois(jogo.tentativa(dado), ponto);
        }
        
    }
}

