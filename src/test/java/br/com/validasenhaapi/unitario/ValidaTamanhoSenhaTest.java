package br.com.validasenhaapi.unitario;

import br.com.validasenhaapi.service.ValidaTamanhoSenha;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidaTamanhoSenhaTest {
    ValidaTamanhoSenha validaTamanhoSenha = new ValidaTamanhoSenha();

    @Test
    @DisplayName("Valida se o tamanho da senha é maior que 9")
    public void testeOk() {
        boolean response = validaTamanhoSenha.processar("asdfrp12!");
        assert response;
    }

    @Test
    @DisplayName("Valida se o tamanho da senha não é menor que 9")
    public void testeNaoOk() {
        boolean response = validaTamanhoSenha.processar("asdfrp1!");
        assert !response;
    }
}
