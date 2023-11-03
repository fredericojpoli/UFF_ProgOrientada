package Estruturas.Arvore;

public class Main {
    
    public static void main(String[] args) {
        
        int vetor[] = {10, 5, 15, 4, 14, 6, 16};
        
        ArvoreBinaria arvore = null;
        
        for (int i = 0; i < 7; i++)
            arvore = Controle.insere(arvore, vetor[i]);
                
        Controle.imprime(arvore, 1);
    } 
    
}
