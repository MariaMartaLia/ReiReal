# REGRAS DE NEGÓCIO

## RN001 - Cadastro Obrigatório

O cliente deverá realizar um cadastro rápido antes de acessar o catálogo de produtos.

---

## RN002 - Cancelamento de Pedido

O cliente poderá cancelar um pedido somente enquanto o pagamento não tiver sido confirmado.

---

## RN003 - Pagamento via Pix

Ao selecionar a opção Pix, o sistema deverá gerar uma cobrança Pix correspondente ao valor total do pedido.

---

## RN004 - Tempo Limite para Pagamento Pix

O cliente terá 3 minutos para concluir o pagamento via Pix.

Após esse período, o pagamento será considerado expirado.

---

## RN005 - Pix Expirado

Quando o tempo limite para pagamento expirar, o sistema deverá apresentar as seguintes opções:

* Cancelar pedido;
* Alterar a forma de pagamento para pagamento no caixa.

---

## RN006 - Alteração do Tempo de Pagamento Pix

O administrador poderá configurar o tempo limite para pagamento via Pix.

Exemplos:

* Dias normais: 3 minutos;
* Eventos: 1 minuto.

---

## RN007 - Envio do Pedido para Separação

Somente pedidos com pagamento confirmado poderão ser enviados para separação.

---

## RN008 - Fluxo de Pagamento no Caixa

Pedidos criados com a opção "Pagar no Caixa" deverão permanecer com status AGUARDANDO_PAGAMENTO até a confirmação do pagamento pelo operador do caixa.

---

## RN009 - Confirmação de Pagamento

Após a confirmação do pagamento, o sistema deverá alterar automaticamente o status do pedido para PAGO.

---

## RN010 - Entrega do Pedido

Após a separação dos itens, o atendente deverá chamar o cliente para retirada do pedido.

---

## RN011 - Finalização do Pedido

O pedido somente poderá ser marcado como FINALIZADO após a confirmação da entrega ao cliente.

---

## RN012 - Identificação do Pedido

Todo pedido deverá possuir um número único de identificação para utilização durante os processos de pagamento, separação e entrega.

---

## RN013 - Número do Pedido na Entrega

O atendente deverá utilizar o nome do cliente e o número do pedido para realizar a chamada de retirada, evitando ambiguidades entre clientes com nomes iguais.

---

## RN014 - Saída de Estoque

Toda saída de estoque deverá ocorrer exclusivamente através do processo de venda ou movimentações autorizadas pelo sistema.

Não será permitida a alteração direta da quantidade em estoque.

---

## RN015 - Desativação Automática por Falta de Estoque

Quando a quantidade em estoque atingir zero unidades, o produto deverá ser desativado automaticamente pelo sistema.

Produtos desativados não poderão ser vendidos até que haja reposição de estoque.

---

## RN016 - Alerta de Estoque Mínimo

O sistema deverá gerar um alerta quando a quantidade em estoque atingir ou ficar abaixo da quantidade mínima definida para o produto.

Exemplo:

* Estoque mínimo: 5 unidades;
* Estoque atual: 4 unidades.

Resultado:

* Alerta de estoque baixo.

---

## RN017 - Quantidade Mínima de Item no Pedido

A quantidade de um ItemPedido deverá ser maior ou igual a 1.

Não será permitido adicionar itens com quantidade zero ou negativa.

---

## RN018 - Cancelamento de Pedido Após Pagamento

Pedidos com pagamento confirmado não poderão ser cancelados.

Essa regra aplica-se aos pagamentos realizados via:

* Pix;
* Cartão de Crédito;
* Cartão de Débito;
* Dinheiro já confirmado.

---

## RN019 - Troca de Produtos Após Pagamento

Caso o cliente deseje alterar produtos após a confirmação do pagamento, o sistema deverá permitir a substituição dos itens antes do início da separação.

Regras:

* Permitir remoção de produtos;
* Permitir inclusão de novos produtos;
* Recalcular automaticamente o valor total do pedido.

---

## RN020 - Crédito do Cliente

Quando houver diferença de valor favorável ao cliente durante uma troca de produtos, o sistema deverá gerar um crédito para utilização futura.

Regras:

* O crédito ficará vinculado ao cadastro do cliente;
* O crédito poderá ser utilizado em compras futuras;
* O crédito não será convertido automaticamente em dinheiro.

---

## RN021 - Complementação de Pagamento

Quando a troca de produtos resultar em valor superior ao originalmente pago, o sistema deverá solicitar o pagamento da diferença antes da conclusão da alteração.

---

## RN022 - Restrição de Alteração de Pedido

Pedidos poderão ser alterados somente enquanto estiverem nos status:

* AGUARDANDO_PAGAMENTO;
* PAGO.

Pedidos com status:

* EM_SEPARACAO;
* PRONTO_PARA_RETIRADA;
* FINALIZADO;
* CANCELADO;

não poderão sofrer alterações.

---

## RN023 - Controle Automático de Valores

Sempre que houver inclusão, exclusão ou alteração de itens do pedido, o sistema deverá recalcular automaticamente:

* Valor total do pedido;
* Diferença para pagamento complementar;
* Crédito disponível para o cliente.
