/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio06.Observers;

import Exercicio06.Modelo.Operador;

/**
 *
 * @author Fred
 */
public class OObserver implements OperadorObserver {
    Operador observado;
    
    public OObserver(Operador o){
        this.observado = o;
    }
    @Override
    public void atualiza(){
        System.out.printf("%s teve seu valor alterado!\n", this.observado.getNome());
    }

}