package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class Subtracao extends Operacao implements Visitable {
    
    public Subtracao(Numero a, Numero b) {
        super(a, b);
    }

    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
