package br.com.validasenhaapi.service;

import org.springframework.stereotype.Component;

@Component
public class ValidaPossuiNumero implements ValidaSenha {

    @Override
    public boolean processar(String senha) {
        return senha.matches(".*[0-9].*");
    }
}
