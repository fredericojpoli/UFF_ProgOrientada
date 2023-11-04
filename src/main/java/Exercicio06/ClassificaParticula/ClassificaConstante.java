package Exercicio06.ClassificaParticula;

import Exercicio06.Modelo.*;

public class ClassificaConstante implements ClassificaParticula {
    
    private ClassificaParticula proximo = null;
    
    public ClassificaConstante(ClassificaParticula proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Particula classifica(String particula) {
        return (new Numero(particula, Double.parseDouble(particula)));
    }
    
}
