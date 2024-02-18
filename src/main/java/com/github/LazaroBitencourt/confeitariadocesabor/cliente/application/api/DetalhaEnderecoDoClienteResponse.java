package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Endereco;
import lombok.Getter;

import java.util.UUID;

@Getter
public class DetalhaEnderecoDoClienteResponse {

    private UUID IdEndereco;
    private String logadouro;
    private String numero;
    private String bairro;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String complemento;
    private String cep;

    public DetalhaEnderecoDoClienteResponse(Endereco endereco) {
        this.IdEndereco = endereco.getIdEndereco();
        this.logadouro = endereco.getLogadouro();
        this.numero = endereco.getNumero();
        this.bairro = endereco.getBairro();
        this.complemento = endereco.getComplemento();
        this.cep = endereco.getCep();
    }

}
