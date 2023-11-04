package Exercicio06.Modelo;

import Exercicio06.Modelo.Operacoes.Operacao;

public class Operador extends Particula {
            
    public Operacao operacao;
    
    public Operador(String nome, Operacao operacao) {
        super(nome);
        this.operacao = operacao;
    }
    
    public void setFatores(Numero fatorA, Numero fatorB) {
        operacao.fatorA = fatorA;
        operacao.fatorB = fatorB;
    }

}
