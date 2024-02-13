package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.service;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.api.*;

import java.util.UUID;

public interface EnderecoService {

    EnderecoIdResponse cadastraEndereco(EnderecoRequest enderecoRequest);

    DetalhaEnderecoResponse buscaEnderecoPorId(UUID idEndereco);

    void alteraEnderecoPorId(UUID idEndereco, AlteraEnderecoRequest alteraEnderecoRequest);

    void deletaEnderecoPorId(UUID idEndereco);
}
