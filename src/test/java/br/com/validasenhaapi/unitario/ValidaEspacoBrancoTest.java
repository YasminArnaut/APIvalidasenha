package br.com.validasenhaapi.unitario;

import br.com.validasenhaapi.service.ValidaEspacoBranco;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidaEspacoBrancoTest {

    ValidaEspacoBranco validaEspacoBranco = new ValidaEspacoBranco();

    @Test
    @DisplayName("Valida sem espaço em branco")
    public void testeOk() {
        boolean response = validaEspacoBranco.processar("");
        assert response;
    }

    @Test
    @DisplayName("Valida com espaço em branco")
    public void testeNaoOk() {
        boolean response = validaEspacoBranco.processar(" ");
        assert !response;
    }
}
