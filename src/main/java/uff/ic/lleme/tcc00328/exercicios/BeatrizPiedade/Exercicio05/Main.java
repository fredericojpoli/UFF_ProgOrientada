package uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05;

import uff.ic.lleme.tcc00328.exercicios.BeatrizPiedade.Exercicio05.Modelo.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        // armazenamento
        List<Blog> listaBlogs = new ArrayList(); 
        List<Usuario> listaUsuarios = new ArrayList(); 
        
        // primeiros objetos
        Usuario usuarioAtual = Controle.criaUsuario("gilberto", "gg@id.uff.br");
        Blog blogAtual = Controle.criaBlog("Blog do Gilberto", usuarioAtual);
        
        listaUsuarios.add(usuarioAtual);
        listaBlogs.add(blogAtual);
        
        Controle.adicionaPostagem(blogAtual, usuarioAtual, "Sítio do Pica-Pau Amarelo", "Marmelada de banana, bananada de goiaba\nGoiabada de marmelo");
        Nota postagemAtual = blogAtual.postagens.get(0);
        
        Controle.adicionaComentario(blogAtual, postagemAtual, usuarioAtual, "Sítio do Pica-Pau Amarelo\nSítio do Pica-Pau Amarelo");
        Comentario comentarioAtual = postagemAtual.comentarios.get(0);
        
        Janela.homepage(listaBlogs);
        
        
        System.out.println(">>> REGRA 1 - PERMITIR A CRIAÇÃO DE BLOGS");
        usuarioAtual = Controle.criaUsuario("rita", "rlee@id.uff.br");
        blogAtual = Controle.criaBlog("Blog da Rita", usuarioAtual);
        
        listaUsuarios.add(usuarioAtual);
        listaBlogs.add(blogAtual);
        Janela.homepage(listaBlogs);
        
        
        System.out.println(">>> REGRA 3 - SOMENTE O DONO DO BLOG PODE CRIAR NOTAS");
        // rita é o usuario e blog da rita é o blog atual
        Controle.adicionaPostagem(blogAtual, usuarioAtual, "Agora Só Falta Você", "Um belo dia resolvi mudar\nE fazer tudo o que eu queria fazer");
        // gilberto é o usuario
        usuarioAtual = listaUsuarios.get(0); 
        Controle.adicionaPostagem(blogAtual, usuarioAtual, "Andar Com Fé", "Andar com fé eu vou\nQue a fé não costuma faiar");
        
        
        System.out.println(">>> REGRA 2 - QUALQUER USUÁRIO PODE LER CONTEÚDOS");
        // gilberto é o usuario e blog da rita é o blog atual
        postagemAtual = blogAtual.postagens.get(0);
        
        Janela.feed(blogAtual);
        Janela.postagem(postagemAtual, true);
        
        
        System.out.println(">>> REGRAS 4 e 5 - somente usuários que marcam o Blog como favorito pode criar comentários / para criar um comentário o usuários precisa ler as notas");
        // rita é o usuario (como dona, favoritou por padrão) e blog da rita é o blog atual
        usuarioAtual = listaUsuarios.get(1); 
        Controle.adicionaComentario(blogAtual, postagemAtual, usuarioAtual, "Lança, menina, lança todo esse perfume");
        
        Janela.postagem(postagemAtual, true);
        
        // gilberto é o usuario 
        usuarioAtual = listaUsuarios.get(0);
        Controle.adicionaComentario(blogAtual, postagemAtual, usuarioAtual, "Que a fé não costuma faiar");    
        // gilberto favorita o blog da rita
        usuarioAtual.favBlog(blogAtual);
        Controle.adicionaComentario(blogAtual, postagemAtual, usuarioAtual, "Que a fé não costuma faiar");
        
        Janela.postagem(postagemAtual, true);
        
        
        System.out.println(">>> REGRAS 7, 8 e 9 - SOMENTE O DONO DO BLOG PODE REMOVER CONTEÚDOS/ para remover um conteúdo ele precisará ler o conteúdo/ caso ele remova um comentário, o autor do comentário deve ser notificado por e-mail");
        // gilberto é o usuario e blog da rita é o blog
        Controle.deletaPostagem(blogAtual, usuarioAtual, "Agora Só Falta Você");
        
        // blog do gilberto é o blog atual
        blogAtual = listaBlogs.get(0);
        postagemAtual = blogAtual.postagens.get(0);
        
        Janela.homepage(listaBlogs);
        Janela.feed(blogAtual);
        Janela.postagem(postagemAtual, true);
        
        Controle.deletaComentario(blogAtual, postagemAtual, usuarioAtual, "gg@id.uff.br");
        
        Janela.postagem(postagemAtual, true);
        
        Controle.deletaPostagem(blogAtual, usuarioAtual, "Sítio do Pica-Pau Amarelo");
        
        Janela.feed(blogAtual);
        
        
    }
}
