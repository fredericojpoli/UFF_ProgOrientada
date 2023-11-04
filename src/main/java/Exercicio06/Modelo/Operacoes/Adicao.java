package Exercicio06.Modelo.Operacoes;

import Exercicio06.Modelo.*;
import Exercicio06.Visitor.*;

public class Adicao extends Operacao implements Visitable {

    @Override
    public Numero accept(Visitor visitor) {
        return visitor.visit(this);
    }
    
}
