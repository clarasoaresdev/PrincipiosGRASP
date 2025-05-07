package org.example.exercicio3;


/* TODO: 3 - Aplique o princípio do Baixo Acoplamento (Low Coupling).
    Cite os focos de acoplamento encontrados e como adequou o código existente
    para que o princípio fosse atendido.

    RESPOSTA:

    O problema aqui é que, deixando todas essas lógicas em Pedido, se a conexão com
    o banco de dados mudar por exemplo, vai ser necessário modificar Pedido

    Para resolver isso, dividi SalvarPedido em várias classes

    BD - Faz a conexão com o Banco de Dados
    Controller - Faz a lógica de validação dos dados
    DAO - Faz a persistência
    Service - Ligação entre o Controller e o DAO

    dessa forma, se algo na lógica de algumas dessas classes mudar, não afetará as demais

*/
public class Pedido {

    private int id;
    private String descricao;

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
