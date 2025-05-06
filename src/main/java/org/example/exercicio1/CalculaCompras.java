package org.example.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CalculaCompras {
    private ArrayList<Double> valoresCompras;

    public CalculaCompras(){}

    public CalculaCompras(ArrayList<Double> valores) {
        this.valoresCompras = valores;
    }

    public double calculaTotalCompras() {
        double total = 0;
        for (double valor : valoresCompras) {
            total += valor;
        }
        return total;
    }

    public List<Double> getValoresCompras() {
        return valoresCompras;
    }
}
