package br.com.validarsenhaapi.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidaCaracterEspecialTest {

    ValidaCaracterEspecial validaCaracterEspecial = new ValidaCaracterEspecial();

    @Test
    @DisplayName("Valida com caracter especial")
    public void testeOk() {
        boolean response = validaCaracterEspecial.processar("@");
        assert response;
    }

    @Test
    @DisplayName("Valida sem caracter especial")
    public void testeNaoOk() {
        boolean response = validaCaracterEspecial.processar("a");
        assert !response;
    }
}
