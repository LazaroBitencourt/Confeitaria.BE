package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.EnderecoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.EnderecoRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class EnderecoApplicationService implements EnderecoService{

    @Override
    public EnderecoIdResponse cadastraEndereco(EnderecoRequest enderecoRequest) {
        return null;
    }
}
