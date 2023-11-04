package Exercicio06.ClassificaParticula;

import Exercicio06.Modelo.*;
import Exercicio06.SelecionaOperacao.*;

public class ClassificaOperador implements ClassificaParticula {
    
    private ClassificaParticula proximo = null;
    
    public ClassificaOperador(ClassificaParticula proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classifica(String particula) {
        if (particula.equals("+") || particula.equals("-") || particula.equals("*") || particula.equals("/") || particula.equals("^")) {
            SelecionaOperacao seletor = new SelecionaAdicao(new SelecionaSubtracao(new SelecionaMultiplicacao(new SelecionaDivisao(new SelecionaPotenciacao(null)))));
            Operador novo = new Operador(particula, seletor.seleciona(particula));
            return novo;
        }
        
        if (proximo != null)
            return proximo.classifica(particula);
        
        return null;
    }
    
}
