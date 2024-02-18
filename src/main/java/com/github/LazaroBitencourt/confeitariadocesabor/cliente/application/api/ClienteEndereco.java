package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Endereco;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class ClienteEndereco {

    private String logadouro;
    private String numero;
    private String bairro;
    private String complemento;
    private String cep;

    public ClienteEndereco(Endereco endereco) {
        this.logadouro = endereco.getLogadouro();
        this.numero = endereco.getNumero();
        this.bairro = endereco.getBairro();
        this.complemento = endereco.getComplemento();
        this.cep = endereco.getCep();
    }
}
