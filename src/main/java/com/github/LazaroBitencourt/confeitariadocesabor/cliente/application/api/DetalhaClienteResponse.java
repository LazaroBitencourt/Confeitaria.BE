package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import lombok.Getter;

@Getter
public class DetalhaClienteResponse {

    private String nome;
    private String telefone;
    private ClienteEndereco endereco;
}
