package Exercicio06.Modelo;

public class Numero extends Particula {
   
    private double valor;
    
    public Numero(String nome, double valor) {
        super(nome);
        this.valor = valor;
    }
    
    public double getValor() {
        return valor;
    } 

}
