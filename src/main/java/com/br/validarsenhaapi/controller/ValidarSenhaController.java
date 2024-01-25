package com.br.validarsenhaapi.controller;

import com.br.validarsenhaapi.controller.dto.Senha;
import com.br.validarsenhaapi.usecase.ValidaUseCase;
import com.br.validarsenhaapi.usecase.ValidaUseCaseImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/senhas")
    private ResponseEntity<Senha> validarSenha(@RequestBody Senha senha) {
        boolean response = validaUseCase.processar(senha.getSenha());

        return ResponseEntity.ok(new Senha(response));
    }
}
