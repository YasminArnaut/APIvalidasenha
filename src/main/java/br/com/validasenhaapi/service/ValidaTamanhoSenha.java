package br.com.validasenhaapi.service;

import org.springframework.stereotype.Service;

@Service
public class ValidaTamanhoSenha implements ValidaSenha {
    @Override
    public boolean processar(String senha) {
        return senha.matches("^.{9,}$");
    }
}
