package Exercicio06.HandlerA;

import Exercicio06.Modelo.*;

public interface HandlerA {
    /*
    A primeira classe vai receber a particula, trata se souber tratar
    Caso contrário passa a particula pra próxima
    */
    public Particula classifica(String particula);
    
}
