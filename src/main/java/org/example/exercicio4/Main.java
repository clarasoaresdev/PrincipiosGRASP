package org.example.exercicio4;

public class Main {
    public static void main(String[] args) {

        CadastraCliente cc = new CadastraCliente();
        Cliente cliente = new Cliente();
        cliente.setNome("Maria");
        cliente.setEmail("maria@email.com");

       cc.cadastrarCliente(cliente);
    }
}
