/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio06.Observers;

import Exercicio06.Modelo.Numero;

/**
 *
 * @author Fred
 */
public class NObserver implements NumeroObserver {
    Numero observado;
    
    public NObserver(Numero num){
        this.observado = num;
    }
    @Override
    public void atualiza(){
        System.out.printf("%s teve seu valor alterado para %.2f", observado.getNome(), observado.getValor() );
    }
}
