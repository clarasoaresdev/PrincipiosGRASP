package org.example.exercicio2;

/* TODO: 2 - Aplique o princípio do Controlador (Controller).
    Explique de forma breve os problemas identificados e o que foi feito para adequar
    o código existente ao princípio.

    RESPOSTA:

*/
public class Usuario {
    private String usuario;
    private String senha;

    public Usuario(){}

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
