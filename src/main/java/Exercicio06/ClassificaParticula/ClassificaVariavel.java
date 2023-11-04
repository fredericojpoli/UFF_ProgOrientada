package Exercicio06.ClassificaParticula;

import Exercicio06.Modelo.*;
import Exercicio06.Controle;

public class ClassificaVariavel implements ClassificaParticula {
    
    private ClassificaParticula proximo = null;
    
    public ClassificaVariavel(ClassificaParticula proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classifica(String particula) {
        if (particula.startsWith("_")) 
            return Controle.buscaVariavel(particula);
        
        if (proximo != null)
            return proximo.classifica(particula);
        
        return null;
        
    }
    
}
