package Exercicio06.Operacao;

import Exercicio06.Particula.Variavel;

public class Potenciacao implements Operacao {
    
    private Variavel base;
    private Variavel expoente;
    
    public Potenciacao(Variavel base, Variavel expoente) {
        this.base = base;
        this.expoente = expoente;
    }
    
    @Override
    public double calcular() {
        double resultado = 1;
        
        for (int i = 0; i < expoente.getModulo(); i++)
            resultado = resultado * base.getValor();
        
        if (!expoente.positivo())
            resultado = 1 / resultado;
        
        return resultado;
    }
}
