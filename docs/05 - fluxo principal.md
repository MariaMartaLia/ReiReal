# FLUXO PRINCIPAL DO PEDIDO

## Fluxo Principal

1. Cliente escaneia o QR Code.
2. Cliente realiza cadastro rápido.
3. Cliente acessa o catálogo de produtos.
4. Cliente seleciona os produtos desejados.
5. Sistema calcula o valor total do pedido.
6. Sistema gera um número único para identificação do pedido.
7. Cliente escolhe a forma de pagamento.

---

# Fluxo A - Pagamento no Caixa

8. Cliente seleciona a opção "Pagar no Caixa".
9. Sistema cria o pedido com status AGUARDANDO_PAGAMENTO.
10. Cliente dirige-se ao caixa.
11. Caixa localiza o pedido pelo nome ou número do pedido.
12. Caixa consulta os itens e o valor total.
13. Caixa recebe o pagamento.
14. Sistema confirma o pagamento.
15. Sistema altera o status do pedido para PAGO.
16. Sistema envia o pedido para separação.
17. Atendente visualiza o pedido.
18. Atendente separa os produtos.
19. Atendente chama o cliente pelo nome e número do pedido.
20. Atendente entrega os produtos.
21. Atendente confirma a entrega.
22. Sistema altera o status do pedido para FINALIZADO.

---

# Fluxo B - Pagamento via Pix

8. Cliente seleciona a opção "Pagar via Pix".
9. Sistema gera o QR Code Pix.
10. Sistema inicia a contagem do tempo limite para pagamento.
11. Cliente realiza o pagamento.
12. Sistema confirma o pagamento.
13. Sistema altera o status do pedido para PAGO.
14. Sistema envia o pedido para separação.
15. Atendente visualiza o pedido.
16. Atendente separa os produtos.
17. Atendente chama o cliente pelo nome e número do pedido.
18. Atendente entrega os produtos.
19. Atendente confirma a entrega.
20. Sistema altera o status do pedido para FINALIZADO.

---

# Fluxo Alternativo - Pix Expirado

1. O cliente seleciona pagamento via Pix.
2. O sistema gera o QR Code Pix.
3. O tempo limite para pagamento expira.
4. O sistema altera o status do pagamento para EXPIRADO.
5. O sistema apresenta as opções:

    * Cancelar pedido;
    * Alterar para pagamento no caixa.
6. O cliente escolhe uma das opções.
