package ProgOrientadaObjetos.Exercício01;

public class Quadrado extends Retangulo {
    
    public Quadrado(double lado, String cor) {
        super(lado, lado, cor);
    }
    
    @Override
    public String descricao() {
        return "Quadrado " + this.getCor() + " de lados " + lado1 + ".";
    }
    
    public void setLado1(double lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }
    
    public void setLado2(double lado2) {
        this.lado1 = lado2;
        this.lado2 = lado2;
    }
    
}
