package Exercicio06.Particula;

public class Particula {
    
    private String nome;
    
    public Particula(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public Class getTipo() {
        return this.getClass();
    }
}
