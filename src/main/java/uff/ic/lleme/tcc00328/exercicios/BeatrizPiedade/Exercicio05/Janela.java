package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05.Modelo.*;
import java.util.*;

public abstract class Janela {

    /* IMPRESSÃO DE OBJETOS */
    /* lista de blogs */
    public static void homepage(List<Blog> listaBlogs) {
        System.out.println("\n************** PÁGINA INICIAL ***************\n");
   
        if (listaBlogs.isEmpty())
            System.out.println("NENHUM BLOG!");
        
        else
            for (int i = 0; i < listaBlogs.size(); i++)
                System.out.println(i + " - " + listaBlogs.get(i).titulo);

        System.out.println("\n*********************************************\n");
    }
    
    /* lista de postagens de um blog */
    public static void feed(Blog blog) {
        System.out.println("\n/////////////////////////////////////////////\n");
        System.out.println(blog.titulo);
        System.out.println("Criado por " + blog.autor + "\nem " + blog.criacao + "\n");
        
        if (blog.postagens.isEmpty())
            System.out.println("NENHUMA POSTAGEM!");
        
        else 
            for (int i = 0; i < blog.postagens.size(); i++)
                System.out.println(i + " - " + blog.postagens.get(i).titulo);
        
        System.out.println("\n/////////////////////////////////////////////\n");
    }
    
    /* postagem */
    public static void postagem(Nota post, boolean printComentarios) {
        System.out.println("\n.............................................\n");
        
        System.out.println(post.titulo.toUpperCase());
        System.out.println("Postado em " + post.criacao);
        System.out.println(" ");
        System.out.println(post.texto);
        System.out.println(" ");
        
        if (printComentarios) {
            if (post.comentarios.isEmpty())
                System.out.println("NENHUM COMENTÁRIO!");
            
            else if (!post.comentarios.isEmpty() && printComentarios == true) {
                System.out.println("COMENTÁRIOS");
                for (Comentario comentario : post.comentarios)
                    comentario(comentario);
            }
        }
        
        System.out.println(".............................................\n");
    }
    
    /* comentário */
    public static void comentario(Comentario comentario) {
        System.out.print(comentario.autor + ": ");
        System.out.println(comentario.texto);
        System.out.println("Em " + comentario.criacao + "\n");
    }

    
    public static void notificacaoEmail(Blog blog, Nota postagem, Usuario usuario) {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("De: " + blog.autor);
        System.out.println("Para: " + usuario.email);
        System.out.println("Olá, " + usuario.nome + "!\nSeu comentário na postagem '" + postagem.titulo + "' foi deletado.");
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
