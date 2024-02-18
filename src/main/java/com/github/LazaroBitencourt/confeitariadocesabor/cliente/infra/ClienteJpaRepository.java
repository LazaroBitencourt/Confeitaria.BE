package com.github.LazaroBitencourt.confeitariadocesabor.cliente.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository.ClienteRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteJpaRepository implements ClienteRepository {

    private final ClienteSpringDataJpaRepository jpaRepository;

    @Override
    public Cliente salva(Cliente novoCliente) {
        log.info("[inicia] ClienteJpaRepository - salva");
        try {
            jpaRepository.save(novoCliente);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"EXISTE DADOS DUPLICADOS", e);
        }
        log.info("[finaliza] ClienteJpaRepository - salva");
        return novoCliente;
    }

    @Override
    public Cliente buscaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteJpaRepository - buscaClientePorId");
        Cliente cliente = jpaRepository.findById(idCliente).orElseThrow(()
        -> APIException.build(HttpStatus.NOT_FOUND, "CLIENTE NAO ENCONTRADO OU " +
                "NAO EXISTE! !INSIRA UM ID VALIDO OU INFORME AO ADM DO SISTEMA!"));
        log.info("[finaliza] ClienteJpaRepository - buscaClientePorId");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[inicia] ClienteJpaRepository - buscaTodosClientes");
        List<Cliente> listaDeClientes =  jpaRepository.findAll();
        log.info("[finaliza] ClienteJpaRepository - buscaTodosClientes");
        return listaDeClientes;
    }
}
