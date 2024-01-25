package com.br.validarsenhaapi.usecase;

import org.springframework.stereotype.Component;

@Component
public class ValidaRepeticaoCaracter implements ValidaSenha {


    @Override
    public boolean processar(String senha) {

        char[] letras = new char[senha.length()];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = senha.charAt(i);

            for (int j = i + 1; j < senha.length(); j++) {
                if (letras[i] == senha.charAt(j)) {
                    return false;
                }
            }
        }
        return false;
    }
}
