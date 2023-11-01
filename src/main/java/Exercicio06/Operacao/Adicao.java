package Exercicio06.Operacao;

import Exercicio06.Particula.Variavel;

public class Adicao implements Operacao{
    
    private Variavel parcelaA;
    private Variavel parcelaB;
    
    public Adicao(Variavel parcelaA, Variavel parcelaB) {
        this.parcelaA = parcelaA;
        this.parcelaB = parcelaB;
    }
    
    @Override
    public double calcular() { 
        return (parcelaA.getValor() + parcelaB.getValor());
    }
}
