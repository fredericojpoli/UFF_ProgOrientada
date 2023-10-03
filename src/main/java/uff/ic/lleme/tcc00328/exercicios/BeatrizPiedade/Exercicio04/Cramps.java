package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio04;

public class Cramps {
    
    public static int tentativa(Dado dado) {
        // inicializando as variaveis
        int d1, d2, soma;
        
        // lançando os dados
        d1 = Dado.lancar();
        d2 = Dado.lancar();
        
        // somando os dados
        soma = d1 + d2;
        
        // imprimindo resultado
        System.out.println("DADOS: "+ d1 +" + "+ d2 +" = "+ soma);
        
        return soma;
    }
    
    public static int faseUm(int soma) {

        switch (soma) {
            // 2, 3 ou 12 = PERDE
            case 2, 3, 12 -> { 
                System.out.println("Você perdeu!");
                return 0;
            }
            // 7 ou 11 = GANHA
            case 7, 11 -> {
                System.out.println("Você ganhou!");
                return 0;
            }
            // 4, 5, 6, 8, 9 ou 10 = TENTAR O MESMO PONTO
            default -> {
                System.out.println("PONTO!");
                return soma;
            }
        }
    }
    
    public static int faseDois(int soma, int ponto) {
        // 7 = PERDE
        if (soma == 7) {
            System.out.println("Você perdeu!");
            return 0;
        }
        // mesmo ponto = GANHA
        if (soma == ponto) {
            System.out.println("Você ganhou!");
            return 0;
        }
        // continuar tentando
        System.out.println("Tente novamente!");
        return ponto;
    }
}
