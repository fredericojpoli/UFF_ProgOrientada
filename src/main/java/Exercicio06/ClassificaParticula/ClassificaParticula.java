package Exercicio06.ClassificaParticula;

import Exercicio06.Modelo.*;

/*
Se o primeiro elemento da lista encadeada não pode tratar a particula, passsa para o proximo
Termina quando ele retorna um numero ou um operador = Termina quando alguém trata a particula
*/
public interface ClassificaParticula {
    
    public Particula classificar(String particula);
    
}
