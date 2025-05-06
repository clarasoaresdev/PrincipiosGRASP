package org.example.exercicio3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/* TODO: 3 - Aplique o princípio do Baixo Acoplamento (Low Coupling).
    ou Cite os focos de acoplamento encontrados e como adequo código existente
    para que o princípio fosse atendido.

    RESPOSTA:

*/
public class Pedido {

    private int id;
    private String descricao;

    public void salvaPedido(Pedido pedido) {

        //Lógica de validação dos dados do pedido
        System.out.println("Validando dados do pedido " + pedido.getId());

        // Lógica de conexão com banco de dados
        System.out.println("Criando conexão com banco de dados");

        // Lógica de persistência
        System.out.println("Preparando dados para persistência.");
        System.out.println("Dados salvos no banco.");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
