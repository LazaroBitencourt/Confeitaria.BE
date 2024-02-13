package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClientRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteIdResponse;

public interface ClienteService {
    ClienteIdResponse cadastraNovoCliente(ClientRequest clientRequest);
}
