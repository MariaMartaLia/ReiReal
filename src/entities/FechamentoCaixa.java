package entities;

import java.util.UUID;

import enums.StatusPagamento;

import java.math.BigDecimal;
import java.sql.Timestamp;




public class FechamentoCaixa {
    private UUID id;
    private Timestamp dataAbertura;
    private Timestamp dataFechamento;
    private BigDecimal valorAbertura;
    private BigDecimal totalDinheiro;
    private BigDecimal totalCartaoCredito;
    private BigDecimal totalCartaoDebito;
    private BigDecimal totalPix;

    private BigDecimal subtotalEntradas;
    private BigDecimal subtotalSaidas;

    private BigDecimal valorFinal;
    private boolean caixaAberto;
    


    public FechamentoCaixa(BigDecimal valorAbertura) {
        if(valorAbertura == null || valorAbertura.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O valor de abertura não pode ser nulo ou negativo.");
        }
        this.valorAbertura = valorAbertura;
        this.id = UUID.randomUUID();
        this.dataAbertura = new Timestamp(System.currentTimeMillis());
        this.totalDinheiro = BigDecimal.ZERO;
        this.totalCartaoCredito = BigDecimal.ZERO;
        this.totalCartaoDebito = BigDecimal.ZERO;
        this.totalPix = BigDecimal.ZERO;
        this.subtotalEntradas = BigDecimal.ZERO;
        this.subtotalSaidas = BigDecimal.ZERO;
        this.valorFinal = BigDecimal.ZERO;
        this.dataFechamento = null;
        this.caixaAberto = true;
    }  
    public UUID getId() {
        return id;
    }
    public BigDecimal getValorAbertura() {
        return valorAbertura;
    }
    public Timestamp getDataAbertura() {
        return dataAbertura;
    }
    public BigDecimal getTotalDinheiro() {
        return totalDinheiro;
    }
    public BigDecimal getTotalCartaoCredito() {
        return totalCartaoCredito;
    }
    public BigDecimal getTotalCartaoDebito() {
        return totalCartaoDebito;
    }
    public BigDecimal getTotalPix() {
        return totalPix;
    }
    public BigDecimal getSubtotalEntradas() {
        return subtotalEntradas;
    }
    public BigDecimal getSubtotalSaidas() {
        return subtotalSaidas;
    }
    public BigDecimal getValorFinal() {
        return valorFinal;
    }
    public Timestamp getDataFechamento() {
        return dataFechamento;
    }
    public boolean isCaixaAberto() {
        return caixaAberto;
    }
public boolean registrarPagamento(Pagamento pagamento){
    if(pagamento == null || pagamento.getValor().compareTo(BigDecimal.ZERO) <= 0){
        throw new IllegalArgumentException("Pagamento não pode ser nulo ou negativo");
    }
    if(pagamento.getStatusPagamento() != StatusPagamento.PAGO){
        throw new IllegalArgumentException("Apenas pagamentos com status 'PAGO' podem ser registrados.");
    }
    if(!caixaAberto){
        throw new IllegalStateException("Não é possível registrar pagamentos em um caixa fechado.");
    }
    BigDecimal valor = pagamento.getValor();
    switch (pagamento.getTipoPagamento()) {
        case DINHEIRO: 
         totalDinheiro = totalDinheiro.add(valor);
         break;

        case CARTAO_CREDITO: 
          totalCartaoCredito = totalCartaoCredito.add(valor);
          break;
      
        case CARTAO_DEBITO: 
          totalCartaoDebito = totalCartaoDebito.add(valor);
          break;
        
          case PIX: 
            totalPix = totalPix.add(valor);
            break;
        default: 
            throw new IllegalArgumentException("Tipo de pagamento inválido."); 
    }
    atualizarEntradas();
    
    return true;
}
private void atualizarEntradas(){
    subtotalEntradas = totalDinheiro.add(totalCartaoCredito).add(totalCartaoDebito).add(totalPix);
} 
public boolean registrarSaida(BigDecimal valor){
    if(valor == null || valor.compareTo(BigDecimal.ZERO) <= 0){
        throw new IllegalArgumentException("Valor de saída não pode ser nulo ou negativo.");
    }
            if(!caixaAberto){
        throw new IllegalStateException("Não é possível registrar saídas em um caixa fechado.");
    }
    subtotalSaidas = subtotalSaidas.add(valor);

    return true;
}
public boolean fecharCaixa(){
    if(!caixaAberto){
        throw new IllegalStateException("O caixa já está fechado.");
    }
    caixaAberto = false;
    dataFechamento = new Timestamp(System.currentTimeMillis());
    calcularValorFinal();
    return true;
}
private void calcularValorFinal(){
    valorFinal = valorAbertura.add(subtotalEntradas).subtract(subtotalSaidas);
}}
