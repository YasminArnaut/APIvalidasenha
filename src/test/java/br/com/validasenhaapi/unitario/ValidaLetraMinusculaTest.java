package br.com.validasenhaapi.unitario;

import br.com.validasenhaapi.service.ValidaLetraMinuscula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidaLetraMinusculaTest {
    ValidaLetraMinuscula validaLetraMinuscula = new ValidaLetraMinuscula();

    @Test
    @DisplayName("Valida se possui letra minúscula")
    public void testeOk() {
        boolean response = validaLetraMinuscula.processar("a");
        assert response;
    }

    @Test
    @DisplayName("Valida se não possui letra minúscula")
    public void testeNaoOk() {
        boolean response = validaLetraMinuscula.processar("A");
        assert !response;
    }
}
