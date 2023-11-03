package Exercicio06.Visitor;

import Exercicio06.Modelo.*;

/* todos esse objetos podem calcular mas cada um calcula de uma forma diferente */
public interface Visitor {
    public Numero visit(Adicao expressao);
    public Numero visit(Subtracao expressao);
    public Numero visit(Multiplicacao expressao);
    public Numero visit(Divisao expressao);
    public Numero visit(Potenciacao expressao);
}
