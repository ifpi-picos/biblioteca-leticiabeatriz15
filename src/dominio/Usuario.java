package src.dominio;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;

    public Usuario(String nomeUsuario, String cpf, String email){
        this.nome = nomeUsuario;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
