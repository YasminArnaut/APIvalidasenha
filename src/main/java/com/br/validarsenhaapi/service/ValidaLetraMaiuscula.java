package com.br.validarsenhaapi.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidaLetraMaiuscula implements ValidaSenha{
    @Override
    public boolean processar(String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }
}
