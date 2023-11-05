package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class OperadorPotenciacao extends Operador implements Visitable {

    public OperadorPotenciacao(Operador operador) {
        super("^");
        this.setFatores(operador.fatorA, operador.fatorB);
    }
    
    
    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
