package br.com.validasenhaapi.controller;

import br.com.validasenhaapi.controller.dto.Senha;
import br.com.validasenhaapi.usecase.ValidaUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/senhas")
public class ValidarSenhaController {

    private final ValidaUseCase validaUseCase;

    public ValidarSenhaController(ValidaUseCase validaUseCase) {
        this.validaUseCase = validaUseCase;
    }

    @PostMapping("/validacoes")
    private ResponseEntity<Senha> validarSenha(@RequestBody Senha senha) {
        boolean response = validaUseCase.processar(senha.getSenha());

        if (response) {
            return ResponseEntity.ok(new Senha(response));
        } else {
            return ResponseEntity.unprocessableEntity().body(new Senha(response));
        }
    }
}
