package Exercicio06.ClassificaParticula;

import Exercicio06.Modelo.*;

public class ClassificaOperador implements ClassificaParticula {
    
    private ClassificaParticula proximo = null;
    
    public ClassificaOperador(ClassificaParticula proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classificar(String particula) {
        if (particula.equals("+") || particula.equals("-") || particula.equals("*") || particula.equals("/") || particula.equals("^"))
            return (new Operador(particula));
        
        if (proximo != null)
            return proximo.classificar(particula);
        
        return null;
    }
    
}
