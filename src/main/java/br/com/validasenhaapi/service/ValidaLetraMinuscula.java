package br.com.validasenhaapi.service;

import org.springframework.stereotype.Service;

@Service
public class ValidaLetraMinuscula implements ValidaSenha {
    @Override
    public boolean processar(String senha) {
        return senha.matches(".*[a-z].*");
    }
}
