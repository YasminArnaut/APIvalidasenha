package com.br.validarsenhaapi.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidaLetraMinuscula implements ValidaSenha{
    @Override
    public boolean processar(String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 'a' && c <= 'a') {
                return true;
            }
        }
        return false;
    }
}
