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
        if (pedido == null){
            throw new IllegalArgumentException("Pedido não pode ser nulo");
        }
        this.pedido = pedido;
        if (tipoPagamento == null ){
            throw new IllegalArgumentException("Tipo de pagamento não pode ser nulo ou negativo");
        }
        this.tipoPagamento = tipoPagamento;
        this.valor = pedido.getValorTotal();
        this.id = UUID.randomUUID();
       
        this.statusPagamento = StatusPagamento.PENDENTE;
        this.dataPagamento = null;
        
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
            this.dataPagamento = new Timestamp(System.currentTimeMillis());
            pedido.confirmarPagamento();
            return true;
        }
        return false;
    }
    public boolean cancelarPagamento(){
        if(this.statusPagamento == StatusPagamento.PENDENTE) {
            this.statusPagamento = StatusPagamento.CANCELADO;
            pedido.cancelarPedido();
            return true;
        }
        return false;
    }

}