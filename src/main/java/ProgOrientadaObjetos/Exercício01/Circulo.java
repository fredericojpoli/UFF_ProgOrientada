package ProgOrientadaObjetos.Exercício01;

public class Circulo extends Figura {
    
    public double raio;
    
    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }
    
    public void setRaio(double raio){
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }
    
    public double getDiametro() {
        return (raio * 2);
    }
    
    public double getArea() {
        return (Math.PI * (raio * raio));
    }
    
    public String descricao() {
        return "Circulo " + this.getCor() + " de raio " + raio + ".";
    }
    
}
