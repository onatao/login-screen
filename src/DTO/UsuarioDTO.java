
package DTO;

public class UsuarioDTO {
    
    private int id;
    private String nome_usuario, senha_usuario;
    
    public int getID () {
        return this.id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getUsuario() {
        return this.nome_usuario;
    }
    
    public void setUsuario (String usuario) {
        this.nome_usuario = usuario;
    }
    
    public String getSenha() {
        return this.senha_usuario;
    }
    
    public void setSenha(String senha) {
        this.senha_usuario = senha;
    }
    
    
}
