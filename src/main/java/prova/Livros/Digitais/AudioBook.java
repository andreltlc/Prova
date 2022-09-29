package prova.Livros.Digitais;

public class AudioBook extends Digital{

   

    public AudioBook(String nome, String autor, int paginas, int duracao) {
        super(nome, autor, paginas, duracao);
        
    }

    @Override
    public int getDuracao() {
        this.duracao = this.paginas * 10;
        this.duracao = this.duracao / 60;
        return this.duracao ;
    }
    
    
    
}
