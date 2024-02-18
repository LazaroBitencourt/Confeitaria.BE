package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import lombok.Getter;

@Getter
public class DetalhaClienteResponse {

    private String nome;
    private String telefone;
    private ClienteEndereco endereco;

    public DetalhaClienteResponse(Cliente cliente) {
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.endereco = new ClienteEndereco(cliente.getEndereco());
    }

}
