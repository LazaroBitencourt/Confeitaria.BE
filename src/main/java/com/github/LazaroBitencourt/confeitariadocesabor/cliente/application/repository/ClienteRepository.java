package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente novoCliente);
}
