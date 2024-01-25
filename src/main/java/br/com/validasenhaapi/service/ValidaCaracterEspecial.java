package br.com.validasenhaapi.service;

import org.springframework.stereotype.Component;

@Component
public class ValidaCaracterEspecial implements ValidaSenha {
    @Override
    public boolean processar(String senha) {
        return senha.matches(".*[!@#$%^&*()+-].*");
    }
}
