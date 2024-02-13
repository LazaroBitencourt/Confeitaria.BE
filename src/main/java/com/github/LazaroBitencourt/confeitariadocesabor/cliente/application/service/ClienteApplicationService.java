package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClientRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.DetalhaClienteResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository.ClienteRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService{

    private final ClienteRepository repository;

    @Override
    public ClienteIdResponse cadastraNovoCliente(ClientRequest clientRequest) {
        log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
        Cliente novoCliente = repository.salva(new Cliente(clientRequest));
        log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
        return ClienteIdResponse.builder().idCliente(novoCliente.getIdCliente()).build();
    }

    @Override
    public DetalhaClienteResponse detalhaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - detalhaClientePorId");
        Cliente cliente = repository.detalhaClientePorId(idCliente);
        log.info("[finaliza] ClienteApplicationService - detalhaClientePorId");
        return new DetalhaClienteResponse(cliente);
    }
}
