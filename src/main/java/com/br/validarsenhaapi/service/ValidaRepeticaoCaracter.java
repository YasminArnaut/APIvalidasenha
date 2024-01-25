package com.br.validarsenhaapi.service;

import org.springframework.stereotype.Component;

@Component
public class ValidaRepeticaoCaracter implements ValidaSenha {

    @Override
    public boolean processar(String senha) {
        return senha.matches("^(?!.*(.).*\\1).+$");
    }
}
