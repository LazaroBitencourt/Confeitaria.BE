package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;

import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente novoCliente);

    Cliente detalhaClientePorId(UUID idCliente);
}
