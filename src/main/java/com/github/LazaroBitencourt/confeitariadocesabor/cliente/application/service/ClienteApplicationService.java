package com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteRequest;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.ClienteIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.api.DetalhaClienteResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository.ClienteRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository.EnderecoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class ClienteApplicationService implements ClienteService{

    private final ClienteRepository repository;
    private final EnderecoRepository enderecoRepository;

    @Override
    public ClienteIdResponse cadastraNovoCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
        Endereco endereco = enderecoRepository.salva(new Endereco(clienteRequest));
        Cliente novoCliente = repository.salva(new Cliente(clienteRequest, endereco));
        log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
        return ClienteIdResponse.builder().idCliente(novoCliente.getIdCliente()).build();
    }

    @Override
    public DetalhaClienteResponse detalhaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - detalhaClientePorId");
        Cliente cliente = repository.buscaClientePorId(idCliente);
        log.info("[finaliza] ClienteApplicationService - detalhaClientePorId");
        return new DetalhaClienteResponse(cliente);
    }
}
