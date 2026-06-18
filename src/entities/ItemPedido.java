package entities;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemPedido {
    private UUID id;
    private int quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal subtotal;

    private Produto produto;
    private Pedido pedido;

public ItemPedido(int quantidade,Produto produto, Pedido pedido){
    this.id = UUID.randomUUID();
    this.quantidade = quantidade;
    this.valorUnitario = produto.getPreco( );
    this.produto = produto;
    this.pedido = pedido;
    this.subtotal = valorUnitario.multiply(new BigDecimal(quantidade));
}
public UUID getId(){
    return this.id;
}
public int getQuantidade( ){
    return this.quantidade;
}
public BigDecimal getValorUnitario(){
    return this.valorUnitario;
}
public BigDecimal getSubtotal(){
    return this.subtotal;
}
public Produto getProduto(){
    return this.produto;
}
public Pedido getPedido() {
        return this.pedido;
    }
    public Boolean validacaoItem( ){
    if(produto == null || quantidade > produto.getEstoque() || quantidade <= 0 ){
        return false;
    }
    return true;
}
}

