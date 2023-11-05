package Exercicio06.HandlerA;

import Exercicio06.Modelo.*;

/*
Se o primeiro elemento da lista encadeada não pode tratar a particula, passsa para o proximo
Termina quando ele retorna um numero ou um operador = Termina quando alguém trata a particula
*/
public interface HandlerA {
    
    public Particula classifica(String particula);
    
}
