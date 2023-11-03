package Estruturas.Arvore;

public abstract class Controle {
    
    public static ArvoreBinaria busca(ArvoreBinaria raiz, int numero) {
        
        ArvoreBinaria ante = raiz;
        ArvoreBinaria aux = raiz;
        
        while (aux != null && aux.info != numero) {
            ante = aux;
            if (numero < aux.info)
                aux = aux.esq;
            else if (numero > aux.info)
                aux = aux.dir;
        }
        
        return ante;
    }
    
    public static ArvoreBinaria insere(ArvoreBinaria raiz, int numero) {
        
        ArvoreBinaria nova = new ArvoreBinaria(numero);
        
        if (raiz != null) {
            ArvoreBinaria mae = busca(raiz, numero);
            
            if (numero < mae.info && mae.esq == null)
                mae.esq = nova;
            
            else if (numero > mae.info && mae.dir == null)
                mae.dir = nova;
            
            else
                System.out.println("Já está na lista!");
            
        } else
            raiz = nova;
        
        return raiz;
    }
  
    public static void imprime(ArvoreBinaria raiz, int tab) {
        
        if (raiz != null) {
            
            imprime(raiz.dir, tab+2);
            
            for (int i = 0; i < tab; i++)
                System.out.print("-");
            
            System.out.println(raiz.info);
            
            imprime(raiz.esq, tab+2);
        }
        
    }
    
}
