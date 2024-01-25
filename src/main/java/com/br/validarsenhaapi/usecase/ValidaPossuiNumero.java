package com.br.validarsenhaapi.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidaPossuiNumero implements ValidaSenha {

    @Override
    public boolean processar(String senha) {
        for (char caracter : senha.toCharArray()) {
            if (caracter >= '0' && caracter <= '9') {
                return true;
            }
        }
        return false;
    }
}
