package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class OperadorMultiplicacao extends Operador implements Visitable {

    public OperadorMultiplicacao(String nome) {
        super(nome);
    }
    
    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
