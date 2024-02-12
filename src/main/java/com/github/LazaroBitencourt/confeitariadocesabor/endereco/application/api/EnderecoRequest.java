package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import lombok.Getter;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Value
public class EnderecoRequest {

    @NotNull
    private Cliente cliente;
    @NotBlank
    private String logadouro;
    @NotBlank
    @Size(min = 2, message = "O campo numero deve conter pelos menos dois numeros")
    private String numero;
    @NotBlank
    private String bairro;
    @NotBlank
    @Size(min = 8, max = 8, message = "O campo deve conter exatamente 8 numeros")
    private String cep;
}
