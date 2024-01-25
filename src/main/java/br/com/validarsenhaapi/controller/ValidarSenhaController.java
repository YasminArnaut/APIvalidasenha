package br.com.validarsenhaapi.controller;

import br.com.validarsenhaapi.controller.dto.Senha;
import br.com.validarsenhaapi.usecase.ValidaUseCase;
import br.com.validarsenhaapi.usecase.ValidaUseCaseImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/validacoes")
public class ValidarSenhaController {

    private final ValidaUseCase validaUseCase;

    public ValidarSenhaController(ValidaUseCaseImpl validaServiceImpl, ValidaUseCase validaUseCase) {
        this.validaUseCase = validaUseCase;
    }

    @PostMapping("/senhas")
    private ResponseEntity<Senha> validarSenha(@RequestBody Senha senha) {
        boolean response = validaUseCase.processar(senha.getSenha());

        if (response) {
            return ResponseEntity.ok(new Senha(response));
        } else {
            return ResponseEntity.unprocessableEntity().body(new Senha(response));
        }
    }
}
