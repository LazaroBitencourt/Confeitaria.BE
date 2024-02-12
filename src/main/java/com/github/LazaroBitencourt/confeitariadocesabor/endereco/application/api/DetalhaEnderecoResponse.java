package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;

import java.util.UUID;

@Getter
public class DetalhaEnderecoResponse {

    private UUID cliente;
    private String logadouro;
    private String numero;
    private String bairro;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String complemento;
    private String cep;
}
