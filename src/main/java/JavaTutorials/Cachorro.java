package JavaTutorials;

import java.util.*;

public class Cachorro {
   
    public static void latir() {
        System.out.println("AU AU AU!");
    }
    
    public static void alimentar() {
        Scanner teclado = new Scanner(System.in);
        boolean alimentado = false;
        int gramas = 0;
        
        while (alimentado == false) {
            gramas += 5;
            System.out.println("Alimentando com +5g de ração. Satisfeito? (true/false)");
            alimentado = teclado.nextBoolean();
        }
        
        System.out.println("Seu cão foi alimentado com " + gramas + " gramas");
    }
    
    public static void banhar() {
        
        for (int dia = 1; dia < 8; dia++) {
            if (dia == 2) {
                System.out.println("Hoje é terça, dia de banho!");
                
            } else if (dia == 4) {
                System.out.println("Hoje é quinta, dia de banho!");
                
            } else if (dia == 6) {
                System.out.println("Hoje é sábado, dia de banho!");
                
            } else {
                System.out.println("Hoje não é dia de banho!");
            }
        }
        
    }
    
}
