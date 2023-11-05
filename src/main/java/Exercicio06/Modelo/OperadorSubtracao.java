package Exercicio06.Modelo;

import Exercicio06.Visitor.*;

public class OperadorSubtracao extends Operador implements Visitable {

    public OperadorSubtracao(String nome) {
        super(nome);
    }
    
    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
