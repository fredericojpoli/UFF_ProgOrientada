package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class OperadorDivisao extends Operador implements Visitable {

    public OperadorDivisao(String nome) {
        super(nome);
    }
    
    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
