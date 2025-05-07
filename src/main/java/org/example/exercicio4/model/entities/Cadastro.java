package org.example.exercicio4;

/* TODO: 4 - Aplique o princípio da Alta Coesão (High Cohesion) no contexto abaixo.
    Explique de forma breve os problemas encontrados e o que foi feito para adequar
    o código ao princípio.

    RESPOSTA:
*/
public class Cliente {

    private String nome;
    private String email;

    public Cliente() {}

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
