package JavaTutorials;

import java.util.*;

public class Teste {
    
    public static void main(String[] args) {
        
        List<Integer> lista = new ArrayList();   
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(10);
        
        for (int i = 0; i < 8; i++) {
            System.out.println(lista.get(i));
        }
        
        System.out.println(lista.size());
        
    }
    
}
