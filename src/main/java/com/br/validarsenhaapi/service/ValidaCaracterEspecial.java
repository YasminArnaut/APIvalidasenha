package com.br.validarsenhaapi.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidaCaracterEspecial implements ValidaSenha {
    @Override
    public boolean processar(String senha) {
        String s = "!@#$%^&amp;*()-+";
        for (char ch : s.toCharArray()) {
            for (char c : senha.toCharArray()) {
                if (ch == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
