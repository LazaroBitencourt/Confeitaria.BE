package com.github.LazaroBitencourt.confeitariadocesabor.pedido.application.api;

import lombok.Getter;

@Getter
public class EnderecoDeEntrega {
    private String logadouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;
}
