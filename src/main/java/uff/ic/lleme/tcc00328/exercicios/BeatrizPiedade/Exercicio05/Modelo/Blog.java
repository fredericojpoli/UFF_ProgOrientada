package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05.Modelo;

import java.util.*;

public class Blog {
    
    public String titulo;
    public String autor;
    public Date criacao;
    public List<Nota> postagens = new ArrayList();
    
    public void addPostagem(Nota postagem) {
        postagens.add(postagem);
    }
}
