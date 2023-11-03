package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class Multiplicacao extends Operacao implements Visitable {
    
    public Multiplicacao(Numero a, Numero b) {
        super(a, b);
    }

    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
