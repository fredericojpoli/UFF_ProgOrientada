package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade;

import java.util.*;

public class Exercicio03 {
    
    public static int lancaDado() {
        Random dado = new Random();
        return (dado.nextInt(6) + 1);
    }
    
    public static void main(String[] args) {
        
        // jogador rola os dados
        int dadoUm = lancaDado();
        int dadoDois = lancaDado();
        int dadoSoma = dadoUm + dadoDois;
        System.out.println("DADOS: "+dadoUm+" + "+dadoDois+" = "+dadoSoma);
        
        // 2, 3 ou 12 = PERDE
        if (dadoSoma == 2 || dadoSoma == 3 || dadoSoma == 12) {
            System.out.println("Você perdeu!");
            
        // 7 ou 11 = GANHA
        } else if (dadoSoma == 7 || dadoSoma == 11) {
            System.out.println("Você ganhou!");
        
        // 4, 5, 6, 8, 9 ou 10 = TENTAR O MESMO PONTO
        } else {
            int ponto = dadoSoma;
            while (true) {
                dadoUm = lancaDado();
                dadoDois = lancaDado();
                dadoSoma = dadoUm + dadoDois;
                System.out.println("DADOS: "+dadoUm+" + "+dadoDois+" = "+dadoSoma);
                
                // mesmo ponto = GANHA
                if (dadoSoma == ponto) {
                    System.out.println("Você ganhou!");
                    break;
                    
                // 7 = PERDE
                } else if (dadoSoma == 7) {
                    System.out.println("Você perdeu!");
                    break;
                }
            }
        }
    }
}
