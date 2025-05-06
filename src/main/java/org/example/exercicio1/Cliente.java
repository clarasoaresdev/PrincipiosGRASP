package org.example.exercicio1;

/* TODO: 1 - Aplique o princípio Especialista na Informação (Information Expert).
    Explique os problemas encontrados e o que foi feito para adequar
    o código existente ao princípio.

    RESPOSTA:

*/
import org.example.exercicio1.CalculaCompras;

import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private String dataCompra;

    CalculaCompras calculaCompras = new CalculaCompras();

    calculaCompras.calculaCompras(calculaCompras.valoresCompras.add(new Double ("4344", "332323", "323232"));
    calculaCompras.getValoresCompras();

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
