package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClientRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.DetalhaClienteResponse;

import java.util.UUID;

public interface ClienteService {
    ClienteIdResponse cadastraNovoCliente(ClientRequest clientRequest);

    DetalhaClienteResponse detalhaClientePorId(UUID idCliente);
}
