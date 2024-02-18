package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Getter;

import java.util.UUID;

@Getter
public class InformacoesDoCliente {
    UUID idCliente;
    private String nome;
    private String telefone;
}
