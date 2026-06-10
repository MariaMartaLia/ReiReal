# RELACIONAMENTOS

## Cliente 1 ----- N Pedido

Um cliente pode realizar vários pedidos.

Um pedido pertence a apenas um cliente.

---

## Pedido 1 ----- N ItemPedido

Um pedido possui vários itens.

Um item pertence a apenas um pedido.

---

## Produto 1 ----- N ItemPedido

Um produto pode aparecer em vários itens de pedido.

Um item de pedido referencia apenas um produto.

---

## Categoria 1 ----- N Produto

Uma categoria possui vários produtos.

Um produto pertence a apenas uma categoria.

---

## Pedido 1 ----- 1 Pagamento

Um pedido possui um pagamento.

Um pagamento pertence a um pedido.

---

## Usuario 1 ----- N Pedido

Um usuário pode atender vários pedidos.

Um pedido pode ser atendido por apenas um usuário.

---

## Usuario 1 ----- N FechamentoCaixa

Um usuário pode realizar vários fechamentos de caixa.

Um fechamento de caixa pertence a apenas um usuário.
