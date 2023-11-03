package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class Adicao extends Operacao implements Visitable {

    public Adicao(Numero a, Numero b) {
        super(a, b);
    }

    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
