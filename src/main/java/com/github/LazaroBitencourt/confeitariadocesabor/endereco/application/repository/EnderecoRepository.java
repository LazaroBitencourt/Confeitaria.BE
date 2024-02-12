package com.github.LazaroBitencourt.confeitariadocesabor.endereco.application.repository;

import com.github.LazaroBitencourt.confeitariadocesabor.endereco.domain.Endereco;

import java.util.UUID;

public interface EnderecoRepository {

    Endereco salva(Endereco endereco);

    Endereco buscaEnderecoPorId(UUID idEndereco);
}
