package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
public class EnderecoRestController implements EnderecoAPI{

    private final EnderecoService service;

    @Override
    public EnderecoIdResponse postCadastraEndereco(EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoRestController - postCadastraEndereco");
        EnderecoIdResponse enderecoIdResponse = service.cadastraEndereco(enderecoRequest);
        log.info("[finaliza] EnderecoRestController - postCadastraEndereco");
        return enderecoIdResponse;
    }
}
