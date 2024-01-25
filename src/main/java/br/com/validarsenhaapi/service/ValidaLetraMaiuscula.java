package br.com.validarsenhaapi.service;

import org.springframework.stereotype.Component;

@Component
public class ValidaLetraMaiuscula implements ValidaSenha{
    @Override
    public boolean processar(String senha) {
        return senha.matches(".*[A-Z].*");
    }
}
