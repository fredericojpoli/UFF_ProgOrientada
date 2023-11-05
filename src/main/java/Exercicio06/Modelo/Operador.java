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

    

    public void setFatorA(Numero fatorA) {
        this.fatorA = fatorA;
       
    }

    public void setFatorB(Numero fatorB) {
        this.fatorB = fatorB;
      
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
     
    }
    
    
    
}
