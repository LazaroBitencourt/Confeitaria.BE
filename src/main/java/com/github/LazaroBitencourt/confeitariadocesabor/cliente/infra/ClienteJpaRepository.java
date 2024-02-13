package com.github.LazaroBitencourt.confeitariadocesabor.cliente.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.cliente.application.repository.ClienteRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.cliente.domain.Cliente;
import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

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
        return null;
    }
}
