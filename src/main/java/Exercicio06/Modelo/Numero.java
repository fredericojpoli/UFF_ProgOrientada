package Exercicio06.Modelo;

import Exercicio06.Observers.NObserver;


public class Numero extends Particula {
    NObserver observer;
    
    private double valor;
    
    public Numero(String nome, double valor) {
        super(nome);
        this.valor = valor;
        this.observer = new NObserver(this);
    }
    
    private void notificar(){
        this.observer.atualiza();
    }
    
    public double getValor() {
        return valor;
    } 

    public void setValor(double valor) {
        if(this.valor != valor){
            this.valor = valor;
            this.notificar();
        }
    }
    
}
