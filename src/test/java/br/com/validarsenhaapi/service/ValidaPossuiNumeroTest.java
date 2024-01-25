package br.com.validarsenhaapi.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidaPossuiNumeroTest {
    ValidaPossuiNumero validaPossuiNumero = new ValidaPossuiNumero();

    @Test
    @DisplayName("Valida se possui número")
    public void testeOk() {
        boolean response = validaPossuiNumero.processar("1");
        assert response;
    }

    @Test
    @DisplayName("Valida se não possui número")
    public void testeNaoOk() {
        boolean response = validaPossuiNumero.processar("a");
        assert !response;
    }
}
