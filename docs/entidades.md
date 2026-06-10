# ENTIDADES DO SISTEMA

## Cliente

### Atributos

* id
* nome
* telefone
* dataCadastro

---

## Categoria

### Atributos

* id
* nome
* ativo

---

## Produto

### Atributos

* id
* nome
* preco
* estoque
* ativo

---

## Pedido

### Atributos

* id
* numeroPedido
* dataPedido
* total
* status

---

## ItemPedido

### Atributos

* id
* quantidade
* valorUnitario
* subtotal

---

## Pagamento

### Atributos

* id
* tipoPagamento
* valor
* dataPagamento
* statusPagamento

---

## Usuario

### Atributos

* id
* nome
* funcao

---

## FechamentoCaixa

### Atributos

* id
* data
* totalDinheiro
* totalCartao
* totalPix
* totalGeral
