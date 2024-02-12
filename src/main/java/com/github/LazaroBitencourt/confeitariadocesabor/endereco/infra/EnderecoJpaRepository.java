package com.github.LazaroBitencourt.confeitariadocesabor.endereco.infra;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.repository.EnderecoRepository;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;
import com.github.LazaroBitencourt.confeitariadocesabor.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class EnderecoJpaRepository implements EnderecoRepository {

    private final EnderecoSpringDataJpaRepository jpaRepository;

    @Override
    public Endereco salva(Endereco endereco) {
        log.info("[inicia] EnderecoJpaRepository - salva");
        try{
            jpaRepository.save(endereco);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,"EXISTE DADOS DUPLICADOS", e);
        }
        log.info("[finaliza] EnderecoJpaRepository - salva");
        return endereco;
    }
}
