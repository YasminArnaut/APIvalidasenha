package com.br.validarsenhaapi.service;

import com.br.validarsenhaapi.usecase.*;
import org.springframework.stereotype.Service;

@Service
public class ValidaServiceImpl implements ValidaService {

    ValidaSenha validaCaracterEspecial = new ValidaCaracterEspecial();
    ValidaSenha validaLetraMaiuscula = new ValidaLetraMaiuscula();
    ValidaSenha validaLetraMinuscula = new ValidaLetraMinuscula();
    ValidaSenha validaPossuiNumero = new ValidaPossuiNumero();
    ValidaSenha validaRepeticaoCaracter = new ValidaRepeticaoCaracter();
    ValidaSenha validaTamanhoSenha = new ValidaTamanhoSenha();

    @Override
    public boolean processar(String senha) {
        return validaCaracterEspecial.processar(senha) &&
                validaLetraMaiuscula.processar(senha) &&
                validaLetraMinuscula.processar(senha) &&
                validaPossuiNumero.processar(senha) &&
                validaRepeticaoCaracter.processar(senha) &&
                validaTamanhoSenha.processar(senha);
    }
}
