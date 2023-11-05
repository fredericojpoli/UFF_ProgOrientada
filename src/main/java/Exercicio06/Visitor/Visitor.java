package Exercicio06.Visitor;

import Exercicio06.Modelo.*;

/* todos esse objetos podem calcular mas cada um calcula de uma forma diferente */
public interface Visitor {
    public Numero visit(OperadorAdicao expressao);
    public Numero visit(OperadorSubtracao expressao);
    public Numero visit(OperadorMultiplicacao expressao);
    public Numero visit(OperadorDivisao expressao);
    public Numero visit(OperadorPotenciacao expressao);
}
