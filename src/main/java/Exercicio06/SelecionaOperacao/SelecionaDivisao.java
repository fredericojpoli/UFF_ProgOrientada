package Exercicio06.SelecionaOperacao;

import Exercicio06.Modelo.Operacoes.*;

public class SelecionaDivisao implements SelecionaOperacao {
    
    private SelecionaOperacao proximo = null;
    
    public SelecionaDivisao(SelecionaOperacao proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operacao seleciona(String nome) {
        if (nome.equals("/"))
            return (new Divisao());
        
        if (proximo != null)
            return proximo.seleciona(nome);
        
        return null;
        
    }
}
