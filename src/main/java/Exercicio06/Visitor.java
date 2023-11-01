package Exercicio06;

import Exercicio06.Particula.Particula;
import java.util.*;

public class Visitor {
    
    public static List<Particula> traduzExpressao(String expressao) {
 
        String[] particulas = expressao.split(" ");
        List<Particula> traducao = new ArrayList();
        
        for (int i = 0; i < particulas.length; i++)
            traducao.add(Controle.setParticula(particulas[i]));
        
        return traducao;
    }
    
}
