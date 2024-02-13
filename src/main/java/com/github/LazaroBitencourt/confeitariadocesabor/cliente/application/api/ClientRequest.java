package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;
import lombok.Value;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Value
public class ClientRequest {

    @NotNull
    private String nome;
    @NotNull
    @Size(min = 11, max = 11, message = "O numero do telefone deve conter 11 numeros com o DDD")
    private String telefone;
    @NotNull
    private Endereco endereco;
}
