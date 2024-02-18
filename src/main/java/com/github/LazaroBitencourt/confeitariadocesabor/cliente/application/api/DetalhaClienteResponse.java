package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import lombok.Getter;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public static List<DetalhaClienteResponse> converte(List<Cliente> listaDeClientes) {
        return listaDeClientes.stream().map(cliente -> new DetalhaClienteResponse(cliente)).collect(Collectors.toList());
    }
}
