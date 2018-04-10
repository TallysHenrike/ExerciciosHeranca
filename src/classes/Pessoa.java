package classes;

public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private String email;
    private String endereço;
    private int telefone;
    //METODOS
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereço() {
        return endereço;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}