package Exercicio06.Modelo;

import Exercicio06.Observers.OObserver;

public class Operador extends Particula {
    OObserver observer = new OObserver(this); 
    public Numero fatorA;
    public Numero fatorB;
    
    
    private void notificar(){
        this.observer.atualiza();
    }
    public Operador(String nome) {
        super(nome);
    }

    public void setFatores(Numero A, Numero B) {
        this.fatorA = A;
        this.fatorB = B;
    }

    

    public void setFatorA(Numero fatorA) {
        this.fatorA = fatorA;
        this.notificar();
    }

    public void setFatorB(Numero fatorB) {
        this.fatorB = fatorB;
        this.notificar();
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
        this.notificar();
    }
    
    
    
}
