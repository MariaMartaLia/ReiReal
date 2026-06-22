package entities;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {
    private UUID id;
    private Integer numeroPedido;
    private Timestamp dataPedido;
    private BigDecimal valorTotal;


    private Cliente cliente;
    private StatusPedido statusPedido;
    private List<ItemPedido>listaItensPedido ;

    public Pedido(Cliente cliente){
        this.id = UUID.randomUUID();
        this.cliente = cliente;
        this.numeroPedido = 0 ;
        this.listaItensPedido = new ArrayList<ItemPedido>();
        this.dataPedido = new Timestamp(System.currentTimeMillis());
        this.valorTotal = BigDecimal.ZERO;
        this.statusPedido = StatusPedido.AGUARDANDO_PAGAMENTO;
    }
    public UUID getId(){
        return this.id;
    }
    public Integer getNumeroPedido(){
        return this.numeroPedido;
    }
    public Timestamp getDataPedido(){
        return this.dataPedido;
    }
    public static BigDecimal getValorTotal(){
        return this.valorTotal;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    public StatusPedido getStatusPedido(){
        return this.statusPedido;
    }
    public List<ItemPedido> getListaItensPedido(){
        return this.listaItensPedido;
    }
    public void adicionarItensPedido(ItemPedido itemPedido){
        this.listaItensPedido.add(itemPedido);
        this.valorTotal = valorTotal.add(itemPedido.getSubtotal());
    }
    public void removerItensPedido(ItemPedido itemPedido){
        this.listaItensPedido.remove(itemPedido);
        this.valorTotal = valorTotal.subtract(itemPedido.getSubtotal());
    }
    public void cancelarPedido( ){
        this.statusPedido = StatusPedido.CANCELADO;
    }
    public void confirmarPagamento( ){
        this.statusPedido = StatusPedido.PAGO;
    }
    public boolean enviarParaSeparacao() {
        if (this.statusPedido == StatusPedido.PAGO) {
            this.statusPedido = StatusPedido.EM_SEPARACAO;
            return true;
        }
        return false;
    }
    public boolean finalizarPedido(){
        if (this.statusPedido == StatusPedido.PRONTO_PARA_RETIRADA) {
            this.statusPedido = StatusPedido.FINALIZADO;
            return true;
        }
        return false;
    }
}
