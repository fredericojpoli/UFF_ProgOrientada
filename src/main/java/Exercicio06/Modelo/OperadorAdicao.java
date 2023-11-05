package Exercicio06.Modelo;

import Exercicio06.Modelo.*;
import Exercicio06.Visitor.*;

public class OperadorAdicao extends Operador implements Visitable {

    public OperadorAdicao(String nome) {
        super(nome);
    }
    
    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
