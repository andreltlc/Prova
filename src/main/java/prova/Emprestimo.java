package prova;

import prova.Livros.Livro;

public class Emprestimo {
   private Usuario leitor;
   private Livro livro;
   private Boolean devolveu ;
   
   public Emprestimo(Usuario leitor, Livro livro,Boolean devolveu) {
      this.leitor = leitor;
      this.livro = livro;
      this.devolveu = devolveu;
   }
   public Usuario getLeitor() {
      return leitor;
   }
   public void setLeitor(Usuario leitor) {
      this.leitor = leitor;
   }
   public Livro getLivro() {
      return livro;
   }
   public void setLivro(Livro livro) {
      this.livro = livro;
   }
   public Boolean getDevolveu() {
      return devolveu;
   }
   public void setDevolveu(Boolean devolveu) {
      this.devolveu = devolveu;
   } 

   
}
