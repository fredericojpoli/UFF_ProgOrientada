package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class OperadorPotenciacao extends Operador implements Visitable {

    public OperadorPotenciacao(String nome) {
        super(nome);
    }
    
    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
