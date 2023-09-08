package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade;

import java.util.*;
import java.io.*;

public class Exercicio02 {
    
    public static int retornaLider(int times, int[][] matriz) throws FileNotFoundException, IOException {
        
        int lider = 0;
        int PG = matriz[0][0], V = matriz[0][2], SG = matriz[0][3], GP = matriz[0][4]; // os maiores saldos
        
        for (int i = 0; i < times; i++) {
            if (PG <= matriz[i][0] && V <= matriz[i][2] && SG <= matriz[i][3] && GP < matriz[i][4]) {
                PG = matriz[i][0];
                V = matriz[i][2];
                SG = matriz[i][3];
                GP = matriz[i][4];
                lider = i;
            }
        }
        
        return lider;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // abrindo o arquivo
        BufferedReader leitor = new BufferedReader(new FileReader("src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/campeonato.txt"));
        String linha;
        String[] numeros;
        
        Scanner teclado = new Scanner(System.in);
        int times = teclado.nextInt();
        
        // gerando matriz
        int[][] matriz = new int[times][5];
        for (int i = 0; i < times; i++) {
            linha = leitor.readLine();
            numeros =  linha.split(" ");
            for (int j = 0; j < 5; j++){
                matriz[i][j] = Integer.parseInt(numeros[j]);
            }
        }
        
        int lider = retornaLider(times, matriz);
        System.out.println("O time "+lider+" foi o lider do campeonato!");
        
    }
    
}
