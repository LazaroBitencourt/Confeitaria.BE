package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.DetalhaEnderecoResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.EnderecoIdResponse;
import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.EnderecoRequest;

import java.util.UUID;

public interface EnderecoService {

    EnderecoIdResponse cadastraEndereco(EnderecoRequest enderecoRequest);

    DetalhaEnderecoResponse buscaEnderecoPorId(UUID idEndereco);
}
