# PROJETO REIREAL

Repositório:

https://github.com/MariaMartaLia/ReiReal.git

---

# Visão Geral

## Nome do Projeto

ReiReal

## Objetivo

Permitir que clientes realizem pedidos por meio da leitura de um QR Code, sem a necessidade de instalar aplicativos.

## Problema

O processo de atendimento manual gera filas, aumenta o tempo de espera dos clientes e exige interação constante com atendentes e operadores de caixa.

## Solução

Desenvolver um sistema web de autoatendimento acessado por QR Code, permitindo que os clientes realizem seus pedidos de forma rápida e autônoma.

## Status do Projeto

Sprint 0 — Análise e Levantamento de Requisitos (Concluída)

---

# Decisões Arquiteturais

## DA001 - Autenticação

A primeira versão do sistema não utilizará autenticação por login e senha.

Os clientes serão identificados por meio de um cadastro rápido contendo nome e telefone.

A funcionalidade de autenticação será avaliada para implementação em versões futuras do sistema.

---

# Escopo da Primeira Versão (MVP)

A primeira versão do sistema contemplará:

* Cadastro rápido de clientes;
* Catálogo de produtos;
* Carrinho de compras;
* Pagamento via Pix;
* Pagamento presencial no caixa;
* Controle de status dos pedidos;
* Tela de separação para atendentes;
* Controle básico de estoque;
* Fechamento de caixa;
* Relatórios gerenciais básicos.
