package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.*;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.repository.EnderecoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Log4j2
public class EnderecoApplicationService implements EnderecoService{

    private final EnderecoRepository repository;

    private final ClienteRepository clienteRepository;

    @Override
    public EnderecoIdResponse cadastraEndereco(EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoApplicationService - cadastraEndereco");
        Cliente cliente = clienteRepository.buscaClientePorId(enderecoRequest.getCliente());
        Endereco endereco = repository.salva(new Endereco(cliente, enderecoRequest));
        log.info("[finaliza] EnderecoApplicationService - cadastraEndereco");
        return EnderecoIdResponse.builder().IdEndereco(endereco.getIdEndereco()).build();
    }

    @Override
    public DetalhaEnderecoResponse buscaEnderecoPorId(UUID idEndereco) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecoPorId");
        Endereco endereco = repository.buscaEnderecoPorId(idEndereco);
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecoPorId");
        return new DetalhaEnderecoResponse(endereco);
    }

    @Override
    public void alteraEnderecoPorId(UUID idEndereco, AlteraEnderecoRequest informacoesDoEndereco) {
        log.info("[inicia] EnderecoApplicationService - alteraEnderecoPorId");
        Endereco endereco = repository.buscaEnderecoPorId(idEndereco);
        endereco.alteraInformacoesDoEndereco(informacoesDoEndereco);
        repository.salva(endereco);
        log.info("[finaliza] EnderecoApplicationService - alteraEnderecoPorId");
    }

    @Override
    public void deletaEnderecoPorId(UUID idEndereco) {
        log.info("[inicia] EnderecoApplicationService - deletaEnderecoPorId");
        repository.deletaEnderecoPorId(idEndereco);
        log.info("[finaliza] EnderecoApplicationService - deletaEnderecoPorId");
    }
}
