package prova.Livros;

public abstract class Livro {
    private String nome ;
    private String autor ;
    protected static int paginas;
    
    public Livro(String nome, String autor, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    
}
