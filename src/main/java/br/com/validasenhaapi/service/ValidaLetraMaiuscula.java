package br.com.validasenhaapi.service;

import org.springframework.stereotype.Service;

@Service
public class ValidaLetraMaiuscula implements ValidaSenha {
    @Override
    public boolean processar(String senha) {
        return senha.matches(".*[A-Z].*");
    }
}
