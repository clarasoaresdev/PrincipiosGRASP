package org.example.exercicio4.model.entities;

import org.example.exercicio4.Cliente;

public class Cadastro {

    CLiente cliente = new Cliente();
    public void cadastraCliente(Cliente cliente){

        //Lógica de validação dos dados do cliente
        System.out.println("Cadastrando o cliente " + cliente.getNome());

        // Lógica de persistência
        System.out.println("Dados salvos no banco.");

        // Lógica de envio de e-mail
        System.out.println("Enviando e-mail de boas-vindas para " + cliente.getEmail());
    }
}
