package Exercicio06.Particula;

import Exercicio06.Particula.Particula;

public class Variavel extends Particula {
   
    private double valor;
    
    public Variavel(String nome, double valor) {
        super(nome);
        this.valor = valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }   
    
    public double getValor() {
        return valor;
    } 
    
    public Boolean positivo() {
        return valor >= 0;
    }
            
    public double getModulo() {
        if (this.positivo())
            return valor;
        else
            return (valor * -1);
    }
    
    
}
