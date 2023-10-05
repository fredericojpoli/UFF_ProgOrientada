package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05.Modelo;

import java.util.*;

public class Usuario {
    
    public String nome;
    public String email;

    public List<Blog> blogsCriados = new ArrayList();
    public List<Blog> blogsFavoritados = new ArrayList();
    
    public void addBlog(Blog blog) {
        blogsCriados.add(blog);
        blogsFavoritados.add(blog);
    }
    
    public void favBlog(Blog blog) {
        blogsFavoritados.add(blog);
    }
}
