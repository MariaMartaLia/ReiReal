package entities;

import java.util.UUID;

public class Categoria {
    private UUID id;
    private String nome;
    private boolean ativo;

    public Categoria(String nome) {
        this.id =   UUID.randomUUID();
        this.nome = nome;
        this.ativo = true;
    }

public UUID getId() {
        return id;
}
public String getNome() {
        return nome;
}
public Boolean getAtivo() {
        return ativo;
}
public void setNome(String nome) {
        this.nome = nome;
}
public boolean categoriaValida(){
    if (nome.isBlank()){
        return false;
    }
        if (nome.matches("^[a-z A-Z]+$")){
            return true;
        }
        return false;
}
public void ativarCategoria() {
        ativo = true;
}
public void desativarCategoria() {
    ativo = false;
}
}

