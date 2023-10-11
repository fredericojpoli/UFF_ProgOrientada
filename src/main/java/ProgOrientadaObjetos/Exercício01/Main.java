package ProgOrientadaObjetos.Exercício01;

public class Main {
    
    public static void main(String[] args) {
        Retangulo campinho = new Retangulo(10, 2, "verde");
        Circulo piscina = new Circulo(50, "azul");
        Triangulo borracha = new Triangulo(3, 3, "roxo");
        Quadrado postit = new Quadrado(5, "laranja");
        
        System.out.println(campinho.descricao());
        campinho.setLado1(5);
        System.out.println(campinho.descricao());
        
        System.out.println(piscina.descricao());
        System.out.println("A piscina tem area " + piscina.getArea());
        
        System.out.println(borracha.descricao());
        borracha.setCor("rosa");
        System.out.println(borracha.descricao());
        
        System.out.println(postit.descricao());
        postit.setLado1(6);
        System.out.println(postit.descricao());
        postit.setLado2(10);
        System.out.println(postit.descricao());
        
    }
}
