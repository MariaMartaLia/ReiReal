    package entities;

import java.sql.Timestamp;
import java.util.UUID;
import java.math.BigDecimal;


public class Cliente {
    private UUID id;
    private String nome;
    private String telefone;
    private Timestamp dataCriacao;
    private BigDecimal creditoDisponivel;


    public Cliente(String nome, String telefone) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
        this.dataCriacao = new Timestamp(System.currentTimeMillis());
        this.creditoDisponivel = BigDecimal.ZERO;

    }

    public UUID getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public Timestamp getDataCriacao() {

        return dataCriacao;
    }

    public BigDecimal getCreditoDisponivel() {
        
        return creditoDisponivel;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;}

public boolean validaCliente( ){
        if (nome==null || telefone==null
            || nome.isBlank()
            || telefone.isBlank()
            || !nome.matches("^[a-zA-ZÀ-ÿ ]+$")
            || !telefone.matches("^[0-9]{11}$")){
        return false;
    }
        return true ;
}

public void adicionarCredito(BigDecimal valor){
    if (valor.compareTo(BigDecimal.ZERO) > 0){
        this.creditoDisponivel = this.creditoDisponivel.add(valor);
    }   
}
public boolean usarCredito(BigDecimal valor){
    if(valor.compareTo(BigDecimal.ZERO) <= 0 || this.creditoDisponivel.compareTo(valor) < 0){
        return false;}
        this.creditoDisponivel = this.creditoDisponivel.subtract(valor);
        return true;
    }
}
