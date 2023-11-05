package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class Operador extends Particula {
    
    public Numero fatorA;
    public Numero fatorB;
    
    public Operador(String nome) {
        super(nome);
    }

    public void setFatores(Numero fatorA, Numero fatorB) {
        this.fatorA = fatorA;
        this.fatorB = fatorB;
    }
}
