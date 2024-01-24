package com.br.validarsenhaapi.service;

import org.springframework.stereotype.Service;

@Service
public class ValidadorService {

    public static boolean validaNumero(final String senha) {

        for (char c : senha.toCharArray()) {
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }

    public static boolean validaCaracteres(final String senha) {
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

    public static boolean validaLetraMaiuscula(final String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
        }
        return false;
    }

    public static boolean validaLetraMinuscula(final String senha) {
        for (char c : senha.toCharArray()) {
            if (c >= 'a' && c <= 'a') {
                return true;
            }
        }
        return false;
    }

    public static boolean validaTamanho(final String senha) {
        return senha.length() >= 9;
    }

    public static boolean validaRepeticao(final String senha) {

        char[] letras = new char[senha.length()];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = senha.charAt(i);

            for (int j = i + 1; j < senha.length(); j++) {
                if (letras[i] == senha.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
