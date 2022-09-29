package prova.Livros.Digitais;

import prova.Livros.Livro;

public abstract class Digital extends Livro {
    protected int duracao;
    public Digital(String nome, String autor,int paginas , int duracao) {
        super(nome, autor, paginas);
        this.duracao = duracao;
    }

    public abstract int getDuracao();

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    
    
}