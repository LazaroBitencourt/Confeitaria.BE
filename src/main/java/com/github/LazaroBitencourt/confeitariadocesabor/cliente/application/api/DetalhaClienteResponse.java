package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import lombok.Getter;

import java.util.UUID;

@Getter
public class DetalhaClienteResponse {

    private UUID idCliente;
    private String nome;
    private String telefone;
    private ClienteEndereco endereco;

    public DetalhaClienteResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.telefone = cliente.getTelefone();
        this.endereco = new ClienteEndereco(cliente.getEndereco());
    }

}
