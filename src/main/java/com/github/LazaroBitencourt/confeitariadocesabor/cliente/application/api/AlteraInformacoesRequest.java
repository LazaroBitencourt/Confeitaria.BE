package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Endereco;
import lombok.Value;

@Value
public class AlteraInformacoesRequest {

    private String nome;
    private String telefone;
    private Endereco endereco;
}
