# REGRAS DAS ENTIDADES

## Cliente

### RE001 - Nome obrigatório

Todo cliente deverá possuir nome válido para ser cadastrado.

---

### RE002 - Telefone obrigatório

Todo cliente deverá possuir telefone válido contendo exatamente 11 dígitos.

---

## Categoria

### RE003 - Categoria nasce ativa

Toda categoria criada deverá ser criada com status ativo.

---

### RE004 - Categoria pode ser ativada ou desativada

O administrador poderá ativar ou desativar categorias.

---

### RE005 - Nome da categoria obrigatório

Toda categoria deverá possuir nome válido contendo apenas letras e espaços.

---

## Produto

### RE006 - Produto deve possuir categoria

Não será permitido cadastrar produtos sem categoria.

---

### RE007 - Estoque não pode ser negativo

O estoque do produto nunca poderá possuir valores negativos.

---

### RE008 - Produto é desativado automaticamente

Quando o estoque atingir zero unidades, o produto deverá ser desativado automaticamente.

---

### RE009 - Produto é reativado automaticamente

Quando houver entrada de estoque, o produto deverá ser reativado automaticamente.

---

### RE010 - Produto deve possuir preço válido

Todo produto deverá possuir preço maior que zero.

---

### RE011 - Produto sem estoque não pode ser vendido

O sistema deverá impedir a venda de produtos sem estoque disponível.

---

### RE012 - Quantidade solicitada não pode exceder o estoque

O sistema deverá informar a quantidade disponível quando a solicitação exceder o estoque atual.

---

### RE013 - Estoque não pode ser alterado diretamente

Após a criação do produto, o estoque não poderá ser alterado diretamente.

Toda alteração de estoque deverá ocorrer através das operações de entrada ou saída de estoque.