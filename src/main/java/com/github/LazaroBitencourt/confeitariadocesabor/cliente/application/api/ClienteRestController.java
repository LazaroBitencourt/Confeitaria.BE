package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class ClienteRestController implements ClienteAPI{

    private final ClienteService service;

    @Override
    public ClienteIdResponse postCadastraNovoCliente(ClientRequest clientRequest) {
        log.info("[inicia] ClienteRestController - postCadastraCliente");
        ClienteIdResponse clienteIdResponse = service.cadastraNovoCliente(clientRequest);
        log.info("[finaliza] ClienteRestController - postCadastraCliente");
        return clienteIdResponse;
    }
}
