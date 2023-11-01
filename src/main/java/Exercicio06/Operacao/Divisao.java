package Exercicio06.Operacao;

import Exercicio06.Particula.Variavel;

public class Divisao implements Operacao{
    
    private Variavel dividendo;
    private Variavel divisor;
    
    public Divisao(Variavel dividendo, Variavel divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }
    
    @Override
    public double calcular() { 
        return (dividendo.getValor() / divisor.getValor());
    }
}
