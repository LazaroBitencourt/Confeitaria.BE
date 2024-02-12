package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import lombok.Getter;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Getter
@Value
public class EnderecoRequest {

    @NotNull
    private UUID cliente;
    @NotBlank
    private String logadouro;
    @NotBlank
    @Size(min = 2, message = "O campo numero deve conter pelos menos dois numeros")
    private String numero;
    @NotBlank
    private String bairro;
    private String complemento;
    @NotBlank
    @Size(min = 8, max = 8, message = "O campo deve conter exatamente 8 numeros")
    private String cep;
}
