package entities;

import java.math.BigDecimal;
import java.util.UUID;

public class Produto {
    private UUID id;
    private String nome;
    private BigDecimal preco;
    private int estoque;
    private Boolean ativo;

    private Categoria categoria;

    public Produto(String nome, BigDecimal preco, int estoque, Categoria categoria) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.ativo = true;
        this.categoria = categoria;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Boolean produtoValido() {
        if (nome == null || nome.isBlank()) {
            return false;
        }
        if (preco.compareTo(BigDecimal.ZERO) <= 0) {
            return false;
        }
        if (estoque < 0) {
            return false;
        }
        if (categoria == null) {
            return false;
        }
        return true;
    }

    public int adicionarEstoque(int quantidade) {
        estoque = estoque + quantidade;
        return estoque;
    }

    public void ativarProduto() {
        this.ativo = true;
    }

    public void desativarProduto() {
        this.ativo = false;
    }
    public boolean estoqueValido(int quantidade) {
        if (estoque < quantidade) {
            return false;}

        return true;
    }
    public int removerEstoque(int quantidade) {
        if (estoque < quantidade) {
            return 0;
        } else{
            estoque = estoque - quantidade;
        }
        if (estoque == 0) {
            desativarProduto();
        }
return estoque;
    }
}