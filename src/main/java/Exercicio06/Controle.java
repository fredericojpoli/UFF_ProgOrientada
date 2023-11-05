package Exercicio06;

import Exercicio06.Interpreter.Arvore;
import Exercicio06.Interpreter.NPR;
import Exercicio06.Modelo.*;

public class Controle {
    public static String expressao;

    public static void setExpressao(String expressao) {
        Controle.expressao = expressao;
    }
    
    
    public static Arvore geraArvore(){
        String splited[] = Controle.expressao.split(" ");
        Arvore npr = NPR.traduz(splited, splited.length - 1); // Interpreter/NPR.java
        return npr;
    }
    
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
    
    public static void listaVariaveis(){
        System.out.println("Variáveis:");
         for(int i = 0; i< Main.listaVariaveis.size(); i++){
             System.out.printf("%d: %s\n",(i+1) ,Main.listaVariaveis.get(i).getNome());
         }
    }
    
    public static void alteraVariavel(String variavel, Double valor){
        for(int i = 0; i< Main.listaVariaveis.size(); i++){
            if(Main.listaVariaveis.get(i).getNome().equals(variavel)){
                Numero num = Main.listaVariaveis.get(i);
                num.setValor(valor);
                Main.listaVariaveis.set(i, num);
                break;
            }
            if(i == (Main.listaVariaveis.size() - 1)){
                System.out.println("A variável não está na expressão!");
            }
        }
    }
    
     public static void Calcula(){
        Arvore npr = geraArvore();
        Numero resultado = NPR.calcula(npr); // Interpreter/NPR.java
        System.out.printf("O resultado é igual a: %.1f\n",resultado.getValor());
    }
    
}
