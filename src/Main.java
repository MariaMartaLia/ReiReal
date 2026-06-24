import entities.*;
import enums.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        // Categoria
        Categoria bebidas = new Categoria("Bebidas");

        // Produto
        Produto coca = new Produto(
                "Coca-Cola",
                new BigDecimal("5.00"),
                100,
                bebidas
        );

        // Cliente
        Cliente cliente = new Cliente(
                "Maria Marta",
                "11999999999"
        );

        // Pedido
        Pedido pedido = new Pedido(cliente);

        // Item do Pedido
        ItemPedido item = new ItemPedido(
                2,
                coca,
                pedido
        );

       pedido.adicionarItensPedido(item);

    System.out.println("Status: " + pedido.getStatusPedido());

    pedido.confirmarPagamento();

    System.out.println("Status: " + pedido.getStatusPedido());

    pedido.enviarParaSeparacao();

    System.out.println("Status: " + pedido.getStatusPedido());

    pedido.pedidoProntoParaRetirada();

    System.out.println("Status: " + pedido.getStatusPedido());

    pedido.finalizarPedido();

    System.out.println("Status: " + pedido.getStatusPedido());
}}