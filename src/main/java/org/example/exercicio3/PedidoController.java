package org.example.exercicio3;

public class PedidoController {

    private PedidoService pedidoService = new PedidoService();

    public void salvarPedido(Integer id) {
        //Lógica de validação dos dados do pedido
        System.out.println("Validando dados do pedido " + id);

        pedidoService.salvarPedido();
    }
}
