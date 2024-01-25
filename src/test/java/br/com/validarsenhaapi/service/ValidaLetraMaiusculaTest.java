package br.com.validarsenhaapi.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidaLetraMaiusculaTest {
    ValidaLetraMaiuscula validaLetraMaiuscula = new ValidaLetraMaiuscula();

    @Test
    @DisplayName("Valida se possui letra maiúscula")
    public void testeOk() {
        boolean response = validaLetraMaiuscula.processar("A");
        assert response;
    }

    @Test
    @DisplayName("Valida se não possui letra maiúscula")
    public void testeNaoOk() {
        boolean response = validaLetraMaiuscula.processar("a");
        assert !response;
    }
}
