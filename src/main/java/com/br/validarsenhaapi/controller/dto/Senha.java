package com.br.validarsenhaapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Senha {

    @JsonProperty("senha")
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
