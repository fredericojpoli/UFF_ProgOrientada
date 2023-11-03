package Estruturas.Arvore;

public class ArvoreBinaria {
    public int info;
    public ArvoreBinaria esq;
    public ArvoreBinaria dir;
    
    public ArvoreBinaria(int info) {
        this.info = info;
        esq = null;
        dir = null;
    }
}
