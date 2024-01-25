package com.br.validarsenhaapi.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidaLetraMinuscula implements ValidaSenha{
    @Override
    public boolean processar(String senha) {
        for (char caracter : senha.toCharArray()) {
            if (caracter >= 'a' && caracter <= 'z') {
                return true;
            }
        }
        return false;
    }
}
