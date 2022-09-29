package prova.Livros;



public class Fisicos extends Livro {
    private String isbn;
    private int edicao;
    public Fisicos(String nome, String autor,String isbn, int paginas , int edicao) {
        super(nome, autor, paginas);
        this.isbn = isbn;
        this.edicao =edicao;
        
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getEdicao() {
        return edicao;
    }
    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    
   
    
    
}
