package prova;

public class Usuario {
    private String name;
    private int cpf;
    
    public Usuario(String name , int cpf) {
        this.name = name;
        
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
