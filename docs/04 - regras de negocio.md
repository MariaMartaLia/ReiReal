#  REGRAS DE NEGÓCIO



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