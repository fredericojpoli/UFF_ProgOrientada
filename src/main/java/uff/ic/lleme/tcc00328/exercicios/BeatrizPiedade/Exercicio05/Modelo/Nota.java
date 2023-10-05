package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05.Modelo;

import java.util.*;

public class Nota extends Conteudo {
    
    public String titulo;
    public List<Comentario> comentarios = new ArrayList();
    
    public void addComentario(Comentario comentario) {
        comentarios.add(comentario);
    }
}
