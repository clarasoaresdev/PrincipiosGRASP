package org.example.exercicio2;

import java.util.List;

public class UsuarioCadastro {
    private List<Usuario> listaUsuarios;
    public UsuarioCadastro(){}

    Usuario u = new Usuario();
    public void login(String usuario, String senha){
        u.setUsuario(usuario);
        u.setSenha(senha);
    }
    public void criaUsuario(){
        listaUsuarios.add(u);
    }
    public void deletaUsuario(){
        listaUsuarios.remove(u);
    }
}
