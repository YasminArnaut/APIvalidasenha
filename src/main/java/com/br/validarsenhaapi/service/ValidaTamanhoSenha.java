package com.br.validarsenhaapi.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidaTamanhoSenha implements ValidaSenha {
    @Override
    public boolean processar(String senha) {
        return senha.length() >= 9;
    }
}
