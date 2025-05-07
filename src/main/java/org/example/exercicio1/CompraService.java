package org.example.exercicio1;

import java.util.List;

public class CompraService {

    public double calculaTotalCompras(List<Compra> compras) {
        double total = 0;
        for (Compra compra : compras) {
            total += compra.getValorCompra();
        }
        return total;
    }
}
