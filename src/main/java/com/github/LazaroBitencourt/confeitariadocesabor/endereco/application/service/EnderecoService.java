package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.EnderecoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.EnderecoRequest;

public interface EnderecoService {

    EnderecoIdResponse cadastraEndereco(EnderecoRequest enderecoRequest);
}
