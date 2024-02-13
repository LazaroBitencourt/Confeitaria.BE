package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;


import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class AlteraEnderecoRequest {
    private String logadouro;
    @NotBlank
    private String numero;
    @NotBlank
    private String bairro;
    private String complemento;
    @NotBlank
    private String cep;
}
