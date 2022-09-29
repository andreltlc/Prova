package prova.Gerencia;

import java.util.ArrayList;

import prova.Emprestimo;

public class GerenciaEmprestimo {
    private ArrayList<Emprestimo> emprestimos;
    private boolean ativo;
    public GerenciaEmprestimo(boolean ativo) {                
        this.ativo = ativo;
    }

    private Emprestimo getEmprestimo(String nome){
        for (Emprestimo emprestimo : emprestimos ) {
            if(emprestimo.getLeitor().equals(nome)){
                return emprestimo;
            }
        }
        return null;
    }
    private boolean existeEmprestimo(String nome){
        if(getEmprestimo(nome)== null){
            return false;
        }
        return true;

    }
}
