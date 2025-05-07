package org.example.exercicio3;

public class PedidoDAO {

    private BD bd = new BD();

    public void salvarPedido() {

        bd.conectar();

        // Lógica de persistência
        System.out.println("Preparando dados para persistência.");
        System.out.println("Dados salvos no banco.");

    }

}
