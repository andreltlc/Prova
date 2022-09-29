package prova.Gerencia;

import java.util.ArrayList;

import prova.Usuario;

public class GerenciaUsuario {
    private ArrayList<Usuario> leitores;
    private boolean ativo;

    public GerenciaUsuario(boolean ativo) {                
        this.ativo = ativo;
    }

    private Usuario getUsuario(String nome){
        for (Usuario usuario : leitores ) {
            if(usuario.getName().equals(nome)){
                return usuario;
            }
        }
        return null;
    }
    private boolean existeUsuario(String nome){
        if(getUsuario(nome)== null){
            return false;
        }
        return true;

    }
    
}
