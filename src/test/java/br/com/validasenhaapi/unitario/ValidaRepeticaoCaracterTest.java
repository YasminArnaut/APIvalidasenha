package br.com.validasenhaapi.unitario;

import br.com.validasenhaapi.service.ValidaRepeticaoCaracter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidaRepeticaoCaracterTest {

    ValidaRepeticaoCaracter validaRepeticaoCaracter = new ValidaRepeticaoCaracter();

    @Test
    @DisplayName("Valida se possui letras repetidas - Sem letras repetidas")
    public void testeLetrasOk() {
        boolean response = validaRepeticaoCaracter.processar("a");
        assert response;
    }

    @Test
    @DisplayName("Valida se possui letras repetidas - Com letras repetidas")
    public void testeLetrasNaoOk() {
        boolean response = validaRepeticaoCaracter.processar("aa");
        assert !response;
    }

    @Test
    @DisplayName("Valida se possui números repetidos - Sem números repetidos")
    public void testeNumerosOk() {
        boolean response = validaRepeticaoCaracter.processar("1");
        assert response;
    }

    @Test
    @DisplayName("Valida se possui números repetidos - Com números repetidos")
    public void testeNumerosNaoOk() {
        boolean response = validaRepeticaoCaracter.processar("11");
        assert !response;
    }

    @Test
    @DisplayName("Valida se possui caracteres especiais repetidos - Sem caracteres repetidos")
    public void testeCaracterEspecialOk() {
        boolean response = validaRepeticaoCaracter.processar("@");
        assert response;
    }

    @Test
    @DisplayName("Valida se possui caracteres especiais repetidos - Com caracteres repetidos")
    public void testeCaracterEspecialNaoOk() {
        boolean response = validaRepeticaoCaracter.processar("@@");
        assert !response;
    }
}
