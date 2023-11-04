package Exercicio06.Interpreter;

import Exercicio06.ClassificaParticula.*;
import Exercicio06.Modelo.*;

public abstract class Tradutor {
    
    public static Arvore traduz(String[] expressao, int indx) {

        ClassificaParticula classificador = new ClassificaVariavel(new ClassificaOperador(new ClassificaConstante(null)));

        Arvore novoNoh = new Arvore();
        novoNoh.conteudo = classificador.classifica(expressao[indx]);

        if (novoNoh.conteudo.getClass() == Operador.class) {
            novoNoh.direita = traduz(expressao, indx-1);
            novoNoh.esquerda = traduz(expressao, indx-2);
        }
            
        return novoNoh;

    }
    
}
