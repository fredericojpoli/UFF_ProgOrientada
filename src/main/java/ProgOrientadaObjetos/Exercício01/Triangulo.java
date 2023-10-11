package ProgOrientadaObjetos.Exercício01;

public class Triangulo extends Figura {
    
    public double base;
    public double altura;
    
     public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getArea() {
        return (base * altura)/2;
    }
    
    public String descricao() {
        return "Triangulo " + this.getCor() + " de base " + base + " e altura " + altura + ".";
    }
    
}
