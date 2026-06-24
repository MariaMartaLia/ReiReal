package entities;

import enums.StatusPagamento;
import enums.TipoPagamento;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;


public class Pagamento {
    private UUID id;
    private BigDecimal valor;
    private Timestamp dataPagamento;

    private TipoPagamento tipoPagamento;
    private StatusPagamento statusPagamento;

    private Pedido pedido;


    public Pagamento(Pedido pedido, TipoPagamento tipoPagamento) {
        this.id = UUID.randomUUID();
        this.valor = pedido.getValorTotal();
        this.statusPagamento = StatusPagamento.PENDENTE;
        this.pedido = pedido;
        this.dataPagamento = new java.sql.Timestamp(System.currentTimeMillis());
        this.tipoPagamento = tipoPagamento;
    }
    public UUID getId() {
        return id;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public Timestamp getDataPagamento() {
        return dataPagamento;
    }
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public boolean confirmarPagamento(){
         if(this.statusPagamento == StatusPagamento.PENDENTE){
           this.statusPagamento = StatusPagamento.PAGO ;
            pedido.confirmarPagamento();
            return true;
        }
        return false;
    }
    public boolean cancelarPagamento(){
        if(this.statusPagamento == StatusPagamento.PENDENTE) {
            this.statusPagamento = StatusPagamento.CANCELADO;
            return true;
        }
        return false;
    }



}
