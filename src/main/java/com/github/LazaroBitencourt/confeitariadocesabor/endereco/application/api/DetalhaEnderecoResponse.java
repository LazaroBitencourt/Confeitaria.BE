package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;
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

    public DetalhaEnderecoResponse(Endereco endereco) {
        this.cliente = endereco.getCliente().getIdCliente();
        this.logadouro = endereco.getLogadouro();
        this.numero = endereco.getNumero();
        this.bairro = endereco.getBairro();
        this.complemento = endereco.getComplemento();
        this.cep = endereco.getCep();
    }
}
