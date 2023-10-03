package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio04;
import java.util.*;

public class Dado {
    
    public static int lancar() {
        Random dado = new Random();
        return (dado.nextInt(6) + 1);
    }
    
}
