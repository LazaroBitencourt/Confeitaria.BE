package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente novoCliente);

    Cliente buscaClientePorId(UUID idCliente);

    List<Cliente> buscaTodosClientes();

    void deletaClientePorId(UUID idCliente);
}
