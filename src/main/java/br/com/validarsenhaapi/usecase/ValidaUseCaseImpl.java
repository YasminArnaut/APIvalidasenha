package br.com.validarsenhaapi.usecase;

import br.com.validarsenhaapi.service.*;
import org.springframework.stereotype.Service;

@Service
public class ValidaUseCaseImpl implements ValidaUseCase {

    ValidaSenha validaTamanhoSenha = new ValidaTamanhoSenha();
    ValidaSenha validaPossuiNumero = new ValidaPossuiNumero();
    ValidaSenha validaLetraMinuscula = new ValidaLetraMinuscula();
    ValidaSenha validaLetraMaiuscula = new ValidaLetraMaiuscula();
    ValidaSenha validaCaracterEspecial = new ValidaCaracterEspecial();
    ValidaSenha validaRepeticaoCaracter = new ValidaRepeticaoCaracter();
    ValidaSenha validaEspacoBranco = new ValidaEspacoBranco();

    @Override
    public boolean processar(String senha) {
        return validaTamanhoSenha.processar(senha) &&
                validaPossuiNumero.processar(senha) &&
                validaLetraMinuscula.processar(senha) &&
                validaLetraMaiuscula.processar(senha) &&
                validaCaracterEspecial.processar(senha) &&
                validaRepeticaoCaracter.processar(senha) &&
                validaEspacoBranco.processar(senha);
    }
}
