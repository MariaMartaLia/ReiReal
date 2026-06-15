package entities;

import java.sql.Timestamp;
import java.util.UUID;


public class Cliente {
    private UUID id;
    private String nome;
    private String telefone;
    private Timestamp dataCriacao;


    public Cliente(String nome, String telefone) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.telefone = telefone;
        this.dataCriacao = new Timestamp(System.currentTimeMillis());


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

        this.telefone = telefone;}

public boolean validaCliente( ){
        if (nome.isBlank() || telefone.isBlank() ){
        return false;
    }
    if (nome.matches("^[a-z A-Z]+$") && telefone.matches("^[0-9]{11}$")){
        return true ;
    }
    else {
        return false;
    }
}}