package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class OperadorMultiplicacao extends Operador implements Visitable {

    public OperadorMultiplicacao(Operador operador) {
        super("*");
        this.setFatores(operador.fatorA, operador.fatorB);
    }
    
    
    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}