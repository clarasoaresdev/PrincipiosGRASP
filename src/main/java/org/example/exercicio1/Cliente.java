package org.example.exercicio1;

import java.util.List;

/* TODO: 1 - Aplique o princípio Especialista na Informação (Information Expert).
    Explique os problemas encontrados e o que foi feito para adequar
    o código existente ao princípio.

    RESPOSTA:

    O problema é que Cliente tava com a responsabilidade de calcular o total das compras,
    quando o Especialista na Informação de calcular o total das compras é a classe Compra,
    que detém todas as informações necessárias para o cálculo

    Criei uma classe Compra

    Na classe Compra eu coloquei os atributos de uma compra que estavam na classe Cliente

    Movi o método CalculaTotalCompras para CompraService, que agora
    recebe uma lista de compras e retorna o total

*/
public class Cliente {

    private String nome;
    private String cpf;
    private List<Compra> compras;

}