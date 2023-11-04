package Exercicio06.SelecionaOperacao;

import Exercicio06.Modelo.Operacoes.*;

public class SelecionaAdicao implements SelecionaOperacao {
    
    private SelecionaOperacao proximo = null;
    
    public SelecionaAdicao(SelecionaOperacao proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public Operacao seleciona(String nome) {
        if (nome.equals("+"))
            return (new Adicao());
        
        if (proximo != null)
            return proximo.seleciona(nome);
        
        return null;
        
    }
}
