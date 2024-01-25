package com.br.validarsenhaapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Senha {

    @JsonProperty("senha")
    private String senha;

    @JsonProperty("senha_valida")
    private boolean senhaValida;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isSenhaValida() {
        return senhaValida;
    }

    public void setSenhaValida(boolean senhaValida) {
        this.senhaValida = senhaValida;
    }

    public Senha(String senha, boolean senhaValida) {
        this.senha = senha;
        this.senhaValida = senhaValida;
    }

    public Senha(boolean senhaValida) {
        this.senhaValida = senhaValida;
    }
}
