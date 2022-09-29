package prova.Gerencia;

import java.util.ArrayList;

import prova.Livros.Livro;

public class GerenciaLivro {
    private ArrayList<Livro> livros;
    private boolean ativo ;
    public GerenciaLivro(boolean ativo) {                
        this.ativo = ativo;
    }

    private Livro getLivro(String nome){
        for (Livro livro : livros ) {
            if(livro.getNome().equals(nome)){
                return livro;
            }
        }
        return null;
    }
    private boolean existeLivro(String nome){
        if(getLivro(nome)== null){
            return false;
        }
        return true;

    }
}
