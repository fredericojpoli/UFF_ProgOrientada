package Exercicio06.Operacao;

import Exercicio06.Particula.Variavel;

public class Multiplicacao implements Operacao{
    
    private Variavel fatorA;
    private Variavel fatorB;
    
    public Multiplicacao(Variavel fatorA, Variavel fatorB) {
        this.fatorA = fatorA;
        this.fatorB = fatorB;
    }
    
    @Override
    public double calcular() { 
        return (fatorA.getValor() * fatorB.getValor());
    }
}
