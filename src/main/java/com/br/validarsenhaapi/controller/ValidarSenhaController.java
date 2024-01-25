package com.br.validarsenhaapi.controller;

import com.br.validarsenhaapi.service.ValidaService;
import com.br.validarsenhaapi.service.ValidaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/senha")
public class ValidarSenhaController {

    private final ValidaService validaService;

    public ValidarSenhaController(ValidaServiceImpl validaServiceImpl, ValidaService validaService) {
        this.validaService = validaService;

    }

    @GetMapping("/validar")
    private boolean validarSenha(@RequestParam String senha) {
      return validaService.processar(senha);
    }
}
