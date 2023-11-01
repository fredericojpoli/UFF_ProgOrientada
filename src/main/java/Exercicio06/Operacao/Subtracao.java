package Exercicio06.Operacao;

import Exercicio06.Particula.Variavel;

public class Subtracao implements Operacao{
    
    private Variavel minuendo;
    private Variavel subtraendo;
    
    public Subtracao(Variavel minuendo, Variavel subtraendo) {
        this.minuendo = minuendo;
        this.subtraendo = subtraendo;
    }
    
    @Override
    public double calcular() { 
        return (minuendo.getValor() - subtraendo.getValor());
    }
}
