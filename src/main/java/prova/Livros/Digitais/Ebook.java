package prova.Livros.Digitais;

public class Ebook extends Digital {
    
    

    public Ebook(String nome, String autor, int paginas, int duracao) {
        super(nome, autor, paginas, duracao);
        
    }

    @Override
    public int getDuracao() {
        this.duracao = this.paginas;
        return this.duracao;
    }
    
}

