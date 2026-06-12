package entities;

import java.sql.Timestamp;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nome;
    private String telefone;
    private Timestamp dataCriacao;


    public Cliente(UUID id, String nome, String telefone, Timestamp dataCriacao) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
        this.dataCriacao = dataCriacao;
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
    public void setNome(String nome) {

        this.nome = nome;
    }
    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }
    public boolean validar(String nome, String telefone){
        if (nome = null) {
            return false;
        }
    }

    public void
}
