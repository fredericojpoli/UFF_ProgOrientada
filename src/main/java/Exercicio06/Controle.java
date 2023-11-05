package Exercicio06;

import Exercicio06.Modelo.*;

public class Controle {
    
    public static Particula inicializa(String nome, double valor) {
        Particula resultado = buscaVariavel(nome);
        if (resultado == null) {
            resultado = new Numero(nome, valor);
            Main.listaVariaveis.add((Numero) resultado);
        }
        return resultado;
    }
    
    public static Particula buscaVariavel(String particula) {
        for (Particula variavel: Main.listaVariaveis)
            if (variavel != null && variavel.getNome().equals(particula))
                return variavel;
        return null;
    }
    
    public static void AlteraVariavel(String variavel, Double valor){
        for(int i = 0; i< Main.listaVariaveis.size(); i++){
            if(Main.listaVariaveis.get(i).getNome().equals(variavel)){
                Numero num = Main.listaVariaveis.get(i);
                num.setValor(valor);
                Main.listaVariaveis.set(i, num);
            }
        }
    }
    
}
