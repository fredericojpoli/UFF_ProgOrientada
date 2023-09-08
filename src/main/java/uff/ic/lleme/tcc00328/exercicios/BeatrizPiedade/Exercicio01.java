package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade;

import java.io.*;
import java.util.*;

public class Exercicio01 {
    
    public static void criaArquivo(int N) throws FileNotFoundException, IOException {
        // criando arquivo
        // declarando variável para gerar números
        BufferedWriter gravador = new BufferedWriter(new FileWriter("src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/numAleatorios.txt"));
        Random gerador = new Random();
        
        // preenchendo arquivo
        for (int i = 0; i < N; i++) {
            gravador.append(gerador.nextInt(100) + "\n");
        }
        
        //fechando arquivo
        gravador.close();
    }

    public static void calculaHistograma(int N) throws FileNotFoundException, IOException {
        // abrindo arquivo
        BufferedReader leitor = new BufferedReader(new FileReader("src/main/java/uff/ic/lleme/tcc00328/exercicios/BeatrizPiedade/numAleatorios.txt"));
        
        int[] frequencia = new int[100];
        // criando e preenchendo o vetor com s ocorrências dos números
        for (int i = 0; i < 100; i++) {
            frequencia[i] = 0;
        }
        
        String linha = leitor.readLine();
        int numero;
        // lendo arquivo e contando as ocorrências
        while (linha != null) {
            numero = Integer.parseInt(linha);
            frequencia[numero] += 1;
            linha = leitor.readLine();
        }

        // imprimindo o histograma
        for (int i = 0; i < 100; i++) {
            if (frequencia[i] > 0) {
                if (i < 10) {
                    System.out.print(0);
                }
                System.out.print(i);
                for (int j = 0; j < frequencia[i]; j++) {
                    System.out.print(" -");
                }
                System.out.print("\n");
            }
        }
    }   
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        criaArquivo(N);
        calculaHistograma(N);
    }
    
}
