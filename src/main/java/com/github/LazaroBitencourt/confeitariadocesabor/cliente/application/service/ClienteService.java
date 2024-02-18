package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.DetalhaClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteIdResponse cadastraNovoCliente(ClienteRequest clientRequest);

    DetalhaClienteResponse detalhaClientePorId(UUID idCliente);

    List<DetalhaClienteResponse> listaTodosClientes();
}
