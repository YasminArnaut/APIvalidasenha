package br.com.validarsenhaapi.service;

import org.springframework.stereotype.Component;

@Component
public class ValidaTamanhoSenha implements ValidaSenha {
    @Override
    public boolean processar(String senha) {
        return senha.length() >= 9;
    }
}
