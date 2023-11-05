package Exercicio06.Modelo;

public class Operador extends Particula {
    
    public Numero fatorA;
    public Numero fatorB;
    
    public Operador(String nome) {
        super(nome);
    }

    public void setFatores(Numero A, Numero B) {
        this.fatorA = A;
        this.fatorB = B;
    }
}
