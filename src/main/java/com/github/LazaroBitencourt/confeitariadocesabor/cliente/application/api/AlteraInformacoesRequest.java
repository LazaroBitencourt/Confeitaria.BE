package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import lombok.Value;

@Value
public class AlteraInformacoesRequest {

    private String nome;
    private String telefone;
    private ClienteEndereco endereco;
}
