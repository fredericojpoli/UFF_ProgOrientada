package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05.Modelo.*;
import java.util.*;

public abstract class Controle {
    
    /* CONTROLE DE CRIAÇÃO */
    public static Usuario criaUsuario(String nome, String email) { 
        Usuario novoUsuario = new Usuario();
        novoUsuario.nome = nome;
        novoUsuario.email = email;
        return novoUsuario;
    }
    
    public static Blog criaBlog(String titulo, Usuario autor) { 
        Calendar relogio = Calendar.getInstance();
        
        Blog novoBlog = new Blog();
        novoBlog.titulo = titulo;
        novoBlog.autor = autor.email;
        novoBlog.criacao = relogio.getTime();
        
        autor.addBlog(novoBlog);
        
        return novoBlog;
    }
    
    public static Nota criaPostagem(String titulo, String texto) { 
        Calendar relogio = Calendar.getInstance();
        
        Nota novaPostagem = new Nota();
        novaPostagem.titulo = titulo;
        novaPostagem.texto = texto;
        novaPostagem.criacao = relogio.getTime();
        
        return novaPostagem;
    }
    
    public static Comentario criaComentario(Usuario autor, String texto) { 
        Calendar relogio = Calendar.getInstance();
        
        Comentario novoComentario = new Comentario();
        novoComentario.texto = texto;
        novoComentario.autor = autor.email;
        novoComentario.criacao = relogio.getTime();
        
        return novoComentario;
    }
    
    /* CONTROLE DE FLUXO */
    public static Blog abreBlog(List<Blog> listaBlogs) {
        Scanner teclado = new Scanner(System.in);
        int blog;
        
        System.out.println("Digite o número do blog:");
        System.out.print("-> ");
        blog = teclado.nextInt();
       
        Janela.feed(listaBlogs.get(blog));
        
        return listaBlogs.get(blog);
    }
    
    public static Nota abrePostagem(List<Nota> postagens) {
        Scanner teclado = new Scanner(System.in);
        int post;
        
        System.out.println("Digite o número da postagem:");
        System.out.print("-> ");
        post = teclado.nextInt();
        Janela.postagem(postagens.get(post), true);
        
        return postagens.get(post);
    }
    
    public static void adicionaPostagem(Blog blog, Usuario usuario, String titulo, String texto) {
        if (blog.autor.equals(usuario.email)) {
            Nota novaPostagem = criaPostagem(titulo, texto);
            blog.addPostagem(novaPostagem);
        } else
            System.out.println("\nERRO! Usuário " + usuario.nome + " não é o dono do blog " + blog.titulo + "!\n");
    }
    
    public static void adicionaComentario(Blog blog, Nota postagem, Usuario usuario, String texto) {
        if (buscaBlog(usuario.blogsFavoritados, blog)) {
            postagem.addComentario(Controle.criaComentario(usuario, texto));
        } else
            System.out.println("\nERRO! Usuário " + usuario.nome + " não favoritou o blog!\n");
    }
    
    public static void deletaPostagem(Blog blog, Usuario usuario, String titulo) {
        if (blog.autor.equals(usuario.email)) {
            int indice = buscaPostagem(blog.postagens, titulo);
            if (indice != -1) {
                blog.postagens.remove(indice);
            } else
                System.out.println("A postagem '" + titulo + "' não existe em " + blog.titulo);
            
        } else
            System.out.println("\nERRO! Usuário " + usuario.nome + " não é o dono do blog " + blog.titulo + "!\n");
    }
    
    public static void deletaComentario(Blog blog, Nota postagem, Usuario usuario, String email) {
        if (blog.autor.equals(usuario.email)) {
            int indice = buscaComentario(postagem.comentarios, email);
            if (indice != -1) {
                Janela.notificacaoEmail(blog, postagem, usuario);
                postagem.comentarios.remove(indice);
            } else
                System.out.println("O comentário de " + email + " não existe em " + postagem.titulo);
            
        } else
            System.out.println("\nERRO! Usuário " + usuario.nome + " não é o dono do blog " + blog.titulo + "!\n");
    }
    
    public static Usuario login(List<Usuario> listaUsuarios) {
        Scanner teclado = new Scanner(System.in);
        String nome, email;
        
        System.out.println(" ");
        System.out.print("Digite seu nome de usuario: ");
        nome = teclado.nextLine();
        
        System.out.print("Digite seu email: ");
        email = teclado.nextLine();
        System.out.println(" ");
        
        return autenticacao(listaUsuarios, nome, email);
    }

    public static Usuario autenticacao(List<Usuario> listaUsuarios, String nome, String email) {
        Usuario novoUsuario;
        int resultado = buscaEmail(listaUsuarios, email);
        
        if (resultado == -1) {
            novoUsuario = Controle.criaUsuario(nome, email);
            listaUsuarios.add(novoUsuario);
        } else 
            novoUsuario = listaUsuarios.get(resultado);
        
        return novoUsuario;
    }
   
    public static int buscaEmail(List<Usuario> listaUsuarios, String email) {
        for (int i = 0; i < listaUsuarios.size(); i++)
            if (listaUsuarios.get(i).email.equals(email))
                return i;
        return -1;
    }
    
    public static boolean buscaBlog(List<Blog> listaBlogs, Blog blog) {
        if (!listaBlogs.isEmpty())    
            for (int i = 0; i < listaBlogs.size(); i++)
                if (listaBlogs.get(i).titulo.equals(blog.titulo))
                    return true;
        return false;
    }
    
    public static int buscaPostagem(List<Nota> listaPostagens, String titulo) {
        for (int i = 0; i < listaPostagens.size(); i++) {
            if (listaPostagens.get(i).titulo.equals(titulo))
                return i;
        }
        return -1;
    }
    
    public static int buscaComentario(List<Comentario> listaComentarios, String email) {
        for (int i = 0; i < listaComentarios.size(); i++) {
            if (listaComentarios.get(i).autor.equals(email))
                return i;
        }
        return -1;
    }
}
