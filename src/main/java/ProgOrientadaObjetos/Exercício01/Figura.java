/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProgOrientadaObjetos.Exercício01;

/* ABDTRACT = não pode ser instaciada */
public abstract class Figura {
    
    private String cor;
    
    public Figura(String cor) {
        this.cor = cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCor() {
        return cor;
    }
    
}
