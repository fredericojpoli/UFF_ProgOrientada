package JavaTutorials;

import java.util.*;

public class LanguageBasics {
    
    public static void main(String[] args) {
        
        // TIPOS PRIMITIVOS
        int a = 10;
        char b = 'b';
        long c = 200;
        double d = 3.33;
        float e = 4.44f;
        
        // TIPO OBJETO
        String nome = "Eliana"; // varivel.metodo() == tudo que o objeto nome pode fazer
       
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        
        metodoQuestionMark("tudo bem");
        System.out.println(metodoExclamationPoint("tudo bem"));
    
        // METODO IMPORTADO DE Numero.java
        Numero num = new Numero();
        
        int quinze = num.adicao(10, 5);
        int cinco = num.subtracao(10, 5);
        
        System.out.println("Imprime 10 + 5 == " + quinze);
        System.out.println("Imprime 10 - 5 == " + cinco);
        
        // METODO IMPORTADO DE Cachorro.java;
        Cachorro belinha = new Cachorro();
        belinha.latir();
        belinha.alimentar();
        belinha.banhar();
    }
    
    public static void metodoQuestionMark(String frase) {
        System.out.println(frase + "?");
    }
    
    public static String metodoExclamationPoint(String frase) {
        return (frase + "!");
    }
    
}
