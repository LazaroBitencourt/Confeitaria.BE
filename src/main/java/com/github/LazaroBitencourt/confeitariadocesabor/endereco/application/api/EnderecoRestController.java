package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

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

    @Override
    public DetalhaEnderecoResponse getBuscaEnderecoPorId(UUID idEndereco) {
        log.info("[inicia] EnderecoRestController - getBuscaEnderecoPorId");
        DetalhaEnderecoResponse detalhaEnderecoResponse = service.buscaEnderecoPorId(idEndereco);
        log.info("[finaliza] EnderecoRestController - getBuscaEnderecoPorId");
        return detalhaEnderecoResponse;
    }

    @Override
    public void patchAlteraEnderecoPorId(UUID idEndereco, AlteraEnderecoRequest alteraEnderecoRequest) {
        log.info("[inicia] EnderecoRestController - patchAlteraEnderecoPorId");
        service.alteraEnderecoPorId(idEndereco,alteraEnderecoRequest);
        log.info("[finaliza] EnderecoRestController - patchAlteraEnderecoPorId");
    }

    @Override
    public void deleteEnderecoPorId(UUID idEndereco) {
        log.info("[inicia] EnderecoRestController - deleteEnderecoPorId");
        service.deletaEnderecoPorId(idEndereco);
        log.info("[finaliza] EnderecoRestController - deleteEnderecoPorId");
    }
}
