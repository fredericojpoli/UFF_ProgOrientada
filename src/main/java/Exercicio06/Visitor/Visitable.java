package Exercicio06.Visitor;

import Exercicio06.Modelo.*;

public interface Visitable {
    public Numero accept(Visitor visitor);
}
