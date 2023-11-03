package Exercicio06.Interpreter;

import Exercicio06.ClassificaParticula.ClassificaParticula;
import Exercicio06.ClassificaParticula.ClassificaVariavel;
import Exercicio06.ClassificaParticula.ClassificaConstante;
import Exercicio06.ClassificaParticula.ClassificaOperador;
import Exercicio06.Modelo.*;

public abstract class Tradutor {
    
    public static Pilha traduz(String expressao) {
        
        String particula[] = expressao.split(" ");
        int tamanho = particula.length;
        
        Pilha topo = criaNoh(particula[tamanho-1]);
        Pilha aux = topo;
        
        for (int i = tamanho-2; i >= 0; i--) {
            aux.proximo = criaNoh(particula[i]);
            aux = aux.proximo;
        }
        
        return topo;
    }
    
    public static Pilha criaNoh(String particula) {
        ClassificaParticula classificador = new ClassificaVariavel(new ClassificaOperador(new ClassificaConstante(null)));
        
        Pilha novo = new Pilha();
        novo.info = classificador.classificar(particula);
        
        return novo;
    }
    
}
